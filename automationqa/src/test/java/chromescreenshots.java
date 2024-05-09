import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class chromescreenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		driver.findElement(By.linkText("https://www.getcalley.com/")).click();
		
		File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f1, new File("C:\\Chrome screenshots\\screenshot1.png"));
		driver.navigate().back();

		driver.findElement(By.linkText("https://www.getcalley.com/calley-call-from-browser/")).click();
		
		File f2= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f2, new File("C:\\Chrome screenshots\\screenshot2.png"));
		driver.navigate().back();
		
		driver.findElement(By.linkText("https://www.getcalley.com/calley-pro-features/")).click();
		
		File f3= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f3,new File("C:\\Chrome screenshots\\screenshot3.png"));
		driver.navigate().back();
		
		driver.findElement(By.linkText("https://www.getcalley.com/best-auto-dialer-app/")).click();
		
		File f4= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f4, new File("C:\\Chrome screenshots\\screenshot4.png"));
		driver.navigate().back();
		
		driver.findElement(By.linkText("https://www.getcalley.com/how-calley-auto-dialer-app-works/")).click();
		
		File f5= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f5, new File("C:\\Chrome screenshots\\screenshot5.png"));


	}

}
