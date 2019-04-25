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

WebUI.click(findTestObject('OASIS/ADLs-IADLs/adls_mucko_status/adls_ms_fracture_new'))

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

WebUI.delay(10)

