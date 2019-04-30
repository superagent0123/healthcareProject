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

WebUI.click(findTestObject('OASIS/OASIS_TABS/Medications_tab'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Medications/M2001_1'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Medications/M2003_1'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Medications/M2010_1'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Medications/M2020_1'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Medications/M2030_1'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Medications/med_venous_access'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Medications/med_va_purpose/med_va_purpose_antibiotic'))

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/Medications/med_va_purpose/med_va_purpose_hydration'))

WebUI.click(findTestObject('OASIS/Medications/med_va_purpose/med_va_purpose_parenteral'))

WebUI.click(findTestObject('OASIS/Medications/med_va_purpose/med_va_purpose_pain_control'))

WebUI.click(findTestObject('OASIS/Medications/med_va_purpose/med_va_purpose_chemotherapy'))

WebUI.click(findTestObject('OASIS/Medications/med_va_purpose/med_va_purpose_maintain_va'))

WebUI.setText(findTestObject('OASIS/Medications/med_va_purpose/med_va_purpose_other'), 'Medication Monitoring Therapy')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Medications/med_va_peripheral/med_va_peripheral_cathetype_short'))

WebUI.click(findTestObject('OASIS/Medications/med_va_peripheral/med_va_peripheral_cathesize_24'))

WebUI.setText(findTestObject('OASIS/Medications/med_va_peripheral/med_va_peripheral_cathesize_other'), '28')

WebUI.click(findTestObject('OASIS/Medications/med_va_peripheral/med_va_peripheral_insertionsite_arm_l'))

WebUI.click(findTestObject('OASIS/Medications/med_va_peripheral/med_va_peripheral_insertionsite_hand_r'))

WebUI.setText(findTestObject('OASIS/Medications/med_va_peripheral/med_va_peripheral_insertionsite_hand_other'), 'Left and Right Legs')

WebUI.setText(findTestObject('OASIS/Medications/med_va_peripheral/med_va_peripheral_dateinserted'), '04252019')

WebUI.setText(findTestObject('OASIS/Medications/med_va_peripheral/med_va_peripheral_ivsitechangefreq'), '3')

WebUI.setText(findTestObject('OASIS/Medications/med_va_peripheral/med_va_peripheral_dressingchangefreq'), '3')

WebUI.click(findTestObject('OASIS/Medications/med_va_peripheral/med_va_peripheral_conditioninsertion_wnl'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OASIS/Medications/med_va_peripheral/med_va_peripheral_conditioninsertion_tf'), 'All Normal')

WebUI.setText(findTestObject('OASIS/Medications/med_va_peripheral/med_va_peripheral_flushsolution'), 'Normal')

WebUI.setText(findTestObject('OASIS/Medications/med_va_peripheral/med_va_peripheral_flushfrequency'), 'Normal')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Medications/med_va_cvad/med_va_cvad_cathe_piccline'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OASIS/Medications/med_va_cvad/med_va_cvad_numlumens_single'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OASIS/Medications/med_va_cvad/med_va_cvad_insertionsiteloc_peripheral_l'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OASIS/Medications/med_va_cvad/med_va_cvad_insertionsiteloc_subclavian_l'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OASIS/Medications/med_va_cvad/med_va_cvad_insertionsiteloc_jugular_l'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OASIS/Medications/med_va_cvad/med_va_cvad_insertionsiteloc_jugular_other'), 'Left and Right Legs')

WebUI.setText(findTestObject('OASIS/Medications/med_va_cvad/med_va_cvad_dateinserted'), '04252019')

WebUI.setText(findTestObject('OASIS/Medications/med_va_cvad/med_va_cvad_dressingchangefreq'), '3')

WebUI.click(findTestObject('OASIS/Medications/med_va_cvad/med_va_cvad_conditioninsertion_wnl'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OASIS/Medications/med_va_cvad/med_va_cvad_conditioninsertion_tf'), 'Normal')

WebUI.setText(findTestObject('OASIS/Medications/med_va_cvad/med_va_cvad_flushfreq'), 'Normal')

WebUI.setText(findTestObject('OASIS/Medications/med_va_cvad/med_va_cvad_flushsolution'), 'Normal')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Medications/med_va_implantedcvad/med_va_implantedCVAD_portdevice_bardport'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OASIS/Medications/med_va_implantedcvad/med_va_implantedCVAD_portdevice_other'), 'Sample text')

WebUI.click(findTestObject('OASIS/Medications/med_va_implantedcvad/med_va_implantedCVAD_portreservoir_singlechamber'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OASIS/Medications/med_va_implantedcvad/med_va_implantedCVAD_hubernlength_050'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OASIS/Medications/med_va_implantedcvad/med_va_implantedCVAD_huberngauge_19'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OASIS/Medications/med_va_implantedcvad/med_va_implantedCVAD_implantlocation'), 'Arms and Legs')

WebUI.setText(findTestObject('OASIS/Medications/med_va_implantedcvad/med_va_implantedCVAD_dateimplanted'), '04252019')

WebUI.setText(findTestObject('OASIS/Medications/med_va_implantedcvad/med_va_implantedCVAD_dressingchangefreq'), 'Normal')

WebUI.click(findTestObject('OASIS/Medications/med_va_implantedcvad/med_va_implantedCVAD_conditionimplant_wnl'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OASIS/Medications/med_va_implantedcvad/med_va_implantedCVAD_conditionimplant_tf'), 'Normal')

WebUI.setText(findTestObject('OASIS/Medications/med_va_implantedcvad/med_va_implantedCVAD_flushsolution'), 'Normal')

WebUI.setText(findTestObject('OASIS/Medications/med_va_implantedcvad/med_va_implantedCVAD_flushfrequency'), '3')

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS/Medications/med_va_intravenous/med_va_intravenous_ivmedication'), 'Sample text')

WebUI.setText(findTestObject('OASIS/Medications/med_va_intravenous/med_va_intravenous_ivsolution'), 'Sample text')

WebUI.click(findTestObject('OASIS/Medications/med_va_intravenous/med_va_intravenous_toleratedivtherapy'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Medications/med_va_administrationvia/med_va_adminvia_ivpump'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OASIS/Medications/med_va_administrationvia/med_va_adminvia_ivpump_tf'), 'Sample text')

WebUI.setText(findTestObject('OASIS/Medications/med_va_administrationvia/med_va_adminvia_other'), 'Sample text')

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS/Medications/med_flushsolution_IV/med_va_flushsolution_pre'), 'Sample text')

WebUI.setText(findTestObject('OASIS/Medications/med_flushsolution_IV/med_va_flushsolution_post'), 'Sample text')

WebUI.setText(findTestObject('OASIS/Medications/med_flushsolution_IV/med_va_flushsolution_otherprocedure'), 'Sample text')

WebUI.delay(5)

WebUI.click(findTestObject('OASIS/OASIS_TABS/discardchangesbtn'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/OASIS_TABS/discardchangesmodalbtn'))

WebUI.delay(5)

