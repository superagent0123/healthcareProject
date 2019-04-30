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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.medisource.com/login')

WebUI.setText(findTestObject('Object Repository/addUser/Page_Medisource  Login/input_Please try afterminutes.'), 'superagent')

WebUI.setEncryptedText(findTestObject('Object Repository/addUser/Page_Medisource  Login/input_Username or email requir'), 
    'SITHpLWAWtI8C4F8RIujvA==')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/addUser/Page_Medisource  Login/button_Login'))

WebUI.delay(3)

WebUI.navigateToUrl('https://qa.medisource.com/patients/all')

WebUI.delay(1)

'Select the patient: task tab link'
WebUI.navigateToUrl('https://qa.medisource.com/patientcare/7A8DDC98-19FC-470D-93B9-DEBD3B09D9F7/F813D137-B6FE-41FD-A8FC-04BE4CEF5E6B/overview')

WebUI.delay(1)

'Patient OASIS link'
WebUI.navigateToUrl('https://qa.medisource.com/patientcare/7A8DDC98-19FC-470D-93B9-DEBD3B09D9F7/F813D137-B6FE-41FD-A8FC-04BE4CEF5E6B/2019/oasis/clinical/soc/663D7785-5851-4882-B251-3BBEE917C2FE/7A8DDC98-19FC-470D-93B9-DEBD3B09D9F7')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/OASIS_TABS/xitemedits_btn'))

