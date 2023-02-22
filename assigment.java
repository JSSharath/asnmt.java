package initial;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class first {
    public static void main(String[] args) throws InterruptedException{
        //chrome();
        //firefox();
        safari();
    }
       public static void chrome() throws InterruptedException{

               //1.Choose browser:
               ChromeDriver chromeDriver = new ChromeDriver();
               //2. Launch url
               chromeDriver.get("https://letcode.in/test");
               //3. Idetify the element
               WebElement editLinkElement = chromeDriver.findElement(By.xpath("//a[text()='Edit']"));
               //4. Do action on element
               editLinkElement.click();
               Thread.sleep(3000);
               //5. Close the browser:
               chromeDriver.close();

       }

    public static void firefox() throws InterruptedException {
        //1.Choose browser:
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        //2. Launch url
        firefoxDriver.get("https://letcode.in/test");
        //3. Idetify the element
        WebElement editLinkElement = firefoxDriver.findElement(By.xpath("//a[text()='Edit']"));
        //4. Do action on element
        editLinkElement.click();
        Thread.sleep(3000);
        //5. Close the browser:
        firefoxDriver.close();
    }

    public static void safari() throws InterruptedException {
        //1.Choose browser:
        WebDriver safariDriver = new SafariDriver();
        //2. Launch url

        safariDriver.navigate().to("https://letcode.in/test");
        //3. Idetify the element
        WebElement editLinkElement = safariDriver.findElement(By.xpath("//a[text()='Edit']"));
        //4. Do action on element
        editLinkElement.click();
        Thread.sleep(3000);
        //5. Close the browser:
        safariDriver.close();

    }


}
