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
import org.openqa.selenium.Keys as Keys

WebUI.delay(3)

WebUI.click(findTestObject('Patient_Care/communication/comm_new_form'))

WebUI.delay(3)

WebUI.click(findTestObject('Patient_Care/communication/comm_new_caseconference'))

WebUI.delay(5)

WebUI.setText(findTestObject('Communication_Forms/case_conference/casecon_datecreated'), GlobalVariable.today_date)

WebUI.setText(findTestObject('Communication_Forms/case_conference/casecon_purposeoftheconference'), GlobalVariable.sample_text_long)

WebUI.setText(findTestObject('Communication_Forms/case_conference/casecon_assessmentofpatientstatus'), GlobalVariable.sample_text_long)

WebUI.delay(3)

WebUI.setText(findTestObject('Communication_Forms/case_conference/casecon_followupdate'), GlobalVariable.today_date)

WebUI.setText(findTestObject('Communication_Forms/case_conference/casecon_planofactionstobetaken'), GlobalVariable.sample_text_long)

WebUI.click(findTestObject('Communication_Forms/case_conference/casecon_participants_facetoface'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Communication_Forms/case_conference/casecon_participants_phone'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Communication_Forms/case_conference/casecon_participants_online'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Communication_Forms/case_conference/casecon_clinicians_dd'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Communication_Forms/case_conference/casecon_clinicians_tf'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Communication_Forms/case_conference/casecon_superagent_signbtn'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Communication_Forms/case_conference/casecon_superagent_comments'), GlobalVariable.sample_text_long)

WebUI.click(findTestObject('Communication_Forms/case_conference/casecon_dischargechanges_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Communication_Forms/case_conference/casecon_discardchanges_discard'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Communication_Forms/case_conference/casecon_save_btn'), FailureHandling.STOP_ON_FAILURE)

