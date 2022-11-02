// org.example is the package in java to store the classes
package org.example;

import org.openqa.selenium.By;  // Package import for selenium
import org.openqa.selenium.WebDriver;// import package of selenium web-driver
import org.openqa.selenium.chrome.ChromeDriver;//Import package of chrome driver

public class Product

{
    // Import selenium Webdriver Interface using maven dependency to perform automation task.
    protected static WebDriver driver;

    public static void main(String[] args)
    {
        //System.setProperty is to set the property of the system which is indicated by key
        //"src/test/java/Driver/chromedriver.exe"    is key for Google Chrome.

        System.setProperty("webdriver.chrome.driver", "src/test/java/Driver/chromedriver.exe");

        //object created for Chrome Driver
        driver = new ChromeDriver();

        // for maximize screen
        driver.manage().window().maximize();

        // driver.get command is used for to open an Url and it will wait till whole page gets loaded
        driver.get("https://demo.nopcommerce.com/");

        // driver.findelement command is used for uniquely identify a web element with in the webpage by id , by class name , by xpath

        driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]")).click();
        driver.findElement(By.xpath("//h2[@class=\"title\"]//a [@title=\"Show products in category Desktops\"]")).click();
        String regMsg = driver.findElement(By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/build-your-own-computer\"]")).getText();
        // for better space in console
        System.out.println();

        // to print message in console
        System.out.println(regMsg);

        System.out.println();// for better space in console

        // to close the current window on which program is running
        driver.close();
    }
}
