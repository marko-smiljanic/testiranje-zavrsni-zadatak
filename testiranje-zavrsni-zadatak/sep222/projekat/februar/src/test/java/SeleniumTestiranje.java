/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 *
 * @author Marko
 */
public class SeleniumTestiranje {
    
    @Test
    public void testiranjeRadSaKnjigama(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Marko/Desktop/FAKS 3/1. TESTIRANJE SOFTVERA/Vežbe/chromedriver.exe");
        // Instanciranje WebDriver-a
        WebDriver driver = new ChromeDriver();             
        
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Navigacija na stranicu
        driver.get("file:///C:\\Users\\Marko\\Desktop\\sep222\\zadatak4.html");
        
        WebElement forma = driver.findElements(By.tagName("form")).get(1);
        
        
        WebElement inputISBN = driver.findElements(By.tagName("form")).get(1);
        WebElement inputNaslov = driver.findElements(By.tagName("form")).get(2);
        WebElement inputAutor = driver.findElements(By.tagName("form")).get(3);
        WebElement inputCena = driver.findElements(By.tagName("form")).get(4);
        
        inputISBN.sendKeys("01423124");
        inputNaslov.sendKeys("Neki naslov");
        inputAutor.sendKeys("Neki autor");
        inputCena.sendKeys("2200");
        
        
        List<WebElement> prethodniRedoviIzTabele = driver.findElements(By.tagName("tr"));
        int brojPrethodnihRedova = prethodniRedoviIzTabele.size();
        
        WebElement dugmeDodaj = driver.findElements(By.tagName("button")).get(1);
        dugmeDodaj.click();
        
        List<WebElement> noviRedoviIzTabele = driver.findElements(By.tagName("tr"));
        int brojNovihRedova = prethodniRedoviIzTabele.size();
        
        assertEquals(String.valueOf(brojPrethodnihRedova + 1), String.valueOf(brojNovihRedova));   //da li je broj redova uvecan za 1
        //da li su isti podaci u tabeli
        WebElement poslednjiRedIzTabele = noviRedoviIzTabele.get(noviRedoviIzTabele.size() - 1);  //dohvatam poslednji red iz tabele
        
        //ne znam da dohvatim kolone da bih proverio njihov value sa vrednostima koje sam ubacio u formu.
        //ostalo ne stizem ni da pokusam
                
        
        driver.quit();
        
    }
    
    
    
    
}
