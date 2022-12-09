package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = WebDriverManager.chromedriver().create();
        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();
        driver.get("https://www.google.com");
        driver.quit();

    }
}