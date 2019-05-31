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

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Task_Notes/SNV/snv_tabs/snv_cardiovascular'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/cardio_heartrhythm_reg'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/cardio_pulsestrong_l'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/cardio_pulseweak_r'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/cardio_pulseabsent_l'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/cardio_capillaryrefill_more3sec'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/cardio_jvd_no'))

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/cardio_edema/edema_yes'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/cardio_edema/edema_pedal_l1'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/cardio_edema/edema_pedal_r1'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/cardio_edema/edema_leg_l2'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/cardio_edema/edema_leg_r2'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/cardio_edema/edema_ankle_l3'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/cardio_edema/edema_ankle_r3'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/cardio_edema/edema_sacral_4'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/cardio_edema/edema_generalized_4'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/cardio_edema/edema_weightgain_over2pounds'))

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/edema_chestpain/cp_yes'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/edema_chestpain/cp_angina'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/edema_chestpain/cp_sharp'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/edema_chestpain/cp_substernal'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/edema_chestpain/cp_stabbing'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/edema_chestpain/cp_localized'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/edema_chestpain/cp_postural'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/edema_chestpain/cp_dullache'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/edema_chestpain/cp_viselike'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/edema_chestpain/cp_radiatingto_neckl'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/edema_chestpain/cp_radiatingto_jawl'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/edema_chestpain/cp_radiatingto_shoulderl'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/edema_chestpain/cp_radiatingto_arml'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/edema_chestpain/cp_accompaniedby_dyspnea'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/edema_chestpain/cp_accompaniedby_diaphoresis'))

WebUI.setText(findTestObject('Task_Notes/SNV/cardiopulmonary/edema_chestpain/cp_freq'), 'Twice a Day')

WebUI.setText(findTestObject('Task_Notes/SNV/cardiopulmonary/edema_chestpain/cp_duration'), '1 Month')

WebUI.setText(findTestObject('Task_Notes/SNV/cardiopulmonary/edema_chestpain/cp_painintervention'), 'Motor Ability')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/cardio_iplantedcardiacdevices/icd_yes'))

WebUI.click(findTestObject('Task_Notes/SNV/cardiopulmonary/cardio_iplantedcardiacdevices/icd_pacemaker'))

WebUI.setText(findTestObject('Task_Notes/SNV/cardiopulmonary/cardio_iplantedcardiacdevices/icd_pacemaker_brand'), 'Advisa MRI')

WebUI.setText(findTestObject('Task_Notes/SNV/cardiopulmonary/cardio_iplantedcardiacdevices/icd_pacemaker_dateimplanted'), 
    'January 2019')

WebUI.setText(findTestObject('Task_Notes/SNV/cardiopulmonary/cardio_iplantedcardiacdevices/icd_pacemaker_ratesetting'), 
    '75 bpm')

WebUI.setText(findTestObject('Task_Notes/SNV/cardiopulmonary/cardio_iplantedcardiacdevices/icd_pacemaker_datelasttested'), 
    'May 2019')

WebUI.delay(3)

