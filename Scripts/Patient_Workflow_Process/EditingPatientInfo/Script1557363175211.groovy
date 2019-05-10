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

WebUI.delay(2)

'Redirecting to Patient List > Patient Manager Page\r\n'
WebUI.navigateToUrl('https://qa.medisource.com/patients/all')

'Editing Patient Information\r\n\r\n'
WebUI.delay(3)

WebUI.executeJavaScript('alert(\'Editing Patient Information\')', null)

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.setText(findTestObject('Patient_Manager/p_man_searchbar'), 'Patient - 081023')

WebUI.delay(3)

WebUI.click(findTestObject('Patient_Manager/p_man_editinfo_icon'))

'Edit the Last Name and add Allergy: shrimps'
WebUI.delay(3)

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_patient_info/p_info_lname'), 'Edited')

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_diagnosis_orders/diagnosis_allergies'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Patient_Pre-Admission/pre-ad_diagnosis_orders/diagnosis_allergies'), Keys.chord('Shrimps', 
        Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_save_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

'Redirecting to Patient List > Patient Manager Page\r\n'
WebUI.navigateToUrl('https://qa.medisource.com/patients/all')

