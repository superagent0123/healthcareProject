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
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('OASIS/OASIS_TABS/xitemedits_btn'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/OASIS_TABS/Endocrine_tab'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Endocrine/endo_endosystemstatus/endo_ess_heatorcold'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_endosystemstatus/endo_ess_sweating'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_endosystemstatus/endo_ess_thyroid'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_endosystemstatus/endo_ess_ongoing'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_endosystemstatus/endo_ess_polydipsia'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_endosystemstatus/endo_ess_excessivethrist'))

WebUI.setText(findTestObject('OASIS/Endocrine/endo_endosystemstatus/endo_ess_other'), 'Sample text')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Endocrine/endo_endosystemstatus/endo_ess_diabetes/endo_diabetes'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Endocrine/endo_endosystemstatus/endo_ess_diabetes/endo_diabetes_type2'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_endosystemstatus/endo_ess_diabetes/endo_diabetes_onset_new'))

WebUI.setText(findTestObject('OASIS/Endocrine/endo_endosystemstatus/endo_ess_diabetes/endo_diabetes_onset_date'), 'July 2019')

WebUI.click(findTestObject('OASIS/Endocrine/endo_endosystemstatus/endo_ess_diabetes/endo_diabetes_onset_unknown'))

WebUI.delay(1)

WebUI.setText(findTestObject('OASIS/Endocrine/endo_endosystemstatus/endo_ess_diabetes/endo_diabetes_hgba1c_result'), 'Sample text')

WebUI.setText(findTestObject('OASIS/Endocrine/endo_endosystemstatus/endo_ess_diabetes/endo_diabetes_hgba1c_testdate'), 'May 2019')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Endocrine/endo_endosystemstatus/endo_ess_diabetes/endo_diabetes_mgmt_diabeticdiet'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_endosystemstatus/endo_ess_diabetes/endo_diabetes_mgmt_oralmed'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_endosystemstatus/endo_ess_diabetes/endo_diabetes_mgmt_injectablemed'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_endosystemstatus/endo_ess_diabetes/endo_diabetes_mgmt_slidingscale'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Endocrine/endo_endosystemstatus/endo_ess_diabetes/endo_diabetes_cgmbrand'))

WebUI.setText(findTestObject('OASIS/Endocrine/endo_endosystemstatus/endo_ess_diabetes/endo_diabetes_cgmbrand_tf'), 'Sample text')

WebUI.setText(findTestObject('OASIS/Endocrine/endo_endosystemstatus/endo_ess_diabetes/endo_diabetes_bloodglucosetesting_other'), 
    'Sample text')

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Endocrine/endo_endosystemstatus/endo_ess_diabetes/endo_diabetes_doesthepatientexhibit_none'))

not_run: WebUI.click(findTestObject('OASIS/Endocrine/endo_endosystemstatus/endo_ess_diabetes/endo_diabetes_doesthepatientexhibit_hypo_no'))

not_run: WebUI.click(findTestObject('OASIS/Endocrine/endo_endosystemstatus/endo_ess_diabetes/endo_diabetes_doestthepatientexhibit_hyper_yes'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footexamfreq_daily'))

WebUI.setText(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footexamfreq_other'), 'Sample text')

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footexamfreq_donebypatient'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footasses/endo_dfex_footasses_footdeform_l'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footasses/endo_dfex_footasses_footdeform_r'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footasses/endo_dfex_footasses_thickingrown_l'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footasses/endo_dfex_footasses_thickingrown_r'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footasses/endo_dfex_footasses_calluses_l'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footasses/endo_dfex_footasses_calluses_r'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footasses/endo_dfex_footasses_interdigital_l'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footasses/endo_dfex_footasses_interdigital_r'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footasses/endo_dfex_footasses_signsoffungal_l'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footasses/endo_dfex_footasses_signsoffungal_r'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footasses/endo_dfex_footasses_limitedrom_l'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footasses/endo_dfex_footasses_limitedrom_r'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footasses/endo_dfex_footasses_absentpedalpulses_l'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footasses/endo_dfex_footasses_absentpedalpulses_r'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footasses/endo_dfex_footasses_decreasedcirculation_l'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footasses/endo_dfex_footasses_decreasedcirculation_r'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footasses/endo_dfex_footasses_hotredswollenfoot_l'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footasses/endo_dfex_footasses_hotredswollenfoot_r'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footasses/endo_dfex_footasses_burningtingling_l'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footasses/endo_dfex_footasses_burningtingling_r'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footasses/endo_dfex_footasses_lossofsensation_l'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footasses/endo_dfex_footasses_lossofsensation_r'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footcarepcg/endo_dfex_footcarepcg_washfeet'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footcarepcg/endo_dfex_footcarepcg_keeptheskinsoft'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footcarepcg/endo_dfex_footcarepcg_inspectyourfeet'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footcarepcg/endo_dfex_footcarepcg_askyourdiabetes'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footcarepcg/endo_dfex_footcarepcg_toavoidblisters'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footcarepcg/endo_dfex_footcarepcg_alwayswearshoes'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footcarepcg/endo_dfex_footcarepcg_toavoidinjuring'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footcarepcg/endo_dfex_footcarepcg_examineyourshoes'))

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_footcarepcg/endo_dfex_footcarepcg_letyourdiabetescare'))

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_glucometer/endo_dfex_gm_brand'), 'Accu-Chek Aviva Connect')

WebUI.setText(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_glucometer/endo_dfex_gm_datelasttestingdone'), 
    'July 2019')

WebUI.setText(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_glucometer/endo_dfex_gm_resultlvl1'), 'success')

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_glucometer/endo_dfex_gm_resultlvl1_wr_yes'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_glucometer/endo_dfex_gm_resultlvl2'), 'success')

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_glucometer/endo_dfex_gm_resultlvl2_wr_yes'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_glucometer/endo_dfex_gm_resultlvl3'), 'success')

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_glucometer/endo_dfex_gm_resultlvl3_wr_yes'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_glucometer/endo_dfex_gm_reasonfortesting'), 
    Keys.chord('New vial of ', Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_patientcaregiverknowledge/endo_dfex_pcck_bloodglucose_patient'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_patientcaregiverknowledge/endo_dfex_pcck_bloodglucose_caregiver'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_patientcaregiverknowledge/endo_dfex_pcck_bloodglucose_sn'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_patientcaregiverknowledge/endo_dfex_pcck_insulinadmin_patient'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_patientcaregiverknowledge/endo_dfex_pcck_insulinadmin_caregiver'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_patientcaregiverknowledge/endo_dfex_pcck_insulinadmin_sn'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_patientcaregiverknowledge/endo_dfex_pcck_cglucometeruse_patient_yes'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_patientcaregiverknowledge/endo_dfex_pcck_cglucometeruse_caregiver_yes'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_patientcaregiverknowledge/endo_dfex_pcck_cinsulinprep_patient_yes'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_patientcaregiverknowledge/endo_dfex_pcck_cinsulinprep_caregiver_yes'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_patientcaregiverknowledge/endo_dfex_pcck_cafterinstruction_patient_yes'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_patientcaregiverknowledge/endo_dfex_pcck_cafterinstruction_caregiver_yes'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_patientcaregiverknowledge/endo_dfex_pcck_levelofknowledge_patient_good'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OASIS/Endocrine/endo_diabeticfootexam/endo_dfex_patientcaregiverknowledge/endo_dfex_pcck_levelofknowledge_caregiver_good'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

