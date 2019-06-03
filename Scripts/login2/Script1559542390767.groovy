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

for (rowNum=1; rowNum <= findTestData('login2').getRowNumbers(); rowNum++) { 
	
	WebUI.setText(findTestObject('LogIn/username'), findTestData('login2').getValue(1, rowNum))
	WebUI.delay(3)
	
	WebUI.setText(findTestObject('LogIn/password'), findTestData('login2').getValue(2, rowNum))
	WebUI.delay(3)
	
	
}





WebUI.click(findTestObject('LogIn/login_button'))

WebUI.delay(3)

