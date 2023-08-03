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

WebUI.callTestCase(findTestCase('ALTAFORMULARIO/login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ALTAFORMULARIO/elements_Webtables/div_Elements'))

WebUI.scrollToElement(findTestObject('ALTAFORMULARIO/elements_Webtables/div_Elements'), 0)

WebUI.click(findTestObject('ALTAFORMULARIO/elements_Webtables/span_Web Tables'))

WebUI.click(findTestObject('ALTAFORMULARIO/elements_Webtables/button_Add'))

WebUI.setText(findTestObject('ALTAFORMULARIO/elements_Webtables/input_First Name_firstName'), Nombre)

WebUI.setText(findTestObject('ALTAFORMULARIO/elements_Webtables/input_Last Name_lastName'), Apellido)

WebUI.setText(findTestObject('ALTAFORMULARIO/elements_Webtables/input_Email_userEmail'), Correo)

WebUI.setText(findTestObject('ALTAFORMULARIO/elements_Webtables/input_Age_age'), Edad)

WebUI.setText(findTestObject('ALTAFORMULARIO/elements_Webtables/input_Salary_salary'), Salario)

WebUI.setText(findTestObject('ALTAFORMULARIO/elements_Webtables/input_Department_department'), Departamento)

WebUI.click(findTestObject('ALTAFORMULARIO/elements_Webtables/button_Submit'))

WebUI.scrollToElement(findTestObject('ALTAFORMULARIO/elements_Webtables/input_Add_searchBox'), 0)

WebUI.click(findTestObject('ALTAFORMULARIO/elements_Webtables/input_Add_searchBox'))

WebUI.setText(findTestObject('ALTAFORMULARIO/elements_Webtables/input_Add_searchBox'), 'Pedro Pablo')

