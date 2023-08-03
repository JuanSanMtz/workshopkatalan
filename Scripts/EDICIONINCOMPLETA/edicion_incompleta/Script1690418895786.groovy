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

WebUI.click(findTestObject('EDICIONEMPLEADO/div_Elements'))

WebUI.scrollToElement(findTestObject('EDICIONEMPLEADO/li_Web Tables'), 0)

WebUI.click(findTestObject('EDICIONEMPLEADO/li_Web Tables'))

WebUI.click(findTestObject('EDICIONINCOMPLETA/Page_DEMOQA/svg'))

WebUI.doubleClick(findTestObject('EDICIONINCOMPLETA/Page_DEMOQA/input_First Name_firstName'))

WebUI.sendKeys(findTestObject('Object Repository/EDICIONINCOMPLETA/Page_DEMOQA/input_First Name_firstName'), Keys.chord(
        Keys.DELETE))

WebUI.click(findTestObject('EDICIONINCOMPLETA/Page_DEMOQA/input_Last Name_lastName'))

WebUI.click(findTestObject('EDICIONINCOMPLETA/Page_DEMOQA/button_Submit'))

WebUI.verifyElementAttributeValue(findTestObject('EDICIONINCOMPLETA/Page_DEMOQA/input_First Name_firstName'), 'id', 'firstName', 
    0)

WebUI.closeBrowser()

