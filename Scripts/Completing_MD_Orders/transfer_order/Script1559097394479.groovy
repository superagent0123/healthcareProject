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

WebUI.click(findTestObject('Patient_Care/md_orders/mdo_new_form'))

WebUI.delay(3)

WebUI.click(findTestObject('Patient_Care/md_orders/mdo_new_transferorder'))

WebUI.delay(8)

todayy = new Date()

tdate = todayy.format('MM/dd/yyyy')

def tnscommnote = 'Patient ______ is an 45 years old patient followed in our pediatric rheumatology practice who will be transferring to the specified Healthcare facilty. \n The patient first appointment with you is scheduled on ______. His primary diagnosis is ____ and other important medical concerns include ____. \n You also may want to know that _____ and enclosed please find a medical summary and other pertinent records.'

def phytransorder = 'Anticipated complexity of this transfer to adult care: \n Low complexity \n Moderate complexity \n High Complexity \n This transfer order includes: \n Transfer letter \n Medical Summary \n Guardianship or health proxy documents if indicated \n Fact sheet about condition \n Additional records'

WebUI.setText(findTestObject('MD_Orders/transfer_order/to_orderdate'), tdate)

WebUI.setText(findTestObject('MD_Orders/transfer_order/to_time'), '1200')

WebUI.setText(findTestObject('MD_Orders/transfer_order/to_receiveddate'), tdate)

WebUI.click(findTestObject('MD_Orders/transfer_order/to_commtype_persontoperson'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/transfer_order/to_commtypephone'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/transfer_order/to_commtypefax'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/transfer_order/to_commtypemail'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MD_Orders/transfer_order/to_commnote'), tnscommnote)

WebUI.click(findTestObject('MD_Orders/transfer_order/to_transferredto_dd'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/transfer_order/to_transferredto_tf'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MD_Orders/transfer_order/to_physicianorder'), phytransorder)

WebUI.delay(3)

not_run: WebUI.click(findTestObject('MD_Orders/transfer_order/to_discardchanges_btn'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('MD_Orders/transfer_order/to_discardchanges_cancel'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/transfer_order/to_savebtn'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('MD_Orders/transfer_order/transfer_esign'), '12345678')

WebUI.delay(3)

WebUI.click(findTestObject('MD_Orders/transfer_order/transfer_esign_submit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

