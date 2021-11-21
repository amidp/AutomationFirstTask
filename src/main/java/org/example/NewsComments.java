package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NewsComments {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/java/drivers/chromedriver_win32/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        //Type the URL
        driver.get("https://demo.nopcommerce.com/");
        //click on News
        driver.findElement(By.linkText("News")).click();
        //click on Details
        driver.findElement(By.linkText("DETAILS")).click();
        //Type title and comment
        driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("New");
        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys(" Comment");
        driver.findElement(By.xpath("//div[@class='buttons']/button")).click();
        //print message New comment is successfully added
        String actualResult = driver.findElement(By.xpath("//div[@class='notifications']/div")).getText();
        //print comment in console as per requirement
        System.out.println(actualResult);
        //close the window
        driver.close();
    }
}
