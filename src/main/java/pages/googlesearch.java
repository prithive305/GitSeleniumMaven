package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class googlesearch {
WebDriver driver;
	public  googlesearch(WebDriver driver)
	{
		this.driver=driver;
	}
	private By searchBox =By.name("q");
	
	public void EnterKeyword(String keywod) {
		driver.findElement(searchBox).sendKeys("testing");
		driver.findElement(searchBox).sendKeys(Keys.ENTER);
	}
	
			}
