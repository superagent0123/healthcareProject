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

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_corrective'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_catL'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_catR'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_glaucomaL'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_glaucomaR'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_blurL'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_blurR'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_blindL'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_blindR'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_other'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_other_rednessL'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_other_rednessR'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_other_painL'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_other_painR'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_other_itchingL'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_other_itchingR'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_other_ptosisL'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_other_ptosisR'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_other_scleraL'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_other_scleraR'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_other_edemaL'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_other_edemaR'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_other_exudateL'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_other_exudateR'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_other_excessiveL'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_other_excessiveR'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_other_mucularL'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_other_mucularR'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_other_retinopathyL'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_other_retinopathyR'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_other_doublevisionL'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_eyes_other_doublevisionR'))

WebUI.setText(findTestObject('OASIS/Sensory/sensory_eyes_other2'), 'other sample eyes')

WebUI.click(findTestObject('OASIS/Sensory/sensory_ears_hohL'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_ears_hohR'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_ears_hearingaidL'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_ears_hearingaidR'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_ears_deafL'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_ears_deafR'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_ears_other'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_ears_other_tinnitusL'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_ears_other_tinnitusR'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_ears_other_drainageL'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_ears_other_drainageR'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_ears_other_painL'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_ears_other_painR'))

WebUI.setText(findTestObject('OASIS/Sensory/sensory_ears_other_vertigo'), 'vertigo')

WebUI.setText(findTestObject('OASIS/Sensory/sensory_ears_other2'), 'ears others')

WebUI.click(findTestObject('OASIS/Sensory/sensory_nose_congestion'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_nose_rhinitis'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_nose_sinus'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_nose_others'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_nose_others_epistaxis'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_nose_others_lossofsmell'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_nose_others_noisy'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_nose_others_snoring'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_nose_others_lession'))

WebUI.setText(findTestObject('OASIS/Sensory/sensory_nose_others_lession_input'), 'lession sample')

WebUI.setText(findTestObject('OASIS/Sensory/sensory_nose_others2'), 'other nose sample')

WebUI.click(findTestObject('OASIS/Sensory/sensory_mouth_dentures'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_mouth_dentures_upper'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_mouth_dentures_lower'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_mouth_dentures_partial'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_mouth_difficultychewing'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_mouth_poordentention'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_throat_sore'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_throat_dysphagia'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_throat_hoarseness'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_throat_lession'))

WebUI.setText(findTestObject('OASIS/Sensory/sensory_throat_lession_input'), 'lession sample')

WebUI.setText(findTestObject('OASIS/Sensory/sensory_throat_others'), 'other throat')

WebUI.click(findTestObject('OASIS/Sensory/sensory_speech_slow'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_speech_slurred'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_speech_aphasia'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_speech_mechanical'))

WebUI.setText(findTestObject('OASIS/Sensory/sensory_speech_others'), 'other speech')

WebUI.click(findTestObject('OASIS/Sensory/sensory_touch_paraesthesia'))

WebUI.setText(findTestObject('OASIS/Sensory/sensory_touch_paraesthesia_input'), 'fasfasfasfaf')

WebUI.click(findTestObject('OASIS/Sensory/sensory_touch_hyperesthesia'))

WebUI.setText(findTestObject('OASIS/Sensory/sensory_touch_hyperesthesia_input'), 'dsggwetgsdsdg')

WebUI.click(findTestObject('OASIS/Sensory/sensory_touch_peripheral'))

WebUI.setText(findTestObject('OASIS/Sensory/sensory_touch_peripheral_input'), 'dfgdfgdfgdfgd')

WebUI.setText(findTestObject('OASIS/Sensory/sensory_touch_others'), 'dfhdfhdfhdfhdfhdf')

WebUI.click(findTestObject('OASIS/Sensory/sensory_M1200'))

WebUI.setText(findTestObject('OASIS/Sensory/sensory_vs_temp'), '100')

WebUI.click(findTestObject('OASIS/Sensory/sensory_vs_temp_oral'))

WebUI.setText(findTestObject('OASIS/Sensory/sensory_vs_pulse'), '99')

WebUI.click(findTestObject('OASIS/Sensory/sensory_vs_pulse_radial'))

WebUI.setText(findTestObject('OASIS/Sensory/sensory_vs_respi'), '85')

WebUI.setText(findTestObject('OASIS/Sensory/sensory_vs_bpRightArm_systolic'), '100')

WebUI.setText(findTestObject('OASIS/Sensory/sensory_vs_bpRightArm_diastolic'), '150')

WebUI.click(findTestObject('OASIS/Sensory/sensory_vs_bpRightArm_sitting'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OASIS/Sensory/sensory_vs_O2_roomair'), '85')

WebUI.setText(findTestObject('OASIS/Sensory/sensory_vs_O2_withO2'), '100')

WebUI.setText(findTestObject('OASIS/Sensory/sensory_vs_O2_withO2_LPM'), '85')

WebUI.setText(findTestObject('OASIS/Sensory/sensory_vs_glucose'), '325')

WebUI.click(findTestObject('OASIS/Sensory/sensory_vs_glucose_FBS'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_vs_notified_MD'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_vs_notified_CM'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_vs_evidenceNO'))

WebUI.setText(findTestObject('OASIS/Sensory/sensory_vs_evidenceNO_input'), 'sample sample sample evidence')

WebUI.setText(findTestObject('OASIS/Sensory/sensory_vs_intervention'), 'fgdfhdfhdfhdfhdfh')

WebUI.click(findTestObject('OASIS/Sensory/sensory_M1242_1'))

WebUI.setText(findTestObject('OASIS/Sensory/sensory_pain_site1'), 'buttock face Left')

WebUI.setText(findTestObject('OASIS/Sensory/sensory_pain_site2'), 'buttock face rigth')

WebUI.click(findTestObject('OASIS/Sensory/sensory_pain_site1_typeAcute'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_pain_site1_presentLevel1'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_pain_site1_worstLevel1'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_pain_site1_acceptableLevel1'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_pain_site1_levelaftermeds1'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_pain_site2_acute'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_pain_site2_presentlevel1'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_pain_site2_worstlevel1'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_pain_site2_acceptablelevel1'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_pain_site2_levelaftermeds1'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_characterofpain_sharp'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_characterofpain_squeez'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_characterofpain_stabbing'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_characterofpain_stinging'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_characterofpain_cramping'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_characterofpain_shooting'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_characterofpain_throbbing'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_characterofpain_tingling'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_characterofpain_burning'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_characterofpain_aching'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_characterofpain_gnawing'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_characterofpain_crushing'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_nonverbal_diaphoresis'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_nonverbal_guarding'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_nonverbal_restlessness'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_nonverbal_grimacing'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_nonverbal_changeinVS'))

WebUI.setText(findTestObject('OASIS/Sensory/sensory_nonverbal_changeinVS_input'), 'hdfhdffddhdhdf')

WebUI.click(findTestObject('OASIS/Sensory/sensory_nonverbal_irritability'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_nonverbal_moaning'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_nonverbal_tense'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_whatpainworse_movement'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_whatpainworse_ambulation'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_whatpainworse_immobility'))

WebUI.setText(findTestObject('OASIS/Sensory/sensory_whatpainworse_others'), 'gdfhdfhdfjhdfjdfjdf')

WebUI.click(findTestObject('OASIS/Sensory/sensory_whatpainbetter_heat'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_whatpainbetter_rest'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_whatpainbetter_massage'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_whatpainbetter_medication'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_whatpainbetter_repositioning'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_whatpainbetter_diversion'))

WebUI.setText(findTestObject('OASIS/Sensory/sensory_whatpainbetter_others'), 'fdhdfrjkrtuirtruiri')

WebUI.click(findTestObject('OASIS/Sensory/sensory_painmedication_effectiveness_effective'))

WebUI.click(findTestObject('OASIS/Sensory/sensory_painmedication_howoften_lessthandaily'))

WebUI.setText(findTestObject('OASIS/Sensory/sensory_painmedication_howlong'), 'daily')

WebUI.setText(findTestObject('OASIS/Sensory/sensory_painmedication_wheninpain'), 'sample sample sample')

WebUI.click(findTestObject('OASIS/Sensory/sensory_painmedication_physicianawareYes'))

WebUI.click(findTestObject('OASIS/OASIS_TABS/Integumentary_tab'))








