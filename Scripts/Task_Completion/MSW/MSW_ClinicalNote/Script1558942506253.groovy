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

WebUI.navigateToUrl('https://qa.medisource.com/patientcare/A15EABD9-7BBD-4F2F-9567-83E1C784B0C2/F85EF0EA-A5BB-4D8B-AA9F-AB1C605EABE6/msw/visit/notes/C8B2F3E2-4655-41E3-AAC5-7E9CC0871E23')

WebUI.delay(3)

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/Visit_Date'))

WebUI.setText(findTestObject('Task_Notes/MSW_ClinicalNote/Visit_Date'), '05/28/2019')

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/Time_In'))

WebUI.setText(findTestObject('Task_Notes/MSW_ClinicalNote/Time_In'), '01:00')

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/Time_Out'))

WebUI.setText(findTestObject('Task_Notes/MSW_ClinicalNote/Time_Out'), '02:00')

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/Diagnosis'))

WebUI.setText(findTestObject('Task_Notes/MSW_ClinicalNote/Diagnosis'), 'Sample Diagnosis')

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/Other_Diagosis'))

WebUI.setText(findTestObject('Task_Notes/MSW_ClinicalNote/Other_Diagosis'), 'Sample Other Diagnosis')

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/HCPCS01'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/HCPCS02'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/HCPCS03'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/Living_Unchange'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/Living_Update'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/Living_Change'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/Living_Changed'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/Psychosocial_UpdateNote'))

WebUI.setText(findTestObject('Task_Notes/MSW_ClinicalNote/Psychosocial_UpdateNote'), 'This is a production test please bear with me thank you')

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/MentalStatus_Alert'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/MentalStatus_Confused'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/MentalStatus_Oriented'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/MentalStatus_Unconcious'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/MentalStatus_CantDetermine'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/MentalStatus_Forgetful'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/MentalStatus_Disoriented'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/MentalStatus_Lethargic'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/MentalStatus_Poor'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/EmotionalStatus_Stable'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/EmotionalStatus_Stressed'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/EmotionalStatus_Sad'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/EmotionalStatus_Fearful'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/EmotionalStatus_Flat'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/EmotionalStatus_Tearful'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/EmotionalStatus_Angry'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/EmotionalStatus_Widrawn'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/EmotionalStatus_Anxious'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/EmotionalStatus_Other'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/EmotionalStatus_inputbox'))

WebUI.setText(findTestObject('Task_Notes/MSW_ClinicalNote/EmotionalStatus_inputbox'), 'Sample Data')

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/VisitGoals_Adequate'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/VisitGoals_Normal'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/VisitGoals_AppropriateComm'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/VisitGoals_Mobilization'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/VisitGoals_Improved'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/VisitGoals_AppropriateGoals'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/VisitGoals_Stable'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/VisitGoals_Other'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/VisitGoals_Otherinput'))

WebUI.setText(findTestObject('Task_Notes/MSW_ClinicalNote/VisitGoals_Otherinput'), 'Sample Data')

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/VitalGoals_Details'))

WebUI.setText(findTestObject('Task_Notes/MSW_ClinicalNote/VitalGoals_Details'), 'This is a production test please bear with us thank you')

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/VisitInter_Psychosocial'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/VisitInter_CounselingRedisease'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/VisitInter_CounselingRefamily'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/VisitInter_Crisis'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/VisitInter_DevelopPlan'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/VisitInter_Other'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/VisitInter_inputbox'))

WebUI.setText(findTestObject('Task_Notes/MSW_ClinicalNote/VisitInter_inputbox'), 'Sample Data')

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/VistiInter_Community'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/VisitInter_Stabilize'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/VisitInter_Determine'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/VisitInter_Financial'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/VisitInter_Developapp'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/Intervention_Details'))

WebUI.setText(findTestObject('Task_Notes/MSW_ClinicalNote/Intervention_Details'), 'Sample automation test')

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/Progress_None'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/Progress_Slight'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/Progress_Fair'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/Progress_Moderate'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/Progress_Good'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/Progress_Excellent'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/Progress_inputbox'))

WebUI.setText(findTestObject('Task_Notes/MSW_ClinicalNote/Time_Out'), 'Sample Data')

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/Follow_Visit'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/Follow_Confer'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/Follow_Provided'))

WebUI.click(findTestObject('Task_Notes/MSW_ClinicalNote/Follow_Discharge'))

