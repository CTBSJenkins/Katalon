import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import com.kms.katalon.core.webui.driver.DriverFactory


String varNow = CustomKeywords.'taiwanlife.Common.GetDataNow'('yyyyMMddHHmmss')
println('Now : ' + varNow)
GlobalVariable.G_ReturnString = 'ReturnTest'
println('G_UesrName : ' + GlobalVariable.G_UesrName)
println('G_ReturnString : ' + GlobalVariable.G_ReturnString)
//開啟瀏覽器
System.setProperty("webdriver.chrome.driver","/usr/soft/Katalon/configuration/resources/drivers/chromedriver_linux64/chromedriver");
ChromeOptions options = new ChromeOptions()
options.addArguments("--no-sandbox");
options.addArguments("--disable-dev-shm-usage");
options.addArguments("--headless");
WebDriver driver = new ChromeDriver(options)

driver.get("https://katalon-demo-cura.herokuapp.com/")

WebUI.waitForElementClickable(findTestObject('Login/btn_MakeAppointment'), 10)
