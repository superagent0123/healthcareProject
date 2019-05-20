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

Date todayy = new Date()

newdate = todayy.format('MMddyyy')

not_run: WebUI.click(findTestObject('Task_Notes/SNV/snv_tabs/snv_venousaccess'))

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/venousaccess_ivtherapy'))

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_purpose/va_p_antibiotictherapy'))

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_purpose/va_p_hydration'))

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_purpose/va_p_parenteralnutrition'))

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_purpose/va_p_paincontrol'))

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_purpose/va_p_chemotherapy'))

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_purpose/va_p_maintainvenousaccess'))

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_purpose/va_p_other'), 'Sample text')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_peripheral_venousaccess/pva_cathtype_short'))

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_peripheral_venousaccess/pva_cathsize_24'))

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_peripheral_venousaccess/pva_cathsize_other'), '32')

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_peripheral_venousaccess/pva_insertionsiteloc_arm_left'))

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_peripheral_venousaccess/pva_insertionsiteloc_hand_left'))

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_peripheral_venousaccess/pva_insertionsiteloc_hand_other'), 
    'Sample text')

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_peripheral_venousaccess/pva_dateinserted'), newdate)

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_peripheral_venousaccess/pva_ivsitechangefreq'), '3')

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_peripheral_venousaccess/pva_dressingchangefreq'), '3')

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_peripheral_venousaccess/pva_conditionofinsertionsite_wnl'))

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_peripheral_venousaccess/pva_conditionofinsertionsite_tf'), 
    'Sample text')

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_peripheral_venousaccess/pva_flushsolution'), 'Sample text')

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_peripheral_venousaccess/pva_flushfreq'), 'Sample text')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_central_venousaccess/cva_cvadcath_piccline'))

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_central_venousaccess/cva_numberoflumens_single'))

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_central_venousaccess/cva_insertionsiteloc_peripheral_left'))

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_central_venousaccess/cva_insertionsiteloc_subclavian_left'))

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_central_venousaccess/cva_insertionsiteloc_jugular_left'))

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_central_venousaccess/cva_insertionsiteloc_other'), 'Sample text')

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_central_venousaccess/cva_dateinserted'), newdate)

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_central_venousaccess/cva_dressingchangefreq'), '2')

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_central_venousaccess/cva_conditionofinsertionsite_wnl'))

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_central_venousaccess/cva_conditionofinsertionsite_tf'), 'Sample text')

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_central_venousaccess/cva_flushsolution'), 'Sample text')

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_central_venousaccess/cva_flushfrequency'), 'Sample text')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_implantedport_cvad/ipcvad_portdevice_portacath'))

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_implantedport_cvad/ipcvad_portdevice_other'), 'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_implantedport_cvad/ipcvad_portreservoir_singlechamber'))

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_implantedport_cvad/ipcvad_huberbneedlelength_050'))

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_implantedport_cvad/ipcvad_huberneedlegauge_19gauge'))

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_implantedport_cvad/ipcvad_implantlocation'), 'Sample text')

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_implantedport_cvad/ipcvad_dateimplanted'), newdate)

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_implantedport_cvad/ipcvad_dressingchangefrequency'), 'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_implantedport_cvad/ipcvad_conditionofimplantsite_wnl'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_implantedport_cvad/ipcvad_conditionofimplantsite_tf'), 'Sample text')

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_implantedport_cvad/ipcvad_flushsolution'), 'Sample text')

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_implantedport_cvad/ipcvad_flushfrequency'), '2')

WebUI.delay(3)

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_ivtherapy/ivt_ivsolution'), 'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_ivtherapy/ivt_toleratedivtherapy'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_ivtherapy/ivt_adminvia_dripmethod'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_ivtherapy/ivt_adminvia_other'), 'Sample text')

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_ivtherapy/ivt_flushsolutionivt_preinfusionflush'), 'Sample text')

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_ivtherapy/ivt_flushsolutionivt_postinfusionflush'), 'Sample text')

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_ivtherapy/ivt_flushsolutionivt_otherflushprocedure'), 'Sample text')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_reasonsforhomehealth/rhh_skillednursingforassessment'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_reasonsforhomehealth/rhh_woundcareman'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_reasonsforhomehealth/rhh_intravenoustherapy'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_reasonsforhomehealth/rhh_diabeticcare'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_reasonsforhomehealth/rhh_nutritionalguidance'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_reasonsforhomehealth/rhh_chhacna'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_reasonsforhomehealth/rhh_injectablemedication'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_reasonsforhomehealth/rhh_physicaltherapy'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_reasonsforhomehealth/rhh_occupationaltherapy'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_reasonsforhomehealth/rhh_speechtherapy'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_reasonsforhomehealth/rhh_medicalsocialservices'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_reasonsforhomehealth/rhh_other'), 'Sample description for patient\'s reasons for home health.')

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_homeboundstatus/hs_needsassistance'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_homeboundstatus/hs_unabletosafelyleave'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_homeboundstatus/hs_dependentuponadaptive'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_homeboundstatus/hs_shortnessofbreath'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_homeboundstatus/hs_requiresassistnace'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_homeboundstatus/hs_residualweakness'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_homeboundstatus/hs_medicalrestriction'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_homeboundstatus/hs_impaireddecisionmaking'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_homeboundstatus/hs_reqiureconsiderabletaxing'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_homeboundstatus/hs_other'), 'Sample text')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_caregiveingstatus/cs_alwaysavailable'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_caregiveingstatus/cs_nameofcaregiver'), 'Khenard Figuracion')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_knowledgedeficitassessed/kda_diseaseprocess'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_knowledgedeficitassessed/kda_preventionofcomplications'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_knowledgedeficitassessed/kda_reportablesigns'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_knowledgedeficitassessed/kda_emergencymeasures'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_knowledgedeficitassessed/kda_medicationeffects'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_knowledgedeficitassessed/kda_compliancewithprocedures'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_knowledgedeficitassessed/kda_dietandnutrition'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_knowledgedeficitassessed/kda_homesafety'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_knowledgedeficitassessed/kda_oxygensafety'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_knowledgedeficitassessed/kda_infectioncontrol'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_knowledgedeficitassessed/kda_painmanagement'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_knowledgedeficitassessed/kda_other'), 'Sample text')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_dme/dme_walker_has'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_dme/dme_cane_needs'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_dme/dme_wheelchair_has'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_dme/dme_bedside_needs'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_dme/dme_showerbench_has'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_dme/dme_feedingpump_needs'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_dme/dme_suctionmachine_has'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_dme/dme_o2concentrator_needs'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_dme/dme_nebulizermachine_has'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_dme/dme_hospitalbed_needs'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_dme/dme_lowairlossmattress_has'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Task_Notes/SNV/venousaccess/va_dme/dme_other'), 'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_dme/dme_workingproperly_yes'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task_Notes/SNV/venousaccess/va_dme/dme_malfunctionreporteddmevendor'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

