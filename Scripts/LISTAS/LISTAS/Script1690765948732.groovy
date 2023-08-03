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

WebUI.click(findTestObject('LISTAS/Page_DEMOQA/div_Widgets'))

WebUI.scrollToElement(findTestObject('LISTAS/Page_DEMOQA/li_Select Menu'), 0)

WebUI.click(findTestObject('LISTAS/Page_DEMOQA/li_Select Menu'))

WebUI.click(findTestObject('LISTAS/Page_DEMOQA/div_Select Option'))

WebUI.sendKeys(findTestObject('Object Repository/LISTAS/Page_DEMOQA/div_A root option'), 'A root option')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/LISTAS/Page_DEMOQA/div_A root option'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('LISTAS/Page_DEMOQA/select_one'))

WebUI.sendKeys(findTestObject('Object Repository/LISTAS/Page_DEMOQA/select_oneProf'), 'Prof.')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/LISTAS/Page_DEMOQA/select_oneProf'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('LISTAS/Page_DEMOQA/select_oldstyle'))

WebUI.click(findTestObject('LISTAS/Page_DEMOQA/select_multiselect'))

WebUI.setText(findTestObject('LISTAS/Page_DEMOQA/input_list'), 'Black')

WebUI.sendKeys(findTestObject('Object Repository/LISTAS/Page_DEMOQA/input_list'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('LISTAS/Page_DEMOQA/input_list'), 'Blue')

WebUI.sendKeys(findTestObject('Object Repository/LISTAS/Page_DEMOQA/input_list'), Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('LISTAS/Page_DEMOQA/input_list'), 'Red')

WebUI.sendKeys(findTestObject('Object Repository/LISTAS/Page_DEMOQA/input_list'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('LISTAS/Page_DEMOQA/select_standar'))

WebUI.delay(1)

WebUI.closeBrowser()

