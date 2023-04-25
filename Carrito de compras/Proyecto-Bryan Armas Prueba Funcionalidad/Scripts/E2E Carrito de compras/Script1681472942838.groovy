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

WebUI.navigateToUrl('https://www.demoblaze.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/a_Sign up'))

WebUI.setText(findTestObject('Object Repository/Carrito de compras/Page_STORE/input_Username_sign-username'), 'Bryan92Armas')

WebUI.setEncryptedText(findTestObject('Object Repository/Carrito de compras/Page_STORE/input_Password_sign-password'), 'TvN5o04gYbk=')

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/button_Sign up'))

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Carrito de compras/Page_STORE/input_Username_loginusername'), 'Bryan92Armas')

WebUI.setEncryptedText(findTestObject('Object Repository/Carrito de compras/Page_STORE/input_Password_loginpassword'), 'TvN5o04gYbk=')

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/button_Log in'))

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/img_700_card-img-top img-fluid'))

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/a_Home (current)'))

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/a_Laptops'))

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/a_Phones'))

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/a_Monitors'))

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/a_Apple monitor 24'))

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/a_Home (current)'))

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/a_Phones'))

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/a_Iphone 6 32gb'))

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/a_Home (current)'))

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/a_Cart'))

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/a_Delete'))

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/a_Home (current)'))

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/a_Samsung galaxy s6'))

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/a_Cart_1'))

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/button_Place Order'))

WebUI.setText(findTestObject('Object Repository/Carrito de compras/Page_STORE/input_Name_name'), 'Bryan Armas')

WebUI.setText(findTestObject('Object Repository/Carrito de compras/Page_STORE/input_Country_country'), 'Ecuador')

WebUI.setText(findTestObject('Object Repository/Carrito de compras/Page_STORE/input_City_city'), 'Quito')

WebUI.setText(findTestObject('Object Repository/Carrito de compras/Page_STORE/input_Credit card_card'), '12345678910')

WebUI.setText(findTestObject('Object Repository/Carrito de compras/Page_STORE/input_Month_month'), 'Abril')

WebUI.setText(findTestObject('Object Repository/Carrito de compras/Page_STORE/input_Year_year'), '2023')

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/button_Purchase'))

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/button_OK'))

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/a_Cart'))

WebUI.click(findTestObject('Object Repository/Carrito de compras/Page_STORE/a_Log out'))

