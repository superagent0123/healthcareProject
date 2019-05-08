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

'Completing a physician order\r\n'
WebUI.click(findTestObject('MD_Orders/physician_order/po_orderdate_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_orderdate_today'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MD_Orders/physician_order/po_ordertime'), '1200')

WebUI.click(findTestObject('MD_Orders/physician_order/po_sentdate_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_sentdate_today'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_receiveddate_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_receiveddate_today'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_subject_patientcondition'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_subject_medication'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('MD_Orders/physician_order/po_subject_visits'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_subject_snevaluation'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_subject_lab'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_subject_others'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MD_Orders/physician_order/po_subject_otherstf'), 'Mental Health Therapy')

WebUI.click(findTestObject('MD_Orders/physician_order/po_commtype_persontoperson'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_commtype_phone'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_commtype_fax'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_commtype_mail'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_mdordergiven_yes'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MD_Orders/physician_order/po_commnote'), 'I am writing on behalf of my patient, (patient name) to document the medical necessity of')

WebUI.setText(findTestObject('MD_Orders/physician_order/po_porder'), 'Include information on the treatment up to this point, course of care and why the')

WebUI.click(findTestObject('MD_Orders/physician_order/po_attachfiles_btn'))

WebUI.delay(3)

/*
WebUI.sendKeys(findTestObject('MD_Orders/physician_order/po_attachfiles_btn'), Keys.chord('C:\\Users\\Khenard Figuracion\\Pictures\\image.png', 
        Keys.ENTER))

not_run: Runtime.getRuntime().exec('C:\\Users\\Khenard Figuracion\\Pictures\\image.png')*/
CustomKeywords.'com.katalon.WebUICustomKeyword.uploadFile'(findTestObject('MD_Orders/physician_order/po_attachfiles_btn'), 
    'C:\\Users\\Khenard Figuracion\\Pictures\\image.png')

