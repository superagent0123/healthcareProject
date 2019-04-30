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

WebUI.delay(1)

WebUI.click(findTestObject('PatientCarePage/component_Admit/admitClickSOC_ClickVisitDateCalendarIcon'))

WebUI.delay(2)

WebUI.click(findTestObject('PatientCarePage/component_Admit/admitClickSOC_SelectVisitDate'))

WebUI.setText(findTestObject('PatientCarePage/component_Admit/admitClickSOC_timeIn'), '1111')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/clinicalRecords/SOC_M0014'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/clinicalRecords/SOC_M0014_CA'))

WebUI.delay(1)

WebUI.setText(findTestObject('OASIS/clinicalRecords/SOC_M0016'), '3456829')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/clinicalRecords/SOC_M0090'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/clinicalRecords/SOC_M0090_dateSelected'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/clinicalRecords/SOC_M0102'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/clinicalRecords/SOC_M0110'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/clinicalRecords/SOC_M0110_SOC_48'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/clinicalRecords/SOC_M0110_SOC_48'))

WebUI.click(findTestObject('OASIS/clinicalRecords/SOC_M1005'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS/OASIS_TABS/discardchangesbtn'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/OASIS_TABS/discardchangesmodalbtn'))

WebUI.delay(5)

