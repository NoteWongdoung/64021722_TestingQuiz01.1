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

WebUI.openBrowser('https://www.saucedemo.com')

for (def index : (1..4)) {
    WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/Uesname'), findTestData('TC_01_Data/Test_01').getValue(
            1, index))

    WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag Labs/password'), 'qcu24s4901FyWDTwXGr6XA==')

    WebUI.click(findTestObject('Object Repository/Page_Swag Labs/submit'))

    WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Open Menu'))

    WebUI.click(findTestObject('Object Repository/Page_Swag Labs/Logout'))
}

WebUI.closeBrowser()

