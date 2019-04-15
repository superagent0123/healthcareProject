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

WebUI.click(findTestObject('PatientCarePage/component_Admit/admitClickSOC'))

WebUI.delay(5)

WebUI.click(findTestObject('PatientCarePage/component_Admit/admitClickSOC_ClickVisitDateCalendarIcon'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('PatientCarePage/component_Admit/admitClickSOC_SelectVisitDate'))

not_run: WebUI.setText(findTestObject('PatientCarePage/component_Admit/admitClickSOC_timeIn'), '1111')

not_run: WebUI.click(findTestObject('PatientCarePage/component_Admit/admitClickSOC_Save'))

WebUI.delay(10)

