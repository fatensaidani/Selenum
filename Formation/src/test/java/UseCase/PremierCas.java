package UseCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PremierCas {

	public static void main(String[] args) {
		//Chemain chrome driver
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		
		//Ouverture chrome
		WebDriver driver = new ChromeDriver();
		
		//Maximiser la fenetre 
		driver.manage().window().maximize();
		
		//Accéder à l'url
		driver.get("https://www.proservices-training-company.com/");
				

	}

}
