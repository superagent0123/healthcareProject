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

not_run: WebUI.click(findTestObject('Task_Notes/SNV/snv_tabs/snv_neurological'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_neurostatus/n_ns_pupils_PERRLA'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_neurostatus/n_ns_mentalstat_oriented'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_neurostatus/n_ns_mentalstat_forgetful'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_neurostatus/n_ns_mentalstat_lethargic'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_neurostatus/n_ns_mentalstat_disoriented'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_neurostatus/n_ns_mentalstat_depressed'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_neurostatus/n_ns_mentalstat_agitated'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_neurostatus/n_ns_mentalstat_comatose'))

WebUI.setText(findTestObject('Task_Notes/SNV/neurological/n_neurostatus/n_ns_mentalstat_other'), 'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_neurostatus/n_ns_sleeprest_adequate'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_neurostatus/n_ns_handgrips_strong'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_neurostatus/n_ns_handgrips_strong_left'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_neurostatus/n_ns_handgrips_strong_right'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_neurostatus/n_ns_handgrips_weak'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_neurostatus/n_ns_handgrips_weak_left'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_neurostatus/n_ns_handgrips_weak_right'))

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/checkfor_weakness_paralysis'))

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_weakness_uex'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_weakness_uex_left'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_weakness_uex_right'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_weakness_lex'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_weakness_lex_left'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_weakness_lex_right'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_paralysis_hemiparesis'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_paralysis_hemiparesis_left'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_paralysis_hemiparesis_right'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_seizure_granmal'))

WebUI.setText(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_seizure_lastseizuredate'), 
    'January 2019')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_tremors_uex'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_tremors_uex_left'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_tremors_uex_right'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_tremors_uex_fine'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_tremors_lex'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_tremors_lex_left'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_tremors_lex_right'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_tremors_lex_coarse'))

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_othersigns_headache'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_othersigns_numbness'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_othersigns_lossofsensation'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_othersigns_visualdisturbances'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_othersigns_incoordination'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_othersigns_involuntarymotorfunction'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_othersigns_improperresponsestimuli'))

WebUI.click(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_othersigns_lossofabilitytomove'))

WebUI.setText(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_othersigns_lossofabilitytomove_tf'), 
    'Sample text')

WebUI.setText(findTestObject('Task_Notes/SNV/neurological/n_ns_checkforweaknessparaylsis/cwp_othersigns_other'), 'Sample text')

WebUI.delay(3)

