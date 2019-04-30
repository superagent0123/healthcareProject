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

WebUI.click(findTestObject('OASIS/OASIS_TABS/Nutri_tab'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS/Nutritional/nutri_health_screen/nutri_nhs_withoutreasons'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_health_screen/nutri_nhs_hasanillness'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_health_screen/nutri_nhs_hasanopen'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_health_screen/nutri_nhs_hasanopen_decubitus'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_health_screen/nutri_nhs_hasanopen_ulcer'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_health_screen/nutri_nhs_hasanopen_burn'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_health_screen/nutri_nhs_hasanopen_wound'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_health_screen/nutri_nhs_eatsfewer'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_health_screen/nutri_nhs_hastoothproblem'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_health_screen/nutri_nhs_has3ormoredrinksbeer'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_health_screen/nutri_nhs_doesnotalwaysmoney'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_health_screen/nutri_nhs_eatalone'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_health_screen/nutri_nhs_takes3ormoreotc'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_health_screen/nutri_nhs_isnotalwaysphysically'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_health_screen/nutri_nhs_frequentlyhasdiarrhea'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Nutritional/nutri_upperGIstatus/nutri_ugis_abdomen_soft'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_upperGIstatus/nutri_ugis_bowelsounds_active'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_upperGIstatus/nutri_ugis_appetite_good'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Nutritional/nutri_upperGIstatus/nutri_ugis_nausea/nutri_ugis_nausea_yes'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_upperGIstatus/nutri_ugis_nausea/nutri_ugis_nausea_vomiting_projectile'))

WebUI.setText(findTestObject('OASIS/Nutritional/nutri_upperGIstatus/nutri_ugis_nausea/nutri_ugis_nausea_frequency'), 'Sample text')

WebUI.click(findTestObject('OASIS/Nutritional/nutri_upperGIstatus/nutri_ugis_nausea/nutri_ugis_nausea_vomitusam_small'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_upperGIstatus/nutri_ugis_nausea/nutri_ugis_nausea_color_coffee'))

WebUI.setText(findTestObject('OASIS/Nutritional/nutri_upperGIstatus/nutri_ugis_nausea/nutri_ugis_nausea_color_other'), 'Sample text')

WebUI.click(findTestObject('OASIS/Nutritional/nutri_upperGIstatus/nutri_ugis_nausea/nutri_ugis_nausea_othersym_heartburn'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_upperGIstatus/nutri_ugis_nausea/utri_ugis_nausea_othersym_indigestion'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_upperGIstatus/nutri_ugis_nausea/utri_ugis_nausea_othersym_reflux'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_upperGIstatus/nutri_ugis_nausea/utri_ugis_nausea_othersym_flatulence'))

WebUI.setText(findTestObject('OASIS/Nutritional/nutri_upperGIstatus/nutri_ugis_nausea/utri_ugis_nausea_othersym_other'), 
    'Acidity')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Nutritional/nutri_nutrition/nutri_regulardiet'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_nutrition/nutri_1800cal'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_nutrition/nutri_2gmsodium'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_nutrition/nutri_renaldiet'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_nutrition/nutri_fluidrestriction24hrs'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_nutrition/nutri_tpnintralipids'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_nutrition/nutri_enteralfeeding'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_nutrition/nutri_othernutrition'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Nutritional/nutri_nutrition/nutri_other_nutrition/nutri_on_noaddedsalt'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_nutrition/nutri_other_nutrition/nutri_on_highprotein'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_nutrition/nutri_other_nutrition/nutri_on_lowprotein'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_nutrition/nutri_other_nutrition/nutri_on_lowfat'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_nutrition/nutri_other_nutrition/nutri_on_lowsodium'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_nutrition/nutri_other_nutrition/nutri_on_lowcholesterol'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_nutrition/nutri_other_nutrition/nutri_on_mechanicalsoft'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_nutrition/nutri_other_nutrition/nutri_on_highfiber'))

WebUI.click(findTestObject('OASIS/Nutritional/nutri_nutrition/nutri_other_nutrition/nutri_on_coumadindiet'))

WebUI.setText(findTestObject('OASIS/Nutritional/nutri_nutrition/nutri_other_nutrition/nutri_on_other'), 'Sample text')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_efvia_gastrostomytube'))

WebUI.setText(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_tubeinsertiondate'), 'January 2019')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_efrequirements/nutri_en_efreqs_formula'), 
    'Peptide Formulas')

WebUI.setText(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_efrequirements/nutri_en_efreqs_f_amountperday'), 
    '2ml')

WebUI.setText(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_efrequirements/nutri_en_efreqs_liquidsupp'), 
    'Supplemental Formulas')

WebUI.setText(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_efrequirements/nutri_en_efreqs_ls_amountperday'), 
    '3 litres')

WebUI.click(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_efrequirements/nutri_en_efreqs_deliverymode_feedingpump'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_efrequirements/nutri_en_efreqs_deliverysystem_opensystem'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_efrequirements/nutri_en_efreqs_feedingpump_ml'), 
    '3')

WebUI.setText(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_efrequirements/nutri_en_efreqs_feedingpump_hours'), 
    '48')

WebUI.click(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_efrequirements/nutri_en_efreqs_patientnpo_yes'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_efrequirements/nutri_en_efreqs_patientnpo_tf'), 
    'Sample text')

WebUI.click(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_efrequirements/nutri_en_efreqs_patienttoleratingfeeding_yes'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_efrequirements/nutri_en_efreqs_patienttoleratingfeeding_tf'), 
    'Sample text')

WebUI.setText(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_efrequirements/nutri_en_efreqs_gastric_amountml'), 
    '2')

WebUI.setText(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_efrequirements/nutri_en_efreqs_gastric_hours'), 
    '4')

WebUI.setText(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_efrequirements/nutri_en_efreqs_gastric_overml'), 
    '1')

WebUI.click(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_efrequirements/nutri_en_efreqs_problemsostomysite_yes'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_efrequirements/nutri_en_efreqs_problemsostomysite_tf'), 
    'Sample text')

WebUI.click(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_efrequirements/nutri_en_efreqs_paininostomysite_yes'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_efrequirements/nutri_en_efreqs_paininostomysite_tf'), 
    'Sample text')

WebUI.click(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_efrequirements/nutri_en_efreqs_leakage_yes'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_efrequirements/nutri_en_efreqs_leakage_tf'), 
    'Sample text')

WebUI.click(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_efrequirements/nutri_en_efreqs_feedingostomycare_caregiver'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OASIS/Nutritional/nutri_enteralnutrition/nutri_en_efrequirements/nutri_en_efreqs_mdnotified_yes'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('OASIS/OASIS_TABS/discardchangesbtn'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/OASIS_TABS/discardchangesmodalbtn'))

WebUI.delay(5)

