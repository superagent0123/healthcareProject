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

WebUI.delay(2)

WebUI.navigateToUrl('https://qa.medisource.com/patients/all')

'Patient Name: CreateTask Automation\r\n'
WebUI.navigateToUrl('https://qa.medisource.com/patientcare/FF3BCC9C-6212-4677-B418-A179F1D465EA/591D45A1-501B-4926-BF4E-74D0A088233B/overview')

WebUI.delay(5)

WebUI.click(findTestObject('Scheduling/addtask/addnewschedule_btn'))

'Patient Name: CreateTask Automation\r\n'
WebUI.navigateToUrl('https://qa.medisource.com/patientcare/FF3BCC9C-6212-4677-B418-A179F1D465EA/591D45A1-501B-4926-BF4E-74D0A088233B/overview')

WebUI.click(findTestObject('Scheduling/addtask/addnewschedule_btn'))

WebUI.delay(2)

WebUI.click(findTestObject('Scheduling/taskmanager/tm_task'))

WebUI.sendKeys(findTestObject('Scheduling/taskmanager/tm_task_list_search'), Keys.chord('RN-Skilled Nursing Visit', Keys.ENTER))

WebUI.click(findTestObject('Scheduling/taskmanager/tm_staff'))

WebUI.sendKeys(findTestObject('Scheduling/taskmanager/tm_staff_search'), Keys.chord('RN Medisource', Keys.ENTER))

WebUI.click(findTestObject('Scheduling/taskmanager/tm_linktasktoMDO'))

WebUI.sendKeys(findTestObject('Scheduling/taskmanager/tm_linktasktoMDO'), Keys.chord('2019', Keys.ENTER))

'Select current date: Today'
WebUI.click(findTestObject('Scheduling/taskmanager/tm_date_calendaricon'))

WebUI.click(findTestObject('Scheduling/taskmanager/tm_tdate_today'))

WebUI.click(findTestObject('Scheduling/taskmanager/tm_checkboxrecurrent'))

WebUI.delay(3)

WebUI.click(findTestObject('Scheduling/taskmanager/tm_cbrecurrent/tm_cbrecurrent_tf'))

WebUI.sendKeys(findTestObject('Scheduling/taskmanager/tm_cbrecurrent/tm_cbrecurrent_search'), Keys.chord('Every Monday, Wednesday and Friday', 
        Keys.ENTER))

WebUI.click(findTestObject('Scheduling/taskmanager/tm_cbrecurrent/tb_recurrent_everymwf/tb_emwf_startson_icon'))

WebUI.click(findTestObject('Scheduling/taskmanager/tm_cbrecurrent/tb_recurrent_everymwf/tb_emwf_startson_today'))

WebUI.setText(findTestObject('Scheduling/taskmanager/tm_cbrecurrent/tb_recurrent_everymwf/tb_emwf_endson'), '6302019')

WebUI.delay(3)

WebUI.click(findTestObject('Scheduling/taskmanager/tm_create'))

WebUI.delay(5)

