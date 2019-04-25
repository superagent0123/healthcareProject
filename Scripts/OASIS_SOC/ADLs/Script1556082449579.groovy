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

WebUI.click(findTestObject('OASIS/OASIS_TABS/ADL_tab'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/adls_ms_muscle_strength_strong'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/adls_ms_rom_limited'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/adls_ms_loc_lue'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/adls_ms_loc_rue'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/adls_ms_loc_lle'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/adls_ms_loc_rle'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/adls_ms_bedmob_independent'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/adls_ms_transferab_moderate'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/adls_ms_gait_steady'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/adls_ms_balance_fair'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/adls_ms_riskfalls_high'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/adls_ms_amputation_bk'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/adls_ms_amputation_ak'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/adls_ms_amputation_ue'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/adls_ms_amputation_tf'), 'Sample Text')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/adls_ms_amputation_l'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/adls_ms_amputation_r'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/adls_ms_fracture_new'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/adls_ms_fracture_location'), 'Sample Text')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/if_case_present/adls_cast_present_character_swelling'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/if_case_present/adls_cast_present_character_swelling_tf'), 
    'Sample Text')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/if_case_present/adls_cast_present_character_pallor'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/if_case_present/adls_cast_present_character_pallor_tf'), 
    'Sample Text')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/if_case_present/adls_cast_present_character_pain'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/if_case_present/adls_cast_present_character_pain_tf'), 
    'Sample Text')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/if_case_present/adls_cast_present_skintemp_warm'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/if_case_present/adls_cast_present_mobility_abletomove'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/if_case_present/adls_cast_present_mobility_abletomove_tf'), 
    'Sample Text')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/if_case_present/adls_cast_present_capillary_more3sec'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_functional_limitations/adls_functional_ambulation'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_functional_limitations/adls_functional_endurance'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_functional_limitations/adls_functional_contracture'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_functional_limitations/adls_functional_paralysis'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_functional_limitations/adls_functional_amputation'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_functional_limitations/adls_functional_legally_blind'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_functional_limitations/adls_functional_hearing'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_functional_limitations/adls_functional_speech'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_functional_limitations/adls_functional_dyspnea'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_functional_limitations/adls_functional_bowel'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_functional_limitations/adls_functional_other'), 'Motor ability')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_activities_permitted/adls_act_permitted_independentathome'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_activities_permitted/adls_act_permitted_upastolerated'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_activities_permitted/adls_act_permitted_bedrest'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_activities_permitted/adls_act_permitted_complete_bedrest'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_activities_permitted/adls_act_permitted_transferbed'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_activities_permitted/adls_act_permitted_partialweight'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_activities_permitted/adls_act_permitted_walker'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_activities_permitted/adls_act_permitted_wheelchair'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_activities_permitted/adls_act_permitted_cane'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_activities_permitted/adls_act_permitted_crutches'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_activities_permitted/adls_act_permitted_norestrictions'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_activities_permitted/adls_act_permitted_excercises'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_activities_permitted/adls_act_permitted_other'), 'Walking')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/M1800_1'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/M1810_0'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/M1820_1'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/M1830_1'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/M1840_0'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/M1845_1'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/M1850_0'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/M1860_0'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/M1870_0'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/M1910_1'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mahc_10/adls_mach10_age65'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mahc_10/adls_mach10_diagnosis'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mahc_10/adls_mach10_priorhistoryoffall'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mahc_10/adls_mach10_incontinence'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mahc_10/adls_mach10_visualimpairment'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mahc_10/adls_mach10_impairedfunctional'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mahc_10/adls_mach10_environmenthazards'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mahc_10/adls_mach10_polypharmacy'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mahc_10/adls_mach10_painaffecting'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mahc_10/adls_mach10_cognitiveimpairment'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0100_priorfunctioning_a'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0100_priorfunctioning_a'), '3')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0100_priorfunctioning_b'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0100_priorfunctioning_b'), '3')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0100_priorfunctioning_c'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0100_priorfunctioning_c'), '2')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0100_priorfunctioning_d'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0100_priorfunctioning_d'), '2')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0110_priordevice_a'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0110_priordevice_b'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0110_priordevice_c'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0110_priordevice_d'))

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0110_priordevice_e'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_soc_a'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_soc_a'), '06')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_dc_a'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_dc_a'), '06')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_soc_b'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_soc_b'), '06')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_dc_b'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_dc_b'), '06')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_soc_c'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_soc_c'), '06')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_dc_c'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_dc_c'), '06')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_soc_e'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_soc_e'), '06')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_dc_e'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_dc_e'), '06')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_soc_f'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_soc_f'), '06')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_dc_f'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_dc_f'), '06')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_soc_g'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_soc_g'), '06')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_dc_g'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_dc_g'), '06')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_soc_h'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_soc_h'), '06')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_dc_h'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0130_self-care_dc_h'), '06')

WebUI.delay(5)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_a'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_a'), '06')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_a'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_a'), '06')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_b'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_b'), '06')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_b'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_b'), '06')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_c'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_c'), '06')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_c'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_c'), '06')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_d'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_d'), '06')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_d'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_d'), '06')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_e'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_e'), '06')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_e'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_e'), '06')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_f'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_f'), '06')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_f'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_f'), '06')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_g'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_g'), '06')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_g'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_g'), '06')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_i'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_i'), '06')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_i'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_i'), '06')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_j'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_j'), '06')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_j'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_j'), '06')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_k'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_k'), '06')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_k'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_k'), '06')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_l'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_l'), '06')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_l'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_l'), '06')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_m'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_m'), '06')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_m'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_m'), '06')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_n'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_n'), '06')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_n'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_n'), '06')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_o'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_o'), '06')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_o'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_o'), '06')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_p'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_p'), '06')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_p'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_p'), '06')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_q'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_q'), '1')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_r'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_r'), '06')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_r'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_r'), '06')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_rr1'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_rr1'), '1')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_s'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_soc_s'), '06')

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_s'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_dc_s'), '06')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_ss1'))

WebUI.setText(findTestObject('OASIS/ADLs-IADLs/adls_sectionGG/adls_GG0170C_ss1'), '1')

WebUI.delay(10)

