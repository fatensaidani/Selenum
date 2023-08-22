package UseCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOuver {

	public static void main(String[] args) {
		//Chemain chrome
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		
		//Ouvrir nav
		WebDriver driver = new ChromeDriver();
		
		//maxim nav
		driver.manage().window().maximize();
		
		//url
		driver.get("https://demoqa.com/menu");
		
		//déclaration element
		WebElement menu;
		
		//identif element
		menu=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		
		//action
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		
		
		
		
		

	}

}
