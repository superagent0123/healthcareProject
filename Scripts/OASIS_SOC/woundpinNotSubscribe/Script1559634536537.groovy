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

// pinning of wound 1
WebUI.delay(5)

WebUI.clickOffset(findTestObject('OASIS/Integumentary/human_image'), 101, 125)

WebUI.delay(5)

// click the yes button
WebUI.click(findTestObject('OASIS/Integumentary/pin_image_yes'))

WebUI.delay(5)

// pinning of wound 2
WebUI.clickOffset(findTestObject('OASIS/Integumentary/human_image'), 150, 225)

WebUI.delay(5)

// click the yes button
WebUI.click(findTestObject('OASIS/Integumentary/pin_image_yes'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS/Integumentary/woundinfo_location'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/woundinfo_location_buttockR'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/woundinfo_type'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/woundinfo_type_pressureulcer'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS/Integumentary/woundinfo_sizelength_field'), '2')

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS/Integumentary/woundinfo_sizewidth_field'), '4')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/woundinfo_depth'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/woundinfo_depth_stage1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/woundinfo_granulationtissue'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/woundinfo_granulationtissue_1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/woundinfo_necrotictissue'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/woundinfo_necrosistissue_1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/woundinfo_granulation_necrosis_coverage'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/woundinfo_granulation_necrosis_coverage1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/woundinfo_exudateamount'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/woundinfo_exudateamount_1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/woundinfo_edges'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/woundinfo_edges_1'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

// selecting one of the options, specifically, edematous
WebUI.sendKeys(findTestObject('OASIS/Integumentary/woundinfo_periwoundtissue'), Keys.chord('Edematous', Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/woundinfo_otherobservation'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('OASIS/Integumentary/woundinfo_otherobservation_textarea'), 'SOCotherObservation')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/woundinfo_woundclosure'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/woundinfo_woundclosure_steri'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/woundinfo_drainpresent'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Integumentary/woundinfo_drainpresent_jackson'))

WebUI.delay(3)

// uploading of wound
WebUI.click(findTestObject('OASIS/Integumentary/woundinfo_uploadwound'))

WebUI.delay(3)

// browsing of file
WebUI.click(findTestObject('OASIS/Integumentary/woundinfo_uploadwound_browsefile'))

WebUI.delay(3)

//selecting of wound photo to be uploaded
Runtime.getRuntime().exec('C:\\Users\\PC-Medisource\\Desktop\\AutoIt3\\uploadwoundimage.exe')

