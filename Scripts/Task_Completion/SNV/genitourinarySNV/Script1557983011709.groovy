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

not_run: WebUI.click(findTestObject('Task_Notes/SNV/snv_tabs/snv_genitourinary'))

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/gu_abnormal_status/gu_ab_incontinence'))

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/gu_abnormal_status/gu_ab_stressincontinence'))

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/gu_abnormal_status/gu_ab_urgency'))

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/gu_abnormal_status/gu_ab_frequency'))

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/gu_abnormal_status/gu_ab_dysuria'))

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/gu_abnormal_status/gu_ab_retention'))

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/gu_abnormal_status/gu_ab_polyuria'))

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/gu_abnormal_status/gu_ab_nocturia'))

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/gu_abnormal_status/gu_ab_oluguria'))

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/gu_abnormal_status/gu_ab_hematuria'))

WebUI.setText(findTestObject('Task_Notes/SNV/gentinourinary/gu_abnormal_status/gu_ab_other'), 'Sample text')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/gu_stat_urinecolor_yellow'))

WebUI.setText(findTestObject('Task_Notes/SNV/gentinourinary/gu_stat_urineodor_tf'), 'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/gu_stat_urineclarity_clear'))

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/gu_stat_urineodor_yes'))

WebUI.setText(findTestObject('Task_Notes/SNV/gentinourinary/gu_stat_urineodor_tf'), 'Sample text')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/gu_stat_spx/gu_stat_spx_indwellingurinarycatheter'))

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/gu_stat_spx/gu_stat_spx_peritonealdialysis'))

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/spx/spx_indwellingurinarycatheter/iuc_cathtype_urethral'))

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/spx/spx_indwellingurinarycatheter/iuc_foleycathsize_14'))

WebUI.setText(findTestObject('Task_Notes/SNV/gentinourinary/spx/spx_indwellingurinarycatheter/iuc_foleycathsize_other'), 
    'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/spx/spx_indwellingurinarycatheter/iuc_cathlumen_2way'))

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/spx/spx_indwellingurinarycatheter/iuc_ballooninflation_10ml'))

WebUI.setText(findTestObject('Task_Notes/SNV/gentinourinary/spx/spx_indwellingurinarycatheter/iuc_ballooninflation_other'), 
    '60')

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/spx/spx_indwellingurinarycatheter/iuc_drainagemethod_bedsidebag'))

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/spx/spx_indwellingurinarycatheter/iuc_drainagemethod_legbag'))

WebUI.setText(findTestObject('Task_Notes/SNV/gentinourinary/spx/spx_indwellingurinarycatheter/iuc_changefreq'), '4')

WebUI.setText(findTestObject('Task_Notes/SNV/gentinourinary/spx/spx_indwellingurinarycatheter/iuc_datelastchanged'), '05202019')

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/spx/spx_indwellingurinarycatheter/iuc_irrigationsolution_none'))

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/spx/spx_indwellingurinarycatheter/iuc_irrigationamount_none'))

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/spx/spx_indwellingurinarycatheter/iuc_irrigationfrequency_asneeded'))

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/spx/spx_peritonealdialysis/pd_type_capd'))

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/spx/spx_peritonealdialysis/pd_dialysate_05'))

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/spx/spx_peritonealdialysis/pd_dialysate_15'))

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/spx/spx_peritonealdialysis/pd_dialysate_25'))

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/spx/spx_peritonealdialysis/pd_dialysate_425'))

WebUI.setText(findTestObject('Task_Notes/SNV/gentinourinary/spx/spx_peritonealdialysis/pd_pdschedule'), 'Sample text')

WebUI.setText(findTestObject('Task_Notes/SNV/gentinourinary/spx/spx_peritonealdialysis/pd_dwelltime'), 'Sample text')

WebUI.setText(findTestObject('Task_Notes/SNV/gentinourinary/spx/spx_peritonealdialysis/pd_sitecondition'), 'Sample text')

WebUI.setText(findTestObject('Task_Notes/SNV/gentinourinary/spx/spx_peritonealdialysis/pd_apdmachine'), 'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/gentinourinary/spx/spx_peritonealdialysis/pd_performedby_patient'), FailureHandling.STOP_ON_FAILURE)

