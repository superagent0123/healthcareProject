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

not_run: WebUI.click(findTestObject('Task_Notes/SNV/snv_tabs/snv_psychosocial'))

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_pfstatus/ps_cognitiveimpairment'))

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_pfstatus/ps_confused'))

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_pfstatus/ps_anxious'))

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_pfstatus/ps_depressed'))

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_pfstatus/ps_memorydeficit'))

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_pfstatus/ps_impaireddecisionmaking'))

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_pfstatus/ps_inappropriatebehavior'))

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_pfstatus/ps_disruptivebehavior'))

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_pfstatus/ps_delusionalparanoid'))

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_pfstatus/ps_physicalaggression'))

WebUI.setText(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_pfstatus/ps_other'), 'Bi-Polar Tendency')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_languagebarrier/langb_yes'))

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_languagebarrier/langb_interpreterneeded'))

WebUI.setText(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_languagebarrier/langb_interpreterneeded_tf'), 
    'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_languagebarrier/langb_interpreterserviceprovider'))

WebUI.setText(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_languagebarrier/langb_interpreterserviceprovider_tf'), 
    'Sample text')

WebUI.setText(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_languagebarrier/langb_interpreterserviceprovider_phone'), 
    '04423235')

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_languagebarrier/langb_signlanguage'))

WebUI.setText(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_languagebarrier/langb_signlanguage_tf'), 
    'ASL')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_learningbarrier/learnb_yes'))

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_learningbarrier/learnb_functional'))

WebUI.setText(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_learningbarrier/learnb_functional_specify'), 
    'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_learningbarrier/learnb_mental'))

WebUI.setText(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_learningbarrier/learnb_mental_specify'), 
    'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_learningbarrier/learnb_physical'))

WebUI.setText(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_learningbarrier/learnb_physical_specify'), 
    'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_learningbarrier/learnb_psychosocial'))

WebUI.setText(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_learningbarrier/learnb_psychosocial_specify'), 
    'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_learningbarrier/learnb_unabletoread'))

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_learningbarrier/learnb_unabletowrite'))

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_signsofabuse/sabuse_yes'))

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_signsofabuse/sabuse_potential'))

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_signsofabuse/sabuse_actual'))

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_signsofabuse/sabuse_physical'))

WebUI.setText(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_signsofabuse/sabuse_physical_describe'), 
    'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_signsofabuse/sabuse_verbal'))

WebUI.setText(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_signsofabuse/sabuse_verbal_describe'), 
    'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_signsofabuse/sabuse_referredtomsw'))

WebUI.setText(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_signsofabuse/sabuse_referredtomsw_tf'), 
    'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_signsofabuse/sabuse_referredtochildapservices'))

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_spiritualconsiderations/scconsi_yes'))

WebUI.delay(3)

WebUI.setText(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_spiritualconsiderations/scconsi_implacatonthatmayimpactcare'), 
    'Sample text')

WebUI.setText(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_spiritualconsiderations/scconsi_spiritualresource'), 
    'Sample text')

WebUI.setText(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_spiritualconsiderations/scconsi_contact'), 
    'Sample text')

WebUI.setText(findTestObject('Task_Notes/SNV/psychosocial_factors/pf_other_pstatus/ops_spiritualconsiderations/scconsi_phone'), 
    '089546346')

WebUI.delay(3)

