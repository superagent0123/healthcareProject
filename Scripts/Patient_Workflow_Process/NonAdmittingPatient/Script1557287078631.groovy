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

not_run: WebUI.delay(2)

'\r\n'
not_run: WebUI.navigateToUrl('https://qa.medisource.com/patients/all')

'Select Patient\r\n'
not_run: WebUI.navigateToUrl('https://qa.medisource.com/patientcare/BD25DB74-1D3E-4E6A-9AB1-14DEB97F4723/E167C437-755C-46C9-B7AC-45401F52C2AA/2019/oasis/clinical/soc/4A12A2DE-5619-4633-A054-9A08A8D0A769/BD25DB74-1D3E-4E6A-9AB1-14DEB97F4723')

WebUI.delay(5)

WebUI.click(findTestObject('PatientCarePage/Component_nonAdmit/nonAdmitbutton'))

WebUI.click(findTestObject('PatientCarePage/Component_nonAdmit/reasonForNonAdmit_inappropriatehomecare'))

WebUI.click(findTestObject('PatientCarePage/Component_nonAdmit/reasonForNonAdmit_patientrefusedservice'))

WebUI.click(findTestObject('PatientCarePage/Component_nonAdmit/reasonForNonAdmit_outofservicearea'))

WebUI.click(findTestObject('PatientCarePage/Component_nonAdmit/reasonForNonAdmit_onservicewithanotheragency'))

WebUI.click(findTestObject('PatientCarePage/Component_nonAdmit/reasonForNonAdmit_notaprovider'))

WebUI.click(findTestObject('PatientCarePage/Component_nonAdmit/reasonForNonAdmit_nothomebound'))

WebUI.click(findTestObject('PatientCarePage/Component_nonAdmit/reasonForNonAdmit_redirectedtoalternatecare'))

WebUI.setText(findTestObject('PatientCarePage/Component_nonAdmit/reasonForNonAdmit_other'), 'The patient is not financially stable for hospitalization and medical support.')

WebUI.click(findTestObject('PatientCarePage/Component_nonAdmit/reasonForNonAdmitSave'), FailureHandling.STOP_ON_FAILURE)

