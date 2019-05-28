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

WebUI.delay(5)

WebUI.click(findTestObject('Patient_Care/md_orders/mdo_new_form'))

WebUI.delay(3)

WebUI.click(findTestObject('Patient_Care/md_orders/mdo_new_dischargeorder'))

WebUI.delay(8)

dt = new Date()

todayd = dt.format('MM/dd/yyyy')

def commnote = 'Patient should be discharged immediately \n Note: Please consult the MD for verification \n DC Order will be effective until 5 days before the end of patient episode'

def physorder = 'The Patient needs assistance on these following functional limitations: \n Bathing \n Taking Stairs \n Wheelchair Assistance \n Lower and Upper body Dressing \n Please comply with the past recorded physician notes.'

not_run: WebUI.setText(findTestObject('MD_Orders/discharge_order/do_orderdate'), todayd)

WebUI.setText(findTestObject('MD_Orders/discharge_order/do_ordertime'), '1200')

WebUI.setText(findTestObject('MD_Orders/discharge_order/do_receiveddate'), todayd)

WebUI.click(findTestObject('MD_Orders/discharge_order/do_commtype_persontoperson'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/discharge_order/do_commtype_phone'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/discharge_order/do_commtype_fax'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/discharge_order/do_commtype_mail'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('MD_Orders/discharge_order/do_commnote'), commnote)

WebUI.delay(2)

WebUI.setText(findTestObject('MD_Orders/discharge_order/do_physicianorder'), physorder)

WebUI.delay(2)

WebUI.click(findTestObject('MD_Orders/discharge_order/do_discardchanges_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('MD_Orders/discharge_order/do_discardchanges_discard'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

not_run: WebUI.click(findTestObject('MD_Orders/discharge_order/do_savebtn'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

