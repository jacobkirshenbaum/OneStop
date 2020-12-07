package com.onestop.onestop;

import com.onestop.onestop.dao.BookmarkRepository;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class ControllersTest {

    private WebDriver driver;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();


    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @Test
    public void testGetAllBookmarksPopulated() {
        driver.get("http://localhost:8080/bookmark/TestUser");
        assertEquals("[{\"id\":7,\"username\":\"TestUser\",\"bookmarkName\":\"TestBookmark\",\"url\":\"www.test.test\"}]", driver.findElement(By.tagName("pre")).getText());
    }

    @Test
    public void testGetAllBookmarksNone() {
        driver.get("http://localhost:8080/bookmark/UserDoesNotExist");
        assertEquals("[]", driver.findElement(By.tagName("pre")).getText());
    }

    @Test
    public void testGetAllUsers() {
        driver.get("http://localhost:8080/users/all");
        assertEquals("[{\"username\":\"TestUser\",\"password\":\"TestPassword\"}]", driver.findElement(By.tagName("pre")).getText());
    }


}
