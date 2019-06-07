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

WebUI.delay(5)

WebUI.click(findTestObject('OASIS/OASIS_TABS/Integumentary_tab'))

WebUI.delay(4)

WebUI.click(findTestObject('OASIS/Integumentary/skincolor_pink'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/skintemperature_warm'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/skinmoisture_dry'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/skinturgor_normal'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/skinintegrity_lesion'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/skinintegrity_cellulitis'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/skinintegrity_IAD'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/skinintegrity_rashes'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/skinintegrity_dermatitis'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/skinintegrity_petechiae'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/skinintegrity_blisters'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/skinintegrity_excoriation'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/skinintegrity_xerosis'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/skinintegrity_ecchymosis'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS/Integumentary/skinintegrity_lesion_location'), 'socskintegrity')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/skinintegrity_wound'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/skinintegrity_pressureulcer'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/skinintegrity_diabeticulcer'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/skinintegrity_surgicalwound'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/skinintegrity_venoustasisulcer'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/skinintegrity_arterialulcer'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/skinintegrity_burn'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/skinintegrity_abrasion'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/skinintegrity_laceration'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/skinintegrity_trauma'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/skinintegrity_skintear'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS/Integumentary/skinintegrity_wound_other'), 'socwound')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS/Integumentary/skinintegrity_wound_location'), 'soclocation')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS/Integumentary/bradenscale_sensory_score'), '1')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS/Integumentary/bradenscale_moisture_score'), '1')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS/Integumentary/bradenscale_activity_score'), '1')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS/Integumentary/bradenscale_mobility_score'), '1')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS/Integumentary/bradenscale_nutrition_score'), '1')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS/Integumentary/bradenscale_friction_score'), '1')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/M1306_selected1'))

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS/Integumentary/M1311_A1'), '1')

WebUI.delay(4)

WebUI.setText(findTestObject('OASIS/Integumentary/M1311_B1'), '1')

WebUI.delay(4)

WebUI.setText(findTestObject('OASIS/Integumentary/M1311_C1'), '1')

WebUI.delay(4)

WebUI.setText(findTestObject('OASIS/Integumentary/M1311_D1'), '1')

WebUI.delay(4)

WebUI.setText(findTestObject('OASIS/Integumentary/M1311_E1'), '1')

WebUI.delay(4)

WebUI.setText(findTestObject('OASIS/Integumentary/M1311_F1'), '1')

WebUI.delay(5)

WebUI.click(findTestObject('OASIS/Integumentary/M1322_selected1'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS/Integumentary/M1324_selected1'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS/Integumentary/M1330_selected1'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS/Integumentary/M1332_selected1'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS/Integumentary/M1334_selected1'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS/Integumentary/M1340_selected1'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS/Integumentary/M1342_selected1'))

WebUI.delay(5)

for (def rowNum = 1; rowNum <= findTestData('woundsets_testdata').getRowNumbers(); rowNum++) {
    def x = findTestData('woundsets_testdata').getValue(1, rowNum)

    def y = findTestData('woundsets_testdata').getValue(2, rowNum)

    Integer valx = ((x) as int)

    Integer valy = ((y) as int)

    WebUI.executeJavaScript(((('alert(\'x: ' + valx) + ' y: ') + valy) + '\')', null)

    WebUI.delay(3)

    WebUI.acceptAlert()
	
	/*
    WebUI.delay(5)

    WebUI.clickOffset(findTestObject('OASIS/Integumentary/human_image'), valx, valy)

    WebUI.delay(5)

    WebUI.click(findTestObject('OASIS/Integumentary/pin_image_yes'))

    WebUI.delay(5)
    */
}

