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

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Task_Notes/SNV/snv_tabs/snv_endocrine'))

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_heatorcold'))

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_sweating'))

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_thyroid'))

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_ongoing'))

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_polydipsia'))

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_excessivethrist'))

WebUI.setText(findTestObject('Task_Notes/SNV/endocrine/endo_other'), 'Other Interventions and Abnormalities')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/diabetes'))

WebUI.delay(2)

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/diabman_diabeticdiet'))

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/diabman_oralmedication'))

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/diabman_injectable'))

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/diabman_slidingscale'))

WebUI.delay(2)

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/bloodglucosetesting_ambeforebfast'))

WebUI.setText(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/bloodglucosetesting_other'), 'Sample Text')

WebUI.delay(2)

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/hypoglycemia_no'))

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/hyperglycemia_no'))

WebUI.delay(2)

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/footasse_footdeformity'))

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/footasse_thick'))

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/footasse_calluses'))

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/footasse_interdigital'))

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/footasse_signsoffungal'))

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/footasse_limitedrangeofmotion'))

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/footasse_absentpedal'))

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/footasse_decreasedcirculation'))

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/footasse_hotredswollen'))

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/footasse_burningtingling'))

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/footasse_lossofsensation'))

WebUI.delay(2)

WebUI.setText(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/glucometer_l1_tf'), 'Passed')

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/glucometer_l1_yes'))

WebUI.setText(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/glucometer_l2_tf'), 'Passed')

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/glucometer_l2_yes'))

WebUI.setText(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/glucometer_l3_tf'), 'Passed')

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/glucometer_l3_yes'))

WebUI.delay(2)

WebUI.click(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/reasonfortesting'))

WebUI.sendKeys(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/reasonfortesting_tf'), Keys.chord('New vial of glucometer strips', 
        Keys.ENTER))

WebUI.setText(findTestObject('Task_Notes/SNV/endocrine/endo_diabetes/datelasttestingdone_tf'), 'January 2019')

