package UseCase;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;



public class Exercice {

	public static void main(String[] args) throws InterruptedException {
		//chemin chrome drive
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		
		//Ouverture drive
		WebDriver driver = new ChromeDriver();
		
		//Maximiser la fenetre
		driver.manage().window().maximize();
		
		//Accéder à l'url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//sleep
		Thread.sleep(5000);
		
		//Déclaration des éléments
		WebElement login, pw, bouton;
		
		//identifier les élément
		login=driver.findElement(By.className("username"));
		pw=driver.findElement(By.className("password"));
		bouton=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		
		//Actions
		
		login.sendKeys("Admin");
		pw.sendKeys("admin123");
		bouton.click();
		
		//Sleep
		Thread.sleep(5000);
		
		//vérification des résultats
		
		WebElement profil;
		profil=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		String text;
		text=profil.getText();
		
		Assert.assertEquals("Paul Collings", text);
		System.out.println("test ok");
		
				

	}

}
