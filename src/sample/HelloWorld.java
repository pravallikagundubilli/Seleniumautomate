package sample;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver.exe");

        WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }
}
