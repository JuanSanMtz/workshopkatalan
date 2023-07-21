import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


WebUI.callTestCase(findTestCase('PRACTICA 3/TC02_crearCita'), [('userName') : 'John Doe', ('password') : 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectAllOption(findTestObject('Object Repository/PRACTICA 3/MAKEAPPOINTMENT/select_facility'))

WebUI.check(findTestObject('Object Repository/PRACTICA 3/MAKEAPPOINTMENT/button_check'))

WebUI.check(findTestObject('Object Repository/PRACTICA 3/MAKEAPPOINTMENT/input_checkMedicaid'))

WebUI.setText(findTestObject('Object Repository/PRACTICA 3/MAKEAPPOINTMENT/input_calender'), visita)

WebUI.setText(findTestObject('Object Repository/PRACTICA 3/MAKEAPPOINTMENT/select_text'), texto)

WebUI.check(findTestObject('Object Repository/PRACTICA 3/MAKEAPPOINTMENT/button_bookAppointment'))

WebUI.takeScreenshot('C:\\Evidencias\\PRACTICA3.JPG')

WebUI.closeBrowser()

