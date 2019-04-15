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

WebUI.navigateToUrl('https://qa.medisource.com/agency')

WebUI.click(findTestObject('System_Module/AgencyInfo/EditButton'))

WebUI.click(findTestObject('System_Module/AgencyInfo/MedicareProvNo'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/MedicareProvNo'), '9104764240')

WebUI.click(findTestObject('System_Module/AgencyInfo/MedicaidProvNo'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/MedicaidProvNo'), '9453397784')

WebUI.click(findTestObject('System_Module/AgencyInfo/StateIDcode'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/StateIDcode'), 'HH980001447code')

WebUI.click(findTestObject('System_Module/AgencyInfo/AgencyFullName'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/AgencyFullName'), 'Lorraine\'s Agency')

WebUI.click(findTestObject('System_Module/AgencyInfo/ExportNameAgency'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/ExportNameAgency'), 'ExportMedisource')

WebUI.click(findTestObject('System_Module/AgencyInfo/AgencyAbbrev'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/AgencyAbbrev'), 'HSII')

WebUI.click(findTestObject('System_Module/AgencyInfo/Address1'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/Address1'), '9660 Flair Drive Suite 3386')

WebUI.click(findTestObject('System_Module/AgencyInfo/Address2'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/Address2'), '955 Sanger')

WebUI.click(findTestObject('System_Module/AgencyInfo/City'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/City'), 'Los Angeles')

WebUI.delay(3)

WebUI.click(findTestObject('System_Module/AgencyInfo/State'))

WebUI.click(findTestObject('System_Module/AgencyInfo/StateValue1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('System_Module/AgencyInfo/ZipCode'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/ZipCode'), '90063')

WebUI.click(findTestObject('System_Module/AgencyInfo/ContactPerson'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/ContactPerson'), 'Lorraine Manzano')

WebUI.click(findTestObject('System_Module/AgencyInfo/ContactPersonNo'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/ContactPersonNo'), '6262761356')

WebUI.click(findTestObject('System_Module/AgencyInfo/PhoneNoExtension'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/PhoneNoExtension'), '6185965421')

WebUI.click(findTestObject('System_Module/AgencyInfo/FaxNo'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/FaxNo'), '6265235487')

WebUI.click(findTestObject('System_Module/AgencyInfo/Tax_Identification'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/Tax_Identification'), '9000001465')

WebUI.click(findTestObject('System_Module/AgencyInfo/NPI'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/NPI'), '9780005')

WebUI.click(findTestObject('System_Module/AgencyInfo/FacilityDBAname'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/FacilityDBAname'), 'InterMed Home Care and Services')

WebUI.click(findTestObject('System_Module/AgencyInfo/OSHPDFacilityNo'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/OSHPDFacilityNo'), '90063')

WebUI.delay(3)

WebUI.click(findTestObject('System_Module/AgencyInfo/EntityType'))

WebUI.click(findTestObject('System_Module/AgencyInfo/EntityType_Value1'))

WebUI.delay(3)

WebUI.click(findTestObject('System_Module/AgencyInfo/EntityRel'))

WebUI.click(findTestObject('System_Module/AgencyInfo/EntityRel_Value1'))

WebUI.delay(3)

WebUI.click(findTestObject('System_Module/AgencyInfo/Intermediary'))

WebUI.click(findTestObject('System_Module/AgencyInfo/Intemediary_Value1'))

WebUI.click(findTestObject('System_Module/AgencyInfo/ParentCorName'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/ParentCorName'), 'Bimbim Parent Test')

WebUI.click(findTestObject('System_Module/AgencyInfo/MedicareCert'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/MedicareCert'), 'Certificate101010')

WebUI.click(findTestObject('System_Module/AgencyInfo/AccredStatus'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/AccredStatus'), 'Approved')

WebUI.click(findTestObject('System_Module/AgencyInfo/SubmittersID'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/SubmittersID'), 'IA000678')

WebUI.click(findTestObject('System_Module/AgencyInfo/AgentFederalTaxID'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/AgentFederalTaxID'), '214')

WebUI.click(findTestObject('System_Module/AgencyInfo/AgentName'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/AgentName'), 'Agent X44')

WebUI.click(findTestObject('System_Module/AgencyInfo/AgentAddress1'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/AgentAddress1'), '144 Zone 4 Cabaruan')

WebUI.click(findTestObject('System_Module/AgencyInfo/AgentAddress2'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/AgentAddress2'), 'Canarvacanan Asingan')

WebUI.click(findTestObject('System_Module/AgencyInfo/AgentCity'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/AgentCity'), 'Urdaneta City')

WebUI.click(findTestObject('System_Module/AgencyInfo/AgentZipcode'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/AgentZipcode'), '90063')

WebUI.click(findTestObject('System_Module/AgencyInfo/AgentContactPerson'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/AgentContactPerson'), 'Jelica Joy Baniel')

WebUI.click(findTestObject('System_Module/AgencyInfo/AgentContactPersonNo'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/AgentContactPersonNo'), '9635558852')

WebUI.click(findTestObject('System_Module/AgencyInfo/AgentPhoneNoExtension'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/AgentPhoneNoExtension'), '9852456985')

WebUI.click(findTestObject('System_Module/AgencyInfo/DiscardButton'))

WebUI.delay(2)

WebUI.click(findTestObject('System_Module/AgencyInfo/ModalCancelButton'))

WebUI.delay(3)

WebUI.click(findTestObject('System_Module/AgencyInfo/DiscardButton'))

WebUI.delay(2)

WebUI.click(findTestObject('System_Module/AgencyInfo/Discardbutton2'))

WebUI.delay(2)

WebUI.click(findTestObject('System_Module/AgencyInfo/EditButton'))

WebUI.delay(5)

WebUI.click(findTestObject('System_Module/AgencyInfo/MedicareProvNo'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/MedicareProvNo'), '9104764241')

WebUI.click(findTestObject('System_Module/AgencyInfo/MedicaidProvNo'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/MedicaidProvNo'), '9453397785')

WebUI.click(findTestObject('System_Module/AgencyInfo/StateIDcode'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/StateIDcode'), 'HH980001447code')

WebUI.click(findTestObject('System_Module/AgencyInfo/AgencyFullName'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/AgencyFullName'), 'Lorraine\'s Agency')

WebUI.click(findTestObject('System_Module/AgencyInfo/ExportNameAgency'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/ExportNameAgency'), 'ExportMedisource')

WebUI.click(findTestObject('System_Module/AgencyInfo/AgencyAbbrev'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/AgencyAbbrev'), 'HSII')

WebUI.click(findTestObject('System_Module/AgencyInfo/Address1'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/Address1'), '9660 Flair Drive Suite 3386')

WebUI.click(findTestObject('System_Module/AgencyInfo/Address2'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/Address2'), '955 Sanger')

WebUI.click(findTestObject('System_Module/AgencyInfo/City'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/City'), 'Los Angeles')

WebUI.delay(3)

WebUI.click(findTestObject('System_Module/AgencyInfo/State'))

WebUI.click(findTestObject('System_Module/AgencyInfo/StateValue1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('System_Module/AgencyInfo/ZipCode'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/ZipCode'), '90063')

WebUI.click(findTestObject('System_Module/AgencyInfo/ContactPerson'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/ContactPerson'), 'Lorraine Manzano')

WebUI.click(findTestObject('System_Module/AgencyInfo/ContactPersonNo'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/ContactPersonNo'), '6262761356')

WebUI.click(findTestObject('System_Module/AgencyInfo/PhoneNoExtension'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/PhoneNoExtension'), '6185965421')

WebUI.click(findTestObject('System_Module/AgencyInfo/FaxNo'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/FaxNo'), '6265235487')

WebUI.click(findTestObject('System_Module/AgencyInfo/Tax_Identification'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/Tax_Identification'), '9000001465')

WebUI.click(findTestObject('System_Module/AgencyInfo/NPI'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/NPI'), '9780005')

WebUI.click(findTestObject('System_Module/AgencyInfo/FacilityDBAname'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/FacilityDBAname'), 'InterMed Home Care and Services')

WebUI.click(findTestObject('System_Module/AgencyInfo/OSHPDFacilityNo'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/OSHPDFacilityNo'), '90063')

WebUI.delay(3)

WebUI.click(findTestObject('System_Module/AgencyInfo/EntityType'))

WebUI.click(findTestObject('System_Module/AgencyInfo/EntityType_Value1'))

WebUI.delay(3)

WebUI.click(findTestObject('System_Module/AgencyInfo/EntityRel'))

WebUI.click(findTestObject('System_Module/AgencyInfo/EntityRel_Value1'))

WebUI.delay(3)

WebUI.click(findTestObject('System_Module/AgencyInfo/Intermediary'))

WebUI.click(findTestObject('System_Module/AgencyInfo/Intemediary_Value1'))

WebUI.click(findTestObject('System_Module/AgencyInfo/ParentCorName'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/ParentCorName'), 'Bimbim Parent Test')

WebUI.click(findTestObject('System_Module/AgencyInfo/MedicareCert'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/MedicareCert'), 'Certificate101010')

WebUI.click(findTestObject('System_Module/AgencyInfo/AccredStatus'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/AccredStatus'), 'Approved')

WebUI.click(findTestObject('System_Module/AgencyInfo/SubmittersID'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/SubmittersID'), 'IA000678')

WebUI.click(findTestObject('System_Module/AgencyInfo/AgentFederalTaxID'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/AgentFederalTaxID'), '214')

WebUI.click(findTestObject('System_Module/AgencyInfo/AgentName'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/AgentName'), 'Agent X44')

WebUI.click(findTestObject('System_Module/AgencyInfo/AgentAddress1'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/AgentAddress1'), '144 Zone 4 Cabaruan')

WebUI.click(findTestObject('System_Module/AgencyInfo/AgentAddress2'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/AgentAddress2'), 'Canarvacanan Asingan')

WebUI.click(findTestObject('System_Module/AgencyInfo/AgentCity'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/AgentCity'), 'Urdaneta City')

WebUI.click(findTestObject('System_Module/AgencyInfo/AgentZipcode'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/AgentZipcode'), '90063')

WebUI.click(findTestObject('System_Module/AgencyInfo/AgentContactPerson'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/AgentContactPerson'), 'Jelica Joy Baniel')

WebUI.click(findTestObject('System_Module/AgencyInfo/AgentContactPersonNo'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/AgentContactPersonNo'), '9635558852')

WebUI.click(findTestObject('System_Module/AgencyInfo/AgentPhoneNoExtension'))

WebUI.setText(findTestObject('System_Module/AgencyInfo/AgentPhoneNoExtension'), '9852456985')

WebUI.click(findTestObject('System_Module/AgencyInfo/SaveButton'))

