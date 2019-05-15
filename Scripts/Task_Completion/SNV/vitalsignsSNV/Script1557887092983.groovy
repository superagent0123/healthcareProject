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

not_run: WebUI.click(findTestObject('Task_Notes/SNV/snv_tabs/snv_vitalsigns'))

WebUI.setText(findTestObject('Task_Notes/SNV/vitalsigns/vs_temperature'), '37')

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_temperature_oral'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Task_Notes/SNV/vitalsigns/vs_pulserate'), '185')

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pulserate_radial'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Task_Notes/SNV/vitalsigns/vs_respiration'), '34')

not_run: WebUI.setText(findTestObject('Task_Notes/SNV/vitalsigns/vs_bparmr_1'), '4')

not_run: WebUI.setText(findTestObject('Task_Notes/SNV/vitalsigns/vs_bparmr_2'), '10')

not_run: WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_bparmr_sitting'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Task_Notes/SNV/vitalsigns/vs_bparml_1'), '5')

not_run: WebUI.setText(findTestObject('Task_Notes/SNV/vitalsigns/vs_bparml_2'), '10')

not_run: WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_bparml_sitting'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Task_Notes/SNV/vitalsigns/vs_bplegr_1'), '3')

not_run: WebUI.setText(findTestObject('Task_Notes/SNV/vitalsigns/vs_bplegr_2'), '10')

not_run: WebUI.setText(findTestObject('Task_Notes/SNV/vitalsigns/vs_bplegr_sitting'), '10')

not_run: WebUI.setText(findTestObject('Task_Notes/SNV/vitalsigns/vs_bplegl_1'), '7')

not_run: WebUI.setText(findTestObject('Task_Notes/SNV/vitalsigns/vs_bplegl_2'), '10')

not_run: WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_bplegl_sitting'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Task_Notes/SNV/vitalsigns/vs_o2saturation_onroomair'), '95')

WebUI.setText(findTestObject('Task_Notes/SNV/vitalsigns/vs_o2saturation_ono2'), '21')

WebUI.setText(findTestObject('Task_Notes/SNV/vitalsigns/vs_o2saturation_ono2_lpm'), '58')

WebUI.setText(findTestObject('Task_Notes/SNV/vitalsigns/vs_bloodglucose'), '140')

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_bloodglucose_fbs'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Task_Notes/SNV/vitalsigns/vs_weight_lbs'), '118')

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_weight_actual'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Task_Notes/SNV/vitalsigns/vs_interventions'), 'There is no significant vital signs intervention has been assessed by the attending physician.')

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_evidenceofinfection_yes'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Task_Notes/SNV/vitalsigns/vs_evidenceofinfection_yes_tf'), 'Fungal Infection on lower gum')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pain_assessment/vs_pa_freq_patienthaspain'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_painassessment/pa_location'), 'Right Arm')

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_painassessment/pa_type_acute'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_painassessment/pa_presentlevel_0'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_painassessment/pa_worstlevel_0'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_painassessment/pa_acceptablelevel_0'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_painassessment/pa_levelafterpainmeds_0'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_characterofpain/cp_sharp'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_characterofpain/cp_squeezing'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_characterofpain/cp_stabbing'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_characterofpain/cp_stinging'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_characterofpain/cp_cramping'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_characterofpain/cp_shooting'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_characterofpain/cp_throbbing'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_characterofpain/cp_tingling'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_characterofpain/cp_burning'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_characterofpain/cp_aching'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_characterofpain/cp_gnawing'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_characterofpain/cp_crushing'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_nonverbalsigns/nvs_diaphoresis'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_nonverbalsigns/nvs_guarding'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_nonverbalsigns/nvs_restlessness'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_nonverbalsigns/nvs_grimacing'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_nonverbalsigns/nvs_moaning'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_nonverbalsigns/nvs_tense'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_nonverbalsigns/nvs_irritability'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_nonverbalsigns/nvs_changeinvs'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_nonverbalsigns/nvs_changeinvs_tf'), 'Elevated Heart Rate by 5 percent')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_whatpainworse/pw_movement'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_whatpainworse/pw_ambulation'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_whatpainworse/pw_immobility'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_whatpainworse/pw_other'), 'Certain Food intake and allergic reactions')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_whatpainbetter/pb_heatice'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_whatpainbetter/pb_restrelax'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_whatpainbetter/pb_massage'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_whatpainbetter/pb_medication'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_whatpainbetter/pb_repositioning'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_whatpainbetter/pb_diversion'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_whatpainbetter/pb_other'), 'Olfactory Sensation Training from medicinal herb scents')

WebUI.delay(3)

WebUI.setText(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_painmedication/pm_tf'), 'Hydromorphone')

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_painmedication/pm_medicationeffect_effective'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_painmedication/pm_medicationneeded_daily'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/vitalsigns/vs_pa_painmedication/pm_physicianawarepain_yes'), FailureHandling.STOP_ON_FAILURE)

