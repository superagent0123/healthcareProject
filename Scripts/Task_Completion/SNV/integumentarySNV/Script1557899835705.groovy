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

not_run: WebUI.click(findTestObject('Task_Notes/SNV/snv_tabs/snv_integumentary'))

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_skincolor_pink'))

WebUI.setText(findTestObject('Task_Notes/SNV/integumentary/integ_skincolor_other'), 'Reddish Blue')

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_skintemp_warm'))

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_skinmoisture_dry'))

WebUI.setText(findTestObject('Task_Notes/SNV/integumentary/integ_skinmoisture_other'), 'Cracked')

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_skinturgor_good'))

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_skinintegrity_intact'))

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_skinintegrity_lesion'))

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_skinintegrity_cellulitis'))

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_skinintegrity_iad'))

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_skinintegrity_rashes'))

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_skinintegrity_dermatitis'))

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_skinintegrity_petechiae'))

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_skinintegrity_blisters'))

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_skinintegrity_excoriation'))

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_skinintegrity_xerosis'))

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_skinintegrity_ecchymosis'))

WebUI.setText(findTestObject('Task_Notes/SNV/integumentary/integ_skinintegrity_other'), 'Necrosis')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_wound'))

WebUI.delay(2)

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_w_pressureulcer'))

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_w_diabeticulcer'))

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_w_surgicalwound'))

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_w_venousstatis'))

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_w_arterial'))

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_w_burn'))

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_w_abrasion'))

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_w_laceration'))

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_w_trauma'))

WebUI.click(findTestObject('Task_Notes/SNV/integumentary/integ_w_skintear'))

WebUI.setText(findTestObject('Task_Notes/SNV/integumentary/integ_w_other'), 'Other')

WebUI.setText(findTestObject('Task_Notes/SNV/integumentary/integ_w_location'), 'Lower Back Scalp')

