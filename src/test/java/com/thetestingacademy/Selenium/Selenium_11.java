package com.thetestingacademy.Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_11 {


    @Test(groups = "QA")
    @Description("Verify the current URL ,title of VWO app")

    public void testVWOLogin() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        WebElement email_InputBox = driver.findElement(By.id("login-username"));
        email_InputBox.sendKeys("admin@admin.com");


        WebElement password_InputBox= driver.findElement(By.name("password"));
        password_InputBox.sendKeys("admin");

        driver.findElement(By.id("js-login-btn")).click();

        try{
            Thread.sleep(3000);

        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        String error_msg_text = error_msg.getText();

        String error_text =error_msg.getAttribute("data-qa");
        System.out.println(error_text);

        Assert.assertEquals(error_msg_text,"Your email, password, IP address or location did not match");

        driver.quit();

    }
}
