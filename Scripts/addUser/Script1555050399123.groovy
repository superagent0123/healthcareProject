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

WebUI.navigateToUrl('https://qa.medisource.com/members/create')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/addUser/Page_Medisource  Main/input_First Name_firstname'), 'Duper')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/addUser/Page_Medisource  Main/input_Last Name_lastname'), 'Agent')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/addUser/Page_Medisource  Main/input_Middle Initial_mi'), 'X')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/addUser/Page_Medisource  Main/input_Suffix_suffix'), 'III')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/addUser/Page_Medisource  Main/input_Female_gender2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/addUser/Page_Medisource  Main/img_Birth Date_ui-datepicker-t'))

WebUI.click(findTestObject('Object Repository/addUser/Page_Medisource  Main/a_1'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/marital_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/maritalstatus_single'))

WebUI.delay(2)

