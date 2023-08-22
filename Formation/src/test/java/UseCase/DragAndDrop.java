package UseCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		//Déclaration chemain driver
		System.setProperty("webd.chrome.driver", "src/test/ressource/chromedriver.exe");
		
		//Ouvrir chrome
		WebDriver driver = new ChromeDriver();
		
		//Maximiser fenetre
		driver.manage().window().maximize();
		
		//Accès à l'url
		driver.get("https://demoqa.com/droppable");
		
		//Sleep
		Thread.sleep(5000);
		
		//Déclaration éléments
		WebElement drag,drop;
		
		//identifier elements
		drag = driver.findElement(By.id("draggable"));
		drop = driver.findElement(By.id("droppable"));
		
		//Action
		Actions action = new Actions(driver);
		action.dragAndDrop(drag,drop).perform();
		
		
		//résultat à vérifier
		
		WebElement message;
		
		message = driver.findElement(By.id("droppable"));
		
		String texte;
	
		texte=message.getText();
		
		
		Assert.assertEquals("Dropped!", texte);
		
		System.out.println("Test ok");
	
	}

}
