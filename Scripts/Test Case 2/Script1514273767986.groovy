import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.newtours.demoaut.com/mercuryregister.php')

WebUI.delay(7)

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('Object Repository/Script Mode/Page_Register Mercury Tours/Page_Register Mercury Tours/input_firstName'), 
    'Tanaya ')

WebUI.sendKeys(findTestObject('Object Repository/Script Mode/Page_Register Mercury Tours/Page_Register Mercury Tours/input_lastName'), 
    'Jena')

WebUI.sendKeys(findTestObject('Object Repository/Script Mode/Page_Register Mercury Tours/Page_Register Mercury Tours/input_phone'), 
    '9778673546')

WebUI.sendKeys(findTestObject('Object Repository/Script Mode/Page_Register Mercury Tours/Page_Register Mercury Tours/input_userName'), 
    't@gmail.com')

WebUI.sendKeys(findTestObject('Object Repository/Script Mode/Page_Register Mercury Tours/Page_Register Mercury Tours/input_address1'), 
    'Hyderabad')

WebUI.sendKeys(findTestObject('Object Repository/Script Mode/Page_Register Mercury Tours/Page_Register Mercury Tours/input_address2'), 
    'Madhapur')

WebUI.sendKeys(findTestObject('Object Repository/Script Mode/Page_Register Mercury Tours/Page_Register Mercury Tours/input_city'), 
    'HYD')

WebUI.sendKeys(findTestObject('Object Repository/Script Mode/Page_Register Mercury Tours/Page_Register Mercury Tours/input_state'), 
    'AP')

WebUI.sendKeys(findTestObject('Object Repository/Script Mode/Page_Register Mercury Tours/Page_Register Mercury Tours/input_postalCode'), 
    '761210')

WebUI.selectOptionByValue(findTestObject('Object Repository/Script Mode/Page_Register Mercury Tours/Page_Register Mercury Tours/select_country'), 
    '92', false)

WebUI.sendKeys(findTestObject('Object Repository/Script Mode/Page_Register Mercury Tours/Page_Register Mercury Tours/input_userName'), 
    'Khumbu')

WebUI.sendKeys(findTestObject('Object Repository/Script Mode/Page_Register Mercury Tours/Page_Register Mercury Tours/input_password'), 
    '123456987')

WebUI.sendKeys(findTestObject('Object Repository/Script Mode/Page_Register Mercury Tours/Page_Register Mercury Tours/input_confirmPassword'), 
    '123456987')

WebUI.submit(findTestObject('Object Repository/Script Mode/Page_Register Mercury Tours/Page_Register Mercury Tours/Page_Register Mercury Tours/input_register'))

WebUI.acceptAlert()

WebUI.callTestCase(findTestCase('Rec-Verify the element'), [:], FailureHandling.STOP_ON_FAILURE)

