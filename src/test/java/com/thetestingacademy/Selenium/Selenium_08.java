package com.thetestingacademy.Selenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium_08 {
    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();// will close entire window  -- session is invalid n error : session id is not null
        //driver.close() --will close only the tab not window -- session is valid n error: session id is null
    }
}
