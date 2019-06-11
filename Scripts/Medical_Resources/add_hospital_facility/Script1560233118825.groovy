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

WebUI.navigateToUrl('https://qa.medisource.com/hospital')

WebUI.delay(5)

WebUI.click(findTestObject('Medical_Resources/hospital_facility/hf_new_hospital_btn'))

WebUI.delay(5)

today = new Date()

randomnum = today.format('HHmmss')

not_run: WebUI.click(findTestObject('Medical_Resources/hospital_facility/new_hospital_facility/newhf_addhftype'))

not_run: WebUI.setText(findTestObject('Medical_Resources/hospital_facility/new_hospital_facility/addhftype_title'), 'Automated Facilty Type - ' + 
    randomnum)

not_run: WebUI.click(findTestObject('Medical_Resources/hospital_facility/new_hospital_facility/addhftype_savebtn'))

WebUI.click(findTestObject('Medical_Resources/hospital_facility/new_hospital_facility/newhf_typeofhf_dd'))

WebUI.sendKeys(findTestObject('Medical_Resources/hospital_facility/new_hospital_facility/newhf_typeofhf_tf'), Keys.chord(
        'Long-term Care', Keys.ENTER))

WebUI.setText(findTestObject('Medical_Resources/hospital_facility/new_hospital_facility/newhf_name'), ('Auto-' + randomnum) + 
    ' Medical Hospital')

WebUI.setText(findTestObject('Medical_Resources/hospital_facility/new_hospital_facility/newhf_address'), GlobalVariable.sample_address)

WebUI.setText(findTestObject('Medical_Resources/hospital_facility/new_hospital_facility/newhf_city'), GlobalVariable.sample_city)

WebUI.click(findTestObject('Medical_Resources/hospital_facility/new_hospital_facility/newhf_state_dd'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Medical_Resources/hospital_facility/new_hospital_facility/newhf_state_tf'), Keys.chord('HI', 
        Keys.ENTER))

WebUI.setText(findTestObject('Medical_Resources/hospital_facility/new_hospital_facility/newhf_zipcode'), GlobalVariable.sample_ZIP_code)

WebUI.setText(findTestObject('Medical_Resources/hospital_facility/new_hospital_facility/newhf_phonenumber'), GlobalVariable.sample_phone_num)

WebUI.setText(findTestObject('Medical_Resources/hospital_facility/new_hospital_facility/newhf_fax'), GlobalVariable.sample_phone_num)

WebUI.setText(findTestObject('Medical_Resources/hospital_facility/new_hospital_facility/newhf_contactperson'), GlobalVariable.sampl_text_short)

WebUI.delay(5)

WebUI.click(findTestObject('Medical_Resources/hospital_facility/new_hospital_facility/newhf_savebtn'), FailureHandling.STOP_ON_FAILURE)

