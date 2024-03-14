package com.thetestingacademy;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TC_02 {

    @Test
    @Description("Verify the thetestingacademy website")
    public void vwologin(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://thetestingacademy.com");
        System.out.println(driver.getTitle());
    }
}
