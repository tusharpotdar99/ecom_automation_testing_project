package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class email_login {

    public String url = "https://mail.google.com/mail/u/0/#inbox";

    public String mail_url= "https://accounts.google.com";
    public String gmail_url= "https://mail.google.com";

    @Test
    public void EmailFirstTest(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(gmail_url);



    }

}
