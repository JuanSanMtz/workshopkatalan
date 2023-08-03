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

WebUI.openBrowser('https://demoqa.com/')

WebUI.maximizeWindow()

CustomKeywords.'UtilidadesNavegador.zoomOut'(3)

WebUI.scrollToElement(findTestObject('AGREGARLIBROCOLECCION/Page_DEMOQA/input_bookstoeap'), 0)

WebUI.click(findTestObject('AGREGARLIBROCOLECCION/Page_DEMOQA/input_bookstoeap'))

WebUI.click(findTestObject('AGREGARLIBROCOLECCION/Page_DEMOQA/label_login'))

WebUI.setText(findTestObject('AGREGARLIBROCOLECCION/Page_DEMOQA/input_username'), 'jsantosmtz')

WebUI.setText(findTestObject('AGREGARLIBROCOLECCION/Page_DEMOQA/input_pass'), 'CursoKatalon1208*')

WebUI.scrollToElement(findTestObject('AGREGARLIBROCOLECCION/Page_DEMOQA/button_login'), 0)

WebUI.click(findTestObject('AGREGARLIBROCOLECCION/Page_DEMOQA/button_login'))

WebUI.scrollToElement(findTestObject('AGREGARLIBROCOLECCION/Page_DEMOQA/li_Book Store'), 0)

WebUI.click(findTestObject('AGREGARLIBROCOLECCION/Page_DEMOQA/li_Book Store'))

WebUI.click(findTestObject('AGREGARLIBROCOLECCION/Page_DEMOQA/input_Book Store API_searchBox'))

WebUI.setText(findTestObject('AGREGARLIBROCOLECCION/Page_DEMOQA/input_Book Store API_searchBox'), 'Eloquent JavaScript')

WebUI.click(findTestObject('AGREGARLIBROCOLECCION/Page_DEMOQA/a_Eloquent JavaScript, Second Edition'))

WebUI.click(findTestObject('AGREGARLIBROCOLECCION/Page_DEMOQA/button_Add To Your Collection'))

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('AGREGARLIBROCOLECCION/Page_DEMOQA/li_Profile'), 0)

WebUI.click(findTestObject('AGREGARLIBROCOLECCION/Page_DEMOQA/li_Profile'))

WebUI.verifyElementText(findTestObject('AGREGARLIBROCOLECCION/Page_DEMOQA/label_author'), 'Marijn Haverbeke')

WebUI.closeBrowser()

