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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://berikhtiar.com/qa.candida.f22')

WebUI.scrollToElement(findTestObject('Page_Toko Online QA Candidate/a_Total Produk  38_productCard__anchor'), 0)

WebUI.click(findTestObject('Object Repository/Page_Toko Online QA Candidate/a_Total Produk  38_productCard__anchor'))

WebUI.click(findTestObject('Object Repository/Page_Toko QA Candidate - Aza Coffee - Kopi _360b7e/span_Masukkan Keranjang'))

WebUI.click(findTestObject('Object Repository/Page_Toko QA Candidate - Aza Coffee - Kopi _360b7e/button_Lanjutkan Belanja'))

WebUI.closeBrowser()

