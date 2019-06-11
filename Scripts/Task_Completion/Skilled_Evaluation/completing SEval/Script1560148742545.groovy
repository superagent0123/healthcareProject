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

not_run: WebUI.navigateToUrl('https://qa.medisource.com/patientcare/89B93E1F-3DF4-47EE-8825-200C8B43F7F8/62FDEF20-99BB-4930-804A-186D46F44A98/overview')

WebUI.delay(3)

todayy = new Date()

todaydate = todayy.format('MMddyyyy')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

'The selector of this search bar is the same as on the patient list page. This might be the cause of conflict.\r\n'
not_run: WebUI.setText(findTestObject('PatientCarePage/Component_Menu/task_menu_components/t_searchbar'), 'Skilled Evaluation')

'Sorts the task entries from Z-A'
WebUI.click(findTestObject('PatientCarePage/Component_Menu/task_menu_components/t_taskcol_sort'), FailureHandling.STOP_ON_FAILURE)

'Sorts the task entries from Z-A'
WebUI.click(findTestObject('PatientCarePage/Component_Menu/task_menu_components/t_taskcol_sort'), FailureHandling.STOP_ON_FAILURE)

'Sorts the task entries from Z-A'
WebUI.click(findTestObject('PatientCarePage/Component_Menu/task_menu_components/t_taskcol_sort'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SN_Evaluation/skilledevaluation_entry'))

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SN_Evaluation/sneval_task2dd'))

'OASIS-D Discharge\r\n'
WebUI.sendKeys(findTestObject('Task_Notes/SN_Evaluation/sneval_task2'), Keys.chord('OASIS-D Discharge', Keys.ENTER))

'OASIS-D Follow-up'
not_run: WebUI.sendKeys(findTestObject('Task_Notes/SN_Evaluation/sneval_task2'), Keys.chord('OASIS-D Follow-Up', Keys.ENTER))

not_run: WebUI.click(findTestObject('Task_Notes/SN_Evaluation/sneval_cliniciandd'))

not_run: WebUI.sendKeys(findTestObject('Task_Notes/SN_Evaluation/sneval_clinician'), Keys.chord('RN Medisource', Keys.ENTER))

not_run: WebUI.click(findTestObject('Task_Notes/SN_Evaluation/sneval_missedvisit_yes'))

WebUI.click(findTestObject('Task_Notes/SN_Evaluation/sneval_external_yes'))

not_run: WebUI.setText(findTestObject('Task_Notes/SN_Evaluation/sneval_planneddate'), todaydate)

WebUI.setText(findTestObject('Task_Notes/SN_Evaluation/sneval_visitdate'), todaydate)

WebUI.setText(findTestObject('Task_Notes/SN_Evaluation/sneval_visitdate'), GlobalVariable.today_date)

WebUI.setText(findTestObject('Task_Notes/SN_Evaluation/sneval_surcharge'), 'Sample Text')

WebUI.setText(findTestObject('Task_Notes/SN_Evaluation/sneval_timein'), '1200')

WebUI.setText(findTestObject('Task_Notes/SN_Evaluation/sneval_timeout'), '0800')

WebUI.click(findTestObject('Task_Notes/SN_Evaluation/sneval_locationdd'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Task_Notes/SN_Evaluation/sneval_location'), Keys.chord('Q5001', Keys.ENTER))

not_run: WebUI.click(findTestObject('Task_Notes/SN_Evaluation/sneval_attachments'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Task_Notes/SN_Evaluation/sneval_save'))

WebUI.delay(3)

