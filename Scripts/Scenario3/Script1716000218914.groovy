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
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory

Mobile.startApplication('C:\\Users\\FeFrJ\\git\\sayakayatestanswer\\androidapp\\flutter-app (1).apk', true)

Mobile.waitForElementPresent(findTestObject('Object Repository/Scenario3/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Scenario3/android.widget.Button - OK'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Scenario3/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Scenario3/android.widget.Button - OK'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Scenario3/android.widget.Button - Material'), 0)

Mobile.scrollToText('Text fields')

Mobile.tap(findTestObject('Object Repository/Scenario3/android.widget.Button - Text fieldsSingle line of editable text and numbers'), 
    0)

Mobile.tap(findTestObject('Object Repository/Scenario3/android.widget.EditText - Name'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Scenario3/android.widget.EditText - Name'), 'Test', 0)

Mobile.tap(findTestObject('Object Repository/Scenario3/android.widget.EditText - Phone Number'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Scenario3/android.widget.EditText - Phone Number'), '1234567890', 0)

Mobile.tap(findTestObject('Object Repository/Scenario3/android.widget.EditText - E-mail'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Scenario3/android.widget.EditText - E-mail'), 'test@test.com', 0)

Mobile.tap(findTestObject('Object Repository/Scenario3/android.widget.EditText - Life story'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Scenario3/android.widget.EditText - Life story'), 'test123', 0)

Mobile.tap(findTestObject('Object Repository/Scenario3/android.widget.EditText - Salary'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Scenario3/android.widget.EditText - Salary'), '123456', 0)

Mobile.scrollToText('Password *')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Scenario3/android.widget.EditText - Password'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/Scenario3/android.widget.EditText - Password'), 'testpassword', 10)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Scenario3/android.widget.Button - SUBMIT'), 0)

Mobile.waitForElementPresent(findTestObject('Scenario3/android.view.View - Please fix the errors in red before submitting'), 
    0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Scenario3/android.view.View - Please fix the errors in red before submitting'), 
    0)

Mobile.closeApplication()

