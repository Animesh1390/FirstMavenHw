// org.example is the package in java to store the classes
package org.example;


import org.openqa.selenium.By;            // Package import for selenium
import org.openqa.selenium.WebDriver;     // import package of selenium web-driver
import org.openqa.selenium.chrome.ChromeDriver; //Import package of chrome driver

import java.text.SimpleDateFormat; // import java package Simple date format

public class BasePage_02  //Java class
{

    // Import selenium Webdriver Interface using maven dependency to perform automation task.
    protected static WebDriver driver;
   // main method to run the program
    public static void main(String[] args)
    {
        //System.setProperty is to set the property of the system which is indicated by key
        //"src/test/java/Driver/chromedriver.exe"    is key for Google Chrome.
        System.setProperty("webdriver.chrome.driver", "src/test/java/Driver/chromedriver.exe");

        //object created for Chrome Driver
        driver =  new ChromeDriver();

        //time stamp method to print the time formet
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        System.out.println(timeStamp);

        // for maximize screen
        driver.manage().window().maximize();

        // driver.get command is used for to open an Url and it will wait till whole page gets loaded
        driver.get("https://demo.nopcommerce.com/");

        // driver.findelement command is used for uniquely identify a web element with in the webpage

        driver.findElement(By.className("ico-register")).click();

        // driver.findelement command is used for uniquely identify a web element with in the webpage by id , by class name , by xpath

        driver.findElement(By.id("FirstName")).sendKeys("Animesh");
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        driver.findElement(By.id("Email")).sendKeys("animesh1390" + timeStamp+ "@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Animesh1234");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Animesh1234");
        driver.findElement(By.id("register-button")).click();

        //Local variable regMsg introduced to store the find element through .gettext command

        String regMsg = driver.findElement((By.className("result"))).getText();

        System.out.println();// for better space in console

        // to print out result in console though stored variable
        System.out.println(regMsg);

        // to close the current window on which program is running
        driver.close();


    }

}
