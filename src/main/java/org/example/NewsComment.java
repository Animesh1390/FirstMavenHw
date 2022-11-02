package org.example;   // org.example is the package in java to store the classes


import org.openqa.selenium.By;                    // Package import for selenium
import org.openqa.selenium.WebDriver;             // import package of selenium web-driver
import org.openqa.selenium.chrome.ChromeDriver;   //Import package of chrome driver


public class NewsComment
{
    // Import selenium Webdriver Interface using maven dependency to perform automation task.
    protected static WebDriver driver;

    public static void main(String[] args)
    {
        //System.setProperty is to set the property of the system which is indicated by key
        //"src/test/java/Driver/chromedriver.exe"    is key for Google Chrome.

        System.setProperty("webdriver.chrome.driver", "src/test/java/Driver/chromedriver.exe");
        driver = new ChromeDriver();

        // for maximize screen

        driver.manage().window().maximize();

        // driver.get command is used for to open an Url and it will wait till whole page gets loaded
        driver.get("https://demo.nopcommerce.com/");

        // driver.findelement command is used for uniquely identify a web element with in the webpage by id , by class name , by xpath

        driver.findElement(By.xpath("//div[@class=\"news-item\"]/div[3]//a[@href=\"/nopcommerce-new-release\"]")).click();
        driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("Hello Nop Commerce");
        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("Nice Website");
        driver.findElement(By.name("add-comment")).click();

        //Local variable regMsg introduced to store the find element through .gettext command

        String regMsg = driver.findElement(By.xpath("//div[@class=\"result\"]")).getText();
        System.out.println();  //  for better space in console

        // print out
        System.out.println(regMsg);

        // to close the current window on which program is running
        driver.close();



    }

}
