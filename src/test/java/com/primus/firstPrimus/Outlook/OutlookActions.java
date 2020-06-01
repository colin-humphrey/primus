package com.primus.firstPrimus.Outlook;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.primus.firstPrimus.PrimusConfig.TestFixtures.Outlook;
import com.primus.firstPrimus.PrimusConfig.TestFixtures.ChromeDriver;

public class OutlookActions
{

    public static WebDriver webdriver;

    public WebDriver ThisWebDriver () throws Exception
    {
        System.setProperty("webdriver.chrome.driver", ChromeDriver.CHROMEDRIVER_PATH);
        webdriver = new RemoteWebDriver(new URL(ChromeDriver.CHROMEDRIVER_HOST), DesiredCapabilities.chrome());
        webdriver.manage().window().setSize(new Dimension(1024,768));
        webdriver.navigate().to(Outlook.HOST);
        return webdriver;
    }

    public void homePage ()  throws Exception
    {
        ThisWebDriver();
        webdriver.getTitle().startsWith("Sign In");
    }

    public void logIn ()
    {
        webdriver.findElement(By.cssSelector(Outlook.USERNAME_FIELD)).sendKeys(Outlook.OUTLOOK_EMAIL);
        webdriver.findElement(By.cssSelector(Outlook.SIGN_IN_BTN_NEXT)).click();
        webdriver.findElement(By.cssSelector(Outlook.PASSWORD_FIELD)).sendKeys(Outlook.OUTLOOK_PASSWORD);
        webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webdriver.findElement(By.cssSelector(Outlook.SIGN_IN_BTN_SIGN_IN)).click();
    }


    public void clickMeMenu()
    {
        WebDriverWait waitForMenuButton = new WebDriverWait(webdriver, 10);
        WebElement menuButton = waitForMenuButton.until(
        ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Outlook.ME_MENU)));
        menuButton.click();
    }

    public void logOut ()
    {
        WebDriverWait waitForSignOutButton = new WebDriverWait(webdriver, 2);
        WebElement signOutButton = waitForSignOutButton.until(
        ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Outlook.SIGN_OUT_BTN)));
        signOutButton.click();
    }

    public void backHome() throws Exception
    {
        webdriver.getTitle().startsWith("MSN UK Home");
        webdriver.quit();
    }
}