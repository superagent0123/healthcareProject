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

WebUI.navigateToUrl('https://qa.medisource.com/roles/templates/create')

today = new Date()

randomnum = today.format('HHmmss')

WebUI.delay(3)

WebUI.setText(findTestObject('Role_Template/add_role_template/art_template_name'), 'Auto-Generated Role-' + randomnum)

WebUI.delay(2)

WebUI.click(findTestObject('Role_Template/add_role_template/art_patient_manager/pm_all'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Role_Template/add_role_template/art_patient_care/pc_all'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Role_Template/add_role_template/art_human_resources/hr_all'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Role_Template/add_role_template/art_system_preference/sp_all'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Role_Template/add_role_template/art_medication_resources/mr_all'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Role_Template/add_role_template/art_documents_reports/dr_all'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Role_Template/add_role_template/art_ulitilities/ul_all'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Role_Template/add_role_template/art_billing_manager/bm_all'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Role_Template/add_role_template/art_libraries/lib_all'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Role_Template/add_role_template/art_system_settings/ss_all'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.setText(findTestObject('Role_Template/add_role_template/art_addcomments'), GlobalVariable.sample_text_long)

WebUI.delay(3)

WebUI.click(findTestObject('Role_Template/add_role_template/art_save_btn'), FailureHandling.STOP_ON_FAILURE)

