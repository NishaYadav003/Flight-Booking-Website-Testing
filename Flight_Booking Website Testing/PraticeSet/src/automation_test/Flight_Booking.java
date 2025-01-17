package automation_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Flight_Booking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String country = "IN";

		String date = "2";

		WebDriver driver = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys(country);
		Thread.sleep(2000);
		List<WebElement> countries = driver.findElements(By.cssSelector(".ui-corner-all"));

		for (WebElement countrys : countries) {

			if (countrys.getText().equalsIgnoreCase("India")) {

				countrys.click();
				break;

			}

		}

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='GOI']"))
				.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BOM']"))
				.click();

		driver.findElement(By.xpath("//div//tr/td/a[text()='" + date + "']")).click();

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

		for (int i = 0; i < 5; i++) {

			driver.findElement(By.id("hrefIncAdt")).click();

			if (i == 1) {
			
			}

		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		
		driver.quit();

	}

}
