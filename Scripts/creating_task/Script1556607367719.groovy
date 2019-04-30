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

WebUI.delay(2)

WebUI.navigateToUrl('https://qa.medisource.com/patients/all')

WebUI.navigateToUrl('https://qa.medisource.com/patientcare/BC287096-B105-4FC8-AFBF-8D2B4B747EAA/D85D407C-4D0C-431E-AAE0-E107D4A582A7/overview')

WebUI.executeJavaScript('alert("fdsdfsdf")', [])

WebUI.delay(5)

WebUI.executeJavaScript('$("#searchbar__wrapper > div > input").text("05/01/2019")', [])

