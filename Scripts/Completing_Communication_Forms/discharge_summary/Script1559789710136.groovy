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

WebUI.click(findTestObject('Patient_Care/communication/comm_new_form'))

WebUI.delay(3)

WebUI.click(findTestObject('Patient_Care/communication/comm_new_dischargesummary'))

WebUI.delay(5)

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reportedby_sn'))

WebUI.setText(findTestObject('Communication_Forms/discharge_summary/dcsum_dischargedate'), GlobalVariable.today_date)

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_senttomdvia_mail'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_senttomdvia_fax'))

WebUI.setText(findTestObject('Communication_Forms/discharge_summary/dcsum_sentdate'), GlobalVariable.today_date)

WebUI.delay(3)

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_physicalmentalemostatus/dcsum_physicalmentalemostatus_aaox4'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_physicalmentalemostatus/dcsum_physicalmentalemostatus_aaox3'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_physicalmentalemostatus/dcsum_physicalmentalemostatus_aaox2'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_physicalmentalemostatus/dcsum_physicalmentalemostatus_vss'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_physicalmentalemostatus/dcsum_physicalmentalemostatus_comatose'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_physicalmentalemostatus/dcsum_physicalmentalemostatus_confused'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_physicalmentalemostatus/dcsum_physicalmentalemostatus_lethargic'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_physicalmentalemostatus/dcsum_physicalmentalemostatus_woundcompletelyhealed'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_physicalmentalemostatus/dcsum_physicalmentalemostatus_forgetful'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_physicalmentalemostatus/dcsum_physicalmentalemostatus_occasionalepisode'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_physicalmentalemostatus/dcsum_physicalmentalemostatus_anxious'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_physicalmentalemostatus/dcsum_physicalmentalemostatus_disoriented'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_physicalmentalemostatus/dcsum_physicalmentalemostatus_agitated'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_physicalmentalemostatus/dcsum_physicalmentalemostatus_depressed'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_physicalmentalemostatus/dcsum_physicalmentalemostatus_innorespiratorydistress'))

WebUI.setText(findTestObject('Communication_Forms/discharge_summary/dcsum_physicalmentalemostatus/dcsum_other'), GlobalVariable.sampl_text_short)

WebUI.delay(3)

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_functionalstatus/dcsum_functionalstatus_adls_independent'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_functionalstatus/dcsum_functionalstatus_mobility_independent'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_functionalstatus/dcsum_assistivedevices_wheelchair'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_functionalstatus/dcsum_assistivedevices_walker'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_functionalstatus/dcsum_assistivedevices_crutches'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_functionalstatus/dcsum_assistivedevices_cane'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_functionalstatus/dcsum_assistivedevices_other'))

WebUI.setText(findTestObject('Communication_Forms/discharge_summary/dcsum_functionalstatus/dcsum_assitivedevices_other_tf'), 
    GlobalVariable.sampl_text_short)

WebUI.delay(3)

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsforadmission/reasonsforad_skillednursingforassessment'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsforadmission/reasonsforad_woundcaremanagement'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsforadmission/reasonsforad_ivtherapy'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsforadmission/reasonsforad_diabeticcaretreatment'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsforadmission/reasonsforad_nutritionalguidance'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsforadmission/reasonsforad_chhacnaassistance'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsforadmission/reasonsforad_injectablemedications'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsforadmission/reasonsforad_physicaltherapy'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsforadmission/reasonsforad_occupationaltherapy'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsforadmission/reasonsforad_speechtherapy'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsforadmission/reasonsforad_medicalsocialservices'))

WebUI.setText(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsforadmission/reasonsforad_other'), GlobalVariable.sample_text_long)

WebUI.delay(3)

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_summaryofcareprovided/summaryofcareprov_homehealthservices'))

WebUI.setText(findTestObject('Communication_Forms/discharge_summary/dcsum_summaryofcareprovided/summaryofcareprov_other'), 
    GlobalVariable.sample_text_long)

WebUI.delay(3)

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_invloveddisciplines/involvedisciplines_skillednursing'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_invloveddisciplines/involvedisciplines_pt'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_invloveddisciplines/involvedisciplines_ot'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_invloveddisciplines/involvedisciplines_st'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_invloveddisciplines/involvedisciplines_msw'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_invloveddisciplines/involvedisciplines_chhacna'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_invloveddisciplines/involvedisciplines_dietician'))

WebUI.delay(3)

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsfordc/reasonsfordc_nofurtherneeded'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsfordc/reasonsfordc_physicianrequest'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsfordc/reasonsfordc_patientfamilyrequest'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsfordc/reasonsfordc_admittedtohospital'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsfordc/reasonsfordc_transferredtosnf'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsfordc/reasonsfordc_transferredtohospice'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsfordc/reasonsfordc_transferredtoanotherhha'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsfordc/reasonsfordc_transferredtooutpatientservices'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsfordc/reasonsfordc_familyfriendsassumedresponsiblity'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsfordc/reasonsfordc_patientnolongerhomebound'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsfordc/reasonsfordc_patientmovedoutofservicesarea'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsfordc/reasonsfordc_patientrefusedservice'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsfordc/reasonsfordc_death'))

WebUI.setText(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsfordc/reasonsfordc_other'), GlobalVariable.sample_text_long)

WebUI.delay(3)

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_reasonsfordc/dcsum_treatmentgoalsattained_yes'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_dischargedisposition/dcdispo_1_patientremainedwithoutformal'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_dischargedisposition/dcdispo_2_patientremainedwithformal'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_dischargedisposition/dcdispo_3_patienttransferredtononinshospice'))

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_dischargedisposition/dcdispo_4_unknown'))

not_run: WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_dischargedisposition/dcdispo_uk_otherunknown'))

not_run: WebUI.setText(findTestObject('Communication_Forms/discharge_summary/dcsum_dischargedisposition/dcdispo_uk_otherunknown_tf'), 
    GlobalVariable.sampl_text_short)

WebUI.delay(3)

WebUI.setText(findTestObject('Communication_Forms/discharge_summary/dcsum_dischargedisposition/dcsum_dcnotifdate_physician'), 
    GlobalVariable.sampl_text_short)

WebUI.setText(findTestObject('Communication_Forms/discharge_summary/dcsum_dischargedisposition/dcsum_dcnotifdate_patientfamily'), 
    GlobalVariable.sampl_text_short)

WebUI.delay(3)

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_discardchange_btn'))

WebUI.delay(3)

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_discardchange_discard'))

WebUI.delay(3)

WebUI.click(findTestObject('Communication_Forms/discharge_summary/dcsum_save_btn'))

