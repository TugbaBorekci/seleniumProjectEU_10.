package Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthNavigation {
    public static void main(String[] args) throws InterruptedException {
        //TC #3: Back and forth navigation
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2- Go to: https://google.com
        driver.get("https://google.com");
        WebElement agreeButton = driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div"));
        agreeButton.click();

        //3- Click to Gmail from top right.
        WebElement clickGmailButton = driver.findElement(By.linkText("Gmail"));
        clickGmailButton.click();



        //4- Verify title contains:
        //Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Gmail Title verification PASSED!");
        }else {
            System.out.println("Gmail Title verification FAILED!!!");
        }

        //5- Go back to Google by using the .back();
        driver.navigate().back();



        //6- Verify title equals:
        //Expected: Google

        String expectedTitle2 = "Google";
        String actualTitle2 = driver.getTitle();

        if (actualTitle2.equals(expectedTitle2)){
            System.out.println("Google Title verification PASSED!");
        }else {
            System.out.println("Google Title verification FAILED!!!");
        }
        driver.close();
    }
}
