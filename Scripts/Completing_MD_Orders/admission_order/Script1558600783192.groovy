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

not_run: WebUI.click(findTestObject('Patient_Care/md_orders/mdo_search'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.sendKeys(findTestObject('Patient_Care/md_orders/mdo_search'), Keys.chord('Admission Order', Keys.ENTER))

WebUI.click(findTestObject('Patient_Care/md_orders/mdo_arrow_up'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Patient_Care/md_orders/mdo_first_entry'))

WebUI.delay(5)

todayy = new Date()

nowtoday = todayy.format('MMddyyyy')

not_run: WebUI.setText(findTestObject('MD_Orders/admission_order/ao_orderdate'), nowtoday)

WebUI.setText(findTestObject('MD_Orders/admission_order/ao_ordertime'), '1000')

WebUI.setText(findTestObject('MD_Orders/admission_order/ao_sentdate'), nowtoday)

WebUI.setText(findTestObject('MD_Orders/admission_order/ao_receiveddate'), nowtoday)

WebUI.setText(findTestObject('MD_Orders/admission_order/ao_admitpatientto'), 'InterMed Corporation')

WebUI.delay(3)

WebUI.click(findTestObject('MD_Orders/admission_order/ao_skillednursingandtherapyneed/sntn_snvisitfreqduration'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MD_Orders/admission_order/ao_skillednursingandtherapyneed/sntn_snvisitfreqduration_tf'), 'Twice week for four weeks')

WebUI.click(findTestObject('MD_Orders/admission_order/ao_skillednursingandtherapyneed/sntn_sntoteachandinstructpatient'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/admission_order/ao_skillednursingandtherapyneed/sntn_physicaltherapist'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/admission_order/ao_skillednursingandtherapyneed/sntn_occupationaltherapist'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/admission_order/ao_skillednursingandtherapyneed/sntn_speechtherapist'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/admission_order/ao_skillednursingandtherapyneed/sntn_evaluationtherapyby'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/admission_order/ao_skillednursingandtherapyneed/sntn_evaluationandinterventionbymss'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/admission_order/ao_skillednursingandtherapyneed/sntn_chhacanduration'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MD_Orders/admission_order/ao_skillednursingandtherapyneed/sntn_chaacanduration_tf'), 'Sample text')

WebUI.click(findTestObject('MD_Orders/admission_order/ao_skillednursingandtherapyneed/sntn_dmeandsupplies'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('MD_Orders/admission_order/ao_skillednursingandtherapyneed/sntn_dmeandsupplies_tf'), 
    'Walker')

not_run: WebUI.click(findTestObject('MD_Orders/admission_order/ao_medications'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MD_Orders/admission_order/ao_additionalorders'), 'The patient food intake must be monitored all the times and observe/limit intake based on allergies listed.')

WebUI.click(findTestObject('MD_Orders/admission_order/ao_ordersreadbackandverified'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/admission_order/ao_oasistobecompletedby'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('MD_Orders/admission_order/ao_oasistobecompletedby_tf'), Keys.chord('CM Medisource', Keys.ENTER))

WebUI.delay(5)

'Save '
WebUI.click(findTestObject('MD_Orders/admission_order/ao_savebtn'), FailureHandling.STOP_ON_FAILURE)

