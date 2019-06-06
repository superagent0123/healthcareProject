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

WebUI.click(findTestObject('Patient_Care/communication/comm_new_communication_notes'))

WebUI.delay(5)

not_run: WebUI.setText(findTestObject('Communication_Forms/care_coordination_note/ccnote_date'), GlobalVariable.today_date)

WebUI.sendKeys(findTestObject('Communication_Forms/care_coordination_note/ccnote_titlesubject'), Keys.chord('Missed visit- RN', 
        Keys.ENTER))

WebUI.setText(findTestObject('Communication_Forms/care_coordination_note/ccnote_time'), GlobalVariable.today_time)

WebUI.setText(findTestObject('Communication_Forms/care_coordination_note/cnote_communicationnotes'), GlobalVariable.sample_text_long)

WebUI.click(findTestObject('Communication_Forms/care_coordination_note/ccnote_comminicatedvia_phone'))

WebUI.click(findTestObject('Communication_Forms/care_coordination_note/ccnote_comminicatedvia_fax'))

WebUI.click(findTestObject('Communication_Forms/care_coordination_note/ccnote_comminicatedvia_mail'))

WebUI.click(findTestObject('Communication_Forms/care_coordination_note/ccnote_comminicatedvia_direct'))

WebUI.delay(3)

WebUI.click(findTestObject('Communication_Forms/care_coordination_note/ccnote_discardchanges_btn'))

WebUI.delay(3)

WebUI.click(findTestObject('Communication_Forms/care_coordination_note/ccnote_discardchanges_discard'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Communication_Forms/care_coordination_note/ccnote_save_btn'))

