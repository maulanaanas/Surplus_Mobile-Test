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

Mobile.startApplication('C:\\Users\\maula\\Downloads\\Sample Android App - Login Tes_4.0_Apkpure.apk', false)

Mobile.tap(findTestObject('Register/CreateLink - Button'), 0)

Mobile.setText(findTestObject('Register/Name - Field'), 'gagalregister', 0)

Mobile.setText(findTestObject('Register/Email - Field'), 'gagal@mail.com', 0)

Mobile.setText(findTestObject('Register/Password - Field'), 'bedayak', 0)

Mobile.setText(findTestObject('Register/ConfirmPassword - Field'), 'gasamanih', 0)

Mobile.tap(findTestObject('Register/Register - Button'), 0)

Mobile.verifyElementVisible(findTestObject('Register/Password Not Same - Text'), 0)

