package org.example;  // org.example is the package in java to store the classes

import org.openqa.selenium.By;            // Package import for selenium
import org.openqa.selenium.WebDriver;    // import package of selenium web-driver
import org.openqa.selenium.chrome.ChromeDriver;  //Import package of chrome driver

import java.text.SimpleDateFormat;

public class EmailaFriend
{
    // Import selenium Webdriver Interface using maven dependency to perform automation task.
    protected static WebDriver driver;

    //main method to run the program

    public static void main(String[] args)
    {
        //System.setProperty is to set the property of the system which is indicated by key
        //"src/test/java/Driver/chromedriver.exe"    is key for Google Chrome.

        System.setProperty("webdriver.chrome.driver", "src/test/java/Driver/chromedriver.exe");
        driver = new ChromeDriver();

        //time stamp method to print the time formet

        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        System.out.println(timeStamp);

        // for maximize screen for better view

        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/apple-macbook-pro-13-inch\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"email-a-friend\"]")).click();
        driver.findElement(By.id("FriendEmail")).sendKeys("animesh2142"+timeStamp+"@gmail.com");
        driver.findElement(By.id("YourEmailAddress")).sendKeys("animesh1390"+timeStamp+"@gmail.com");
        driver.findElement(By.id("PersonalMessage")).sendKeys("MacBook pro 13 ohh yeah ");
        driver.findElement(By.name("send-email")).click();
        String regMsg = driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]/ul/li")).getText();

        System.out.println(); // for better space

        System.out.println(regMsg); // for Print Message In console

        System.out.println();// for better space in console

        // to close the current window on which program is running

        driver.close();
    }
}
