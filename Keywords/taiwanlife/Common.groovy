package taiwanlife

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import internal.GlobalVariable
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
//WriteToExcel add
import org.apache.poi.ss.usermodel.Cell as Cell
import org.apache.poi.ss.usermodel.Row as Row
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.io.FileInputStream as FileInputStream
import java.io.FileNotFoundException as FileNotFoundException
import java.io.FileOutputStream as FileOutputStream
import java.io.InvalidObjectException as InvalidObjectException
//ExcelFactory
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
//add
import java.io.IOException
import org.apache.poi.ss.usermodel.Sheet
import org.apache.poi.ss.usermodel.WorkbookFactory
import org.apache.poi.ss.usermodel.Workbook
//Random
import java.util.Random as Random
public class Common {
	
	/*------------------------------------------------------------------------------------------------------------------------------------------------------------------
	Creation Date : 2019/06/11
	Propose : Rick_Lee
	Input : DataType key : ['yyyy-MM-dd'、'yyyyMMdd'、'yyyyMMddHHmm'、'yyyyMMddHHmmss']
	Return : Data [Format]
	Example :
	Note : Get DateNow To Key Format
	---------------------------------------------------------------------------------------------------------------------------------------------------------------------
	Modify Date / Propose :
	Modify Note :
	--------------------------------------------------------------------------------------------------------------------------------------------------------------------- */
	@Keyword
	def GetDataNow(String argDataType){
			Date today = new Date()
			switch (argDataType) {
					case 'yyyy-MM-dd':
							WebUI.comment('yyyy-MM-dd')
							String varyyyyMMddDash = today.format('yyyy-MM-dd')
							return varyyyyMMddDash
							break
					case 'yyyyMMdd':
							WebUI.comment('yyyyMMdd')
							String varyyyyMMdd = today.format('yyyyMMdd')
							return varyyyyMMdd
							break
					case 'yyyyMMddHHmm':
							WebUI.comment('yyyyMMddHHmm')
							String varyyyyMMddHHmm = today.format('yyyyMMddHHmm')
							return varyyyyMMddHHmm
							break
					case 'yyyyMMddHHmmss':
							WebUI.comment('yyyyMMddHHmmss')
							String varyyyyMMddHHmmss = today.format('yyyyMMddHHmmss')
							return varyyyyMMddHHmmss
							break
			}
	}
}
