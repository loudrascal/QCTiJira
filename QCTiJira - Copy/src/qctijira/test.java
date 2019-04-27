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
public class test {    
    public static void main(String s[]) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hagrawa\\Documents\\NetBeansProjects\\QCTiJira\\jar_files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jiraaio:8443/secure/Dashboard.jspa");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("os_username")).sendKeys("hagrawa");
        driver.findElement(By.name("os_password")).sendKeys("Chotu_penguin");
        driver.findElement(By.name("os_password")).submit();
        driver.findElement(By.xpath("//a[@id='create_link']")).click();
        driver.findElement(By.xpath("//input[@type='text' and @id='issuetype-field' ]")).sendKeys("Defect");
        driver.findElement(By.xpath("//input[@type='text' and @id='issuetype-field' ]")).sendKeys(Keys.TAB);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='summary']")).sendKeys("AIM | 19.1 | AMD_11832 | GSM | Denali UAT3 | Outputs are not getting created and CDR is not going to extract/suspend");
     //   driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("We have processed a CompositInTransit CDR with below details");
         driver.findElement(By.xpath("//input[@id='summary']")).sendKeys(Keys.TAB);
         
        Select temp = new Select(driver.findElement(By.xpath("//label[contains(text(),'Team')]/following-sibling::Select")));
        temp.selectByVisibleText("Dev");
        driver.findElement(By.xpath("//input[@type='text' and @id='priority-field' ]")).sendKeys("Medium");
        driver.findElement(By.xpath("//input[@type='text' and @id='priority-field' ]")).sendKeys(Keys.TAB);
        Thread.sleep(3000);
        temp = new Select(driver.findElement(By.xpath("//label[contains(text(),'Severity')]/following-sibling::Select")));
        temp.selectByVisibleText("M");
        driver.findElement(By.xpath("//input[@type='text' and @id='assignee-field']")).sendKeys("hagrawa");
        driver.findElement(By.xpath("//input[@type='text' and @id='assignee-field']")).sendKeys(Keys.TAB);
        temp = new Select(driver.findElement(By.xpath("//select[@id='issuelinks-linktype']")));
        temp.selectByVisibleText("blocks");
        driver.findElement(By.xpath("//textarea[@id = 'issuelinks-issues-textarea']")).sendKeys("");
        driver.findElement(By.xpath("//textarea[@id = 'issuelinks-issues-textarea']")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//textarea[@id = 'components-textarea']")).sendKeys("NA");
        driver.findElement(By.xpath("//textarea[@id = 'components-textarea']")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//input[@type = 'text' and @id='timetracking_originalestimate']")).sendKeys("2w");
        driver.findElement(By.xpath("//input[@type = 'text' and @id='timetracking_remainingestimate']")).sendKeys("1w");
        driver.findElement(By.xpath("//textarea[@id='labels-textarea']")).sendKeys("");
        driver.findElement(By.xpath("//textarea[@id='labels-textarea']")).sendKeys("Outputs are not getting created and CDR is not going to extract/suspend");
        driver.findElement(By.xpath("//label[contains(text(),'Target Date')]/following-sibling::input[@type='text']")).sendKeys("24/Apr/19");
        driver.findElement(By.xpath("//label[contains(text(),'Submitted By')]/following::input[1]")).sendKeys("hagrawa");
        temp = new Select(driver.findElement(By.xpath("//label[contains(text(),'Ready for Dev')]/following-sibling::Select")));
        temp.selectByVisibleText("Yes");
        temp = new Select(driver.findElement(By.xpath("//label[contains(text(),'Post DCUT Activity')]/following-sibling::Select")));
        temp.selectByVisibleText("Yes");
        driver.findElement(By.xpath("//label[contains(text(),'Dc Link for IA')]/following-sibling::input[@type='text']")).sendKeys("Outputs are not getting created and CDR is not going to extract/suspend");
        temp = new Select(driver.findElement(By.xpath("//label[contains(text(),'Expedite')]/following-sibling::select")));
        temp.selectByVisibleText("None");
        temp = new Select(driver.findElement(By.xpath("//label[contains(text(),'DD Reviewed by Expert')]/following-sibling::select")));
        temp.selectByVisibleText("None");
        temp = new Select(driver.findElement(By.xpath("//label[contains(text(),'Affects Documentation')]/following-sibling::select")));
        temp.selectByVisibleText("None");       
        temp = new Select(driver.findElement(By.xpath("//label[contains(text(),'Blocked Reason')]/following-sibling::select")));
        temp.selectByVisibleText("None");   
        temp = new Select(driver.findElement(By.xpath("//label[contains(text(),'resolution')]/following-sibling::select")));
        temp.selectByVisibleText("None");
        driver.findElement(By.xpath("//label[contains(text(), 'Fix Version/s')]/following::textarea[@id='fixVersions-textarea']")).sendKeys("unassigned");
       // driver.findElement(By.xpath("//input[@type='submit' and @id='create-issue-submit']")).click();
        
        String path = System.getProperty("user.dir");
        System.out.println("path");
    }   
}