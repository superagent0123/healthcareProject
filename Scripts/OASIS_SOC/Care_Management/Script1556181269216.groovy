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

WebUI.click(findTestObject('OASIS/OASIS_TABS/CareManagement_tab'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Care_Management/M2102_2'))

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS/Care_Management/M2200_000'), '000')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/pt/cm_po_pt_difficultyintransfers'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/pt/cm_po_pt_pcg'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/pt/cm_po_pt_difficultyinlower'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/pt/cm_po_pt_knowledgedeficit'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/pt/cm_po_pt_identifiedhighrisk'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/pt/cm_po_pt_painofmuscle'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/pt/cm_po_pt_therapeutic'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/pt/cm_po_pt_newlydeveloped'))

WebUI.setText(findTestObject('OASIS/Care_Management/cm_physician_orders/pt/cm_po_pt_other'), 'Sample text')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/ot/cm_po_ot_upperex'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/ot/cm_po_ot_requiressplinting'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/ot/cm_po_ot_difficultyinadls'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/ot/cm_po_ot_limitedupperex'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/ot/cm_po_ot_requireswork'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/ot/cm_po_ot_needinstructions'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/ot/cm_po_ot_difficultyproblem'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/ot/cm_po_ot_decreasedcoordination'))

WebUI.setText(findTestObject('OASIS/Care_Management/cm_physician_orders/ot/cm_po_ot_other'), 'Sample text')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/st/cm_po_st_receptive'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/st/cm_po_st_communication'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/st/cm_po_st_othercognitive'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/st/cm_po_st_shortattention'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/st/cm_po_st_poorgag'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/st/cm_po_st_facialtongue'))

WebUI.setText(findTestObject('OASIS/Care_Management/cm_physician_orders/st/cm_po_st_other'), 'Sample text')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/msw/cm_po_msw_referraltossa'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/msw/cm_po_msw_mealhousing'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/msw/cm_po_msw_assistanceadls'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/msw/cm_po_msw_evaluationandeduc'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/msw/cm_po_msw_actaspatient'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/msw/cm_po_msw_assistancewithreimburse'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/msw/cm_po_msw_needforcomm'))

WebUI.setText(findTestObject('OASIS/Care_Management/cm_physician_orders/msw/cm_po_msw_needforcomm_tf'), 'Sample text')

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/msw/cm_po_msw_counselling'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OASIS/Care_Management/cm_physician_orders/msw/cm_po_msw_counselling_tf'), 'Sample text')

WebUI.setText(findTestObject('OASIS/Care_Management/cm_physician_orders/msw/cm_po_msw_other'), 'Sample text')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/dietician/cm_po_dietician_identified'))

WebUI.setText(findTestObject('OASIS/Care_Management/cm_physician_orders/dietician/cm_po_dietician_other'), 'Sample text')

WebUI.delay(2)

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Care_Management/cm_physician_orders/chha/cm_po_chha_toassistpersonalcare'))

WebUI.setText(findTestObject('OASIS/Care_Management/cm_physician_orders/chha/cm_po_chha_other'), 'Sample text')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Care_Management/cm_care_coordination/cm_cc_coordinationcarewith/cm_cc_coordinationcarewith_physician'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_care_coordination/cm_cc_coordinationcarewith/cm_cc_coordinationcarewith_rnsupervisor'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_care_coordination/cm_cc_coordinationcarewith/cm_cc_coordinationcarewith_rnlvn'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_care_coordination/cm_cc_coordinationcarewith/cm_cc_coordinationcarewith_patient'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_care_coordination/cm_cc_coordinationcarewith/cm_cc_coordinationcarewith_pcg'))

WebUI.setText(findTestObject('OASIS/Care_Management/cm_care_coordination/cm_cc_coordinationcarewith/cm_cc_coordinationcarewith_other'), 
    'Sample text')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Care_Management/cm_care_coordination/cm_cc_communicatedvia/cm_cc_communicatedvia_phone'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_care_coordination/cm_cc_communicatedvia/cm_cc_communicatedvia_fax'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_care_coordination/cm_cc_communicatedvia/cm_cc_communicatedvia_persontoperson'))

WebUI.setText(findTestObject('OASIS/Care_Management/cm_care_coordination/cm_cc_communicatedvia/cm_cc_communicatedvia_comreceivedby'), 
    'Khenard Figuracion')

WebUI.setText(findTestObject('OASIS/Care_Management/cm_care_coordination/cm_cc_communicatedvia/cm_cc_communicatedvia_date'), 
    'April 26, 2019')

WebUI.setText(findTestObject('OASIS/Care_Management/cm_care_coordination/cm_cc_communicatedvia/cm_cc_communicatedvia_time'), 
    '10:04 AM')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_regardingpatient/cm_sa_rpc_ssindicative'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_regardingpatient/cm_sa_rpc_diabetic'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_regardingpatient/cm_sa_rpc_hypertensive'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_regardingpatient/cm_sa_rpc_depression'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_regardingpatient/cm_sa_rpc_newwound'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_regardingpatient/cm_sa_rpc_unrelievedpain'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_regardingpatient/cm_sa_rpc_fallinjury'))

WebUI.setText(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_regardingpatient/cm_sa_rpc_other'), 'Sample text')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_regardingmedication/cm_sa_rm_adverseeffect'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_regardingmedication/cm_sa_rm_potentialadverse'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_regardingmedication/cm_sa_rm_ineffectivedrugtherapy'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_regardingmedication/cm_sa_rm_significantsideeffect'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_regardingmedication/cm_sa_rm_significantdrunginteractions'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_regardingmedication/cm_sa_rm_noncompliance'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_regardingmedication/cm_sa_rm_misseddose'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_regardingmedication/cm_sa_rm_newmed'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_regardingmedication/cm_sa_rm_medrecon'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_regardingmedication/cm_sa_rm_duplicatedt'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_regardingmedication/cm_sa_rm_missingmed'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_regardingmedication/cm_sa_rm_wrongdose'))

WebUI.setText(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_regardingmedication/cm_sa_rm_other'), 'Sample text')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_obtainedpofor/cm_sa_opof_lab'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_obtainedpofor/cm_sa_opof_med'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_obtainedpofor/cm_sa_opof_treatments'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_obtainedpofor/cm_sa_opof_dme'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_obtainedpofor/cm_sa_opof_diabeticfootexam'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_obtainedpofor/cm_sa_opof_fallprevention'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_obtainedpofor/cm_sa_opof_depression'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_obtainedpofor/cm_sa_opof_interventionstomonitor'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_obtainedpofor/cm_sa_opof_interventionstoprevent'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_obtainedpofor/cm_sa_opof_woundcaretreatment'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_obtainedpofor/cm_sa_opof_patientspecificparam'))

WebUI.setText(findTestObject('OASIS/Care_Management/cm_subject_areas/cm_sa_obtainedpofor/cm_sa_opof_other'), 'Sample text')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Care_Management/cm_dme/cm_dme_walker_has'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_dme/cm_dme_cane_needs'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_dme/cm_dme_wheelchair_has'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_dme/cm_dme_bedside_needs'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_dme/cm_dme_showerbench_has'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_dme/cm_dme_feedingpump_needs'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_dme/cm_dme_suction_has'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_dme/cm_dme_o2con_needs'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_dme/cm_dme_nebulizer_has'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_dme/cm_dme_hospitalbed_needs'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_dme/cm_dme_lowairmattress_has'))

WebUI.setText(findTestObject('OASIS/Care_Management/cm_dme/cm_dme_other_tf'), 'Air Conditioner Machine')

WebUI.click(findTestObject('OASIS/Care_Management/cm_dme/cm_dme_other_needs'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_dme/cm_dme_workingproperly_yes'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Care_Management/cm_knowledgedeficit/cm_kda_diseaseprocess'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_knowledgedeficit/cm_kda_prevention'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_knowledgedeficit/cm_kda_reportable'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_knowledgedeficit/cm_kda_emergency'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_knowledgedeficit/cm_kda_medication'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_knowledgedeficit/cm_kda_compliance'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_knowledgedeficit/cm_kda_diet'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_knowledgedeficit/cm_kda_homesafety'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_knowledgedeficit/cm_kda_oxygen'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_knowledgedeficit/cm_kda_infection'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_knowledgedeficit/cm_kda_pain'))

WebUI.setText(findTestObject('OASIS/Care_Management/cm_knowledgedeficit/cm_kda_other'), 'Sample text')

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS/Care_Management/cm_additonalassessment'), 'The patient must be assisted all the time especially when it comes to basic house chores such as doing the laundry, washing the dishes, walking upstairs. He\'s basically disabled in so many aspects.')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Care_Management/cm_instructionsteachings/cm_instructionst_patientrights'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_instructionsteachings/cm_instructionst_statehotline'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_instructionsteachings/cm_instructionst_advancedirectives'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_instructionsteachings/cm_instructionst_dnr'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_instructionsteachings/cm_instructionst_hipaanotice'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_instructionsteachings/cm_instructionst_oasisprivacy'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_instructionsteachings/cm_instructionst_agencyphone'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_instructionsteachings/cm_instructionst_whentocontact'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_instructionsteachings/cm_instructionst_abnhhccn'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_instructionsteachings/cm_instructionst_emergencyplanning'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_instructionsteachings/cm_instructionst_infectioncontrol'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_instructionsteachings/cm_instructionst_basichomesafety'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_instructionsteachings/cm_instructionst_fallprevention'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_instructionsteachings/cm_instructionst_medication'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_instructionsteachings/cm_instructionst_advancebeneficiary'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_instructionsteachings/cm_instructionst_oxygenrisk'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_instructionsteachings/cm_instructionst_diseaseprocess'))

WebUI.setText(findTestObject('OASIS/Care_Management/cm_instructionsteachings/cm_instructionst_other1'), 'Sample text')

WebUI.setText(findTestObject('OASIS/Care_Management/cm_instructionsteachings/cm_instructionst_other2'), 'Sample text')

WebUI.setText(findTestObject('OASIS/Care_Management/cm_instructionsteachings/cm_instructionst_other3'), 'Sample text')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Care_Management/cm_dischargeplans/cm_dcplans_returntoanindependent'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_dischargeplans/cm_dcplans_abletoremainresisdence'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_dischargeplans/cm_dcplans_abletoemainassistive'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_dischargeplans/cm_dcplans_whenpatient'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_dischargeplans/cm_dcplans_abletounderstand'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_dischargeplans/cm_dcplans_medicalcondition'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_dischargeplans/cm_dcplans_whenmaxpotential'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_dischargeplans/cm_dcplans_dischargeattheend'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_dischargeplans/cm_dcplans_whengoalsaremet'))

WebUI.setText(findTestObject('OASIS/Care_Management/cm_dischargeplans/cm_dcplans_other'), 'Other discharge plan might be added upon the care staff\'s notice or instruction.')

WebUI.click(findTestObject('OASIS/Care_Management/cm_dischargeplans/cm_dcplans_planofcareanddc_patient'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_dischargeplans/cm_dcplans_planofcareanddc_pcg'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_dischargeplans/cm_dcplans_planofcareanddc_family'))

WebUI.click(findTestObject('OASIS/Care_Management/cm_dischargeplans/cm_dcplans_planofcareanddc_agreeable'))

WebUI.setText(findTestObject('OASIS/Care_Management/cm_dischargeplans/cm_dcplans_patientgoals'), 'To be well')

WebUI.setText(findTestObject('OASIS/Care_Management/cm_dischargeplans/cm_dcplans_disciplinefreq'), 'Sample text')

WebUI.click(findTestObject('OASIS/Care_Management/cm_dischargeplans/cm_dcplans_rehabpotential_fair'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS/OASIS_TABS/discardchangesbtn'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/OASIS_TABS/discardchangesmodalbtn'))

WebUI.delay(5)

