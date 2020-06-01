package com.primus.firstPrimus.Junit.Selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;
import com.primus.firstPrimus.PrimusConfig.TestFixtures.JunitSelenium;

public class PrimusJunitSelenium
{
    @Test
    public void firstPrimusJunitSeleniumTest()
    {
        WebDriver driver = new HtmlUnitDriver();
        driver.get(JunitSelenium.HOST);
        assertTrue(driver.getTitle().startsWith(JunitSelenium.TITLE));
        driver.close();
    }
}
