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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.medisource.com/login')

WebUI.setText(findTestObject('LogIn/username'), 'superagent@intermed')

WebUI.setEncryptedText(findTestObject('LogIn/password'), 'SITHpLWAWtLnr/hOhnpplQ==')

WebUI.click(findTestObject('LogIn/login_button'))

WebUI.delay(5)

WebUI.navigateToUrl('https://qa.medisource.com/patientcare/D54CC206-ED8F-40D1-9D9D-2FB2F01411CE/0C87F119-5BDC-4D64-9196-15744946E006/2019/oasis/clinical/soc/3CD6FB75-D3DD-464A-A07A-9FDAD5F02C76/D54CC206-ED8F-40D1-9D9D-2FB2F01411CE')

WebUI.delay(8)

WebUI.click(findTestObject('OASIS/OASIS_TABS/Integumentary_tab'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS/Integumentary/skinintegrity_wound'))

WebUI.delay(5)

not_run: WebUI.clickOffset(findTestObject('OASIS/Integumentary/human_image'), 100, 230)

not_run: WebUI.click(findTestObject('OASIS/Integumentary/pin_image_yes'))

not_run: WebUI.delay(3)

not_run: WebUI.clickOffset(findTestObject('OASIS/Integumentary/human_image'), 200, 210)

not_run: WebUI.click(findTestObject('OASIS/Integumentary/pin_image_yes'))

not_run: for (def rowNum = 0; rowNum <= 2; rowNum++) {
    def xaxis = findTestData('woundpin').getValue(1, rowNum)

    def yaxis = findTestData('woundpin').getValue(2, rowNum)

    WebUI.clickOffset(findTestObject('OASIS/Integumentary/human_image'), xaxis, yaxis)

    WebUI.click(findTestObject('OASIS/Integumentary/pin_image_yes'))

    WebUI.delay(3)
}

/*
 	def rowNum = 1 
 	-- define the row number

 	findTestData('data_set_name').getRowNumbers() 
 	-- function of getRowNumbers() is to get the total number of entries/data on the database table
 
 	def xaxis / def yaxis = findTestData('data_set_name').getValue(1, rowNum)
	--store the value of the x and y-axis from the database to a variable 
 
 	string xx = xaxis
 	--parse or convert the stored value to a string variable
 
	Integer intValx = ((xaxis) as int)
	--parse or convert the stored value of x and y-axis to an integer type variable

    WebUI.clickOffset(findTestObject('OASIS/Integumentary/human_image'), intValx, intValy)
    --parsed to integer x-axis and y-axis
    WebUI.delay(5)
    WebUI.click(findTestObject('OASIS/Integumentary/pin_image_yes')) 
 */
for (def rowNum = 1; rowNum <= findTestData('woundpin').getRowNumbers(); rowNum++) {
    def xaxis = findTestData('woundpin').getValue(1, rowNum)

    def yaxis = findTestData('woundpin').getValue(2, rowNum)

    String xx = xaxis
    String yy = yaxis

    //parse to string
    Integer intValx = ((xaxis) as int)
    Integer intValy = ((yaxis) as int)
    WebUI.delay(8)

    WebUI.clickOffset(findTestObject('OASIS/Integumentary/human_image'), intValx, intValy)
    WebUI.delay(8)
    WebUI.click(findTestObject('OASIS/Integumentary/pin_image_yes'))
}

