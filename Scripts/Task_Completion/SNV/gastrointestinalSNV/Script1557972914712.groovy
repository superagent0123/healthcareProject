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

not_run: WebUI.click(findTestObject('Task_Notes/SNV/snv_tabs/snv_gastroinstestinal'))

WebUI.click(findTestObject('Task_Notes/SNV/gastrointestinal/gi_uppergistatus/gi_ugis_abdomen_soft'))

WebUI.setText(findTestObject('Task_Notes/SNV/gastrointestinal/gi_uppergistatus/gi_ugis_abdomen_girthcm'), '3.6')

WebUI.click(findTestObject('Task_Notes/SNV/gastrointestinal/gi_uppergistatus/gi_ugis_bowelsounds_active'))

WebUI.click(findTestObject('Task_Notes/SNV/gastrointestinal/gi_uppergistatus/gi_ugis_appetite_good'))

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/gastrointestinal/gi_nausea/gi_n_yes'))

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/gastrointestinal/gi_nausea/gi_n_projectile'))

WebUI.setText(findTestObject('Task_Notes/SNV/gastrointestinal/gi_nausea/gi_n_frequency'), '3x a day')

WebUI.click(findTestObject('Task_Notes/SNV/gastrointestinal/gi_nausea/gi_n_vomitusamount_small'))

WebUI.click(findTestObject('Task_Notes/SNV/gastrointestinal/gi_nausea/gi_n_colorcharac_coffee'))

WebUI.setText(findTestObject('Task_Notes/SNV/gastrointestinal/gi_nausea/gi_n_colorcharac_other'), 'Tarry')

WebUI.click(findTestObject('Task_Notes/SNV/gastrointestinal/gi_nausea/gi_n_othersymptom_heartburn'))

WebUI.click(findTestObject('Task_Notes/SNV/gastrointestinal/gi_nausea/gi_n_othersymptom_indigestion'))

WebUI.click(findTestObject('Task_Notes/SNV/gastrointestinal/gi_nausea/gi_n_othersymptom_reflux'))

WebUI.click(findTestObject('Task_Notes/SNV/gastrointestinal/gi_nausea/gi_n_othersymptom_flatulence'))

WebUI.setText(findTestObject('Task_Notes/SNV/gastrointestinal/gi_nausea/gi_n_othersymptom_other'), 'Sample text')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/SNV/gastrointestinal/gi_lowergistatus/gi_lgis_bowelmovement_normal'))

WebUI.click(findTestObject('Task_Notes/SNV/gastrointestinal/gi_lowergistatus/gi_lgis_stoolcharac_soft'))

WebUI.click(findTestObject('Task_Notes/SNV/gastrointestinal/gi_lowergistatus/gi_lgis_stoolcolor_yellow'))

WebUI.setText(findTestObject('Task_Notes/SNV/gastrointestinal/gi_lowergistatus/gi_lgis_stoolcolor_other'), 'Sample text')

WebUI.click(findTestObject('Task_Notes/SNV/gastrointestinal/gi_lowergistatus/gi_lgis_stoolsoftener_effective'))

WebUI.click(findTestObject('Task_Notes/SNV/gastrointestinal/gi_lowergistatus/gi_lgis_laxative_asneeded'))

WebUI.delay(3)

