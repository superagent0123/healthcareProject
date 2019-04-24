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

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/OASIS_TABS/Elimination_tab'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Elimination/genitourinary_status/elim_abnormal_status_incontinence'))

WebUI.click(findTestObject('OASIS/Elimination/genitourinary_status/elim_abnormal_status_stress_incontinence'))

WebUI.click(findTestObject('OASIS/Elimination/genitourinary_status/elim_abnormal_status_urgency'))

WebUI.click(findTestObject('OASIS/Elimination/genitourinary_status/elim_abnormal_status_frequency'))

WebUI.click(findTestObject('OASIS/Elimination/genitourinary_status/elim_abnormal_status_dysuria'))

WebUI.click(findTestObject('OASIS/Elimination/genitourinary_status/elim_abnormal_status_retention'))

WebUI.click(findTestObject('OASIS/Elimination/genitourinary_status/elim_abnormal_status_polyuria'))

WebUI.click(findTestObject('OASIS/Elimination/genitourinary_status/elim_abnormal_status_nocturia'))

WebUI.click(findTestObject('OASIS/Elimination/genitourinary_status/elim_abnormal_status_oliguria'))

WebUI.click(findTestObject('OASIS/Elimination/genitourinary_status/elim_abnormal_status_hematuria'))

WebUI.setText(findTestObject('OASIS/Elimination/genitourinary_status/elim_abnormal_status_other'), 'Xenoderma Pigmentosium')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Elimination/genitourinary_status/elim_urine_color_yellow'))

WebUI.delay(1)

WebUI.setText(findTestObject('OASIS/Elimination/genitourinary_status/elim_urine_color_other'), 'Reddish Yellow')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Elimination/genitourinary_status/elim_urine_clarity_clear'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Elimination/genitourinary_status/elim_urine_odor_yes'))

WebUI.delay(1)

WebUI.setText(findTestObject('OASIS/Elimination/genitourinary_status/elim_urine_odor_yes_textfield'), 'Foul')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Elimination/genitourinary_status/elim_spx_hemo'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Elimination/genitourinary_status/elim_spx_hemodialysis/elim_hemodialysis_avshunt_ra'))

WebUI.delay(1)

WebUI.setText(findTestObject('OASIS/Elimination/genitourinary_status/elim_spx_hemodialysis/elim_hemodialysis_other'), 'RA/LA')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Elimination/genitourinary_status/elim_spx_hemodialysis/elim_hemodialysis_thrill_yes'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Elimination/genitourinary_status/elim_spx_hemodialysis/elim_hemodialysis_bruit_yes'))

WebUI.delay(1)

WebUI.setText(findTestObject('OASIS/Elimination/genitourinary_status/elim_spx_hemodialysis/elim_hemodialysis_avshunt_care'), 
    'Sample Text')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Elimination/genitourinary_status/elim_spx_hemodialysis/elim_hemodialysis_dsched_mon'))

WebUI.click(findTestObject('OASIS/Elimination/genitourinary_status/elim_spx_hemodialysis/elim_hemodialysis_dsched_tue'))

WebUI.click(findTestObject('OASIS/Elimination/genitourinary_status/elim_spx_hemodialysis/elim_hemodialysis_dsched_wed'))

WebUI.click(findTestObject('OASIS/Elimination/genitourinary_status/elim_spx_hemodialysis/elim_hemodialysis_dsched_thu'))

WebUI.click(findTestObject('OASIS/Elimination/genitourinary_status/elim_spx_hemodialysis/elim_hemodialysis_dsched_fri'))

WebUI.click(findTestObject('OASIS/Elimination/genitourinary_status/elim_spx_hemodialysis/elim_hemodialysis_dsched_sat'))

WebUI.click(findTestObject('OASIS/Elimination/genitourinary_status/elim_spx_hemodialysis/elim_hemodialysis_dsched_sun'))

WebUI.delay(1)

WebUI.setText(findTestObject('OASIS/Elimination/genitourinary_status/elim_spx_hemodialysis/elim_hemodialysis_dcenter'), 
    'InterMed Dialysis Center')

WebUI.delay(1)

WebUI.setText(findTestObject('OASIS/Elimination/genitourinary_status/elim_spx_hemodialysis/elim_hemodialysis_phone'), '0452327655')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Elimination/elim_M1600_0'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Elimination/elim_M1610_0'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Elimination/lower_GI_status/elim_bowel_constipation'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Elimination/lower_GI_status/elim_bowel_constipation_chronic'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Elimination/lower_GI_status/elim_stool_charac_soft'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Elimination/lower_GI_status/elim_stool_color_grey'))

WebUI.delay(1)

WebUI.setText(findTestObject('OASIS/Elimination/lower_GI_status/elim_stool_color_other'), 'Blackish Red')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Elimination/lower_GI_status/elim_stool_softener_effective'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Elimination/lower_GI_status/elim_laxative_daily'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Elimination/elim_M1620_1'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Elimination/elim_M1630_1'))

WebUI.delay(5)

