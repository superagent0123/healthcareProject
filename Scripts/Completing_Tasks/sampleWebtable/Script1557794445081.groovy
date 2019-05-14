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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.Keys as Keys

WebUI.delay(3)

WebUI.navigateToUrl('https://qa.medisource.com/patients/all')

WebUI.delay(3)

WebUI.click(findTestObject('Patient_Manager/p_man_statussort_admitted'))

WebUI.delay(3)

'Select the first patient entry on the Admitted tab\r\n'
WebUI.click(findTestObject('Patient_Manager/p_man_first_entry'))

WebUI.delay(5)

WebUI.click(findTestObject('PatientCarePage/Component_Menu/task_menu_components/t_searchbar'))

WebUI.sendKeys(findTestObject('PatientCarePage/Component_Menu/task_menu_components/t_searchbar'), Keys.chord('RN-Skilled Nursing Visit', 
        Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('PatientCarePage/Component_Menu/task_menu_components/t_firstentry'))

