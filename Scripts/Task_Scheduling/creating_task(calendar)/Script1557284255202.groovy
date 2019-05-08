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

WebUI.navigateToUrl('https://qa.medisource.com/patientcare/876CCA94-1179-4553-8469-B9DEAF0387BD/FABFBA89-82B0-4022-A538-A4E253246581/overview')

WebUI.delay(5)

selecteddate = WebUI.getText(findTestObject('Scheduling/addtask/3-month-calendar/selecteddate'))

WebUI.executeJavaScript(('alert(\'The selected date is within the 3rd week: ' + selecteddate) + '\')', null)

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.click(findTestObject('Scheduling/addtask/3-month-calendar/selecteddate'))

'Triggers Task Manager Modal\r\n'
WebUI.click(findTestObject('Scheduling/taskmanager/tm_task'))

WebUI.sendKeys(findTestObject('Scheduling/taskmanager/tm_task_list_search'), Keys.chord('RN-Skilled Nursing Visit', Keys.ENTER))

WebUI.click(findTestObject('Scheduling/taskmanager/tm_staff'))

WebUI.sendKeys(findTestObject('Scheduling/taskmanager/tm_staff_search'), Keys.chord('RN Medisource', Keys.ENTER))

WebUI.click(findTestObject('Scheduling/taskmanager/tm_linktasktoMDO'))

WebUI.sendKeys(findTestObject('Scheduling/taskmanager/tm_linktasktoMDO'), Keys.chord('2019', Keys.ENTER))

WebUI.click(findTestObject('Scheduling/taskmanager/tm_date_calendaricon'))

WebUI.click(findTestObject('Scheduling/taskmanager/tm_tdate_today'))

not_run: WebUI.click(findTestObject('Scheduling/taskmanager/tm_checkboxrecurrent'))

WebUI.click(findTestObject('Scheduling/taskmanager/tm_create'))

WebUI.delay(5)

