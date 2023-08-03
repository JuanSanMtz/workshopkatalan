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

WebUI.openBrowser(' https://demoqa.com/')

WebUI.maximizeWindow()

CustomKeywords.'UtilidadesNavegador.zoomOut'(4)

WebUI.scrollToElement(findTestObject('REGISTROESTUDIANTE/input_forms'), 0)

WebUI.click(findTestObject('REGISTROESTUDIANTE/input_forms'))

WebUI.click(findTestObject('REGISTROESTUDIANTE/input_practiceForm'))

WebUI.setText(findTestObject('REGISTROESTUDIANTE/input_Name_firstName'), 'Juan')

WebUI.setText(findTestObject('REGISTROESTUDIANTE/input_Name_lastName'), 'Antonio')

WebUI.setText(findTestObject('REGISTROESTUDIANTE/input_Email_userEmail'), 'jsammtz@gmail.com')

WebUI.click(findTestObject('REGISTROESTUDIANTE/div_Male'))

WebUI.setText(findTestObject('REGISTROESTUDIANTE/input_userNumber'), '5520700939')

WebUI.setText(findTestObject('Object Repository/REGISTROESTUDIANTE/input_dateBirth'), '')

WebUI.click(findTestObject('REGISTROESTUDIANTE/select_mes'))

WebUI.selectOptionByLabel(findTestObject('REGISTROESTUDIANTE/select_mes'), 'May', false)

WebUI.click(findTestObject('REGISTROESTUDIANTE/select_año'))

WebUI.selectOptionByLabel(findTestObject('REGISTROESTUDIANTE/select_año'), '1990', false)

WebUI.click(findTestObject('REGISTROESTUDIANTE/select_dia'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/REGISTROESTUDIANTE/div_subjects'), 'Maths')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/REGISTROESTUDIANTE/div_subjects'), Keys.chord(Keys.TAB))

WebUI.check(findTestObject('REGISTROESTUDIANTE/input_sports'))

WebUI.uploadFile(findTestObject('REGISTROESTUDIANTE/input_selectPicture'), 'C:\\Users\\A2278170\\OneDrive - GFBANORTE\\Documentos\\Katalon Picture')

WebUI.setText(findTestObject('REGISTROESTUDIANTE/txt_currentAddress'), 'Hola, Bienvenido a Katalon')

WebUI.check(findTestObject('REGISTROESTUDIANTE/input_selectState'))

WebUI.click(findTestObject('REGISTROESTUDIANTE/input_ncr'))

WebUI.check(findTestObject('REGISTROESTUDIANTE/input_selectCity'))

WebUI.click(findTestObject('REGISTROESTUDIANTE/input_delhi'))

WebUI.click(findTestObject('REGISTROESTUDIANTE/button_Submit'))

WebUI.click(findTestObject('REGISTROESTUDIANTE/button_Close'))

WebUI.closeBrowser()

