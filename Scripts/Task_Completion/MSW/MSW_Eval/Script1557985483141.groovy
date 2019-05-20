import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.navigateToUrl('https://qa.medisource.com/patientcare/DA8D02BD-9479-4CC4-9A9F-DF1871F0C4DA/A7C76073-6A1A-4A5E-AE4B-A20392F0B977/msw/evaluation/510830CF-B367-4889-9776-1271E9032C73')

WebUI.delay(2)

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Time_In'))

WebUI.setText(findTestObject('Task_Notes/MSW_Eval/Time_In'), '02:00')

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Time_out'))

WebUI.setText(findTestObject('Task_Notes/MSW_Eval/Time_out'), '03:00')

WebUI.click(findTestObject('Task_Notes/MSW_Eval/PlanCare_Value1'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/PlanCare_Value2'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/PlanCare_Value3'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/PlanCare_Value4'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/PlanCare_Value5'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/PlanCare_Value6'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/PlanCare_Value7'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/PlanCare_Value8'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/PlanCare_Value9'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/PlanCare_Value10'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/PlanCare_Value10.1'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/PlanCare_Value10.2'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/PlanCare_Value10.3'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/PlanCare_Value10.4'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/PlanCare_Value10.5'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Home_Setting'))

WebUI.setText(findTestObject('Task_Notes/MSW_Eval/Home_Setting'), 'Sample Data1')

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Emergency_Contact'))

WebUI.setText(findTestObject('Task_Notes/MSW_Eval/Emergency_Contact'), 'Sample Data2')

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Support_System'))

WebUI.setText(findTestObject('Task_Notes/MSW_Eval/Support_System'), 'Sample Data3')

WebUI.click(findTestObject('Task_Notes/MSW_Eval/HomeBound_Status'))

WebUI.setText(findTestObject('Task_Notes/MSW_Eval/HomeBound_Status'), 'Sample Data4')

WebUI.click(findTestObject('Task_Notes/MSW_Eval/MentalStatus_Alert'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/MentalStatus_Oriented'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/MentalStatus_Disoriented'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/MentalStatus_Forgetful'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/MentalStatus_Depress'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/MentalStatus_Widrawn'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/MentalStatus_Frustration'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/MentalStatus_Others'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/MentalStatus_inputbox'))

WebUI.setText(findTestObject('Task_Notes/MSW_Eval/MentalStatus_inputbox'), 'Confusion')

WebUI.click(findTestObject('Task_Notes/MSW_Eval/FinancialStatus_SocialSecurity'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/FinancialStatus_SSI'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/FinancialStatus_Pension'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/FinancialStatus_Savings'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/FinancialStatus_Medicare'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/FinancialStatus_Medi-Cal'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/FinancialStatus_Private'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/FinancialStatus_Others'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/FinancialStatus_inputbox'))

WebUI.setText(findTestObject('Task_Notes/MSW_Eval/FinancialStatus_inputbox'), 'Salary')

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Clinical_Findings'))

WebUI.setText(findTestObject('Task_Notes/MSW_Eval/Clinical_Findings'), 'Sample Data1')

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Goals'))

WebUI.setText(findTestObject('Task_Notes/MSW_Eval/Goals'), 'Sample Data2')

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Interventions'))

WebUI.setText(findTestObject('Task_Notes/MSW_Eval/Interventions'), 'Sample Data3')

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Referrals'))

WebUI.setText(findTestObject('Task_Notes/MSW_Eval/Referrals'), 'Sample Data4')

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Outcome_Plan'))

WebUI.setText(findTestObject('Task_Notes/MSW_Eval/Outcome_Plan'), 'Sample Data5')

WebUI.delay(2)

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Frequency_1visit'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Frequency_1-3visit'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Frequency_others'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Frequency_inputbox'))

WebUI.setText(findTestObject('Task_Notes/MSW_Eval/Frequency_inputbox'), 'Sample Data')

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Reason_Discharge'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Reason_Transfer'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Reason_Patientmoved'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Reason_NoFurther'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Reason_Admission'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Reason_MDRequest'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Reason_PatientFamRefused'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Reason_PatientFamilyAssume'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Reason_AdmissiontoSNF'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Reason_TransfertoOther'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Reason_Death'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Reason_Other'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Reason_inputbox'))

WebUI.setText(findTestObject('Task_Notes/MSW_Eval/Reason_inputbox'), 'Sample Data')

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Overall_Alert'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Overall_Oriented'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Overall_Disoriented'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Overall_Forgetful'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Overall_Depress'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Overall_Widrawn'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Overall_Frustration'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Overall_others'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Overall_inputbox'))

WebUI.setText(findTestObject('Task_Notes/MSW_Eval/Overall_inputbox'), 'Sample Data')

WebUI.click(findTestObject('Task_Notes/MSW_Eval/ADL_Independent'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/ADL_Assisted'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/ADL_Dependent'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/IADL_Independent'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/IADL_Assisted'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/IADL_Dependent'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Continuing_Level'))

WebUI.setText(findTestObject('Task_Notes/MSW_Eval/Continuing_Level'), 'Sample Data1')

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Problems_Identified'))

WebUI.setText(findTestObject('Task_Notes/MSW_Eval/Problems_Identified'), 'Sample Data2')

WebUI.click(findTestObject('Task_Notes/MSW_Eval/StatusOfProblems'))

WebUI.setText(findTestObject('Task_Notes/MSW_Eval/StatusOfProblems'), 'Sample Data3')

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Summary_Care'))

WebUI.setText(findTestObject('Task_Notes/MSW_Eval/Summary_Care'), 'Sample Data4')

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Goals_Met'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/GoalsPartially_Met'))

WebUI.click(findTestObject('Task_Notes/MSW_Eval/Goals_Unmet'))

not_run: WebUI.click(findTestObject('Task_Notes/MSW_Eval/Save_button'))

