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

not_run: WebUI.click(findTestObject('Task_Notes/SNV/snv_tabs/snv_sensory'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_eyes/eyes_cataract_l'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_eyes/eyes_glaucoma_r'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_eyes/eyes_blurredvision_l'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_eyes/eyes_blind_r'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_eyes/eyes_other_abnormalities'))

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_eyes/eyes_oa_redness_left'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_eyes/eyes_oa_pain_left'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_eyes/eyes_oa_itching_left'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_eyes/eyes_oa_ptosis_left'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_eyes/eyes_oa_sclera_left'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_eyes/eyes_oa_edema_left'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_eyes/eyes_oa_exudateeyes_left'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_eyes/eyes_oa_excessivetearing_left'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_eyes/eyes_oa_maculardegen_left'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_eyes/eyes_oa_retinopathy_left'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_eyes/eyes_oa_doublevision'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_eyes/eyes_oa_doublevision_left'))

WebUI.setText(findTestObject('Task_Notes/SNV/sensory/ss_eyes/eyes_oa_other'), 'Crossed Eyes (Strabismus)')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_ears/ear_hoh_l'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_ears/ear_hearingaid_l'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_ears/ear_deaf_l'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_ears/ear_otherabnormalities'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_ears/ear_oa_tinnitus_l'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_ears/ear_oa_drainage'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_ears/ear_oa_pain'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_ears/ear_oa_vertigo'))

WebUI.setText(findTestObject('Task_Notes/SNV/sensory/ss_ears/ear_oa_vertigo_tf'), 'On Ear')

WebUI.setText(findTestObject('Task_Notes/SNV/sensory/ss_ears/ear_oa_other'), 'Other Interventions or Abnormalities')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_nose/nose_congestion'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_nose/nose_rhinitis'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_nose/nose_sinus'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_nose/nose_otherabnormalities'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_nose/nose_oa_epistaxis'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_nose/nose_oa_lossofsmell'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_nose/nose_oa_noisybreating'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_nose/nose_oa_snoring'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_nose/nose_oa_lesions'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Task_Notes/SNV/sensory/ss_nose/nose_oa_lesions_tf'), 'External Nose Bridge Lesion')

WebUI.setText(findTestObject('Task_Notes/SNV/sensory/ss_nose/nose_oa_other'), 'Other Interventions or Abnormalities')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_mouth/mouth_dentures'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_mouth/mouth_dentures_upper'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_mouth/mouth_dentures_lower'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_mouth/mouth_dentures_partial'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_mouth/mouth_difficultyofchewing'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_mouth/mouth_poordefinition'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_mouth/mouth_otherabnormalities'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_mouth/mouth_oa_toothache'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_mouth/mouth_oa_gingivitis'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_mouth/mouth_oa_lossoftaste'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_mouth/mouth_oa_lesions'))

WebUI.setText(findTestObject('Task_Notes/SNV/sensory/ss_mouth/mouth_oa_lesions_tf'), 'Mouth Lesions')

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_mouth/mouth_oa_ulcerations'))

WebUI.setText(findTestObject('Task_Notes/SNV/sensory/ss_mouth/mouth_oa_ulcerations_tf'), 'Mouth Ulcerations')

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_mouth/mouth_oa_mass'))

WebUI.setText(findTestObject('Task_Notes/SNV/sensory/ss_mouth/mouth_oa_mass_tf'), 'Mouth Tumor')

WebUI.setText(findTestObject('Task_Notes/SNV/sensory/ss_mouth/mouth_oa_other'), 'Other Interventions or Abnormalities')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_throat/throat_sorethroat'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_throat/throat_dysphagia'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_throat/throat_hoarseness'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_throat/throat_lesions'))

WebUI.setText(findTestObject('Task_Notes/SNV/sensory/ss_throat/throat_lesions_tf'), 'Throat Lesion')

WebUI.setText(findTestObject('Task_Notes/SNV/sensory/ss_throat/throat_other'), 'Other Intervention and Abnormalities')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_speech/speech_slow'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_speech/speech_slurred'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_speech/speech_aphasia'))

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_speech/speech_mechanicalassistance'))

WebUI.setText(findTestObject('Task_Notes/SNV/sensory/ss_speech/speech_other'), 'Other Interventions and Abnormalities')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_touch/touch_paraesthesia'))

WebUI.setText(findTestObject('Task_Notes/SNV/sensory/ss_touch/touch_paraesthesia_tf'), 'Due to Anxiety and Panic Attack')

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_touch/touch_hyperesthesia'))

WebUI.setText(findTestObject('Task_Notes/SNV/sensory/ss_touch/touch_hyperesthesia_tf'), 'Due to Migraine')

WebUI.click(findTestObject('Task_Notes/SNV/sensory/ss_touch/touch_peripheralneuropathy'))

WebUI.setText(findTestObject('Task_Notes/SNV/sensory/ss_touch/touch_peripheralneuropathy_tf'), 'Due to HIV Related symptoms')

WebUI.setText(findTestObject('Task_Notes/SNV/sensory/ss_touch/touch_other'), 'Other Interventions and Abnormalities')

