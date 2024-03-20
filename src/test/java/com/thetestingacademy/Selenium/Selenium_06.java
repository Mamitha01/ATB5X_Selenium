package com.thetestingacademy.Selenium;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium_06 {

    public static void main(String[] args) {

        // page loading
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);

        //to set proxy
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("104.24.206.207:13335");
        edgeOptions.setCapability("proxy",proxy);

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        driver.quit();




    }
}
