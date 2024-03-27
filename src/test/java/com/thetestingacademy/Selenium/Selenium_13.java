package com.thetestingacademy.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium_13 {


    //Print all the anchor tags

    @Test(groups = "QA")
    @Description("Verify the current URL ,title of VWO app")

    public void testVWOLogin() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");

        List<WebElement> all_tags = driver.findElements(By.tagName("a"));


        for (WebElement element : all_tags) {
            System.out.println(element.getText());
        }

        // all_tags.get(0).click();//start trail
        //all_tags.get(1).click();// vwo insights
        // all_tags.size();

        driver.quit();


    }
}
