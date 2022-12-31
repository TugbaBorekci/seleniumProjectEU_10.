package Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

    public static void main(String[] args) {
        //TC #1: Yahoo Title Verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");
        WebElement agreeButton = driver.findElement(By.xpath("//*[@id=\"consent-page\"]/div/div/div/form/div[2]/div[2]/button"));
        agreeButton.click();
        //3. Verify title:
        //Expected: Yahoo
        String expectedTitle = "Yahoo";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equalsIgnoreCase(actualTitle)){
            System.out.println("Title is as expected. Verification PASSED!");
        }else {
            System.out.println("Title is NOT as expected. Verification FAILED!!!");
        }


    }
}
