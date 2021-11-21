package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Registration {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/java/drivers/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //type URL
        driver.get("https://demo.nopcommerce.com/");
        //click on Register button
        driver.findElement(By.linkText("Register")).click();
        //type firstname and lastname
        driver.findElement(By.id("FirstName")).sendKeys("Minnie");
        driver.findElement(By.id("LastName")).sendKeys("Mouse");
        //type email address
        driver.findElement(By.id("Email")).sendKeys("xyzabc123@gmail.com");
        //type password
        driver.findElement(By.id("Password")).sendKeys("alpha123");
        //confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("alpha123");
        driver.findElement(By.id("register-button")).click();
        //print registration completed
      String actualResult =  driver.findElement(By.xpath("//div[@class='result']")).getText();
        System.out.println(actualResult);
        driver.close();


    }
}
