package UseCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Liste {

	public static void main(String[] args) {
		//chemain webdriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		
		//Ouvrir chrome
		WebDriver driver = new ChromeDriver();
		
		//maxim
		driver.manage().window().maximize();
		
		//accès url
		driver.get("https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//déclaration element
		WebElement liste;
		
		//identifier element
		liste=driver.findElement(By.id("oldSelectMenu"));
		
		//action
		Select select = new Select(liste);
		select.selectByValue("7");
		System.out.println("test ok");		
		

	}

}
