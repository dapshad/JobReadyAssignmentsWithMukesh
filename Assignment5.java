package Assignment5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println("-----------------------Task 1---------------------------------------");
        String WebUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(WebUrl);

        String url = driver.getCurrentUrl();
        System.out.println("URL is " + url);
        System.out.println("verify url ends with login " + url.endsWith("login"));
        System.out.println("verify url contains demo " + url.contains("demo"));

        String title = driver.getTitle();
        System.out.println("Title is " + title);
        System.out.println("Title contains HRM " + title.contains("HRM"));

        System.out.println("-----------------------Task 2---------------------------------------");

        List<WebElement> tLogo = driver.findElements(By.cssSelector("img[src]"));

        for (WebElement img : tLogo
        ) {
            System.out.println("Is Logo Present " + img.isDisplayed());
            System.out.println("Total number of images " + img.getSize());
            System.out.println("Attribute is " + img.getAttribute("src"));
        }


        System.out.println("-----------------------Task 3---------------------------------------");
        //get xpath of footer and use get method to get the size and then print names of the social media icons with get text


        List<WebElement> icons = driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        int totalSize = icons.size();
        //driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']//following::*")).getSize();
        for (int i = 0; i < totalSize; i++) {
            WebElement s1 = icons.get(i);
            String val = s1.getText();
            System.out.println("Social icons are " + val);
            if (val.contains("https://www.youtube.com/c/OrangeHRMInc")) ;
            break;
        }


        /*System.out.println(icons.get(i));
        System.out.println(icons.size());
        System.out.println(icons.contains("linkedin"));
        System.out.println(icons.contains("facebook"));
        System.out.println(icons.contains("twitter"));
        System.out.println(icons.contains("youtube"));*/


        System.out.println("-----------------------Task 4---------------------------------------");
        //check the href tag if a or what?
      /*  List<WebElement> allSocialIcons = driver.findElements(By.tagName("a"));

        for (WebElement n1:allSocialIcons
             ) {
            System.out.println("Print all Href values of Social Icons "+ n1.getAttribute("href"));
            System.out.println("Print total size of Social Icons "+ n1.getSize());
            System.out.println("Get text of all icons "+ n1.getText());

        }*/

        List<WebElement> linkedUrl = driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[1]"));

        for (WebElement linkedinHref : linkedUrl) {
            System.out.println("All Href Values from Linkedin are " + linkedinHref.getAttribute("href"));
        }
        List<WebElement> fbUrl = driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[2]"));
        for (WebElement fbHref : fbUrl) {
            System.out.println("All Facebook Href values " + fbHref.getAttribute("href"));
        }
        List<WebElement> twitterUrl = driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[3]"));
        for (WebElement tHref : twitterUrl) {
            System.out.println("Twitter Href values " + tHref.getAttribute("href"));
        }
        List<WebElement> youtubeUrl = driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[4]"));
        for (WebElement yHref : youtubeUrl) {
            System.out.println("Youtube Href values " + yHref.getAttribute("href"));
        }

        System.out.println("---Now Storing all Href Values into a Map below--------");

        HashMap<Integer, List<WebElement>> m1 = new HashMap<>();
        m1.put(1, fbUrl);
        m1.put(2, twitterUrl);
        m1.put(3, youtubeUrl);
        m1.put(4, linkedUrl);
        System.out.println("All Href Values now stored in a Map " + m1);


        System.out.println("-----------------------Task 5---------------------------------------");
        //capture all href values and run a for each loop with contains & then break
        List<WebElement> allSocialIcons = driver.findElements(By.tagName("a"));

        for (WebElement n1 : allSocialIcons
        ) {
            System.out.println("Print all Href values of Social Icons " + n1.getAttribute("href"));
            if (n1.getText().contains("https://www.youtube.com/c/OrangeHRMInc")) {
                System.out.println("Found YouTube");
            } else {
                System.out.println("Oops!Sorry!!");
                break;
            }

        }
    }
}
