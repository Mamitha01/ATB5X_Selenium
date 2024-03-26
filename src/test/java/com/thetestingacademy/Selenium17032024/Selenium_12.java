package com.thetestingacademy.Selenium17032024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium_12 {
    //Linktext and Partial text


    @Test(groups = "QA")
    @Description("Verify the current URL ,title of VWO app")

    public void testVWOLogin() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");

       // WebElement anchor_tag = driver.findElement(By.linkText("Start a free trial")); //--> LinkText
        WebElement anchor_tag = driver.findElement(By.partialLinkText("Start a free ")); //---> PartialLinktext


        System.out.println(anchor_tag.getAttribute("href"));
        anchor_tag.click();

        driver.quit();


    }
}
