package UseCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class Doubleclic {

	public static void main(String[] args) throws InterruptedException {
		// déclarer le chemain webdrive
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		
		//Ouverture webdriver
		WebDriver driver = new ChromeDriver();
		
		//Maximiser fenetre
		driver.manage().window().maximize();
		
		//Accès à l'url
		driver.get("https://demoqa.com/buttons");
		
		//sleep
		Thread.sleep(10000);
		
		//Déclaration des elemnents
		WebElement bouton;
		WebElement bouton2;
		
		//identifier element
		bouton = driver.findElement(By.id("doubleClickBtn"));
		bouton2 = driver.findElement(By.id("rightClickBtn"));
		
		//Action
		Actions action = new Actions(driver);
		action.doubleClick(bouton).perform();
		action.contextClick(bouton2).perform();
		
		
		//vérification résultat
		
		WebElement message;
		WebElement message2;
		message = driver.findElement(By.id("doubleClickMessage"));
		message2 = driver.findElement(By.id("rightClickMessage"));
		String texte;
		String texte2;
		texte=message.getText();
		texte2=message2.getText();
		
		Assert.assertEquals("You have done a double click", texte);
		Assert.assertEquals("You have done a right click", texte2);
		System.out.println("Test ok");
		
		
		
		
			

	}

}
