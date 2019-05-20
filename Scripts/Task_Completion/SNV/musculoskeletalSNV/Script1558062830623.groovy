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

not_run: WebUI.click(findTestObject('Task_Notes/SNV/snv_tabs/snv_musculoskeletal'))

WebUI.click(findTestObject('Task_Notes/SNV/musculoskeletal/mus_mstrength_strong'))

WebUI.click(findTestObject('Task_Notes/SNV/musculoskeletal/mus_rom_wfl'))

WebUI.click(findTestObject('Task_Notes/SNV/musculoskeletal/mus_rom_loc_lue'))

WebUI.click(findTestObject('Task_Notes/SNV/musculoskeletal/mus_rom_loc_rue'))

WebUI.click(findTestObject('Task_Notes/SNV/musculoskeletal/mus_rom_loc_lle'))

WebUI.click(findTestObject('Task_Notes/SNV/musculoskeletal/mus_rom_loc_rle'))

WebUI.click(findTestObject('Task_Notes/SNV/musculoskeletal/mus_bedmobility_independent'))

WebUI.click(findTestObject('Task_Notes/SNV/musculoskeletal/mus_transferability_independent'))

WebUI.click(findTestObject('Task_Notes/SNV/musculoskeletal/mus_gait_steady'))

WebUI.click(findTestObject('Task_Notes/SNV/musculoskeletal/mus_balance_good'))

WebUI.click(findTestObject('Task_Notes/SNV/musculoskeletal/mus_riskforfalls_low'))

WebUI.click(findTestObject('Task_Notes/SNV/musculoskeletal/mus_amputation_bk'))

WebUI.click(findTestObject('Task_Notes/SNV/musculoskeletal/mus_amputation_ak'))

WebUI.click(findTestObject('Task_Notes/SNV/musculoskeletal/mus_amputation_ue'))

WebUI.setText(findTestObject('Task_Notes/SNV/musculoskeletal/mus_amputation_ue_tf'), 'Sample Text')

WebUI.click(findTestObject('Task_Notes/SNV/musculoskeletal/mus_amputation_left'))

WebUI.click(findTestObject('Task_Notes/SNV/musculoskeletal/mus_amputation_right'))

WebUI.click(findTestObject('Task_Notes/SNV/musculoskeletal/mus_fracture_new'))

WebUI.setText(findTestObject('Task_Notes/SNV/musculoskeletal/mus_fracture_loc'), 'Sample text')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/musculoskeletal/mus_ifcastpresent/ifcp_charac_swelling'))

WebUI.setText(findTestObject('Task_Notes/SNV/musculoskeletal/mus_ifcastpresent/ifcp_charac_swelling_tf'), 'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/musculoskeletal/mus_ifcastpresent/ifcp_charac_pallor'))

WebUI.setText(findTestObject('Task_Notes/SNV/musculoskeletal/mus_ifcastpresent/ifcp_charac_pallor_tf'), 'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/musculoskeletal/mus_ifcastpresent/ifcp_charac_pain'))

WebUI.setText(findTestObject('Task_Notes/SNV/musculoskeletal/mus_ifcastpresent/ifcp_charac_pain_tf'), 'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/musculoskeletal/mus_ifcastpresent/ifcp_charac_warm'))

WebUI.click(findTestObject('Task_Notes/SNV/musculoskeletal/mus_ifcastpresent/ifcp_mobility_abletomove'))

WebUI.setText(findTestObject('Task_Notes/SNV/musculoskeletal/mus_ifcastpresent/ifcp_mobility_abletomove_tf'), 'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/musculoskeletal/mus_ifcastpresent/ifcp_capillaryrefilll_lessthan3sec'))

WebUI.delay(3)

