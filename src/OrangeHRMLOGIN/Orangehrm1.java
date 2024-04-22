package OrangeHRMLOGIN;

import java.io.IOException;

public class Orangehrm1 {

	public static void main(String[] args) throws InterruptedException, IOException  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vivek\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		Loginfunctionality d= new Loginfunctionality();
		d.Login();
		d.Buzz();

	}

}
