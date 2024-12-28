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

WebUI.navigateToUrl('https://app.jubelio.com/home/inventory/review')

WebUI.setText(findTestObject('Object Repository/Jubelio/input_Email'), 'devynursadiah.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Jubelio/input_Password'), '@jubelio123')

WebUI.click(findTestObject('Object Repository/Jubelio/login'))

WebUI.click(findTestObject('Object Repository/Jubelio_page/barang'))

WebUI.click(findTestObject('Object Repository/Jubelio_page/katalog'))

WebUI.click(findTestObject('Object Repository/Jubelio_page/review'))

WebUI.click(findTestObject('Object Repository/Jubelio_InReview/tambah_item'))

WebUI.setText(findTestObject('Object Repository/Jubelio_InReview/input_nama'), 'Novel')

WebUI.click(findTestObject('Object Repository/Jubelio_InReview/div_kategori'))

WebUI.click(findTestObject('Object Repository/Jubelio_InReview/div_nonvarian'))

WebUI.click(findTestObject('Object Repository/Jubelio_InReview/div_pilihan'))

WebUI.setText(findTestObject('Object Repository/Jubelio_InReview/input_pilih'), '')

WebUI.click(findTestObject('Object Repository/Jubelio_InReview/div_2 Man'))

WebUI.setText(findTestObject('Object Repository/Jubelio_InReview/input_brand'), 'Rintik sendu')

WebUI.setText(findTestObject('Object Repository/Jubelio_InReview/input_sku'), '001')

WebUI.setText(findTestObject('Object Repository/Jubelio_InReview/input_barcode'), '12345')

WebUI.click(findTestObject('Object Repository/Jubelio_InReview/div_public'))

WebUI.click(findTestObject('Object Repository/Jubelio_InReview/pilih_gambar'))

WebUI.click(findTestObject('Object Repository/Jubelio_InReview/pilih_gambar'))

WebUI.setText(findTestObject('Object Repository/Jubelio_InReview/input_pilih'), '150000')

WebUI.click(findTestObject('Object Repository/Jubelio_InReview/div_berat))

WebUI.setText(findTestObject('Object Repository/Jubelio_InReview/input_pilih'), '5')

WebUI.click(findTestObject('Object Repository/Jubelio_InReview/simpan'))

WebUI.setText(findTestObject('Object Repository/Jubelio_InReview/review'), 'Naruto')

WebUI.click(findTestObject('Object Repository/Jubelio_InReview/span'))

