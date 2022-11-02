package org.example;    // org.example is the package in java to store the classes

import org.openqa.selenium.By;          // Package import for selenium
import org.openqa.selenium.WebDriver;   // import package of selenium web-driver
import org.openqa.selenium.chrome.ChromeDriver;  //Import package of chrome driver

public class HomePage_Catagories
{
    // Import selenium Webdriver Interface using maven dependency to perform automation task.
    protected static WebDriver driver;

    public static void main(String[] args)
    {

        //System.setProperty is to set the property of the system which is indicated by key
        //"src/test/java/Driver/chromedriver.exe"    is key for Google Chrome.

        System.setProperty("webdriver.chrome.driver", "src/test/java/Driver/chromedriver.exe");
        driver = new ChromeDriver();

        // for maximize screen for better view
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");


        // driver.findelement command is used for uniquely identify a web element with in the webpage by id , by class name , by xpat

        String regMsg = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]")).getText();

        String regMsg1= driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/electronics\"]")).getText();
        String regMsg3 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/apparel\"]")).getText();
        String regMsg4 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/digital-downloads\"]")).getText();
        String regMsg5 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/books\"]")).getText();
        String regMsg6= driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/jewelry\"]")).getText();
        String regMsg7= driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/gift-cards\"]")).getText();

        System.out.println();  // for better space in console

        //Local variable regMsg introduced to store the find element through .gettext command

        System.out.println(regMsg + "   " + regMsg1 + "   "+regMsg3 + "   "+ regMsg4 +"   " + regMsg5 + "   " + regMsg6 + "   " + regMsg7);
        System.out.println();// for better space in console

        // to close the current window on which program is running

        driver.close();





    }
}
