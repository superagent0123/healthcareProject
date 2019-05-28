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

WebUI.click(findTestObject('Patient_Care/md_orders/mdo_new_recertorder'))

WebUI.delay(5)

todayy = new Date()

todaydate = todayy.format('MM/dd/yyy')

WebUI.setText(findTestObject('MD_Orders/recertification_order/rec_sentdate'), todaydate)

WebUI.setText(findTestObject('MD_Orders/recertification_order/rec_receiveddate'), todaydate)

WebUI.setText(findTestObject('MD_Orders/recertification_order/rec_recertifypatientto'), 'InterMed Corporation')

WebUI.click(findTestObject('MD_Orders/recertification_order/rec_skillednursingandtherapyneed/sntn_snvisitfreqandduration'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MD_Orders/recertification_order/rec_skillednursingandtherapyneed/sntn_snvisitfreqandduration_tf'), 
    '4x a day for 3 weeks')

WebUI.click(findTestObject('MD_Orders/recertification_order/rec_skillednursingandtherapyneed/sntn_sntoteachinstructpatient'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/recertification_order/rec_skillednursingandtherapyneed/sntn_physicaltherapist'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/recertification_order/rec_skillednursingandtherapyneed/sntn_occupationaltherapist'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/recertification_order/rec_skillednursingandtherapyneed/sntn_speechtherapist'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/recertification_order/rec_skillednursingandtherapyneed/sntn_evaluationandinterventionbymss'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/recertification_order/rec_skillednursingandtherapyneed/sntn_chhacanvisitfreqduration'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MD_Orders/recertification_order/rec_skillednursingandtherapyneed/sntn_chhacanvisitfreqduration_tf'), 
    '3x a day for 3 weeks')

WebUI.click(findTestObject('MD_Orders/recertification_order/rec_skillednursingandtherapyneed/sntn_dme'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MD_Orders/recertification_order/rec_additionalorders'), 'The patient food intake must be monitored all the times and observe/limit intake based on allergies listed.')

WebUI.delay(3)

WebUI.click(findTestObject('MD_Orders/recertification_order/rec_disardchangesbtn'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('MD_Orders/recertification_order/rec_discardchanges_discard'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('MD_Orders/recertification_order/rec_savebtn'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

