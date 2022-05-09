package com.navatar.generic;

import java.io.*;
import java.util.*;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import static com.navatar.generic.EnumConstants.*;

public class ExcelUtils{
	static String path = System.getProperty("user.dir") + "/TestCases.xlsx";
	static FileInputStream fis;
	static FileOutputStream fos;
	public static Workbook wb;
	static int lastRow = 0;

	/**
	 * @author Ankur Rana
	 * @return All the Test Case ID which have "No" written in there "Execute"
	 *         column
	 * @Description: This method fetch the Test Case ID of the test cases which
	 *               we don't want to execute.
	 */
	public static List<String> getTcsToRun(String sheetName) {

		List<String> tcs = new ArrayList<String>();
		try {
			fis = new FileInputStream(new File(path));
			wb = WorkbookFactory.create(fis);
			lastRow = wb.getSheet(sheetName).getLastRowNum();
			for (int i = 1; i <= lastRow; i++) {
				if (wb.getSheet(sheetName).getRow(i).getCell(2).getStringCellValue().equalsIgnoreCase("no")) {
					tcs.add(wb.getSheet(sheetName).getRow(i).getCell(0).getStringCellValue());
				}
			}
			fis.close();
		} catch (IOException | EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tcs;

	}

	/**
	 * @author Ankur Rana
	 * @param sheetName
	 *            Name of the sheet which have all the test case ID and the
	 *            column where you want to write the status
	 * @Description This method write the status of all the test cases.
	 */
	public static void writeStatusInExcel(String sheetName) {
		Set<String> keys = AppListeners.status.keySet();
		Iterator<String> itr = keys.iterator();
		try {
			fis = new FileInputStream(new File(path));
			wb = WorkbookFactory.create(fis);
			fis.close();
			fos = new FileOutputStream(new File(path));
			Sheet sheet = wb.getSheet(sheetName);
			List<String> key = new ArrayList<String>();
			while (itr.hasNext()) {
				key.add(itr.next());
			}
			for (int i = 0; i < key.size(); i++) {
				for (int z = 1; z <= lastRow; z++) {
					if (key.get(i).equalsIgnoreCase(sheet.getRow(z).getCell(0).getStringCellValue())) {
						Row row = sheet.getRow(z);
						row.createCell(3).setCellValue(AppListeners.status.get(key.get(i)));
					}
				}
			}
			wb.write(fos);
			wb.close();
			fos.close();
		} catch (IOException | EncryptedDocumentException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @author Ankur Rana
	 * @return Void
	 * @Description: Pass the string which you want to write with the sheet
	 *               name, row number and cell number
	 */
	public static void writeDataInExcel(Object msg, String sheetName, int rowNum, int cellNum) {

		try {
			fis = new FileInputStream(new File(path));
			wb = WorkbookFactory.create(fis);
			fis.close();
			fos = new FileOutputStream(new File(path));
			wb.getSheet(sheetName).getRow(rowNum).createCell(cellNum).setCellValue(msg.toString());
			wb.write(fos);
			fos.close();
		} catch (IOException | EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @author Ankur Rana
	 * @return String
	 * @Description: Pass the sheet name, row number and cell number to fetch
	 *               data from particular cell
	 */
	@SuppressWarnings("deprecation")
	public static String readData(String sheetName, int rowNum, int cellNum) {
		String value = null;
		try {
			fis = new FileInputStream(new File(path));
			wb = WorkbookFactory.create(fis);
//			wb.getSheet(sheetName).getRow(rowNum).getLastCellNum();
			Cell cell = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum);
			value = getValueBasedOnCellType(cell);
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			AppListeners.appLog.info("There is no value at the location you passed.");
			return null;
		}
		return value;

	}

	/**
	 * @author Ankur Rana
	 * @param key
	 * @return string
	 * @Description this method read value from the property file credentials.properties.
	 */
	public static String readDataFromPropertyFile(String key) {

		String value = "";
		Properties prop = new Properties();

		try {
			prop.load(new FileInputStream(new File(System.getProperty("user.dir") + "//credentials.properties")));
			value = prop.getProperty(key);
		} catch (Exception e) {
			System.out.println("property file not found");
			e.printStackTrace();
		}
		return value;
	}
	
	/**
	 * @author Ankur Rana
	 * @param filePath
	 * @param key
	 * @return String
	 * @description this method read value from the property file of your choice.
	 */
	public static String readDataFromPropertyFile(String filePath, String key) {

		String value = "";
		Properties prop = new Properties();

		try {
			prop.load(new FileInputStream(new File(filePath)));
			value = prop.getProperty(key);
		} catch (Exception e) {
			System.out.println("property file not found");
			e.printStackTrace();
		}
		return value;
	}
	
	/**
	 * @author Ankur Rana
	 * @param sheetName
	 * @param rowNum
	 * @return int
	 * @description this method gives the last column count
	 */
	public static int getLastColumn(String sheetName, int rowNum){
//		return wb.getSheet(sheetName).getPhysicalNumberOfRows();
		return wb.getSheet(sheetName).getRow(rowNum).getLastCellNum();
	}

	// public static void writeDataInPropertyFile(String key, String oldValue,
	// String newValue){
	//
	// Properties prop=new Properties();
	//
	// try {
	// prop.load(new FileInputStream(new File("./credentials.properties")));
	// prop.replace(key, oldValue, newValue);
	// prop.setProperty(key, newValue);
	// } catch (FileNotFoundException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (IOException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	/**
	 * @author Ankur Rana
	 * @param sheetName
	 * @param tcName
	 * @param cellNum
	 * @return String
	 * @description This method read the cell number passed according to the test case name passed.
	 */
	public static String readData(String sheetName, String tcName, int cellNum) {
		String value = "";
		String testCaseName;
		try {
			fis = new FileInputStream(new File(path));
			wb = WorkbookFactory.create(fis);
			DataFormatter df= new DataFormatter();
			int lastRow=wb.getSheet(sheetName).getLastRowNum();
			System.out.println(lastRow);
			int j=0;
			for(int i=0;i<=lastRow;i++){
					try{
						Cell cell = wb.getSheet(sheetName).getRow(i).getCell(0);
						testCaseName=getValueBasedOnCellType(cell);
						if(!testCaseName.isEmpty() && tcName.contains(testCaseName)){
							cell = wb.getSheet(sheetName).getRow(i).getCell(cellNum);
							value=getValueBasedOnCellType(cell);
							break;
						} else {
							continue;
						}
					} catch (Exception e){
						AppListeners.appLog.info("Row number '"+i+"' is blank. So will not be able to read data from row number '"+i+"'. Kindly Delete the row or enter some value.");
					}
			}
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			AppListeners.appLog.info("File Path '"+path+"' or Sheet Name '"+sheetName+"' is wrong kindly re-check.");
			return null;
		}
		return value;

	}
	
	/**
	 * @author Ankur Rana
	 * @param sheetName
	 * @param columnName
	 * @return String
	 * @description This method read the cell data according to column Name passed.
	 */
	public static String readData(String sheetName, String columnName) {
		String value = "";
		String testCaseName;
		String tcName=AppListeners.currentlyExecutingTC;
		String colName;
		int cellNum=0;
		try {
			fis = new FileInputStream(new File(path));
			wb = WorkbookFactory.create(fis);
			DataFormatter df= new DataFormatter();
			int lastRow=wb.getSheet(sheetName).getLastRowNum();
			System.out.println(lastRow);
			for(int i=0;i<=lastRow;i++){
					try{
						Cell cell = wb.getSheet(sheetName).getRow(i).getCell(0);
						testCaseName=getValueBasedOnCellType(cell);
						if(!testCaseName.isEmpty() && tcName.contains(testCaseName)){
							int lastColumnNum=wb.getSheet(sheetName).getRow(0).getLastCellNum();
							System.out.println(lastColumnNum);
							for(int j =0 ; j <= lastColumnNum; j++){
								try{
									cell  = wb.getSheet(sheetName).getRow(0).getCell(j);
									colName=getValueBasedOnCellType(cell);
									if(!colName.isEmpty() && colName.equalsIgnoreCase(columnName)){
										cellNum=j;
										break;
									} else {
										if(j==lastColumnNum){
											AppListeners.appLog.info(columnName+" is not found.");
											return "";
										}
										continue;
									}
								} catch (Exception e){
									AppListeners.appLog.info("Column number '"+j+"' is blank. So will not be able to read data from column number '"+j+"'. Kindly Delete the column or enter some value.");
								}
							}
							cell = wb.getSheet(sheetName).getRow(i).getCell(cellNum);
							value= getValueBasedOnCellType(cell);
							break;
						} else {
							if(i==lastRow){
								AppListeners.appLog.info(tcName+" is not found.");
								break;
							}
							continue;
						}
					} catch (Exception e){
						AppListeners.appLog.info("Row number '"+i+"' is blank. So will not be able to read data from row number '"+i+"'. Kindly Delete the row or enter some value.");
					}
			}
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			AppListeners.appLog.info("File Path '"+path+"' or Sheet Name '"+sheetName+"' is wrong kindly re-check.");
			return null;
		}
		return value;

	}
	//start from here replacing the df.format with getValueBasedOnCellType
	public static String readData(String path,String sheetName, int rowNum, int cellNum) {
		String value = "";
		try {
			fis = new FileInputStream(new File(path));
			wb = WorkbookFactory.create(fis);
//			wb.getSheet(sheetName).getRow(rowNum).getLastCellNum();
			Cell cell = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum);
			value = getValueBasedOnCellType(cell);
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			AppListeners.appLog.info("There is no value at the location you passed.");
			return null;
		}
		return value;

	}
	

	public static String readData(String sheetName, int columnNum, int cellNum, String value) {
		String excelValue = null;
		String testCaseName;
		try {
			fis = new FileInputStream(new File(path));
			wb = WorkbookFactory.create(fis);
			DataFormatter df = new DataFormatter();
			int lastRow = wb.getSheet(sheetName).getLastRowNum();
//			System.out.println(lastRow);
			for (int i = 0; i <= lastRow; i++) {
				try {
					Cell cell = wb.getSheet(sheetName).getRow(i).getCell(columnNum);
					testCaseName = getValueBasedOnCellType(cell);
					if (!testCaseName.isEmpty() && testCaseName.equalsIgnoreCase(value)) {
						cell = wb.getSheet(sheetName).getRow(i).getCell(cellNum);
						excelValue = getValueBasedOnCellType(cell);
						break;
					} else {
						continue;
					}
				} catch (Exception e) {
					AppListeners.appLog
							.info("Row number '" + i + "' is blank. So will not be able to read data from row number '"
									+ i + "'. Kindly Delete the row or enter some value.");
				}
			}
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			AppListeners.appLog
					.info("File Path '" + path + "' or Sheet Name '" + sheetName + "' is wrong kindly re-check.");
			return null;
		}
		return excelValue;

	}
	
	
	public static boolean WriteDataBasedOnColumnName(String sheetName, int columnNum, int cellNum, String value,
			String writeValue) {
		String excelValue = null;
		boolean flag = false;
		try {
			fis = new FileInputStream(new File(path));
			wb = WorkbookFactory.create(fis);
			fis.close();
			int lastRow = wb.getSheet(sheetName).getLastRowNum();
			for (int i = 0; i <= lastRow; i++) {
				try {
					Cell cell = wb.getSheet(sheetName).getRow(i).getCell(columnNum);
					excelValue = getValueBasedOnCellType(cell).trim();
					if (!excelValue.isEmpty() && excelValue.equalsIgnoreCase(value)) {
						fos = new FileOutputStream(new File(path));
						wb.getSheet(sheetName).getRow(i).createCell(cellNum).setCellValue(writeValue);
						wb.write(fos);
						flag = true;
						fos.close();
						break;
					} else {
						continue;
					}
				} catch (Exception e) {
					AppListeners.appLog
							.error("Row number '" + i + "' is blank. So will not be able to read data from row number '"
									+ i + "'. Kindly Delete the row or enter some value.");
				}
			}
//			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			AppListeners.appLog
					.error("File Path '" + path + "' or Sheet Name '" + sheetName + "' is wrong kindly re-check.");
			return false;
		}
		if (!flag) {
			AppListeners.appLog.error(
					value + " :Value is not present in excel sheet " + sheetName + " in column number " + columnNum);
		}
		return flag;
	}
	
	public static int getLastRow(String sheetName){
//		return wb.getSheet(sheetName).getPhysicalNumberOfRows();
		try {
			fis=new FileInputStream(new File(path));
			wb=WorkbookFactory.create(fis);
			return wb.getSheet(sheetName).getLastRowNum();
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
		
	}
	
	/**
	 * @author Ankur Rana
	 * @param sheetName
	 * @param label
	 * @return column number of the label
	 */
	public static int getColumnNumberBasedOnLabel(String sheetName, excelLabel label){
		
		try {
			fis=new FileInputStream(new File(path));
			wb=WorkbookFactory.create(fis);
			Sheet sheet=wb.getSheet(sheetName);
			int lastColumnNumber = sheet.getRow(0).getLastCellNum();
			for(int i = 0; i < lastColumnNumber; i++){
				if(getValueBasedOnCellType(sheet.getRow(0).getCell(i)).equalsIgnoreCase(label.toString())){
					return i;
				} else {
					if (i==lastColumnNumber-1){
						AppListeners.appLog.info(label.toString()+" is not present in the excel.");
						System.out.println(label.toString()+" is not present in the excel.");
					}
				}
			}
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	
	/**
	 * @author Ankur Rana
	 * @param sheetName
	 * @param basedOnLabel 
	 * @param basedOnValue
	 * @return row number at which basedOnValue(value) is present under the basedOnLabel(Label)
	 */
	public static int getRowNumberBasedOnLabelAndValue(String sheetName, excelLabel basedOnLabel, String basedOnValue){
		
		try {
			fis=new FileInputStream(new File(path));
			wb=WorkbookFactory.create(fis);
			String currentlyItreatingValue="";
			Sheet sheet=wb.getSheet(sheetName);
			int j = 0;
			int searchInColumnNumber = getColumnNumberBasedOnLabel(sheetName, basedOnLabel);
			for(int i = 0; i >= 0; i++){
				try{
					currentlyItreatingValue=getValueBasedOnCellType(sheet.getRow(i).getCell(searchInColumnNumber));
				}catch(NullPointerException e){
					j++;
					if(j==100){
						break;
					}
					continue;
				}
				if(currentlyItreatingValue.equalsIgnoreCase(basedOnValue.toString())){
					return i;
				}
			}
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(basedOnValue+" value is not found under label "+basedOnLabel.toString());
		return 0;
		
	}
	
	/**
	 * @author Ankur Rana
	 * @param sheetName
	 * @param basedOnLabel: Label under which primary key is present
	 * @param basedOnValue: Primary Key based on which value is required.
	 * @param searchUnderLabel: Label under which required value is present
	 * @return Value based on the parameters.
	 */
	public static String readData(String sheetName, excelLabel basedOnLabel, String basedOnValue, excelLabel searchUnderLabel){
		try {
			fis=new FileInputStream(new File(path));
			wb=WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			Cell cell = sheet.getRow(getRowNumberBasedOnLabelAndValue(sheetName, basedOnLabel, basedOnValue)).getCell(getColumnNumberBasedOnLabel(sheetName, searchUnderLabel));
			return getValueBasedOnCellType(cell);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return null;
	}
	
	/**
	 * @author Ankur Rana
	 * @param dataToWrite: The data which you want to write in excel
	 * @param sheetName: Name of the sheet in which data has to be written
	 * @param basedOnLabel: Label which contains the primary key
	 * @param basedOnValue: Primary key to find the row number
	 * @param writeUnderLabel: Label under which data has to be written
	 * @return boolean: if successfully written then return true otherwise false
	 */
	public static boolean writeData(Object dataToWrite, String sheetName, excelLabel basedOnLabel, String basedOnValue, excelLabel writeUnderLabel){
		try {
//			System.err.println("Row: "+getRowNumberBasedOnLabelAndValue(sheetName, basedOnLabel, basedOnValue)+" Cell: "+getColumnNumberBasedOnLabel(sheetName, writeUnderLabel));
			writeDataInExcel(dataToWrite, sheetName, getRowNumberBasedOnLabelAndValue(sheetName, basedOnLabel, basedOnValue), getColumnNumberBasedOnLabel(sheetName, writeUnderLabel));
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	
	/**
	 * @author Ankur Rana
	 * @return Void
	 * @Description: Pass the string which you want to write in the excel at path with the sheet
	 *               name, row number and cell number
	 */
	public static void writeDataInExcel(String path, Object msg, String sheetName, int rowNum, int  cellNum) {

		try {
			fis = new FileInputStream(new File(path));
			wb = WorkbookFactory.create(fis);
			fis.close();
			fos = new FileOutputStream(new File(path));
			wb.getSheet(sheetName).getRow(rowNum).createCell(cellNum).setCellValue(msg.toString());
			wb.write(fos);
			wb.close();
			fos.close();
		} catch (IOException | EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static boolean writeData(String path, Object dataToWrite, String sheetName, excelLabel basedOnLabel,
			String basedOnValue, excelLabel writeUnderLabel) {
		try {
			writeDataInExcel(path, dataToWrite, sheetName,
					getRowNumberBasedOnLabelAndValue(path, sheetName, basedOnLabel, basedOnValue),
					getColumnNumberBasedOnLabel(path, sheetName, writeUnderLabel));
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}

		return false;
	}

	public static int getRowNumberBasedOnLabelAndValue(String path, String sheetName, excelLabel basedOnLabel,
			String basedOnValue) {
		int k = 0;
		try {
			fis = new FileInputStream(new File(path));
			wb = WorkbookFactory.create(fis);
			String currentlyItreatingValue = "";
			Sheet sheet = wb.getSheet(sheetName);
			int j = 0;
			int searchInColumnNumber = getColumnNumberBasedOnLabel(path, sheetName, basedOnLabel);
			for (int i = 0; i >= 0; i++) {
				try {
					currentlyItreatingValue = getValueBasedOnCellType(sheet.getRow(i).getCell(searchInColumnNumber));
				} catch (NullPointerException e) {
					j++;
					if (j == 100) {
						break;
					}
					continue;
				}
				if (currentlyItreatingValue.equalsIgnoreCase(basedOnValue.toString())) {
					k = i;
					break;
				} else {
//					System.out.println(basedOnValue + " value is not found under label " + basedOnLabel.toString());
//					AppListeners.appLog.error(basedOnValue + " value is not found under label " + basedOnLabel.toString());
				}
			}
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				wb.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
			}
		}
		
		return k;

	}
	
	public static int getColumnNumberBasedOnLabel(String path, String sheetName, excelLabel label) {
		int k = 0;
		try {
			fis = new FileInputStream(new File(path));
			wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			int lastColumnNumber = sheet.getRow(0).getLastCellNum();
			for (int i = 0; i < lastColumnNumber; i++) {
				if (getValueBasedOnCellType(sheet.getRow(0).getCell(i)).equalsIgnoreCase(label.toString())) {
					k = i;
					break;
				} else {
					if (i == lastColumnNumber - 1) {
						AppListeners.appLog.info(label.toString()+" is not present in the excel.");
						System.out.println(label.toString() + " is not present in the excel.");
					}
				}
			}
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		} finally {
			try {
				wb.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
			}
		}
		return k;
	}
	
	public static int getLastColumn(String filePath, String sheetName, int rowNum){
//		return wb.getSheet(sheetName).getPhysicalNumberOfRows();
		int lastColumn = 0;
		try {
			fis = new FileInputStream(new File(filePath));
			wb = WorkbookFactory.create(fis);
			lastColumn = wb.getSheet(sheetName).getRow(rowNum).getLastCellNum();
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		} finally {
			try {
				wb.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
			}
		}
		return lastColumn;
	}
	
	/**
	 * @author Ankur Rana
	 * @param sheetName
	 * @param basedOnLabel: Label under which primary key is present
	 * @param basedOnValue: Primary Key based on which value is required.
	 * @param searchUnderLabel: Label under which required value is present
	 * @return Value based on the parameters.
	 */
	public static String readData(String filePath, String sheetName, excelLabel basedOnLabel, String basedOnValue, excelLabel searchUnderLabel){
		try {
			fis=new FileInputStream(new File(filePath));
			wb=WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet(sheetName);
			return getValueBasedOnCellType(sheet.getRow(getRowNumberBasedOnLabelAndValue(filePath, sheetName, basedOnLabel, basedOnValue)).getCell(getColumnNumberBasedOnLabel(filePath, sheetName, searchUnderLabel)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		} finally {
			try {
				wb.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
			}
		}
		return null;
	}

	public static String getValueBasedOnCellType(Cell cell){
		String value = "";
		DataFormatter df= new DataFormatter();
		try {
			switch (cell.getCellTypeEnum()) {
			case FORMULA:
				switch (cell.getCachedFormulaResultTypeEnum()) {
				case NUMERIC:
					value = String.valueOf((int) cell.getNumericCellValue());
					break;
				default:
					value = cell.getStringCellValue();
					break;
				}
				break;
			default:
				value = df.formatCellValue(cell);
				break;
			}
			
		} catch (Exception e){
		}
		return value;
	}
	
}
