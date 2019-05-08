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

WebUI.setText(findTestObject('Object Repository/addUser/Page_Medisource  Login/input_Please try afterminutes.'), 'kenkenrn')

WebUI.setEncryptedText(findTestObject('Object Repository/addUser/Page_Medisource  Login/input_Username or email requir'), 
    'SITHpLWAWtLnr/hOhnpplQ==')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/addUser/Page_Medisource  Login/button_Login'))

WebUI.delay(3)

'Patient: Khenard Automation\r\n'
WebUI.navigateToUrl('https://qa.medisource.com/patients/all')

WebUI.delay(1)

WebUI.navigateToUrl('https://qa.medisource.com/patientcare/638B92A0-A489-410B-8056-906FE598F197/9F6A772C-C308-499E-BA52-A7BF3652D416/overview')

WebUI.delay(1)

WebUI.navigateToUrl('https://qa.medisource.com/patientcare/638B92A0-A489-410B-8056-906FE598F197/9F6A772C-C308-499E-BA52-A7BF3652D416/2019/oasis/clinical/soc/9405B47D-64F0-4CF9-A5FA-25C79AC5A572/638B92A0-A489-410B-8056-906FE598F197')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/OASIS_TABS/xitemedits_btn'))

