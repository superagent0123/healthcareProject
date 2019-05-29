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

def sampletext = 'This is a sample text \n generated through an automated testing software \n THe patient is in lit condition \n everything is good, man.'

'Default Thrid Entry on MD Orders is the Plan of Care/485 (SOC)'
WebUI.click(findTestObject('Patient_Care/md_orders/mdo_third_entry'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('MD_Orders/plan_of_care_485/poc_tabs/poc_diagnosis_tab'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('MD_Orders/plan_of_care_485/poc_tabs/poc_medications_tab'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('MD_Orders/plan_of_care_485/poc_tabs/poc_precautions_tab'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('MD_Orders/plan_of_care_485/poc_tabs/poc_limitations_tab'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('MD_Orders/plan_of_care_485/poc_tabs/poc_orders_tab'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('MD_Orders/plan_of_care_485/poc_orders/order_other_textarea'), sampletext)

WebUI.delay(3)

WebUI.click(findTestObject('MD_Orders/plan_of_care_485/poc_orders/order_medicalsocialserviceseval'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MD_Orders/plan_of_care_485/poc_orders/order_medicalsocialserviceseval_tf'), 'Noted by: Khenard Figuracion')

not_run: WebUI.setText(findTestObject('MD_Orders/plan_of_care_485/poc_orders/order_medicalsocialserviceseval_tf'), sampletext)

WebUI.delay(5)

WebUI.click(findTestObject('MD_Orders/plan_of_care_485/poc_orders/order_physicaltherapyeval'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MD_Orders/plan_of_care_485/poc_orders/order_physicaltherapyeval_textarea'), sampletext)

WebUI.delay(5)

WebUI.click(findTestObject('MD_Orders/plan_of_care_485/poc_orders/order_occupationaltherapyeval'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MD_Orders/plan_of_care_485/poc_orders/order_occupationtherapyeval_textarea'), sampletext)

WebUI.delay(5)

WebUI.click(findTestObject('MD_Orders/plan_of_care_485/poc_orders/order_speechtherapyeval'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MD_Orders/plan_of_care_485/poc_orders/order_speechtherapyeval_tf'), sampletext)

WebUI.delay(5)

WebUI.setText(findTestObject('MD_Orders/plan_of_care_485/poc_additonalorders/aorders_genassessment'), sampletext)

WebUI.setText(findTestObject('MD_Orders/plan_of_care_485/poc_additonalorders/aorders_sntoperform'), sampletext)

WebUI.setText(findTestObject('MD_Orders/plan_of_care_485/poc_additonalorders/aorders_sntoteachandinstruct'), sampletext)

WebUI.setText(findTestObject('MD_Orders/plan_of_care_485/poc_additonalorders/aorders_sntoreprttophysician'), sampletext)

WebUI.delay(5)

WebUI.click(findTestObject('MD_Orders/plan_of_care_485/poc_tabs/poc_goals_tab'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.setText(findTestObject('MD_Orders/plan_of_care_485/poc_goals/goals_textarea'), sampletext)

WebUI.delay(5)

WebUI.click(findTestObject('MD_Orders/plan_of_care_485/poc_tabs/poc_other_tab'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('MD_Orders/plan_of_care_485/poc_other/rehabpotential_other'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MD_Orders/plan_of_care_485/poc_other/rehabpotential_other_textarea'), sampletext)

WebUI.click(findTestObject('MD_Orders/plan_of_care_485/poc_other/dischargeplan_patientwillbedischarged'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/plan_of_care_485/poc_other/dischargesummary_availabletoMDuponrequest'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MD_Orders/plan_of_care_485/poc_other/60daysummary_textarea'), sampletext)

WebUI.delay(5)

WebUI.click(findTestObject('MD_Orders/plan_of_care_485/poc_other/poc_discardchanges_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('MD_Orders/plan_of_care_485/poc_other/poc_discardchanges_cancel'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('MD_Orders/plan_of_care_485/poc_other/poc_savebtn'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

