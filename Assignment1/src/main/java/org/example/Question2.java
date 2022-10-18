package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Question2 {
    public static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();
        driver.get("https://www.google.com/");
    }
}
