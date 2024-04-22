package OrangeHRMLOGIN;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Loginfunctionality {
     
	WebDriver driver = new ChromeDriver();
     void Login() throws InterruptedException, IOException  {
    	 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       Thread.sleep(2000);
           driver.manage().window().maximize();
	    	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");	    	
		    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");  
		    Thread.sleep(2000);
		    
		    
		    TakesScreenshot ts = (TakesScreenshot)driver;
		    File src = ts.getScreenshotAs(OutputType.FILE);
		    File file = new File("E:\\screenshot.png");
		    FileUtils.copyFile(src, file);
		    System.out.println("Screenshot1 is captured");
		    
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    Thread.sleep(3000);
		    TakesScreenshot tk = (TakesScreenshot)driver;
		    File srcs = tk.getScreenshotAs(OutputType.FILE);
		    File files = new File("E:\\screenshot1.png");
		    FileUtils.copyFile(srcs, files);
		    System.out.println("Screenshot2 is captured");
	    	
     }
		    
		    void Buzz() throws IOException, InterruptedException     {
		    	
		    	driver.findElement(By.xpath("//span[normalize-space()='Buzz']")).click();
		    	Thread.sleep(2000);

			    TakesScreenshot tn = (TakesScreenshot)driver;
			    File srcss = tn.getScreenshotAs(OutputType.FILE);
			    File filess = new File("E:\\screenshot3.png");
			    FileUtils.copyFile(srcss, filess);
			    System.out.println("Screenshot3 is captured");
			    
			    
			    
			    WebElement textarea= driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
				textarea.sendKeys("Neha");
				Thread.sleep(2000);
				
				WebElement post= driver.findElement(By.xpath("//button[@type='submit']"));
				post.click();
				Thread.sleep(2000);			
				
				TakesScreenshot tssn = (TakesScreenshot)driver;
			    File srccs = tssn.getScreenshotAs(OutputType.FILE);
			    File filees = new File("E:\\screenshot4.png");
			    FileUtils.copyFile(srccs, filees);
			    System.out.println("Screenshot4 is captured");
			    
			    
		    	
		    	
		    	
		    	
		    }
		     
		    
     
     
}
	 