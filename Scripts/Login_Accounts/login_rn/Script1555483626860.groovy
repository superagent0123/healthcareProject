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

WebUI.delay(3)

WebUI.setText(findTestObject('LogIn/username'), 'jbnurse@intermed')

WebUI.delay(3)

WebUI.setEncryptedText(findTestObject('LogIn/password'), '7R8xyZjhQ0BdAr3CQOVX0g==')

WebUI.delay(3)

WebUI.click(findTestObject('LogIn/login_button'))

WebUI.delay(3)

'Patient List'
WebUI.navigateToUrl('https://qa.medisource.com/patients/all')

WebUI.delay(3)

'Selected Patient'
WebUI.navigateToUrl('https://qa.medisource.com/patientcare/4FBAE309-21E6-46B9-ACA1-C27AAC6552A9/F5B3F516-A991-49AD-BD8F-120E53DAF1D4/overview')

WebUI.delay(3)

'Patient OASIS'
WebUI.navigateToUrl('https://qa.medisource.com/patientcare/4FBAE309-21E6-46B9-ACA1-C27AAC6552A9/F5B3F516-A991-49AD-BD8F-120E53DAF1D4/2019/oasis/clinical/soc/CAB28734-CC0C-4DE8-9034-30BD345335A7/4FBAE309-21E6-46B9-ACA1-C27AAC6552A9')

WebUI.delay(5)

