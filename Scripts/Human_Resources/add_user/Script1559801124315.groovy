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

WebUI.navigateToUrl('https://qa.medisource.com/members/create')

WebUI.delay(5)

today = new Date()

randomnum = today.format('HHmmss')

WebUI.setText(findTestObject('addUser/Page_Medisource  Main/input_First Name_firstname'), 'User ' + randomnum)

WebUI.setText(findTestObject('addUser/Page_Medisource  Main/input_Last Name_lastname'), 'Automated')

WebUI.setText(findTestObject('addUser/Page_Medisource  Main/input_Middle Initial_mi'), 'I')

WebUI.setText(findTestObject('addUser/Page_Medisource  Main/input_Suffix_suffix'), 'Jr.')

WebUI.click(findTestObject('addUser/Page_Medisource  Main/input_Female_gender2'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('addUser/user_bdate'), '02071997')

WebUI.click(findTestObject('addUser/user_race_dd'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('addUser/user_race_tf'), Keys.chord('American', Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('addUser/user_marital_status_dd'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('addUser/user_marital_status_tf'), Keys.chord('Single', Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('addUser/user_discipline_dd'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('addUser/user_discipline_tf'), Keys.chord('Skilled Nurse', Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('addUser/user_title_dd'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('addUser/user_title_tf'), Keys.chord('Registered Nurse', Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('addUser/user_hirecategory_dd'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('addUser/user_hirecategory_tf'), Keys.chord('Direct Hire', Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('addUser/user_position_dd'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('addUser/user_position_tf'), Keys.chord('Registered Nurse', Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('addUser/Page_Medisource  Main/input_Social Security Number_s'), '231' + randomnum)

WebUI.setText(findTestObject('addUser/employee_id'), '09')

WebUI.setText(findTestObject('addUser/user_company'), 'MEDISOURCE, LLC.')

WebUI.setText(findTestObject('addUser/address_1'), GlobalVariable.sample_address)

WebUI.setText(findTestObject('addUser/address_2'), GlobalVariable.sample_address)

WebUI.setText(findTestObject('addUser/city'), GlobalVariable.sample_city)

WebUI.click(findTestObject('addUser/state_dd'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('addUser/state_az'), Keys.chord('HI', Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('addUser/zipcode'), GlobalVariable.sample_ZIP_code)

WebUI.delay(3)

WebUI.setText(findTestObject('addUser/phone_no'), GlobalVariable.sample_phone_num)

WebUI.setText(findTestObject('addUser/mobile_no'), GlobalVariable.sample_phone_num)

WebUI.setText(findTestObject('addUser/fax'), GlobalVariable.sample_phone_num)

WebUI.setText(findTestObject('addUser/email'), GlobalVariable.sample_email)

WebUI.delay(3)

WebUI.click(findTestObject('addUser/hiredate_calendar'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('addUser/hiredate_calendar_today'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('addUser/language_primary_dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('addUser/language_primary_filipino'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('addUser/language_secondary_dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('addUser/language_secondary_english'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('addUser/language_other_dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('addUser/language_other_korean'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('addUser/verbal_primary_dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('addUser/verbal_primary_fluent'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('addUser/verbal_secondary_dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('addUser/verbal_secondary_fluent'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('addUser/verbal_other_dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('addUser/verbal_other_fluent'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('addUser/reading_primary_dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('addUser/reading_primary_fluent'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('addUser/reading_secondary_dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('addUser/reading_secondary_fluent'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('addUser/reading_other_dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('addUser/reading_other_fluent'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('addUser/writing_primary_dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('addUser/writing_primary_fluent'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('addUser/writing_secondary_dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('addUser/writing_secondary_fluent'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('addUser/writing_other_dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('addUser/writing_other_fluent'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

not_run: WebUI.click(findTestObject('addUser/professional_cred_tab'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('addUser/next_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/professional_credentials/cred_profcert_idlicensecert'), '1234344441')

WebUI.setText(findTestObject('addUser/professional_credentials/cred_profcert_effectivedate'), GlobalVariable.today_date)

WebUI.setText(findTestObject('addUser/professional_credentials/cred_profcert_expirationdate'), '06072025')

WebUI.setText(findTestObject('addUser/professional_credentials/cred_profcert_dateverified'), GlobalVariable.today_date)

WebUI.setText(findTestObject('addUser/professional_credentials/cred_profcert_verifiedby'), 'RN Medisource')

WebUI.sendKeys(findTestObject('addUser/professional_credentials/cred_profcert_notes'), Keys.chord('Copy on File', Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('addUser/professional_credentials/cred_licensecertverification_idlicensecert'), '1234344441')

WebUI.setText(findTestObject('addUser/professional_credentials/cred_licensecertverification_effectivedate'), GlobalVariable.today_date)

WebUI.setText(findTestObject('addUser/professional_credentials/cred_licensecertverification_expirationdate'), '06072025')

WebUI.setText(findTestObject('addUser/professional_credentials/cred_licensecertverification_dateverified'), GlobalVariable.today_date)

WebUI.setText(findTestObject('addUser/professional_credentials/cred_licensecertverification_verifiedby'), 'RN Medisource')

WebUI.sendKeys(findTestObject('addUser/professional_credentials/cred_licensecertverification_notes'), Keys.chord('Copy on File', 
        Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('addUser/professional_credentials/cred_cprbls_idlicensecert'), '1234344441')

WebUI.setText(findTestObject('addUser/professional_credentials/cred_cprbls_effectivedate'), GlobalVariable.today_date)

WebUI.setText(findTestObject('addUser/professional_credentials/cred_cprbls_expirationdate'), '06072025')

WebUI.setText(findTestObject('addUser/professional_credentials/cred_cprbls_dateverified'), GlobalVariable.today_date)

WebUI.setText(findTestObject('addUser/professional_credentials/cred_cprbls_verifiedby'), 'RN Medisource')

WebUI.sendKeys(findTestObject('addUser/professional_credentials/cred_cprbls_notes'), Keys.chord('Copy on File', Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('addUser/professional_credentials/cred_driverlicense_idlicensecert'), '1234344441')

WebUI.setText(findTestObject('addUser/professional_credentials/cred_driverlicense_effectivedate'), GlobalVariable.today_date)

WebUI.setText(findTestObject('addUser/professional_credentials/cred_driverlicense_expirationdate'), '06072025')

WebUI.setText(findTestObject('addUser/professional_credentials/cred_driverlicense_dateverified'), GlobalVariable.today_date)

WebUI.setText(findTestObject('addUser/professional_credentials/cred_driverlicense_verifiedby'), 'RN Medisource')

WebUI.sendKeys(findTestObject('addUser/professional_credentials/cred_driverlicense_notes'), Keys.chord('Copy on File', Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('addUser/professional_credentials/cred_carinsurance_idlicensecert'), '1234344441')

WebUI.setText(findTestObject('addUser/professional_credentials/cred_carinsurance_effectivedate'), GlobalVariable.today_date)

WebUI.setText(findTestObject('addUser/professional_credentials/cred_carinsurance_expirationdate'), '06072025')

WebUI.setText(findTestObject('addUser/professional_credentials/cred_carinsurance_dateverified'), GlobalVariable.today_date)

WebUI.setText(findTestObject('addUser/professional_credentials/cred_carinsurance_verifiedby'), 'RN Medisource')

WebUI.sendKeys(findTestObject('addUser/professional_credentials/cred_carinsurance_notes'), Keys.chord('Copy on File', Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('addUser/professional_credentials/cred_annaualpereval_effectivedate'), GlobalVariable.today_date)

WebUI.setText(findTestObject('addUser/professional_credentials/cred_annaualpereval_expirationdate'), '06072025')

WebUI.setText(findTestObject('addUser/professional_credentials/cred_annaualpereval_dateverified'), GlobalVariable.today_date)

WebUI.setText(findTestObject('addUser/professional_credentials/cred_annaualpereval_verifiedby'), 'RN Medisource')

WebUI.sendKeys(findTestObject('addUser/professional_credentials/cred_annaualpereval_notes'), Keys.chord('Copy on File', 
        Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('addUser/health_cred_tab'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/health_credentials/hcred_phyexam_effectivedate'), GlobalVariable.today_date)

WebUI.setText(findTestObject('addUser/health_credentials/hcred_phyexam_expirationdate'), '06062025')

WebUI.setText(findTestObject('addUser/health_credentials/hcred_phyexam_dateverified'), GlobalVariable.today_date)

WebUI.setText(findTestObject('addUser/health_credentials/hcred_phyexam_verifiedby'), 'RN Medisource')

WebUI.sendKeys(findTestObject('addUser/health_credentials/hcred_phyexam_notes'), Keys.chord('Copy on File', Keys.ENTER))

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/health_credentials/hcred_chestxray_effectivedate'), GlobalVariable.today_date)

WebUI.setText(findTestObject('addUser/health_credentials/hcred_chestxray_expirationdate'), '06062025')

WebUI.setText(findTestObject('addUser/health_credentials/hcred_chestxray_dateverified'), GlobalVariable.today_date)

WebUI.setText(findTestObject('addUser/health_credentials/hcred_chestxray_verifiedby'), 'RN Medisource')

WebUI.sendKeys(findTestObject('addUser/health_credentials/hcred_chestxray_notes'), Keys.chord('Copy on File', Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('addUser/user_save_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('addUser/create_personnel_account_yes'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.setText(findTestObject('addUser/useraccount_username'), 'user' + randomnum)

WebUI.setText(findTestObject('addUser/useraccount_email'), ('user' + randomnum) + '@mailinator.com')

WebUI.click(findTestObject('addUser/useraccount_status_active'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('addUser/user_account_existingroletemplate_dd'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('addUser/user_account_existingroletemplate_tf'), Keys.chord('Field Staff', Keys.ENTER))

WebUI.delay(2)

WebUI.setText(findTestObject('addUser/user_account_addcomment'), GlobalVariable.sample_text_long)

WebUI.delay(5)

WebUI.click(findTestObject('addUser/user_account_save_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

