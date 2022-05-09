package com.navatar.generic;


public class EnumConstants {

	/**
	 * 
	 * @author Ankur Rana
	 * @description static enums
	 */
	public static enum action {
		ACCEPT, DECLINE, GETTEXT, THROWEXCEPTION, BOOLEAN, SCROLL, SCROLLANDTHROWEXCEPTION, SCROLLANDBOOLEAN;
	}

	public static enum excelLabel {
		Variable_Name,Institutions_Name,Contact_FirstName,Contact_LastName,Contact_EmailId, Contact_password_updated,Registered,Fund_Name,FundRaising_Name,
		Limited_Partner,PartnerShip_Name,Commitment_ID,User_First_Name,User_Last_Name,User_Email,User_Profile,User_License,Fund_Type,Firm_Name,UploadedFileInternal,UploadedFileShared,UploadedFileStandard,UploadedFileCommon,UpdatedFileCommon,UpdatedFileInternal,UpdatedFileShared,UpdatedFileStandard,TestCases_Name ,Alert_Count,AllDocument_Count,
		Folder_Template_Name,Fund_Contact,Fund_Phone,Fund_Email,Firm_Description,ContactNew_fName, ContactNew_lName, Contact_Title, Contact_Phone, Facebook, Mailing_Street, Linkedin, Institution_Type_MyProfile, Industry_Dropdown_myprofile, FundType_myprofile, IndustrySelectBox_myprofile,Investment_Category, GeoFocus_myprofile, Firm_Description_Firmprofile, Billing_street_Firmprofile,
		Billing_city_firmprofile, Billing_state_firmprofile, Billing_country_firmprofile, Industries_selectbox, FundType_selectbox, Geofocus_selectbox, Industry_dropdown, InstType_dropdown, Min_investment, Max_investment, AUM,Contact_updated_firmname,
		Folder_Description,Fund_Size,Fund_VintageYear,Fund_Description,Disclaimer_Name,Disclaimer_Description,StandardPath,CommonPath,SharedPath,InternalPath,MyProfile_FName,MyProfile_LName,Updated_FirmName,Updated_FirstName,Updated_LastName,Title,Business_Phone,Mailing_City,Mailing_State,Mailing_Zip,Mailing_Country,Firm_Contact,KeyWord_For_Search,AllFirms_Count,OnlineImportPath,AdvisorInvolvementID,FOLDER_NAME,INVALID_FOLDER_NAME,
		TargetRegistrationURL,TargetLoginURL,Watermarking,UpdateInstitution_NameFormManageInvestor,UpdatedLimitedPartner_NameFormManageInvestor,HomePageAlertCount,FundsPageALertCount,ContactPageALertCount,BillingZip,UpdateFund_NameFromUpdateInfoIWR,UpdateFund_NameFromUpdateInfoFR,ContactName,FundName,Module_Name,Execute,Statistics,FRW_Value,INV_Value,FRW_DocumentsName,
		INV_DocumentsName,Updated_InstitutionName_From_InvestorSide,Activity_Count,Viewed_Or_DownloadedAnyFile,Account_Name,Logo_Name,Contact_Access,ContactUpdatedEmailID, Path, DrawdownID, CapitalCalllID, CapitalAmount,ManagementFee, OtherFee, CallAmount, CallDate, DueDate, CallAmountReceived,ReceivedDate, AmountDue,CapitalReturn,Dividends,RealizedGain,OtherProceeds,TotalDistributions,FundDistributionID,InvestorDistributionID,Capital_Returned_Recallable,Capital_Returned_NonRecallable,Item_ID {
			 @Override
			    public String toString() {
			      return "Item Id";
			    }
		}, Item_Name{
			@Override
			public String toString(){
				return "Item Name";
			}
		},Record_Type,Street,City,State,Postal_Code,Country,Other_Street,Other_City,Other_State,Other_Zip,Other_Country,Report_Folder_Name,Report_Name,Select_Report_Type,Show,Range,Email_Template_Folder_Label,Public_Folder_Access,Type,Available_For_Use,Description,Subject,Email_Body,Email_Template_Name,Marketing_InitiativeName,Target_Commitments,Vintage_Year,Fax,
		Frist_Closing_Date{
			@Override
			public String toString() {
				return "1st Closing Date";
			}
		}
			, Pipeline_Name, Company_Name, Stage, Source, Source_Firm, Source_Contact, Deal_Type, Employees, Website, Email, Legal_Name, Name, Investment_Size, Log_In_Date, Our_Role, Last_Name, Last_Stage_Change_Date, Highest_Stage_Reached, Age_of_Current_Stage, Date_Stage_Changed, Changed_Stage, Age, First_Stage_Changed, Second_Stage_Changed, Office_Location_Name, State_Province, ZIP, Organization_Name, Primary, Updated_Primary, Start, Related_To, Due_Date,Investment_Likely_Amount,Total_Fundraising_Contacts,Fundraising_Contact_ID,Fundraising,Role, Other_Address, Mailing_Address,Total_Commitments,Commitment_Amount,Partner_Type,Tax_Forms,Final_Commitment_Date,Company,Bank_Name,Placement_Fee,Fund_Investment_Category,Total_CoInvestment_Commitments,Total_Fund_Commitments, Institution_Type, Fund_Preferences, Industry_Preferences, Shipping_Street, Shipping_City, Shipping_State, Shipping_Zip, Shipping_Country, Mobile_Phone, Assistant, Asst_Phone, Phone,Total_Call_Amount_Received, Total_Amount_Called,Total_Amount_Received,Total_Uncalled_Amount,Total_Commitment_Due,Commitment_Called,Called_Due,Preferred_Mode_of_Contact,Percent, TotalCommitment, Priority, Partnership, Deal_Name;
};

	public static enum fileDistributor {
		BulkUpload,FileSplitter;
	}

	public static enum FolderType{
		Common,
		Shared,
		Internal,
		Standard,
		Global;
	}
	
	public static enum accessType {
		InternalUserAccess, AdminUserAccess;
	}

	public static enum userType {
		CRMUser, SuperAdmin;
	}

	public static enum WorkSpaceAction{
		CREATEFOLDERTEMPLATE,
		IMPORTFOLDERTEMPLATE,
		WITHOUTEMPLATE,
		WITHTARGET,
		WITHOUTTARGET,
		ACTIVE,
		INACTIVE,
		UPDATE,
		CHECKERRORMSG,
		UPLOAD;
	}
	
	public static enum OnlineImportFileAddTo{
		SingleInstitute, MultipleInstitute
	}
	
	public static enum ContentGridArrowKeyFunctions{
		Update,
		Delete,
		ManageVersions,
		Open;
	}
	
	public static enum PercentOrValue {
		Percent,Value;
	}
	public static enum SortOrder {
		Assecending,
		Decending;
	}
	
	public static enum multiInstance{
		AllInvestor,ThisInvestorOnly;
	}

	public static enum TabName {
		InstituitonsTab{
			@Override
		    public String toString() {
		      return "Firms";
		    }}, ContactTab, FundraisingsTab, FundsTab, NIMTab, CommitmentsTab, PartnershipsTab, 
		NavatarInvestorAddOns, CurrentInvesment, PotentialInvesment, RecentActivities, AllDocuments, HomeTab, 
		FolderTemplate, FundDistributions, InvestorDistributions, MarketingInitiatives, MarketingProspects, 
		NavatarSetup, Pipelines, FundDrawdowns, CapitalCalls, FundraisingContacts, LimitedPartne, ReportsTab, LimitedPartner,CompaniesTab, Deal, Other;
	}
	
	public static enum Mode{
		Lightning,Classic;
	}
	public static enum Environment{
		Sandbox,Testing,Dev;
	}
	
	public static enum Workspace{

		FundraisingWorkspace,InvestorWorkspace,CurrentInvestment,Other,PotentialInvestment;

	}
	
	public static enum customTabActionType{
		Add,Remove;
	}
	public static enum investorSideWorkSpace{
		CurrentInvestment,PotentialInvestment;
	}
	
	public static enum activityType{
		DocumentUpdate,DocumentUpload,ContactProfileUpdate,FirmProfileUpdate;
	}
	
	public static enum PageName{
		  FundsPage,ContactsPage,InstitutionsPage,CommitmentsPage,HomePage,NavatarInvestorAddOnsPage,AllFirmsPage,InvestorFirmPage,CurrentInvestmentPgae,PotentialInvestmentPage,NavatarInvestorManager,ManageFolderPopUp,BulkDownload,ManageApprovalsPopUp,AllDocumentTab
		  ,RecentActivitiesTab,FundPageAlertPopUp,ContactPageAlertPopUp,LimitedPartnerPage,BuildStep2Of3,CompanyPage,WarningPopUp,CreateFundraisingPage,emailProspects,emailFundraisingContact,CreateCommitmentFundType,CreateCommitmentCoInvestmentType,FundraisingPage,FundDrawdown, CapitalCall,PartnershipsPage,FundDistribution,InvestorDistribution, MarketingInitiatives, EmailTargets, ManageTarget, DealPage,pastFundraisingContactPopUp,pastFundraisingAccountPopUp, emailCapitalCallNotice, Send_Distribution_Notices, BulkEmail, VisualForcePage, NewEventPopUp, TaskPage, GlobalActtion_TaskPOpUp, Object5Page;
		 }
	
	public static enum NavatarSetupSideMenuTab{
		DealCreation, IndividualInvestorCreation, CommitmentCreation, ContactTransfer, AccountAssociations, OfficeLocations, CoInvestmentSettings, PipelineStageLog, BulkEmail
		}
	
	
	
	public static enum UploadFileActions{
		BulkUploaderOrFileSplitter,Upload,Update;
	}
	
	public static enum DisclaimerGrid{
		Activate,Deactivate,View,LastActivatedOn,CreatedOn;
	}
	
	public static enum YesNo {
		Yes,No,YesWinium;
	}
	public static enum EnableDisable {
		Enable,Disable;
	}
	public static enum ErrorMessageType{
		BlankErrorMsg,PrefixErrorMsg,SpiecalCharErrorMsg,FolderCreationRestrictionErrorMsg,DuplicateFolder;
	}
	public static enum EditViewMode {
		Edit,View;
	}
	public static enum ManageApprovalTabs {
		PendingDocuments, ApprovedDocuments;
	}
	
	public static enum ExpandCollapse{
		Expand,Collapse
	}
	
	public static enum CheckUncheck{
		Check, UnCheck;
	}
	public static enum UpdateIgnore {
		Update, Ignore;
	}
	public static enum Status {
		Pending, Approved, Both;
	}
	
	public static enum profileUpdatedAlert{
		FirmProfileUpdated,ContactProfileUpdated;
		
	}
	
	public static enum columnName{
		fundName,contactName,institutionName,AccountName,Fundraising_Name;
	}
	
	public static enum viewDownload{
		view,Download;
	}
	
	public static enum SelectDeselect{
		Select,Deselect
	};
	
	public static enum AllOr1By1{
		All,OneByOne
	};
	
	
	
	
	
	public static enum object{
		Account{
			@Override
			public String toString() {
//				if(ExcelUtils.readDataFromPropertyFile("Mode").equalsIgnoreCase(Mode.Lighting.toString())) {
//					return "Institution";
//				} else {
					return "Accounts";
			//	}
			}
		},Contact,Fund,Fundraising,Fundraising_Contact{
			@Override
			public String toString() {
				return "Fundraising Contact";
			}
		},Email,InstalledPackage{
			@Override
			public String toString() {
				return "Installed Packages";
		}
	},CommunicationTemplates{
		@Override
		public String toString() {
			return "Communication Templates";
	}
}, Company_Information{
	@Override
	public String toString() {
		return "Company Information";
}
}
	};
	
	public static enum objectFeatureName{
		
		pageLayouts{
			@Override
			public String toString() {
					return "Page Layouts";
		}
	},myTemplates{
			@Override
			public String toString() {
				if(ExcelUtils.readDataFromPropertyFile("Mode").equalsIgnoreCase(Mode.Classic.toString())){
					return "Classic Email Templates";
				}else {
					return "Classic Email Templates";
				}
		}
	}
};

//*************************************************************** Pages Field Labels*********************************************//
	public static enum InstitutionPageFieldLabelText {
		Street,Referral_Source_Description,Legal_Name,Description,
		Shipping_State{
			@Override
			public String toString() {
				return "Shipping State/Province";
			};
		},Shipping_Zip{
			@Override
			public String toString() {
				return "Shipping Zip/Postal Code";
			};
		},Parent_Institution{
			
			public String toString() {
				
				return "Parent Firm";
			}
		};
		
	}
	
	public static enum LimitedPartnerPageFieldLabelText {
		Street,Referral_Source_Description,Legal_Name,Description,
		Total_CoInvestment_Commitments{
			@Override
			public String toString() {
				return "Total Co-investment Commitments (mn)";
			};
		},
		Total_Fund_Commitments{
			@Override
			public String toString() {
				return "Total Fund Commitments (mn)";
			};
		}
		
	}
	
	public static enum ContactPageFieldLabelText {
		Legal_Name,Description,Mailing_Street,Other_Street,Candidate_Notes,First_Name,Last_Name,Contact_Referral_Source,Mobile,
		Mailing_State{
			@Override
			public String toString() {
				return "Mailing State/Province";
			};
		},Mailing_Zip{
			@Override
			public String toString() {
				return "Mailing Zip/Postal Code";
			};
		},Other_State{
			@Override
			public String toString() {
				return "Other State/Province";
			};
		},Other_Zip{
			@Override
			public String toString() {
				return "Other Zip/Postal Code";
			};
		}
		
	}
	
	public static enum CapitalCallPageFieldLabelText {
		CC_No,Fund_Drawdown,Commitment,Capital_Amount,Management_Fee,Other_Fee,Call_Amount,Call_Date,Due_Date,Call_Amount_Received,Received_Date,Amount_Due,Commitment_Called,Called_Due,Total_Commitment_Due
	}

	public static enum FundDrawdownPageFieldLabelText {
		DD_No,Fund_Name,Call_Amount,Call_Date,Due_Date,Amount_Due,Total_Call_Amount_Received,Capital_Amount,Management_Fee,Other_Fee
	}
	
	public static enum InvestorDistributionPageFieldLabelText {
		ID_No,Fund_Distribution, Commitment, Capital_Return, Dividends, Realized_Gain, Other_Proceeds, Total_Distributions, Capital_Recallable, Distribution_Date;
	}
	public static enum CommitmentPageFieldLabelText {
		Commitment_ID,Partner_Type,Limited_Partner,Final_Commitment_Date,Tax_Forms,Commitment_Amount,Total_Amount_Called,Total_Amount_Received,
		Total_Uncalled_Amount,Total_Commitment_Due,Partnership,Commitment_Called{
			@Override
			public String toString() {
				return "% Commitment Called";
			}
		},Called_Due{
			@Override
			public String toString() {
				return "% Called Due";
			}
		}
		,Total_Distributions{
			@Override
			public String toString() {
				return "Total Distributions";
			}
		}
		,Capital_Returned_Recallable{
			@Override
			public String toString() {
				return "Capital Returned (Recallable)";
			}
		}
		,Capital_Returned_NonRecallable{
			@Override
			public String toString() {
				return "Capital Returned (Non-Recallable)";
			}
		};
	}
	public static enum FundPageFieldLabelText{
		Fund_Name,Fund_Type,Investment_Category,Vintage_Year,
		Frist_Closing_Date{
			@Override
			public String toString() {
					return "1st Closing Date";
		}
		},Second_Closing_Date{
			@Override
			public String toString() {
					return "2nd_Closing_Date";
		}
		}
		,Third_Closing_Date{
			@Override
			public String toString() {
					return "3rd_Closing_Date";
		}
		},Fourth_Closing_Date{
			@Override
			public String toString() {
					return "4th_Closing_Date";
		}
		},Fivth_Closing_Date{
			@Override
			public String toString() {
					return "5th_Closing_Date";
		}
		},Sixth_Closing_Date{
			@Override
			public String toString() {
					return "6th_Closing_Date";
		}
		},Final_Closing_Date,Termination_Date,Dissolution_Date,Step_Down_Date,Investment_Period_End_Date,Target_Commitments{
			@Override
			public String toString() {
					return "Target Commitments (mn)";
		}
		};
	}
	
	public static enum CreateCommitmentPageFieldLabelText{
		Legal_Name,Fundraising_Name, Investment_Likely_Amount{
			@Override
			public String toString() {
					return "Investment Likely Amount (mn)";
		}
		},Fund_Name,Company;
		
	}
	
	
	//*****************************************************************************************************************************************//
	
	public static enum PrimaryContact{
		Yes,No;
	}
	
	public static enum CreationPage{
		InstitutionPage,ContactPage;
	}
	
	public static enum UserLicense{
		Salesforce_Platform{
			@Override
			public String toString() {
					return "Salesforce Platform";
		}
		}
	}
	
	public static enum UserProfile{
		PE_Standard_User{
			@Override
			public String toString() {
					return "PE Standard User";
		}
		}
		
	}
	
	public static enum EmailTemplateType{
		Text{
			@Override
			public String toString() {
				return "Text";
			}
		},HTML{
			@Override
			public String toString() {
				return "HTML";
			}
		},Custom{
			@Override
			public String toString() {
				return "Custom";
			}
		},Visualforce{
			@Override
			public String toString() {
				return "Visualforce";
			}
		};
	}
	
	public static enum ReportDashboardFolderType{
		ReportFolder{
			@Override
			public String toString() {
				return "New Report Folder";	
			}
		},DashBoardFolder{
			@Override
			public String toString() {
				return "New Dashboard Folder";
			}
		}
	};
	
	public static enum ReportField{
		ContactID{
			@Override
			public String toString() {
				return "Contact ID";
			}
		}
	};
	
	public static enum FolderAccess{
		ReadOnly{
			@Override
			public String toString() {
				return "Read Only";
			}
		},ReadWrite{
			@Override
			public String toString() {
				return "Read/Write";
			}
		}
	};

	public static enum NavatarQuickLink{
		CreateDeal{
			@Override
			public String toString() {
				return "Create New Deal";
			}
		},CreateFundRaising{
			@Override
			public String toString() {
				return "Bulk Fundraising";
			}
		},CreateCommitment{
			@Override
			public String toString() {
				return "Create New Commitments";
			}
		},BulkEmail{
			@Override
			public String toString() {
				return "Send Bulk Email";
			}
		},CreateIndiviualInvestor{
			@Override
			public String toString() {
				return "Create New Individual Investor";
			}
		}
	};

	public static enum DealCreationPageLayout{
		Deal_Information,New_Source_Firm,New_Source_Contact;
	};
	

	public static enum Existing{
		Yes,No
	};
	
	public static enum newSourceFirmPopUpFieldLabelText{
		Description, Street
	};
	
	public static enum HTMLTAG{
		select,input
	};

	public static enum AddProspectsTab{
		AccountAndContacts,PastMarketingInitiatives,Report;
	}
	
	public static enum NavatarSetupSideMenuTabLayoutSection{
		DealCreation_DealInformation,DealCreation_NewSourceFirm,DealCreation_NewSourceContact,
		CommitmentCreation_FundRaisingInformation,CommitmentCreation_AdditionalInformation,CommitmentCreation_FieldsForNewLimitedPartner
		,CommitmentCreation_FieldsForNewPartnership,CommitmentCreation_GeneralInformation,CommitmentCreation_CommitmentInformation,Contact_Information,Address_Information,Additional_Information;
	}

	public static enum RecordType{
		Company,Institution,IndividualInvestor,Contact, PipeLine, Fund, Fundraising,Partnerships;
	}
	
	public static enum searchContactInEmailProspectGrid{
		Yes,No
	};
	
	public static enum Locator{
		Xpath,Name;
	}

	public static enum CheckBox{
		Checked,Unchecked
	};
	
	public static enum OfficeLocationLabel{
		Office_Location_Name,Street,City,ZIP,Country,Phone,Fax,Primary,State_Province{
			@Override
			public String toString() {
				return "State/Province";
			}
	}, State
	};
	
	public static enum PrimaryOfficeLocation{
	Yes,No
	};
	
	public static enum LookUpIcon{
		OfficeLocation{
			@Override
			public String toString() {
				return "Office Location Lookup (New Window)";
			}
		},
		selectFundFromCreateFundraising{
			@Override
			public String toString() {
				return "Fund Name Lookup (New Window)";
			}
		}
		
		};
		
	public static enum RelatedList {
		Fundraising_Contacts{
			@Override
			public String toString() {
				return "Fundraising Contacts";
			}
		},Office_Locations, Open_Activities,Affiliations,Contacts, Activities,Activity_History,Commitments,Partnerships,Fundraisings,FundDistribution {
			@Override
			public String toString() {
				return "Fund Distribution";
				
			}
			}, InvestorDistributions{
				@Override
				public String toString() {
					return "Investor Distributions";
				}
			}, FundDrawdown {
		@Override
		public String toString() {
			return "Fund Drawdown";
			
		}
		}, CapitalCalls{
			@Override
			public String toString() {
				return "Capital Calls";
			}
		},
			Deals_Sourced{
			@Override
			public String toString() {
				return "Deals Sourced";
			}
		},
			Pipeline_Stage_Logs{
			@Override
			public String toString() {
				return "Pipeline Stage Logs";
			}
		},Correspondence_Lists{
			@Override
			public String toString() {
				return "Correspondence Lists";
			}
		},Deals
	};

	public static enum ActivityRelatedButton {
		Task,Event,Call,Email;
	};
	
	public static enum ActivityRelatedLabel {
		Assigned_To {
			@Override
			public String toString() {
				return "Assigned To";
			}
		},
		Status, Subject, Name, Start_Date {
			@Override
			public String toString() {
				return "Start Date";
			}
		},
		Related_To {
			@Override
			public String toString() {
				return "Related To";
			}
		},
		Due_Date {
			@Override
			public String toString() {
				return "Due Date";
			}
		},
		Priority, Comments, Start, End, Description;
	};

		public static enum fundraisingContactActions{
			Role_None{
				@Override
				public String toString() {
					return "--None--";
				}
			},
			Role_DecisionMaker{
				@Override
				public String toString() {
					return "Decision Maker";
				}
			},Role_Evaluator{
				@Override
				public String toString() {
					return "Evaluator";
				}
			},Role_ExecutiveSponsor{
				@Override
				public String toString() {
					return "Executive Sponsor";
				}
			},Role_Gatekeeper{
				@Override
				public String toString() {
					return "Gatekeeper";
				}
			},Role_Influencer{
				@Override
				public String toString() {
					return "Influencer";
				}
			},Role_Other{
				@Override
				public String toString() {
					return "Other";
				}
			},Role_BusinessUser{
				@Override
				public String toString() {
					return "Business User";
				}
			},Remove,PrimaryContact,AddNewContactInFundraisingContact;
			
		};
		
		public static enum DataLoader {
			Institutions,Contacts,Funds,Fundraisings,Commitments,Partnerships,Advisor,CorrespondanceList,Pipeline,MarketingInitiative,MarketingProspect,FundraisingContact;
		}

	public static enum FundraisingContactPageTab{
			SearchBasedOnExistingFunds,SearchBasedOnAccountsAndContacts;
		}
		
		public static enum PopUpName{
			selectFundPopUp, WarningPopUp,SelectFundPopUpFromCompmayPage,selectCompany;
		}
		
		public static enum GridSectionName{
			
		}
		public static enum AddressAction {
			Clear,Retain, CrossIcon;
		};
		
		public static enum SearchBasedOnExistingFundsOptions{
			OnlyFundraisingContacts{
				@Override
				public String toString() {
					return "Only Fundraising Contacts";
				}
			},AllContacts{
				@Override
				public String toString() {
					return "All Contacts";
				}
			}
		}
	public static enum CommitmentType{
		fund,coInvestment,fundraisingName;
	}
	
	public static enum CreatedOrNot{
		AlreadyCreated,NotCreated;
	}
	
	public static enum RequiredFieldListForSection{
		Fundraising_Information,Additional_Information,Fields_for_New_Limited_Partner,Fields_for_New_Partnership
	};
	
	public static enum RevertToDefaultPopUpButton{
		YesButton,NoButton,CrossIcon
		};
	
	public static enum ShowMoreActionDropDownList{
			Create_Commitments,Send_Capital_Call_Notices,Create_Drawdown, Create_Distribution,Send_Distribution_Notices_Button,Send_Distribution_Notices, Add_Prospect, Email_Prospects, Contact_Transfer;
			};
		
	public static enum IndiviualInvestorSectionsName{
		Contact_Information,Address_Information,Additional_Information;
				};
	
	public static enum IndiviualInvestorFieldLabel{
		First_Name,Last_Name,Contact_Description,Business_Phone,Business_Fax,Mobile_Phone,Email,Mailing_Street,Mailing_City,
		Mailing_State{
			@Override
			public String toString() {
				return "Mailing State/Province";
			}
		},Mailing_Zip{
			@Override
			public String toString() {
				return "Mailing Zip/Postal Code";
			}
		}, Other_State{
			@Override
			public String toString() {
				return "Other State/Province";
			}
		},Other_Zip{
			@Override
			public String toString() {
				return "Other Zip/Postal Code";
			}
		},Assistant{
		@Override
		public String toString() {
			return "Assistant's Name";
		}
	},Asst_Phone{
		@Override
		public String toString() {
			return "Asst. Phone";
		}
	},Mailing_Country,Other_Street,Other_City,Other_Country,Fund_Preferences,Industry_Preferences,Website,Preferred_Mode_of_Contact
};	

	public static enum NotApplicable{
		NA;
	}
	
	public static enum ClickOrCheckEnableDisableCheckBox{
		Click,EnableOrDisable;
	}
	
	public static enum sideListOnLayout{
		Related_Lists{
			@Override
			public String toString() {
				return "Related Lists";
			}
		},other{
			@Override
			public String toString() {
				return null;
			}
		}
	}
	
	public static enum ViewFieldsName{
		All_Fields,Contact_Fields{
			@Override
			public String toString() {
				return "Contact Fields";
			}
		},Account_Fields{
			@Override
			public String toString() {
				return "Account Fields";
			}
		}, Marketing_Prospect_Fields{
			@Override
			public String toString() {
				return "Marketing Prospect Fields";
			}
		},Fundraising_Contact_Fields{
			@Override
			public String toString() {
				return "Fundraising Contact Fields";
			}
		},Fundraising_Fields{
			@Override
			public String toString() {
				return "Fundraising Fields";
			}
		},Commitment_Fields{
			@Override
			public String toString() {
				return "Commitment Fields";
			}
		},Investor_Distribution_Fields{
			@Override
			public String toString() {
				return "Investor Distribution Fields";
			}
		}
		;
	}
	

	public static enum TopOrBottom{
		TOP,BOTTOM;	  
	};

	public static enum CancelOrCross{
		Cancel,Cross;	  
	};

	public static enum Header{
		Fund,Contact,Institution{
			public String toString() {
				
				return "Firm";
			}
		},Marketing_Initiative;	  
	};

	public static enum ReportFormatName{
		Matrix,Joined,Summary,Tabular,Null;
	}
	
 	public static enum RelatedTab{
 		Related,Details,Tasks,Meetings,Activities,Documents,Box,Investment,
 		QandA{
 			@Override
 			public String toString() {
 				return "Q&A";
 			}
 		}, Overview,Events, Fundraising,Affiliations, Fundraising_Contacts,Fundraising_Contact, Commitments, Fund_Management, Contacts, Deals, Investor_Relations;	  
 	};
 	
 	public static enum QuickLink{
 		Quick_Action{
 			@Override
 			public String toString() {
 				return "Quick Action";
 			}
 		},New_Relationship{
 			@Override
 			public String toString() {
 				return "New Relationship";
 			}
 		};	  
 	};
 	
 	public static enum NavigationMenuItems{
    	Bulk_Actions {
			@Override
			public String toString() {
				return "Bulk Actions";
			}
    	},New_Interactions{
			@Override
			public String toString() {
				return "New Interactions";
			}
    	},Create_New{
			@Override
			public String toString() {
				return "Create New";
			}
    	};
    };
    
    public static enum BulkActions_DefaultValues{
    	Bulk_Email {
			@Override
			public String toString() {
				return "Bulk Email";
			}
    	},Bulk_Fundraising{
			@Override
			public String toString() {
				return "Bulk Fundraising";
			}
    	},Bulk_Commitments{
			@Override
			public String toString() {
				return "Bulk Commitments";
			}
    	},Deal_Creation {
			@Override
			public String toString() {
				return "Deal Creation";
			}
    	},Individual_Investor_Creation {
			@Override
			public String toString() {
				return "Individual Investor Creation";
			}
    	},;
    };
    
    public static enum GlobalActionItem{
		New_Event,New_Task,Log_a_Call;
	}
    
    public static enum PageLabel{
		First_Name,Last_Name,Email, Fund_Name, Deal_Name,Status, Investment_Type,Meeting_Type{
			@Override
			public String toString() {
				return "Meeting Type";
			}
		}  ,Priority,Under_Evaluation,RenameWatchlist{
			@Override
			public String toString() {
			return "Rename-Watchlist";
		}},RenameUnder_Evaluation{
			@Override
			public String toString() {
			return "Rename-Under Evaluation";


		}},Watchlist, Profile_Image,Industry,Watch_list,Deal_Conversion_Date,Portfolio_Company,Related_Associations,Name, Subject, Due_Date, New_Task, Related_To, Comments, Edit, Assigned_To, Start_Date, End_Date, End_Time, Start_Time, Type, 
		Date{
			@Override
			public String toString() {
				return "Start Date";
			}},Navigation_Type{
				@Override
				public String toString() {
					return "Navigation Type";
				}
			},
		Contact_Name, Owner, Activity, Related_Contacts, Account_Name, Length, Decimal_Places, Values, Is_Touchpoint,Description, Request, Date_Requested, Attendee_Staff, Label, Panel_Width, Panel_Height,Deal,Team_Member_Role,Member, Page_Layout_Name,Organizer,Convert_to_Portfolio, Deal_Contact_Type, Team_Member, Location, End, All_Day_Event


	};
	
	 public static enum SDGCreationLabel{
	    	SDG_Name,SDG_Tag,sObjectName,Parent_Field_Name,Filter,Image_Field_API;
	    };
	    
}
