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

WebUI.delay(2)

'Redirecting to Patient List > Patient Manager Page\r\n'
WebUI.navigateToUrl('https://qa.medisource.com/patients/all')

'Deleting a Patient\r\n\r\n'
WebUI.delay(3)

WebUI.executeJavaScript('alert(\'Deleting a Patient\')', null)

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.setText(findTestObject('Patient_Manager/p_man_searchbar'), 'Patient - 094838')

WebUI.delay(3)

WebUI.click(findTestObject('Patient_Manager/p_man_name'))

not_run: WebUI.click(findTestObject('Patient_Manager/p_man_name_checkbox'))

WebUI.delay(3)

WebUI.click(findTestObject('Patient_Manager/p_man_delete_btn'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Patient_Manager/p_man_delete_yes'))

WebUI.click(findTestObject('Patient_Manager/p_man_delete_no'))

'Redirecting to Patient List > Patient Manager Page\r\n'
WebUI.navigateToUrl('https://qa.medisource.com/patients/all')

