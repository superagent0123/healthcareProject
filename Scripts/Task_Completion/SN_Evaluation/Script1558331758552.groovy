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

WebUI.navigateToUrl('https://qa.medisource.com/patients/all')

WebUI.navigateToUrl('https://qa.medisource.com/patientcare/AE68C0A9-3DE9-426F-BEC0-D7096EF5D24B/7E39C423-C33F-4F9A-A8CA-1978E4938507/overview')

WebUI.click(findTestObject('PatientCarePage/Component_Menu/task_menu'))

WebUI.delay(5)

WebUI.click(findTestObject('Scheduling/addtask/addnewschedule_btn'))

'Patient Name: CreateTask Automation\r\n'
not_run: WebUI.navigateToUrl('https://qa.medisource.com/patientcare/27205695-4F0E-4E27-9FD5-126F9CF51E10/A3446733-0FAA-4526-BED7-F601DE601FB3/overview')

WebUI.click(findTestObject('Scheduling/taskmanager/tm_cancel'))

WebUI.delay(2)

WebUI.click(findTestObject('Scheduling/addtask/addnewschedule_btn'))

WebUI.delay(2)

WebUI.click(findTestObject('Scheduling/taskmanager/tm_task'))

WebUI.sendKeys(findTestObject('Scheduling/taskmanager/tm_task_list_search'), Keys.chord('Skilled Evaluation', Keys.ENTER))

WebUI.click(findTestObject('Scheduling/taskmanager/tm_staff'))

WebUI.delay(2)

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

WebUI.delay(5)

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

WebUI.delay(3)

WebUI.click(findTestObject('MD_Orders/physician_order/po_save_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('MD_Orders/physician_order/po_esign_tf'), '12345678')

WebUI.click(findTestObject('MD_Orders/physician_order/po_esign_submit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('PatientCarePage/Component_Menu/task_menu'))

