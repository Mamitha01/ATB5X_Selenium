package com.thetestingacademy.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import javax.annotation.Tainted;
import java.io.File;

public class Selenium_03 {
    //To add Adblocker to youtube

    @Test

    public void testmethod1() {


        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addExtensions(new File("C:/Users/Dell/Downloads/AdBlocker.crx"));
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/");

    }
}
