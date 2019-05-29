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

WebUI.delay(5)

WebUI.click(findTestObject('Patient_Care/md_orders/mdo_new_form'))

WebUI.delay(3)

WebUI.click(findTestObject('Patient_Care/md_orders/mdo_new_dischargedeathathome'))

WebUI.delay(8)

todayy = new Date()

tdate = todayy.format('MM/dd/yyyy')

def dccommnote = 'I was called to patients bedside to pronounce that patient _____ has died. \n No spontaneous movement were present. There was no response to verbal or tactile stimuli. \n Pupils were mid-dilated and fixed. No breath sounds were appreaciated over either lung field. \n Document if pt was DNR/DNI vs full code. \n The Patient\'s major medical illness was _____. Time of death was 0315. \n Confirmed and witnessed by Nurse Khenard Figuracion, RN.'

def phydcorder = 'Orders to be done: \n 1. Expiration Order \n 2. Discharge to Morgue. \n 3. Please notify attending in AM, name of attending that patient has expired and death certificate will need to be signed. \n 4. if autopsy desired, family sign/notarize form, complete autopsy permit.'

WebUI.setText(findTestObject('MD_Orders/discharge_order_deathathome/dodah_ordertime'), '1200')

WebUI.setText(findTestObject('MD_Orders/discharge_order_deathathome/dodah_sentdate'), tdate)

WebUI.setText(findTestObject('MD_Orders/discharge_order_deathathome/dodah_receiveddate'), tdate)

WebUI.click(findTestObject('MD_Orders/discharge_order_deathathome/dodah_commtype_persontoperson'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/discharge_order_deathathome/dodah_commtype_phone'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/discharge_order_deathathome/dodah_commtype_fax'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('MD_Orders/discharge_order_deathathome/dodah_commtype_mail'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('MD_Orders/discharge_order_deathathome/dodah_commnote'), dccommnote)

WebUI.setText(findTestObject('MD_Orders/discharge_order_deathathome/dodah_physicianorder'), phydcorder)

WebUI.delay(3)

WebUI.click(findTestObject('MD_Orders/discharge_order_deathathome/dodah_notificationandcarecoordination/dodah_discardchanges_btn'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('MD_Orders/discharge_order_deathathome/dodah_notificationandcarecoordination/dodah_discardchanges_cancel'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('MD_Orders/discharge_order_deathathome/dodah_notificationandcarecoordination/dodah_savebtn'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

