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

WebUI.navigateToUrl('https://qa.medisource.com/roles/templates')

WebUI.delay(5)

WebUI.setText(findTestObject('Role_Template/role_template_list/role_template_searchbar'), 'Auto')

WebUI.delay(3)

today = new Date()

randomnum = today.format('HHmmss')

WebUI.click(findTestObject('Role_Template/role_template_list/role_template_pencil_icon'))

WebUI.delay(5)

WebUI.setText(findTestObject('Role_Template/add_role_template/art_template_name'), 'Auto-Generated Role-' + randomnum)

WebUI.delay(3)

WebUI.click(findTestObject('Role_Template/add_role_template/art_documents_reports/dr_all'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('Role_Template/add_role_template/art_addcomments'), GlobalVariable.sample_text_long)

WebUI.delay(3)

WebUI.click(findTestObject('Role_Template/add_role_template/art_save_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.navigateToUrl('https://qa.medisource.com/roles/templates')

