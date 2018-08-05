package com.thathrowdown.mvn;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public void goToHomepage(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://thathrowdown.com");

    }
}
