package com.thetestingacademy.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Selenium_02 {

public void testmethod(){


    WebDriver driver = new EdgeDriver();
    WebDriver driver1 = new ChromeDriver();
    WebDriver driver2 = new FirefoxDriver();
    WebDriver driver3 = new InternetExplorerDriver();
    WebDriver driver4 = new SafariDriver();


}
}
