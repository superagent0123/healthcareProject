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

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Sensory1'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Sensory2'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Sensory3'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_SensoryOthers'), 'Sensory Others')

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Integumentary1'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Integumentary2'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Integumentary3'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_IntegumentaryOthers'), 'Integumentary Others')

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Endocrine1'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Endocrine2'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_EndocrineOthers'), 'Endocrine Others')

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Respiratory1'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Respiratory2'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Respiratory3'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Respiratory4'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_RespiratoryOthers'), 'Respi others')

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Cardio1'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Cardio2'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Cardio3'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Cardio4'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Cardio5'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Cardio6'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Cardio7'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_CardioOthers'), 'cardio others')

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Gastro1'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Gastro2'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Gastro3'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Gastro4'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Gastro5'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Gastro6'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Gastro7'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_GastroOthers'), 'gastro others')

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Genito1'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Genito2'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Genito3'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Genito4'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Genito5'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Genito6'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_GenitoOthers'), 'genito others')

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Neuro1'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Neuro2'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Neuro3'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Neuro4'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Neuro5'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Neuro6'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Neuro7'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Neuro8'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Neuro9'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_NeuroOthers'), 'neuro others')

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Muscu1'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Muscu2'))

WebUI.click(findTestObject('OASIS/Medical_History/med_history_Muscu3'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Muscu4'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Muscu5'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Muscu6'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Muscu7'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Muscu8'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_MuscuOthers'), 'muscu others')

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Circu1'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Circu2'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Circu3'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_CircuOthers'), 'circu others')

WebUI.click(findTestObject('OASIS/Medical_History/med_History_OtherMedHis'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_OtherMedHisInput1'), 'sample1')

WebUI.click(findTestObject('OASIS/Medical_History/med_History_OtherMedHis2'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_OtherMedHisInput2'), 'sample2')

WebUI.click(findTestObject('OASIS/Medical_History/med_History_OtherMedHis3'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_OtherMedHisInput3'), 'sample3')

WebUI.click(findTestObject('OASIS/Medical_History/med_History_OtherMedHis4'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_OtherMedHisInput4'), 'sample4')

WebUI.click(findTestObject('OASIS/Medical_History/med_History_OtherMedHis5'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_OtherMedHisInput5'), 'sample5')

WebUI.click(findTestObject('OASIS/Medical_History/med_History_OtherMedHis6'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_OtherMedHisInput6'), 'sample6')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_OtherMedHis_Others'), 'other medical history')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_PastSurgicalDate1'), '12-12-2018')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_PastSurgicalProc1'), 'procedure 1')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_PastSurgicalDate2'), '12-13-2018')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_PastSurgicalProc2'), 'procedure 2')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_PastSurgicalDate3'), '12-14-2018')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_PastSurgicalProc3'), 'procedure3')

WebUI.click(findTestObject('OASIS/Medical_History/med_History_PastSurgicalAddRowButton'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_PastSurgicalDate4'), '12-12-15-2018')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_PastSurgicalProc4'), 'procedure 4')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_Hospi1'), '12-12-2018')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_HospiReason1'), 'reason 1')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_Hospi2'), '12-13-2018')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_HospiReason2'), 'reason 2')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_Hospi3'), '12-14-2018')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_HospiReason3'), 'Reason3')

WebUI.click(findTestObject('OASIS/Medical_History/med_History_HospiAddRowButton'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_Hospi4'), '12-15-2018')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_HospiReason4'), 'Reason4')

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Influenza_NoReason'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_Influenza_NoReasonInput'), 'NO Reason at all')

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Influenza_Offered'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Pneumonia_YesDate'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_Pneumonia_YesDateInput'), '12-30-2018')

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Pneumonia_Declined'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Pneumonia_Agreed_PCP'))

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Other_Immunization_ShinglesYes'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_Other_Immunization_ShinglesInput'), 'shingles1')

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Other_Immunization_TB'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_Other_Immunization_TBinput'), 'TB')

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Other_Immunization_Hepa'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_Other_Immunization_HepaInput'), 'HEPA B')

WebUI.click(findTestObject('OASIS/Medical_History/med_History_Other_Immunization_Tetanus'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_Other_Immunization_TetanusInput'), 'Tetanus')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_HS_ExamType1'), 'exam 1')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_HS_ExamDate1'), '12-12-2018')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_HS_ExamResult1'), 'Positive')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_HS_ExamType2'), 'type 2')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_HS_ExamDate2'), '12-13-2018')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_HS_ExamResult2'), 'result 2')

WebUI.click(findTestObject('OASIS/Medical_History/med_History_HS_AddRowButton'))

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_HS_ExamType3'), 'type 3')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_HS_ExamDate3'), '12-14-2018')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_HS_ExamResult3'), 'result 3')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_RecentF2F_DateLastContact'), '12-30-2018')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_RecentF2F_DateLastVisit'), '12-30-2018')

WebUI.setText(findTestObject('OASIS/Medical_History/med_History_RecentF2F_ReasonForContact'), 'asfasg')

WebUI.click(findTestObject('OASIS/OASIS_TABS/GenAss_tab'))

