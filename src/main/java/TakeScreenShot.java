import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot {
    static WebDriver webDriver;

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        webDriver = new ChromeDriver();
        webDriver.get("https://vnexpress.net/");
        takeScreenShot("vnexpress");
    }

    public static void takeScreenShot(String fileName) throws IOException {
        File file = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("photo/"+fileName+".jpg"));
    }
}
