package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BuildComputer {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/java/drivers/chromedriver_win32/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        //Type the URL
        driver.get("https://demo.nopcommerce.com/");
        //click on Computers category
        driver.findElement(By.linkText("Computers")).click();
        //click on subcategory Desktops
        driver.findElement(By.linkText("Desktops")).click();
        //click on item Build your own Computer
        driver.findElement(By.linkText("Build your own computer")).click();
        //Print Build your own Computer as per requirement
       String actualResult  =  driver.findElement(By.xpath("//div[@class=\"product-name\"]/h1")).getText();
        System.out.println(actualResult);
        //close the URL
        driver.close();
    }
}
