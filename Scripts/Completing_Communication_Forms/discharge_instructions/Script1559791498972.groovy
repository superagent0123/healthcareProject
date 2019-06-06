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

WebUI.delay(5)

WebUI.click(findTestObject('Patient_Care/communication/comm_new_form'))

WebUI.delay(3)

WebUI.click(findTestObject('Patient_Care/communication/comm_new_dischargeinstructions'))

WebUI.delay(5)

WebUI.setText(findTestObject('Communication_Forms/discharge_instructions/dcins_dcdate'), GlobalVariable.today_date)

WebUI.setText(findTestObject('Communication_Forms/discharge_instructions/dcins_diagnosis'), GlobalVariable.sample_text_long)

WebUI.delay(3)

WebUI.click(findTestObject('Communication_Forms/discharge_instructions/dcins_wearepleasedtoprovideservicetoyou_b_dr_dd'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Communication_Forms/discharge_instructions/dcins_wearepleasedtoprovideservicetoyou_b_dr_tf'), 
    Keys.chord('ADRIAN', Keys.ENTER))

WebUI.delay(3)

WebUI.setText(findTestObject('Communication_Forms/discharge_instructions/dcins_wearepleasedtoprovideservicetoyou_day'), 
    '2')

WebUI.setText(findTestObject('Communication_Forms/discharge_instructions/dcins_wearepleasedtoprovideservicetoyou_date'), 
    GlobalVariable.today_date)

WebUI.setText(findTestObject('Communication_Forms/discharge_instructions/dcins_wearepleasedtoprovideservicetoyou_time'), 
    GlobalVariable.today_time)

WebUI.click(findTestObject('Communication_Forms/discharge_instructions/dcins_wearepleasedtoprovideservicetoyou_c_additionalcomments'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Communication_Forms/discharge_instructions/dcins_wearepleasedtoprovideservicetoyou_c_additionalcomments_tf'), 
    GlobalVariable.sample_text_long)

WebUI.setText(findTestObject('Communication_Forms/discharge_instructions/dcins_wearepleasedtoprovideservicetoyou_d_prescribediet'), 
    GlobalVariable.sampl_text_short)

WebUI.click(findTestObject('Communication_Forms/discharge_instructions/dcins_wearepleasedtoprovideservicetoyou_e_instructionattached'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Communication_Forms/discharge_instructions/dcins_wearepleasedtoprovideservicetoyou_e_additionalcomments'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Communication_Forms/discharge_instructions/dcins_wearepleasedtoprovideservicetoyou_e_additonalcomments_tf'), 
    GlobalVariable.sample_text_long)

WebUI.setText(findTestObject('Communication_Forms/discharge_instructions/dcins_wearepleasedtoprovideservicetoyou_f_other_instructions'), 
    GlobalVariable.sample_text_long)

WebUI.setText(findTestObject('Communication_Forms/discharge_instructions/dcins_wearepleasedtoprovideservicetoyou_pleasecontact'), 
    GlobalVariable.sample_text_long)

WebUI.delay(3)

WebUI.click(findTestObject('Communication_Forms/discharge_instructions/dcins_discardchanges_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Communication_Forms/discharge_instructions/dcins_discardchanges_discard'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('Communication_Forms/discharge_instructions/dcins_save_btn'), FailureHandling.STOP_ON_FAILURE)

