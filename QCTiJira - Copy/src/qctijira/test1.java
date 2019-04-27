/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qctijira;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author HAGRAWA
 */
public class test1 {    
    public static void main1() throws InterruptedException{
        
        String path1 = "C:\\Users\\hagrawa\\Documents\\NetBeansProjects\\QCTiJira\\jar_files\\chromedriver.exe";
        String path = "";
        
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.get("https://jiraaio:8443/secure/Dashboard.jspa");
        
        driver.findElement(By.xpath("//label[contains(text(), 'Fix Version/s')]/following::textarea[@id='fixVersions-textarea']")).sendKeys("unassigned");
       // driver.findElement(By.xpath("//input[@type='submit' and @id='create-issue-submit']")).click();
    }   
}