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
import groovy.time.TimeCategory as TimeCategory

not_run: WebUI.delay(2)

not_run: WebUI.navigateToUrl('https://qa.medisource.com/patientcare/BD25DB74-1D3E-4E6A-9AB1-14DEB97F4723/E167C437-755C-46C9-B7AC-45401F52C2AA/2019/oasis/clinical/soc/4A12A2DE-5619-4633-A054-9A08A8D0A769/BD25DB74-1D3E-4E6A-9AB1-14DEB97F4723')

WebUI.delay(5)

'Detect the object [OASIS SOC] at the first row on taksk list table. '
WebUI.click(findTestObject('PatientCarePage/oasis_task_list'))

WebUI.delay(5)

today = new Date()

dtoday = today.format('MMddyyyy')

ttoday = today.format('HH:mm')

WebUI.click(findTestObject('OASIS/OASIS_TABS/xitemedits_btn'))

WebUI.setText(findTestObject('OASIS/oasis_soc_visit_date'), dtoday)

WebUI.setText(findTestObject('OASIS/oasis_soc_time_in'), ttoday)

WebUI.setText(findTestObject('OASIS/oasis_soc_time_out'), '0500')

'Save to Admit the patient\r\n'
WebUI.click(findTestObject('OASIS/oasis_soc_save_btn'))

WebUI.delay(5)

