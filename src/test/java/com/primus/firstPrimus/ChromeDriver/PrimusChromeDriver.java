package com.primus.firstPrimus.ChromeDriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

import com.primus.firstPrimus.PrimusConfig.TestFixtures.ChromeDriver;

public class PrimusChromeDriver
{
    public void startChrome () throws Exception
    {
        System.setProperty("webdriver.chrome.driver", ChromeDriver.CHROMEDRIVER_PATH);
        WebDriver driver = new RemoteWebDriver(new URL(ChromeDriver.CHROMEDRIVER_HOST), DesiredCapabilities.chrome());
        driver.get(ChromeDriver.HOST);
        driver.close();
        driver.quit();
    }
}