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

'Add Patient > Patient Pre-Admission page'
WebUI.navigateToUrl('https://qa.medisource.com/patient')

today = new Date()

dtoday = today.format('MM/dd/yyyy')

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_ref_date'), dtoday)

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_MRN_auto-assign'))

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_admissiondate_sameas_btn'))

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_patient_info/p_info_lname'), 'Automated')

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_patient_info/p_info_fname'), 'Patient')

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_patient_info/p_info_minitial'), 'I')

not_run: WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_patient_info/p_info_suffix'), '')

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_patient_info/p_info_bdate'), '2071997')

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_patient_info/p_info_gender_male'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_patient_info/p_info_marital_select'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Patient_Pre-Admission/pre-ad_patient_info/p_info_marital_status'), Keys.chord('Single', Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_patient_info/p_info_ethnicity'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Patient_Pre-Admission/pre-ad_patient_info/p_info_ethnicity'), Keys.chord('White', Keys.ENTER, 
        'Asian', Keys.ENTER, 'Hispanic ', Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_patient_info/p_info_language_spoken'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Patient_Pre-Admission/pre-ad_patient_info/p_info_language_spoken'), Keys.chord('English', 
        Keys.ENTER, 'Spanish', Keys.ENTER, 'Mandarin', Keys.ENTER, 'Cantonese', Keys.ENTER, 'Vietnamese', Keys.ENTER, 'Russian', 
        Keys.ENTER))

