package UseCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Recherche {

	public static void main(String[] args) {
		//chemain webdriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		
		//Ouvrir chrome
		WebDriver driver = new ChromeDriver();
		
		//maxim
		driver.manage().window().maximize();
		
		//accès url
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//déclaration element
		WebElement barre;
		
		//identifier element
		barre=driver.findElement(By.name("q"));
		
		//action
		barre.sendKeys("Tunisie");
		barre.sendKeys(Keys.ENTER);
		
		//Vérification
		WebElement texte;
		String texte;
		
		

	}

}
