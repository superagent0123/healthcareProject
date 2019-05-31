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

WebUI.navigateToUrl('https://qa.medisource.com/patients/all')

WebUI.click(findTestObject('Patient_Manager/p_man_statussort_admitted'))

WebUI.setText(findTestObject('Patient_Manager/p_man_searchbar'), 'Patient - 103023 Automated')

WebUI.delay(3)

WebUI.click(findTestObject('Patient_Manager/p_man_first_entry'))

not_run: WebUI.setText(findTestObject('PatientCarePage/Component_Menu/task_menu_components/t_searchbar'), 'RN-Skilled Nursing Visit')

WebUI.navigateToUrl('https://qa.medisource.com/patientcare/294BADC7-639F-4B7B-AF86-0779B9397123/60AC6881-1FAD-497A-8BBB-F03A83B6F8F8/snv/2019/F8784FF4-8BC3-41B3-8A22-66667C5485D6')

WebUI.delay(3)

<<<<<<< HEAD
WebUI.executeJavaScript('alert("Estimated Delay time to form load: 8 seconds")', null)

WebUI.delay(8)
=======
WebUI.executeJavaScript('alert("Estimated Delay time to load form: 15 seconds")', null)

WebUI.delay(15)
>>>>>>> branch 'master' of https://github.com/superagent0123/healthcareProject.git

WebUI.acceptAlert()

WebUI.setText(findTestObject('Task_Notes/SNV/snv_time-in'), '1200')

WebUI.setText(findTestObject('Task_Notes/SNV/snv_time_out'), '0500')

