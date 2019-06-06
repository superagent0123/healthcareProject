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

WebUI.delay(3)

WebUI.click(findTestObject('Patient_Care/communication/comm_new_form'))

WebUI.delay(3)

WebUI.click(findTestObject('Patient_Care/communication/comm_new_30dayssummary'))

WebUI.delay(5)

WebUI.setText(findTestObject('Communication_Forms/30days_summary/30ds_date'), GlobalVariable.today_date)

WebUI.setText(findTestObject('Communication_Forms/30days_summary/30ds_summaryofcare'), GlobalVariable.sample_text_long)

WebUI.setText(findTestObject('Communication_Forms/30days_summary/30ds_patientsresponsetocareprovided'), GlobalVariable.sample_text_long)

WebUI.setText(findTestObject('Communication_Forms/30days_summary/30ds_patientcaregiverstatus'), GlobalVariable.sample_text_long)

WebUI.setText(findTestObject('Communication_Forms/30days_summary/30ds_newproblemsidentified'), GlobalVariable.sample_text_long)

WebUI.setText(findTestObject('Communication_Forms/30days_summary/30ds_commentsrecommendationplans'), GlobalVariable.sample_text_long)

WebUI.setText(findTestObject('Communication_Forms/30days_summary/30ds_changesincaremedicationwoundcare'), GlobalVariable.sample_text_long)

WebUI.delay(3)

WebUI.click(findTestObject('Communication_Forms/30days_summary/30ds_discardchanges_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Communication_Forms/30days_summary/30ds_discardchanges_discard'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Communication_Forms/30days_summary/30ds_save_btn'), FailureHandling.STOP_ON_FAILURE)

