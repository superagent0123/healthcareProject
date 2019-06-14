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

WebUI.navigateToUrl('https://qa.medisource.com/physicians')

WebUI.delay(5)

today = new Date()

randomnum = today.format('HHmmss')

WebUI.click(findTestObject('Medical_Resources/physicians/phy_newphysician'))

WebUI.delay(3)

WebUI.click(findTestObject('Medical_Resources/physicians/new_physician/np_skipbtn'))

WebUI.setText(findTestObject('Medical_Resources/physicians/new_physician/np_info_firstname'), randomnum)

WebUI.setText(findTestObject('Medical_Resources/physicians/new_physician/np_info_middlename'), 'Physician')

WebUI.setText(findTestObject('Medical_Resources/physicians/new_physician/np_info_lastname'), 'Automatic')

WebUI.setText(findTestObject('Medical_Resources/physicians/new_physician/np_info_address'), GlobalVariable.sample_address)

WebUI.setText(findTestObject('Medical_Resources/physicians/new_physician/np_info_city'), GlobalVariable.sample_city)

WebUI.click(findTestObject('Medical_Resources/physicians/new_physician/np_info_state_dd'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Medical_Resources/physicians/new_physician/np_info_state_tf'), Keys.chord('HI', Keys.ENTER))

WebUI.setText(findTestObject('Medical_Resources/physicians/new_physician/np_info_zipcode'), GlobalVariable.sample_ZIP_code)

WebUI.setText(findTestObject('Medical_Resources/physicians/new_physician/np_info_phone'), GlobalVariable.sample_phone_num)

WebUI.setText(findTestObject('Medical_Resources/physicians/new_physician/np_info_fax'), GlobalVariable.sample_phone_num)

WebUI.setText(findTestObject('Medical_Resources/physicians/new_physician/np_info_cellphone'), GlobalVariable.sample_phone_num)

WebUI.setText(findTestObject('Medical_Resources/physicians/new_physician/np_info_contactperson'), 'Khenard Figuracion')

WebUI.setText(findTestObject('Medical_Resources/physicians/new_physician/np_info_specialty'), '')

WebUI.setText(findTestObject('Medical_Resources/physicians/new_physician/np_info_licensenumber'), '')

WebUI.setText(findTestObject('Medical_Resources/physicians/new_physician/np_info_expirationdate'), '12/22/2022')

WebUI.delay(3)

WebUI.click(findTestObject('Medical_Resources/physicians/new_physician/np_info_savebtn'))

