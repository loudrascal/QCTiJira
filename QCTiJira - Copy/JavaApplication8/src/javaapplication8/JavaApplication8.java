/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.applet.Main;

/**
 *
 * @author HAGRAWA
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public void main1() throws Exception {
        
        InputStream is = getClass().getResourceAsStream("chromedriver.exe");
        File exeFile = new File((System.getProperty("user.dir")+"driver.exe").toString());
        FileOutputStream fos = new FileOutputStream(exeFile);
        byte bytes[] = new byte[1000];
        int k = 0;
        while((k = is.read(bytes)) != -1){
            fos.write(bytes, 0, k);
        }
        is.close();
         fos.close();
        
        System.setProperty("webdriver.chrome.driver", exeFile.getPath());
        WebDriver driver = new ChromeDriver();
        driver.get("https://jiraaio:8443/secure/Dashboard.jspa");
        driver.close();
        String command = "taskkill /F /IM "+exeFile.getName();
        System.out.println(command);
        Runtime.getRuntime().exec(command);
        Thread.sleep(2000);
        Files.deleteIfExists(Paths.get(exeFile.getPath()));

        
    }
    
    public static void main(String args[]) throws Exception{
        JavaApplication8 jv8 = new JavaApplication8();
        jv8.main1();
    }
    
}
