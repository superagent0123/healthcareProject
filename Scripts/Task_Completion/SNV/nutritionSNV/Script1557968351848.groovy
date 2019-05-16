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

not_run: WebUI.click(findTestObject('Task_Notes/SNV/snv_tabs/snv_nutrition'))

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_regulardiet'))

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_1800calada'))

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_2gmsodium'))

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_renaldiet'))

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_fluidrestriction24hours'))

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_tpnintralipids'))

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_enteralfeeding'))

WebUI.delay(2)

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_othernutrition'))

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_on_lowsodium'))

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_on_noadddedsalt'))

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_on_highprotein'))

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_on_lowprotein'))

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_on_lowfat'))

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_on_lowcholesterol'))

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_on_mechanicalsoft'))

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_on_highfiber'))

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_on_coumadindiet'))

WebUI.setText(findTestObject('Task_Notes/SNV/nutrition/n_on_other'), 'Ketogenic Diet')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_enteral_nutrition/n_en_envia_gastrostomy'))

WebUI.setText(findTestObject('Task_Notes/SNV/nutrition/n_enteral_nutrition/n_en_envia_other'), 'Other ostomy')

WebUI.setText(findTestObject('Task_Notes/SNV/nutrition/n_enteral_nutrition/n_en_tubeinsertiondate'), 'May 2019')

WebUI.delay(3)

WebUI.setText(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_formula'), 'Sample Text')

WebUI.setText(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_formula_amountperday'), '2.4 mg')

WebUI.setText(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_fluidsupplement'), 'Sample Text')

WebUI.setText(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_fluidsupplement_amountperday'), '3.6 mg')

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_feedingdeliverymode_feedingpump'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_formuladeliverysystem_opensystem'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_feedingpumpratehour_ml'), '3')

WebUI.setText(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_feedingpumpratehour_hoursperday'), 
    '4')

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_patientnpo_yes'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_patientnpo_tf'), 'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_patienttoleratingfeeding_yes'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_patienttoleratingfeeding_tf'), 'Sample text')

WebUI.setText(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_gastricresidual_amountml'), '2')

WebUI.setText(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_gastricresidual_forhours'), '3')

WebUI.setText(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_gastricresidual_overml'), '2')

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_problemsnotedinostomy_no'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_problemsnotedinostomy_tf'), 'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_painostomysite_no'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_painostomysite_tf'), 'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_leakageostomysite_no'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_leakageostomysite_tf'), 'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_feedingscaredoneby_caregiver'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_feedingscaredoneby_sn'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_feedingscaredoneby_self'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/nutrition/n_enteralnutritionreqs/n_enreq_mdnotifiedproblemsabove_yes'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

