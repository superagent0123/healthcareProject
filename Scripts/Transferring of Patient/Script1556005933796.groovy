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

WebUI.click(findTestObject('PatientCarePage/Component_Menu/mdOrder_menu'))

WebUI.delay(2)

WebUI.click(findTestObject('PatientCarePage/Component_Menu/mdOrder_menu_new/new_button'))

WebUI.delay(2)

WebUI.click(findTestObject('PatientCarePage/Component_Menu/mdOrder_menu_new/transfer_order'))

WebUI.delay(5)

WebUI.setText(findTestObject('PatientCarePage/Component_Menu/mdOrder_menu_new/transfer_order_forms/transfer_order_date'), 
    '04102019')

WebUI.delay(3)

WebUI.setText(findTestObject('PatientCarePage/Component_Menu/mdOrder_menu_new/transfer_order_forms/trasnfer_order_comm'), 
    'transfer to beverly hospital')

WebUI.delay(2)

WebUI.setText(findTestObject('PatientCarePage/Component_Menu/mdOrder_menu_new/transfer_order_forms/transfer_order_PO'), 
    'for surgerrry')

WebUI.click(findTestObject('PatientCarePage/Component_Menu/mdOrder_menu_new/transfer_order_forms/transfer_save'))

