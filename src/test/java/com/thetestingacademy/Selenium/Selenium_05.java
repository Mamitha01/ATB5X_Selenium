package com.thetestingacademy.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium_05 {
    public static void main(String[] args) {

        //1. headless
        //2.start max
        //3. window size
        //4. add extensions


        EdgeOptions edgeOptions = new EdgeOptions();
        //edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--window-size=800,600");
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        driver.quit();
    }

}
