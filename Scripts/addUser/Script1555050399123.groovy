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

WebUI.setText(findTestObject('addUser/birthdate_field'), '09101994')

WebUI.delay(2)

WebUI.click(findTestObject('addUser/race_ethnicity_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/race_ethnicty_asian'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/marital_status_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/marital_status_married'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/discipline_dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('addUser/discipline_sn'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/title_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/title_rn'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/admin_position'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/admin_position_fieldstaff'))

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/ssn'), '122-25-5566')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/employee_id'), '8')

WebUI.setText(findTestObject('addUser/address_1'), '370 Concho Dr, Sedona, AZ, 86351')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/address_2'), '126 N Etta Dr, Gold Canyon, AZ, 85118')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/city'), 'Gold Canyon')

WebUI.delay(2)

WebUI.click(findTestObject('addUser/state_dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('addUser/state_az'))

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/zipcode'), '85118')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/fax'), '(423) 444-4444')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/phone_no'), '(423) 432-4411')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/mobile_no'), '(411) 424-3321')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/email'), 'duperagent@mailinator.com')

WebUI.click(findTestObject('addUser/hiredate_calendar'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/hiredate_calendar_today'))

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/termination_date_field'), '01012030')

WebUI.delay(2)

WebUI.click(findTestObject('addUser/language_primary_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/language_primary_filipino'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/language_secondary_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/language_secondary_english'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/language_other_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/language_other_korean'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/verbal_primary_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/verbal_primary_fluent'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/verbal_secondary_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/verbal_secondary_fluent'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/verbal_other_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/verbal_other_fluent'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/reading_primary_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/reading_primary_fluent'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/reading_secondary_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/reading_secondary_fluent'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/reading_other_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/reading_other_fluent'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/writing_primary_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/writing_primary_fluent'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/writing_secondary_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/writing_secondary_fluent'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/writing_other_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/writing_other_fluent'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/next_button'))

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/professional_license_id'), '040119')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/professional_license_effectivedate'), '04012019')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/professional_license_expirationdate'), '04012029')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/professional_license_dateverified'), '04012019')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/professional_license_verifiedby'), 'JB Ortiz Doria III')

WebUI.delay(2)

WebUI.click(findTestObject('addUser/professional_license_status_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/professional_license_status_current'))

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/professional_license_notes_input'), 'Copy on File')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('addUser/license_certificate_id'), '040219')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/license_certificate_effectivedate'), '04022019')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/license_certificate_expirationdate'), '04022029')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/license_certificate_dateverified'), '04022019')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/license_certificate_verifiedby'), 'JB Ortiz Doria III')

WebUI.delay(2)

WebUI.click(findTestObject('addUser/license_certificate_status_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/license_certificate_status_current'))

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/license_certificate_notes_input'), 'Copy on File')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/cpr_bls_id'), '040319')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/cpr_bls_effectivedate'), '04032019')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/cpr_bls_expirationdate'), '04032029')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/cpr_bls_dateverified'), '04032019')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/cpr_bls_verifiedby'), 'JB Ortiz Doria III')

WebUI.delay(2)

WebUI.click(findTestObject('addUser/cpr_bls_status_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/cpr_bls_status_current'))

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/cpr_bls_notes_input'), 'Copy on File')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/driver_license_id'), '040419')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/driver_license_effectivedate'), '04042019')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/driver_license_expirationdate'), '04042029')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/driver_license_dateverified'), '04042019')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/driver_license_verifiedby'), 'JB Ortiz Doria III')

WebUI.delay(2)

WebUI.click(findTestObject('addUser/driver_license_status_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/driver_license_status_current'))

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/driver_license_notes_input'), 'Copy on File')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/car_insurance_id'), '040519')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/car_insurance_effectivedate'), '04052019')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/car_insurance_expirationdate'), '04052029')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/car_insurance_dateverified'), '04052019')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/car_insurance_verifiedby'), 'JB Ortiz Doria III')

WebUI.delay(2)

WebUI.click(findTestObject('addUser/car_insurance_status_dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('addUser/car_insurance_status_current'))

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/car_insurance_notes_input'), 'Copy on File')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/annual_performance_effectivedate'), '04062019')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/annual_performance_expirationdate'), '04062029')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/annual_performance_dateverified'), '04062019')

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/annual_performance_verifiedby'), 'JB Ortiz Doria III')

WebUI.delay(2)

WebUI.click(findTestObject('addUser/annual_performance_status_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('addUser/annual_performance_status_current'))

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/annual_performance_notes_input'), 'Copy on File')

WebUI.delay(2)

WebUI.click(findTestObject('addUser/live_scan_verifiedby'))

WebUI.click(findTestObject('addUser/next_2_button'))

WebUI.delay(2)

