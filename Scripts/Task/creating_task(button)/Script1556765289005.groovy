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

'Set date as text\r\n'
not_run: WebUI.setText(findTestObject('Scheduling/taskmanager/tm_taskdate'), '522019')

'Select current date: Today'
WebUI.click(findTestObject('Scheduling/taskmanager/tm_date_calendaricon'))

WebUI.click(findTestObject('Scheduling/taskmanager/tm_tdate_today'))

not_run: WebUI.click(findTestObject('Scheduling/taskmanager/tm_checkboxrecurrent'))

WebUI.click(findTestObject('Scheduling/taskmanager/tm_create'))

WebUI.delay(3)

WebUI.click(findTestObject('PatientCarePage/Component_Menu/task_menu'))

WebUI.delay(5)

not_run: Date datetoday = new Date()

not_run: setdate = datetoday.format('mmddyyyy')

not_run: WebUI.executeJavaScript(('alert(""' + setdate) + '"")', null)

'Completing a physician order\r\n'
WebUI.click(findTestObject('MD_Orders/physician_order/po_orderdate_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_orderdate_today'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MD_Orders/physician_order/po_ordertime'), '1200')

WebUI.click(findTestObject('MD_Orders/physician_order/po_sentdate_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_sentdate_today'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_receiveddate_icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_receiveddate_today'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_subject_patientcondition'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_subject_medication'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('MD_Orders/physician_order/po_subject_visits'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_subject_snevaluation'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_subject_lab'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_subject_others'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MD_Orders/physician_order/po_subject_otherstf'), 'Mental Health Therapy')

WebUI.click(findTestObject('MD_Orders/physician_order/po_commtype_persontoperson'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_commtype_phone'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_commtype_fax'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_commtype_mail'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/physician_order/po_mdordergiven_yes'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MD_Orders/physician_order/po_commnote'), 'I am writing on behalf of my patient, (patient name) to document the medical necessity of')

WebUI.setText(findTestObject('MD_Orders/physician_order/po_porder'), 'Include information on the treatment up to this point, course of care and why the')

WebUI.click(findTestObject('MD_Orders/physician_order/po_attachfiles_btn'))

WebUI.delay(3)
/*
WebUI.sendKeys(findTestObject('MD_Orders/physician_order/po_attachfiles_btn'), Keys.chord('C:\\Users\\Khenard Figuracion\\Pictures\\image.png', 
        Keys.ENTER))

not_run: Runtime.getRuntime().exec('C:\\Users\\Khenard Figuracion\\Pictures\\image.png')*/

CustomKeywords.'com.katalon.WebUICustomKeyword.uploadFile'(findTestObject('MD_Orders/physician_order/po_attachfiles_btn'), 'C:\\Users\\Khenard Figuracion\\Pictures\\image.png')

