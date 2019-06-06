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

def yourText = '\nLorem ipsum dolor sit amet,\nconsectetur adipiscing elit,\nsed do eiusmod tempor incididunt\nut labore et dolore magna aliqua.\n'

WebUI.click(findTestObject('Task_Notes/PT VISIT/NEXT'))

WebUI.setText(findTestObject('Task_Notes/PT VISIT/Muscle Strength_Outcome_Strength after therapy'), '3')

WebUI.click(findTestObject('Task_Notes/PT VISIT/Bed Mobility_Performance after therapy'))

WebUI.click(findTestObject('Task_Notes/PT VISIT/Bed Mobility_Performance after therapy_06'))

WebUI.click(findTestObject('Task_Notes/PT VISIT/Bed Mobility_Using'))

WebUI.setText(findTestObject('Task_Notes/PT VISIT/Pain_Outcome_Pain level after therapy 1'), '0')

WebUI.setText(findTestObject('Task_Notes/PT VISIT/Pain_Outcome_Pain level after therapy2'), '0')

WebUI.setText(findTestObject('Task_Notes/PT VISIT/Safety_Outcome_StairsStepsuneven surfaces'), yourText)

WebUI.setText(findTestObject('Task_Notes/PT VISIT/Safety_Outcome_Narrow or obstructed walkway'), yourText)

WebUI.setText(findTestObject('Task_Notes/PT VISIT/Safety_Outcome_Clutteredsoiled living area'), yourText)

WebUI.setText(findTestObject('Task_Notes/PT VISIT/Safety_Outcome_Unsecured floor covering'), yourText)

WebUI.setText(findTestObject('Task_Notes/PT VISIT/Safety_Outcome_Uneven floor surface'), yourText)

WebUI.setText(findTestObject('Task_Notes/PT VISIT/Safety_Outcome_No grab bars in bathroomshowertub'), yourText)

WebUI.setText(findTestObject('Task_Notes/PT VISIT/Safety_Outcome_Assistive device malfunction'), yourText)

WebUI.setText(findTestObject('Task_Notes/PT VISIT/Safety_Outcome_sample'), yourText)

WebUI.click(findTestObject('Task_Notes/PT VISIT/SAVE'))

