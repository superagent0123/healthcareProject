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

WebUI.delay(2)

'Redirecting to Patient List > Patient Manager Page\r\n'
WebUI.navigateToUrl('https://qa.medisource.com/patients/all')

'Non-Admit Pre-Admitted Patient'
WebUI.delay(3)

WebUI.click(findTestObject('Patient_Manager/p_man_statussort_pre-ad'))

WebUI.setText(findTestObject('Patient_Manager/p_man_searchbar'), 'Automated NA')

WebUI.delay(3)

WebUI.click(findTestObject('Patient_Manager/p_man_non-admit_icon'))

WebUI.click(findTestObject('Patient_Manager/non-admit/non-admit_inappropriate'))

WebUI.click(findTestObject('Patient_Manager/non-admit/non-admit_patientrefused'))

WebUI.click(findTestObject('Patient_Manager/non-admit/non-admit_outofservice'))

WebUI.click(findTestObject('Patient_Manager/non-admit/non-admit_onanotheragency'))

WebUI.click(findTestObject('Patient_Manager/non-admit/non-admit_notaprovider'))

WebUI.click(findTestObject('Patient_Manager/non-admit/non-admit_nothomebound'))

WebUI.click(findTestObject('Patient_Manager/non-admit/non-admit_redirectedtoalternate'))

WebUI.setText(findTestObject('Patient_Manager/non-admit/non-admit_other'), 'The patient is not financially stable to support hospitalization and other medical needs.')

not_run: WebUI.click(findTestObject('Patient_Manager/non-admit/non-admit_savebtn'))

WebUI.delay(3)

WebUI.click(findTestObject('Patient_Manager/non-admit/non-admit_cancelbtn'))

