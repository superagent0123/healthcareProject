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

WebUI.click(findTestObject('OASIS/OASIS_TABS/xitemedits_btn'))

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

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_sleep_inadequate'))

WebUI.delay(1)

WebUI.setText(findTestObject('OASIS/Neurological/neurological_status/neuro_sleep_inadequate_textfield'), 'Typically wokes up at 3:15 AM')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_hand_grips_strong'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_hand_grips_strong_l'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_hand_grips_strong_r'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_hand_grips_weak'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_hand_grips_weak_l'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_hand_grips_weak_r'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/neuro_check_for_weakness'))

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

WebUI.delay(1)

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

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_signs_numb'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_signs_lossofsensation'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_signs_visualdistubances'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_signs_involuntarymf'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_signs_incoordination'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_signs_improperresponse'))

WebUI.click(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_signs_lossofabilitytomove'))

WebUI.setText(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_signs_lossofabilitytomove_textfield'), 
    'Left middle finger due to fracture')

WebUI.setText(findTestObject('OASIS/Neurological/neurological_status/check_for_weakness/c_weak_signs_other'), 'Disassociation of things')

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

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/language_barrier_yes'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/language_interpreter_need'))

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/language_interpreter_need_tf'), 'Mrs. Langdon')

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/language_inter_sp'))

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/language_inter_sp_tf'), 'Interpreter Organization')

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/language_inter_sp_phone'), '3453452345')

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/language_sign_type'))

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/language_sign_type_tf'), 'ASL')

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/learning_barrier_yes'))

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/learning_functional'))

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/learning_functional_tf'), 'Motor Ability')

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/learning_mental'))

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/learning_mental_tf'), 'Speech Disorder')

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/learning_physical'))

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/learning_physical_tf'), 'Needs assistance all the time')

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/learning_pyschosocial'))

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/learning_psyschosocial_tf'), 'Anti-social Behaviour')

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/learning_unable_read'))

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/learning_unable_write'))

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/signs_abuse_yes'))

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/signs_abuse_actual'))

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/signs_abuse_physical'))

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/signs_abuse_physical_tf'), 'Traumatic Experience')

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/signs_abuse_verbal'))

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/signs_abuse_verbal_tf'), 'Traumatic Experience')

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/signs_abuse_referredmsw'))

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/signs_abuse_referredmsw_tf'), 'Centers for MSW')

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/signs_abuse_referredchildadult'))

WebUI.click(findTestObject('OASIS/Neurological/language_barrier/spiritual_yes'))

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/spiritual_impact_care'), 'Sample Text')

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/spiritual_resource'), 'Sample Text')

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/spiritual_contact'), 'Sample Text')

WebUI.setText(findTestObject('OASIS/Neurological/language_barrier/spiritual_phone'), '2333242343')

WebUI.delay(8)

