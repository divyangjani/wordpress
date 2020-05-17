package Helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wordpress.com.wordpress.Baseclass;

public class Utill extends Baseclass {
	
	
	public static void waittill_visibilityof(WebElement ele)
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}

}
