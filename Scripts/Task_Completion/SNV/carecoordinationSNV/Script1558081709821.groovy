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

not_run: WebUI.click(findTestObject('Task_Notes/SNV/snv_tabs/snv_carecoordination'))

WebUI.click(findTestObject('Task_Notes/SNV/care_coordination/cc_md'))

WebUI.click(findTestObject('Task_Notes/SNV/care_coordination/cc_sn'))

WebUI.click(findTestObject('Task_Notes/SNV/care_coordination/cc_pt'))

WebUI.click(findTestObject('Task_Notes/SNV/care_coordination/cc_st'))

WebUI.click(findTestObject('Task_Notes/SNV/care_coordination/cc_msw'))

WebUI.click(findTestObject('Task_Notes/SNV/care_coordination/cc_pcg'))

WebUI.setText(findTestObject('Task_Notes/SNV/care_coordination/cc_other'), 'Sample text')

WebUI.setText(findTestObject('Task_Notes/SNV/care_coordination/cc_regarding'), 'Sample long description for patient care coordination with section')

WebUI.setText(findTestObject('Task_Notes/SNV/care_coordination/cc_additonalassessments'), 'Sample additional assessments, observations, clinical findings and progress towards goals')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/care_coordination/cc_interventions/cc_interventions_instructedpatientpcg'))

WebUI.setText(findTestObject('Task_Notes/SNV/care_coordination/cc_interventions/cc_interventions_instructedpatientpcg_tf'), 
    'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/care_coordination/cc_interventions/cc_interventions_instructedpcg'))

WebUI.setText(findTestObject('Task_Notes/SNV/care_coordination/cc_interventions/cc_interventions_instructedpcg_tf'), 'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/care_coordination/cc_interventions/cc_interventions_reviewedmedications'))

WebUI.click(findTestObject('Task_Notes/SNV/care_coordination/cc_interventions/cc_interventions_patientnoncompliant'))

WebUI.setText(findTestObject('Task_Notes/SNV/care_coordination/cc_interventions/cc_interventions_patientnoncompliant_tf'), 
    'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/care_coordination/cc_interventions/cc_interventions_patientnoncompliant_reportedmd'))

WebUI.click(findTestObject('Task_Notes/SNV/care_coordination/cc_interventions/cc_interventions_instructionalhandouts'))

WebUI.click(findTestObject('Task_Notes/SNV/care_coordination/cc_interventions/cc_interventions_instructionalhandouts_diseaseprocess'))

WebUI.click(findTestObject('Task_Notes/SNV/care_coordination/cc_interventions/cc_interventions_instructionalhandouts_diet'))

WebUI.click(findTestObject('Task_Notes/SNV/care_coordination/cc_interventions/cc_interventions_instructionalhandouts_medication'))

WebUI.click(findTestObject('Task_Notes/SNV/care_coordination/cc_interventions/cc_interventions_instructionalhandouts_homesafety'))

WebUI.setText(findTestObject('Task_Notes/SNV/care_coordination/cc_interventions/cc_interventions_textarea'), 'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/care_coordination/cc_interventions/cc_interventions_textarea_aboveinstruction'))

WebUI.click(findTestObject('Task_Notes/SNV/care_coordination/cc_interventions/cc_interventions_teachingoutcome_patientverbalizedunderstanding'))

WebUI.click(findTestObject('Task_Notes/SNV/care_coordination/cc_interventions/cc_interventions_teachingoutcome_patientonlyachievedpartialunderstanding'))

WebUI.click(findTestObject('Task_Notes/SNV/care_coordination/cc_planfornextvisit/continue_planofcare'))

WebUI.setText(findTestObject('Task_Notes/SNV/care_coordination/cc_planfornextvisit/continue_planofcare_tf'), 'Sample text')

WebUI.delay(3)

