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

WebUI.navigateToUrl('https://qa.medisource.com/patientcare/B9A9D011-509F-4DF1-99B4-A9AAEA69368B/E73C1271-625B-476A-B13D-F4E3FF62502A/overview')

WebUI.setText(findTestObject('PatientCarePage/Component_Menu/task_menu_components/t_searchbar'), 'Skilled Nursing')

not_run: WebUI.click(findTestObject('PatientCarePage/Component_Menu/task_menu_components/t_searchbar'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.sendKeys(findTestObject('PatientCarePage/Component_Menu/task_menu_components/t_searchbar'), Keys.chord('Skilled Evaluation', 
        Keys.ENTER))

