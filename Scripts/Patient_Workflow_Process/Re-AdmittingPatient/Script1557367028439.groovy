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

today = new Date()

todayy = today.format('MM/dd/yyyy')

WebUI.delay(2)

'Redirecting to Patient List > Patient Manager Page\r\n'
WebUI.navigateToUrl('https://qa.medisource.com/patients/all')

'Re-admitting discharged patient\r\n'
WebUI.delay(3)

WebUI.click(findTestObject('Patient_Manager/p_man_statussort_discharged'))

WebUI.delay(3)

WebUI.click(findTestObject('Patient_Manager/p_man_re-admit_icon'))

'Update the Referral date and assign care staff (if not available) of the patient to re-admit\r\n'
WebUI.delay(3)

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_ref_date'), todayy)

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_admissiondate_sameas_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_patient_info/p_info_lname'), 'Re-Admitted')

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_M0080/m0080_rn'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_clinical_staff/clinicalstaff_rn_tf'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.sendKeys(findTestObject('Patient_Pre-Admission/pre-ad_clinical_staff/clinicalstaff_rn'), Keys.chord('RM Medisource', 
        Keys.ENTER))

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_clinical_staff/clinicalstaff_cm_tf'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Patient_Pre-Admission/pre-ad_clinical_staff/clinicalstaff_cm'), Keys.chord('CM Medisource', 
        Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_save_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

