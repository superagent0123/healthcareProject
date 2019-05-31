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

WebUI.delay(5)

not_run: WebUI.click(findTestObject('Patient_Care/md_orders/mdo_search'))

not_run: WebUI.sendKeys(findTestObject('Patient_Care/md_orders/mdo_search'), Keys.chord('Plan of Care', Keys.ENTER))

WebUI.click(findTestObject('Patient_Care/md_orders/mdo_status_filter_dd'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Patient_Care/md_orders/mdo_status_filter_tf'), Keys.chord('In Progress', Keys.ENTER))

WebUI.delay(5)

today = new Date()

tdate = today.format('MM/dd/yyyy')

def sampletext = 'This is a sample text \n generated through an automated testing software \n Everything is good.'

'Default Second Entry on MD Orders is the Physician Certification Face to Face Encounter\r\n'
WebUI.click(findTestObject('Patient_Care/md_orders/mdo_second_entry'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

'Default Second Entry on MD Orders is the Physician Certification Face to Face Encounter\r\n'
WebUI.setText(findTestObject('MD_Orders/physician_certification_f2fencounter/pcffe_sentdate'), tdate)

'Default Second Entry on MD Orders is the Physician Certification Face to Face Encounter\r\n'
WebUI.setText(findTestObject('MD_Orders/physician_certification_f2fencounter/pcffe_receiveddate'), tdate)

'Default Second Entry on MD Orders is the Physician Certification Face to Face Encounter\r\n'
WebUI.click(findTestObject('MD_Orders/physician_certification_f2fencounter/pcffe_hospitalconductedf2fencounter'), FailureHandling.STOP_ON_FAILURE)

'Default Second Entry on MD Orders is the Physician Certification Face to Face Encounter\r\n'
WebUI.click(findTestObject('MD_Orders/physician_certification_f2fencounter/pcffe_f2fencounterconducted90days'), FailureHandling.STOP_ON_FAILURE)

'Default Second Entry on MD Orders is the Physician Certification Face to Face Encounter\r\n'
WebUI.click(findTestObject('MD_Orders/physician_certification_f2fencounter/pcffe_f2fencounterconducted30days'), FailureHandling.STOP_ON_FAILURE)

'Default Second Entry on MD Orders is the Physician Certification Face to Face Encounter\r\n'
WebUI.click(findTestObject('MD_Orders/physician_certification_f2fencounter/pcffe_icertify_skillednursing'), FailureHandling.STOP_ON_FAILURE)

'Default Second Entry on MD Orders is the Physician Certification Face to Face Encounter\r\n'
WebUI.click(findTestObject('MD_Orders/physician_certification_f2fencounter/pcffe_icertify_physicaltherapy'), FailureHandling.STOP_ON_FAILURE)

'Default Second Entry on MD Orders is the Physician Certification Face to Face Encounter\r\n'
WebUI.click(findTestObject('MD_Orders/physician_certification_f2fencounter/pcffe_occupationaltherapy'), FailureHandling.STOP_ON_FAILURE)

'Default Second Entry on MD Orders is the Physician Certification Face to Face Encounter\r\n'
WebUI.click(findTestObject('MD_Orders/physician_certification_f2fencounter/pcffe_speechlanguagepathology'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

'Default Second Entry on MD Orders is the Physician Certification Face to Face Encounter\r\n'
WebUI.setText(findTestObject('MD_Orders/physician_certification_f2fencounter/pcffe_encounterwithpatientwasinwhole'), sampletext)

'Default Second Entry on MD Orders is the Physician Certification Face to Face Encounter\r\n'
WebUI.setText(findTestObject('MD_Orders/physician_certification_f2fencounter/pcffe_theclinicalfindingsstatebelowsupport'), 
    sampletext)

'Default Second Entry on MD Orders is the Physician Certification Face to Face Encounter\r\n'
WebUI.setText(findTestObject('MD_Orders/physician_certification_f2fencounter/pcffe_furthericertifythatmyclinicalfindings'), 
    sampletext)

WebUI.delay(2)

'Default Second Entry on MD Orders is the Physician Certification Face to Face Encounter\r\n'
WebUI.click(findTestObject('MD_Orders/physician_certification_f2fencounter/pcffe_discardchanges_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

'Default Second Entry on MD Orders is the Physician Certification Face to Face Encounter\r\n'
WebUI.click(findTestObject('MD_Orders/physician_certification_f2fencounter/pcffe_discardchanges_discard'), FailureHandling.STOP_ON_FAILURE)

'Default Second Entry on MD Orders is the Physician Certification Face to Face Encounter\r\n'
not_run: WebUI.click(findTestObject('MD_Orders/physician_certification_f2fencounter/pcffe_savebtn'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

