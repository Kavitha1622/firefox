package firefox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firefox 
{

	public static void main(String[] args)
	{
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.mozilla.org/en-US/firefox/new/");
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.close();
	}

}
