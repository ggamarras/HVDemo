package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage {
    WebDriver driver = new ChromeDriver();

    public void abrir() {
        driver.get("http://localhost:8080/");
    }

    public void ingresar(String user, String pass) {
        driver.findElement(By.name("user")).sendKeys(user);
        driver.findElement(By.name("pass")).sendKeys(pass);
        driver.findElement(By.xpath("//input[@type='submit' and @value='Ingresar']")).click();

    }

    public void verificarLoginExitoso() {
        boolean ok = driver.getPageSource().contains("Bienvenido,");
        System.out.println(driver.getPageSource());
        assert ok;
    }
}