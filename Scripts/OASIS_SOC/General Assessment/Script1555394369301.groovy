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

WebUI.delay(1)

WebUI.click(findTestObject('OASIS/OASIS_TABS/GenAss_tab'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/General Assessment/gen_Ass_ReasonForHH1'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_Ass_ReasonForHH2'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_Ass_ReasonForHH3'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_Ass_ReasonForHH4'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_Ass_ReasonForHH5'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_Ass_ReasonForHH6'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_Ass_ReasonForHH7'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_Ass_ReasonForHH8'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_Ass_ReasonForHH9'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_Ass_ReasonForHH10'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_Ass_ReasonForHH11'))

WebUI.setText(findTestObject('OASIS/General Assessment/gen_ass_otherReason'), 'sample sample')

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homeboundstatus1'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homeboundstatus2'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homeboundstatus3'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homeboundstatus4'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homeboundstatus5'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homeboundstatus6'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homeboundstatus7'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homeboundstatus8'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homeboundstatus9'))

WebUI.setText(findTestObject('OASIS/General Assessment/gen_ass_homeboundstatusOthers'), 'HH sample')

not_run: WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homesafety1'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homesafety2'))

WebUI.setText(findTestObject('OASIS/General Assessment/gen_ass_homesafety2_input'), 'step outside input')

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homesafety3'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homesafety4'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homesafety5'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homesafety6'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homesafety7'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homesafety8'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homesafety9'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homesafety10'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homesafety11'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homesafety12'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homesafety13'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homesafety14'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homesafety15'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homesafety16'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homesafety17'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homesafety18'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_homesafety19'))

WebUI.setText(findTestObject('OASIS/General Assessment/gen_ass_homesafetyOthers'), 'Home Environment Safety others')

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_safetymeasures1'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_safetymeasures2'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_safetymeasures3'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_safetymeasures4'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_safetymeasures5'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_safetymeasures6'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_safetymeasures7'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_safetymeasures8'))

WebUI.setText(findTestObject('OASIS/General Assessment/gen_ass_safetymeasuresOthers'), 'safety measures others')

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_safetymeasures9'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_safetymeasures10'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_safetymeasures11'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_safetymeasures12'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_safetymeasures13'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_safetymeasures14'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_safetymeasures15'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_emergencyplanningY1'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_emergencyplanningY2'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_emergencyplanningY3'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_emergencyplanningY4'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_emergencyplanningY5'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_emergencyplanningY6'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_emergencyplanningY7'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_emergencyplanningY7_sel1'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_emergencyplanningY7_sel2'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_oxygenriskY1'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_oxygenriskY2'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_oxygenriskY3'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_oxygenriskY4'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_oxygenriskY5'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_oxygenriskY6'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_oxygenriskY7'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_oxygenriskY8'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_oxygenriskY9'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_oxygenriskY9_sel1'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_oxygenriskY9_sel2'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_oxygenriskY9_sel3'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_oxygenriskY9_sel4'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_advanceddirectivesY1'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_advanceddirectivesY2'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_advanceddirectivesY3'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_advanceddirectivesY4'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_advanceddirectivesY5'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_advanceddirectivesY6'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_advanceddirectivesY7'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_advanceddirectivesLevels1'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_prognosis1'))

WebUI.click(findTestObject('OASIS/General Assessment/gen_ass_caregivingStatus4'))

WebUI.setText(findTestObject('OASIS/General Assessment/gen_ass_caregiverName'), 'jacinto')

WebUI.setText(findTestObject('OASIS/General Assessment/gen_ass_caregiverphone'), '3548956472')

WebUI.setText(findTestObject('OASIS/General Assessment/gen_ass_caregiverLivingFacility'), 'lolo faclity')

WebUI.setText(findTestObject('OASIS/General Assessment/gen_ass_caregiverLivingFacilityPhone'), '6223332222')

WebUI.setText(findTestObject('OASIS/General Assessment/gen_ass_caregiverListName'), 'james, johnny, lousie')

WebUI.setText(findTestObject('OASIS/General Assessment/gen_ass_CaregiverCommunityResources'), 'sample1, sample 2')

WebUI.delay(5)

WebUI.click(findTestObject('OASIS/OASIS_TABS/discardchangesbtn'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/OASIS_TABS/discardchangesmodalbtn'))

WebUI.delay(5)

