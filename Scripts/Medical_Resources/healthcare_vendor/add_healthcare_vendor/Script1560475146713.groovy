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

WebUI.navigateToUrl('https://qa.medisource.com/company')

WebUI.delay(5)

WebUI.click(findTestObject('Medical_Resources/healthcare_vendors/hv_newhealthcare_vendor'))

today = new Date()

randomnum = today.format('HHmmss')

WebUI.delay(3)

WebUI.click(findTestObject('Medical_Resources/healthcare_vendors/new_healthcare_vendor/nhv_typeofhv_dd'))

WebUI.click(findTestObject('Medical_Resources/healthcare_vendors/new_healthcare_vendor/nhv_typeofhv_tf'))

WebUI.setText(findTestObject('Medical_Resources/healthcare_vendors/new_healthcare_vendor/nhv_name'), 'Automated HC - ' + 
    randomnum)

WebUI.setText(findTestObject('Medical_Resources/healthcare_vendors/new_healthcare_vendor/nhv_contactperson'), 'Khenard Figuracion')

WebUI.setText(findTestObject('Medical_Resources/healthcare_vendors/new_healthcare_vendor/nhv_address'), GlobalVariable.sample_address)

WebUI.setText(findTestObject('Medical_Resources/healthcare_vendors/new_healthcare_vendor/nhv_city'), GlobalVariable.sample_city)

WebUI.click(findTestObject('Medical_Resources/healthcare_vendors/new_healthcare_vendor/nhv_state_dd'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Medical_Resources/healthcare_vendors/new_healthcare_vendor/nhv_state_tf'), Keys.chord('HI', 
        Keys.ENTER))

WebUI.setText(findTestObject('Medical_Resources/healthcare_vendors/new_healthcare_vendor/nhv_zipcode'), GlobalVariable.sample_ZIP_code)

WebUI.setText(findTestObject('Medical_Resources/healthcare_vendors/new_healthcare_vendor/nhv_phonenumber'), GlobalVariable.sample_phone_num)

WebUI.setText(findTestObject('Medical_Resources/healthcare_vendors/new_healthcare_vendor/nhv_fax'), GlobalVariable.sample_phone_num)

WebUI.setText(findTestObject('Medical_Resources/healthcare_vendors/new_healthcare_vendor/nhv_emailadd'), GlobalVariable.sample_email)

WebUI.click(findTestObject('Medical_Resources/healthcare_vendors/new_healthcare_vendor/nhv_productorservices_dd'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Medical_Resources/healthcare_vendors/new_healthcare_vendor/nhv_productorservices_tf'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Medical_Resources/healthcare_vendors/new_healthcare_vendor/nhv_baacompleted_yes'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Medical_Resources/healthcare_vendors/new_healthcare_vendor/nhv_baaupload'), GlobalVariable.sampl_text_short)

WebUI.setText(findTestObject('Medical_Resources/healthcare_vendors/new_healthcare_vendor/nhv_baalink'), GlobalVariable.sampl_text_short)

WebUI.delay(3)

WebUI.click(findTestObject('Medical_Resources/healthcare_vendors/new_healthcare_vendor/nhv_savebtn'), FailureHandling.STOP_ON_FAILURE)

