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

WebUI.click(findTestObject('OASIS/OASIS_TABS/Neuro_tab'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_pupils_perrla'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_non-reactive_l'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_non-reactive_r'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_mental_status_oriented'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_mental_status_forgetful'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_mental_status_lethargic'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_mental_status_disoriented'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_mental_status_depressed'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_mental_status_agitated'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_mental_status_comatose'))

WebUI.setText(findTestObject('OASIS/Neurological/neurological_status/neuro_mental_status_other'), 'Frequent signs of aggression')

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_sleep_inadequate'))

WebUI.setText(findTestObject('OASIS/Neurological/neurological_status/neuro_sleep_inadequate_textfield'), 'wokes up at 3:15 AM')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_hand_grips_strong'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_hand_grips_strong_l'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_hand_grips_strong_r'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_hand_grips_weak'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_hand_grips_weak_l'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_hand_grips_weak_r'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_check_for_weakness'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_weakness_ue'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_weakness_ue_l'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_weakness_ue_r'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_weakness_le'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_weakness_le_l'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_weakness_le_r'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_paralysis_hemiparesis'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_paralysis_hemiparesis_l'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_paralysis_hemiparesis_r'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_seizure_petitmal'))

WebUI.setText(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_seizure_petitmal_lsdate'), 
    'June 23, 2015')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_tremors_ue'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_tremors_ue_l'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_tremors_ue_r'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_tremors_ue_fine'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_tremors_le'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_tremors_le_l'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_tremors_le_r'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_tremors_le_coarse'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_signs_headache'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_signs_numb'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_signs_lossofsensation'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_signs_visualdistubances'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_signs_involuntarymf'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_signs_incoordination'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_signs_improperresponse'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_signs_lossofabilitytomove'))

WebUI.setText(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_signs_lossofabilitytomove_textfield'), 
    'Left middle finger due to fracture')

WebUI.setText(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_signs_other'), 'Disassociation of things')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/psychosocial_status/psycho_cognitive'))

WebUI.click(findTestObject('OASIS/Neurological/psychosocial_status/psycho_confused'))

WebUI.click(findTestObject('OASIS/Neurological/psychosocial_status/psycho_anxious'))

WebUI.click(findTestObject('OASIS/Neurological/psychosocial_status/psycho_depressed'))

WebUI.click(findTestObject('OASIS/Neurological/psychosocial_status/psycho_memory_deficit'))

WebUI.click(findTestObject('OASIS/Neurological/psychosocial_status/psycho_impaired_dm'))

WebUI.click(findTestObject('OASIS/Neurological/psychosocial_status/psycho_physical_aggression'))

WebUI.click(findTestObject('OASIS/Neurological/psychosocial_status/psycho_inappropriate_b'))

WebUI.click(findTestObject('OASIS/Neurological/psychosocial_status/psycho_disruptive_b'))

WebUI.click(findTestObject('OASIS/Neurological/psychosocial_status/psycho_delusional'))

WebUI.setText(findTestObject('OASIS/Neurological/psychosocial_status/psycho_other_p_factors'), 'Bipolar and Frequent Sucidical Thoughts')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/language_barrier_yes'))

WebUI.delay(1)

not_run: WebUI.click(findTestObject('OASIS/Neurological/language_barrier/language_interpreter_need'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/language_interpreter_need_tf'), 'Mrs. Langdon')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/language_inter_sp'))

WebUI.delay(1)

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/language_inter_sp_tf'), 'Interpreter Organization')

WebUI.delay(1)

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/language_inter_sp_phone'), '3453452345')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/language_sign_type'))

WebUI.delay(1)

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/language_sign_type_tf'), 'ASL')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/learning_barrier_yes'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/learning_functional'))

WebUI.delay(1)

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/learning_functional_tf'), 'Motor Ability')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/learning_mental'))

WebUI.delay(1)

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/learning_mental_tf'), 'Speech Disorder')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/learning_physical'))

WebUI.delay(1)

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/learning_physical_tf'), 'Needs assistance all the time')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/learning_pyschosocial'))

WebUI.delay(1)

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/learning_psyschosocial_tf'), 'Anti-social Behaviour')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/learning_unable_read'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/learning_unable_write'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/signs_abuse_yes'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/signs_abuse_actual'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/signs_abuse_physical'))

WebUI.delay(1)

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/signs_abuse_physical_tf'), 'Traumatic Experience')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/signs_abuse_verbal'))

WebUI.delay(1)

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/signs_abuse_verbal_tf'), 'Traumatic Experience')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/signs_abuse_referredmsw'))

WebUI.delay(1)

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/signs_abuse_referredmsw_tf'), 'Centers for MSW')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/signs_abuse_referredchildadult'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/spiritual_yes'))

WebUI.delay(1)

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/spiritual_impact_care'), 'Sample Text')

WebUI.delay(1)

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/spiritual_resource'), 'Sample Text')

WebUI.delay(1)

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/spiritual_contact'), 'Sample Text')

WebUI.delay(1)

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/spiritual_phone'), '2333242343')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/M1700_1'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/M1710_2'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/M1720_2'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/M1730_1'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/M1730_a_0'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/M1730_b_1'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/M1740_1'))

WebUI.delay(1)

not_run: WebUI.click(findTestObject('OASIS/Neurological/M1740_2'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/M1740_3'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/M1740_4'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/M1740_5'))

WebUI.delay(1)

not_run: WebUI.click(findTestObject('OASIS/Neurological/M1740_6'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/M1740_7'))

WebUI.click(findTestObject('OASIS/Neurological/M1745_4'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS/OASIS_TABS/discardchangesbtn'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/OASIS_TABS/discardchangesmodalbtn'))

WebUI.delay(5)

