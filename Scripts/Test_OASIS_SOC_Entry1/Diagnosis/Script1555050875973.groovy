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
import java.util.List as List

WebUI.setText(findTestObject('OASIS/Diagnosis/Diagnosis_M1021'), 'J44.')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Diagnosis/Diagnosis_M1021_Selected'))

WebUI.click(findTestObject('OASIS/Diagnosis/Diagnosis_M1021_checkbox'))

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS/Diagnosis/Diagnosis_M1023B'), 'a')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Diagnosis/Diagnosis_M1023B_Selected'))

WebUI.click(findTestObject('OASIS/Diagnosis/Diagnosis_M1023B_checkbox'))

WebUI.setText(findTestObject('OASIS/Diagnosis/Diagnosis_M1023C'), 'c')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Diagnosis/Diagnosis_M1023C_Selected'))

WebUI.click(findTestObject('OASIS/Diagnosis/Diagnosis_M1023C_checkbox'))

WebUI.setText(findTestObject('OASIS/Diagnosis/Diagnosis_M1023D'), 'D')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Diagnosis/Diagnosis_M1023D_Selected'))

WebUI.click(findTestObject('OASIS/Diagnosis/Diagnosis_M1023D_checkbox'))

WebUI.setText(findTestObject('OASIS/Diagnosis/Diagnosis_M1023E'), 'E')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Diagnosis/Diagnosis_M1023E_Selected'))

WebUI.click(findTestObject('OASIS/Diagnosis/Diagnosis_M1023E-checkbox'))

WebUI.setText(findTestObject('OASIS/Diagnosis/Diagnosis_M1023F'), 'F')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Diagnosis/Diagnosis_M1023F_Selected'))

WebUI.click(findTestObject('OASIS/Diagnosis/Diagnosis_M1023F_checkbox'))

WebUI.delay(3)

WebUI.click(findTestObject('OASIS/Diagnosis/Diagnosis_Component/Diagnosis_Component_AddRow'))

WebUI.setText(findTestObject('OASIS/Diagnosis/Diagnosis_Component/Diagnosis_Component_M1023G'), 'G')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS/Diagnosis/Diagnosis_Component/Diagnosis_Component_M1023G_Selected'))

WebUI.click(findTestObject('OASIS/Diagnosis/Diagnosis_Component/Diagnosis_Component_M1023G_checkbox'))

//for (int i=0;i<2; i++){
//WebUI.sendKeys(findTestObject('addPatient/intakeDiagandPreAdSecondaryDiag'), findTestData('secondaryDiag').getValue(1, 1))
//}
//List checkBoxes =
//}
 WebUI.click(findTestObject('OASIS/Diagnosis/Diagnosis_M1028_1'))

WebUI.click(findTestObject('OASIS/Diagnosis/Diagnosis_M1028_1'))

//WebUI.click(findTestObject('OASIS/Diagnosis/Diagnosis_M1028_2'))

WebUI.click(findTestObject('OASIS/Diagnosis/Diagnosis_M1030_1'))

WebUI.click(findTestObject('OASIS/Diagnosis/Diagnosis_M1033_1'))

WebUI.setText(findTestObject('OASIS/Diagnosis/Diagnosis_M1060_height'), '55')

WebUI.setText(findTestObject('OASIS/Diagnosis/Diagnosis_M1060_weight'), '111')

WebUI.click(findTestObject('OASIS/OASIS_TABS/MedHistory_tab'))

