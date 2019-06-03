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

def yourText = '\nLorem ipsum dolor sit amet,\nconsectetur adipiscing elit,\nsed do eiusmod tempor incididunt\nut labore et dolore magna aliqua.\n'

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Time_In'), '1111')

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/company'), 'Intermed')

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Medical_Diagnosis'), 'med diagnosis sample')

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/PT_diagnosis'), 'PT DIAG')

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Medical_Diag_Exacerbation'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Medical_Diag_Onset'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/PT_Diagn_Exacerbation'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/PT_Diag_Onset'))

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Medical_Diag_Onset_text'), 'ffffffffffffffffffffffffffffff')

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/PT_Diag_Onset_text'), 'gggggggggggggggggggggggggg')

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_Rheumatoid'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_Osteoarthritis'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_Falls'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_Gait'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_CVA'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_Multiple'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_Dizziness'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_Seizure'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_Parkinsons'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_Muscular'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_Spinal'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_Head'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_Pares'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_Hemi'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_Para'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_Quadri'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_COPD'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_CHF'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_DVT'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_PVD'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_CAD'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_HTN'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_Neuro'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_Pressure'))

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_Joint'), 'ddddddddddddddddd')

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_FallHistory'), 'hhhhhhhhhhhhhhhh')

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_within60days'), '35')

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_contructures'), 'fdgdfgdfgdf')

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_FructureNew'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_FructureOld'))

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/RMH_FructureLocation'), 'fgggggggggggggg')

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/PriorLevelOfFunctioning'), yourText)

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/PatientGoals'), yourText)

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/HomeboundStatus_need'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/HomeboundStatus_unable'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/HomeboundStatus_dependent'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/HomeboundStatus_shortness'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/HomeboundStatus_requires'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/HomeboundStatus_residual'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/HomeboundStatus_medical'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/HomeboundStatus_impaired'))

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/HomeboundStatus_others'), 'sample')

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Patient living situation'))

not_run: WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Home environment safety_no Hazard'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Home environment safety_stairs'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Home environment safety_narrow'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Home environment safety_cluttered'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Home environment safety_unsecured'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Home environment safety_uneven'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Home environment safety_no Grab'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Home environment safety_assistive'))

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Home environment safety_others'), 'sample')

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/VS_pulse'), '85')

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/VS_pulseCheck'))

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/VS_respi'), '95')

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/VS_respiCheck'))

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/VS_bp'), '120110')

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/VS_bpcheck'))

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/VS_o2'), '80')

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/VS_o2Sat'), '85')

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/VS_o2Sat_LPM'), '5')

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/VS_o2Sat_check'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Physical Assessment_speechCheck'))

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Physical Assessment_speechText'), 'sample')

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Physical Assessment_vision_check'))

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Physical Assessment_vision_text'), 'vision imnpaired')

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Physical Assessment_hearing_check'))

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Physical Assessment_hearing_text'), 'hearing impaired')

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Physical Assessment_skin_check'))

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Physical Assessment_skin_text'), 'skin dissease')

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Physical Assessment_orientation_check'))

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Physical Assessment_orientation_text'), 'orientation')

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Physical Assessment_cognitive_check'))

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Physical Assessment_cognitive_text'), 'cognitive')

not_run: WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Paint_denies'))

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Pain_site1_location'), 'buttock left')

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Pain_site1_typeAcute'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Pain_site1_level'))

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Pain_site2_location'), 'arm left')

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Pain_site2_typeChronic'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Pain_site2_level'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Pain_What makes the pain worse_check'), FailureHandling.STOP_ON_FAILURE)

//for (int r = 2; r <= 3; r++){
//WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Pain_What makes the pain worse_check' + r));
//}
not_run: WebUI.waitForElementClickable(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/testWhatMakes'), 2)

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/What makes the pain better'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Musculoskeletal Assessment_NeckFlexionL'))

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Functional Assessment_BedMobilityRollDevice'), 'wheelchair')

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Functional Assessment_bedmobility06'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Functional Assessment_bedmobilityTX'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/NEXT'))

not_run: WebUI.click(findTestObject('Task_Notes/PT_EVAL/PREVIOUS'))

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Muscle Strength_LongTermWeeks'), '1')

WebUI.delay(2)

WebUI.setText(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/Muscle Strength_LongTermIncreaseTo'), '2')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/SAVE'))

WebUI.click(findTestObject('Task_Notes/PT_EVAL/Assessment_Section/GENERATE_ORDER_MODAL_YES'))

