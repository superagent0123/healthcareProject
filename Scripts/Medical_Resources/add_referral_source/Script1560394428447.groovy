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

WebUI.navigateToUrl('https://qa.medisource.com/referral')

WebUI.delay(5)

today = new Date()

randomnum = today.format('HHmmss')

WebUI.click(findTestObject('Medical_Resources/referral_sources/rs_newreferralbtn'))

WebUI.delay(5)

WebUI.setText(findTestObject('Medical_Resources/referral_sources/new_referral_source/nrs_firstname'), 'Automated')

WebUI.setText(findTestObject('Medical_Resources/referral_sources/new_referral_source/nrs_lastname'), 'Referral Source')

WebUI.setText(findTestObject('Medical_Resources/referral_sources/new_referral_source/nrs_companyname'), randomnum)

WebUI.setText(findTestObject('Medical_Resources/referral_sources/new_referral_source/nrs_address'), GlobalVariable.sample_address)

WebUI.setText(findTestObject('Medical_Resources/referral_sources/new_referral_source/nrs_city'), GlobalVariable.sample_city)

WebUI.click(findTestObject('Medical_Resources/referral_sources/new_referral_source/nrs_state_dd'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Medical_Resources/referral_sources/new_referral_source/nrs_state_tf'), Keys.chord('HI', Keys.ENTER))

WebUI.setText(findTestObject('Medical_Resources/referral_sources/new_referral_source/nrs_zipcode'), GlobalVariable.sample_ZIP_code)

WebUI.setText(findTestObject('Medical_Resources/referral_sources/new_referral_source/nrs_phone'), GlobalVariable.sample_phone_num)

WebUI.setText(findTestObject('Medical_Resources/referral_sources/new_referral_source/nrs_fax'), GlobalVariable.sample_phone_num)

WebUI.delay(3)

WebUI.click(findTestObject('Medical_Resources/referral_sources/new_referral_source/nrs_savebtn'), FailureHandling.STOP_ON_FAILURE)

