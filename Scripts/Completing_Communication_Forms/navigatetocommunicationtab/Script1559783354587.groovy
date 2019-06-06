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

WebUI.delay(3)

WebUI.navigateToUrl('https://qa.medisource.com/patients/all')

WebUI.delay(3)

WebUI.click(findTestObject('Patient_Manager/p_man_statussort_discharged'))

WebUI.delay(3)

'Patient Name: Automated I 102837- Patient'
WebUI.setText(findTestObject('Patient_Manager/p_man_searchbar'), '102837')

WebUI.delay(3)

WebUI.click(findTestObject('Patient_Manager/p_man_first_entry'))

WebUI.delay(3)

WebUI.click(findTestObject('Patient_Care/tabs/communication_tab'))

