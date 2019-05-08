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

randomnum = today.format('HHmmss')

sn = '123'

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_admissiondate_sameas_btn'))

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_patient_info/p_info_lname'), 'Automated')

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_patient_info/p_info_fname'), 'Patient - ' + randomnum)

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_patient_info/p_info_minitial'), 'I')

not_run: WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_patient_info/p_info_suffix'), 'III')

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

WebUI.sendKeys(findTestObject('Patient_Pre-Admission/pre-ad_patient_info/p_info_language_spoken'), Keys.chord('Russian', 
        Keys.ENTER, 'Mandarin', Keys.ENTER))

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_patient_info/p_info_ssn'), randomnum + sn)

WebUI.delay(2)

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_patient_address/p_address_address1'), '10035 Jacks Rd, West Point, MS, 39773')

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_patient_address/p_address_majorcrossstr'), '10035 Jacks Rd')

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_patient_address/p_address_city'), 'West Point')

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_patient_address/p_address_state_tf'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Patient_Pre-Admission/pre-ad_patient_address/p_address_state'), Keys.chord('MS', Keys.ENTER))

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Patient_Pre-Admission/pre-ad_patient_address/p_adddress_ZIPcode'), Keys.chord('39773', Keys.ENTER))

not_run: WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_patient_address/p_adddress_ZIPcode'), '39773')

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_patient_address/p_address_phone1'), '4534233455')

WebUI.delay(1)

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_servicedeliveryaddress/sdaddress_sameaspatient_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_living situation/livingsituation_larrangement_livesalone'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_living situation/livingsituation_assistance_roundtheclock'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_living situation/livingsituation_caregivername'), 'Missandei of Naath')

WebUI.delay(1)

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_emergency_contact/emergency_name'), 'Jaime Lannister')

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_emergency_contact/emergency_relationship'), 'Brother')

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_emergency_contact/emergency_phone1'), '4343444434')

WebUI.delay(1)

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_physician_info/physician_attending_tf'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Patient_Pre-Admission/pre-ad_physician_info/physician_attending'), Keys.chord('Adrian', Keys.ENTER))

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_physician_info/physician_primary_care_sameas_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_insurance_info/insurance_primary_tf'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Patient_Pre-Admission/pre-ad_insurance_info/insurance_primary'), Keys.chord('AAA', Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_referral_info/referral_typeofadmission_tf'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Patient_Pre-Admission/pre-ad_referral_info/referral_typeofadmission'), Keys.chord('1', Keys.ENTER))

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_referral_info/referral_admissionsource_tf'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Patient_Pre-Admission/pre-ad_referral_info/referral_admissionsource'), Keys.chord('2', Keys.ENTER))

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_referral_info/referral_type_tf'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Patient_Pre-Admission/pre-ad_referral_info/referral_type'), Keys.chord('Other', Keys.ENTER))

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_referral_info/referral_source_tf'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Patient_Pre-Admission/pre-ad_referral_info/referral_source'), Keys.chord('JB Doria', Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_hospitalization_info/hospital_hospital_tf'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Patient_Pre-Admission/pre-ad_hospitalization_info/hospital_hospital'), Keys.chord('Advanced Care Hospital', 
        Keys.ENTER))

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_hospitalization_info/hospital_facility_admitdate'), '1012017')

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_hospitalization_info/hospital_dischargedate'), '2282017')

WebUI.delay(1)

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_diagnosis_orders/diagnosis_primary'), 'Carcinoma in situ of floor of mouth')

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_diagnosis_orders/diagnosis_secondary'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Patient_Pre-Admission/pre-ad_diagnosis_orders/diagnosis_secondary'), Keys.chord('Iron deficiency anemia secondary to blood loss (chronic)', 
        Keys.ENTER))

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_diagnosis_orders/diagnosis_surgery'), 'Acne Surgery')

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_diagnosis_orders/diagnosis_allergies'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Patient_Pre-Admission/pre-ad_diagnosis_orders/diagnosis_allergies'), Keys.chord('Gluten', 
        Keys.ENTER, 'Peanuts', Keys.ENTER, 'Shellfish', Keys.ENTER, 'Wheat', Keys.ENTER))

WebUI.setText(findTestObject('Patient_Pre-Admission/pre-ad_diagnosis_orders/diagnosis_pre-ad_orders'), 'The patient food intake must be monitored all the times and observe/limit intake based on allergies listed.')

'Redirected to Medication Profile page upon saving.'
not_run: WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_diagnosis_orders/diagnosis_ivtherapyorder_yes'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_diagnosis_orders/diagnosis_dmeneeded'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Patient_Pre-Admission/pre-ad_diagnosis_orders/diagnosis_dmeneeded'), Keys.chord('Walker', 
        Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_M0080/m0080_rn'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_clinical_staff/clinicalstaff_rn_tf'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Patient_Pre-Admission/pre-ad_clinical_staff/clinicalstaff_rn'), Keys.chord('RN Medisource', 
        Keys.ENTER))

WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_clinical_staff/clinicalstaff_cm_tf'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Patient_Pre-Admission/pre-ad_clinical_staff/clinicalstaff_cm'), Keys.chord('CM Medisource', 
        Keys.ENTER))

WebUI.delay(1)

'Save Patient\r\n'
WebUI.click(findTestObject('Patient_Pre-Admission/pre-ad_save_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

