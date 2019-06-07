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



for (def rowNum = 1; rowNum <= findTestData('woundsets_testdata').getRowNumbers(); rowNum++)  {
	
	def x = findTestData('woundsets_testdata').getValue(1,rowNum)
	def y = findTestData('woundsets_testdata').getValue(2,rowNum)
	
	
	Integer valx = x as int
	Integer valy = y as int
	
	WebUI.delay(5)
	WebUI.clickOffset(findTestObject('OASIS/Integumentary/human_image'), valx, valy)
	
	WebUI.delay(5)
	WebUI.click(findTestObject('OASIS/Integumentary/pin_image_yes'))
	
	WebUI.delay(5)
}