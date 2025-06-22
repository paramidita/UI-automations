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

WebUI.click(findTestObject('Page_DEMOQA/button bookstore'))

WebUI.click(findTestObject('Page_DEMOQA/button_Login'))

WebUI.verifyElementVisible(findTestObject('Page_DEMOQA/input_UserName_userName'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_DEMOQA/button_New User'))

WebUI.verifyElementVisible(findTestObject('Page_DEMOQA/input_First Name_firstname'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_DEMOQA/input_First Name_firstname'), 'John')

WebUI.setText(findTestObject('Page_DEMOQA/input_Last Name_lastname'), 'Doe')

WebUI.setText(findTestObject('Page_DEMOQA/input_UserName_userName'), 'johndoe123')

WebUI.setText(findTestObject('Page_DEMOQA/input_Password_password'), 'password@123')

WebUI.check(findTestObject('Page_DEMOQA/katalon-div_id(recaptcha-anchor)divclassrecaptcha-checkbox-border'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('Page_DEMOQA/button_Register'))

