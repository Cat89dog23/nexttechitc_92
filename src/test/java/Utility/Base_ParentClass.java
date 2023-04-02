package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//constructor and Base(parent) class setup
public class Base_ParentClass {
	
public static Properties MetaProperties;
public static WebDriver driver;

public Base_ParentClass () {
	
try {
	FileInputStream filse = new FileInputStream (System.getProperty("user.dir") + "\\src\\test\\java\\com\\NextTechMeta\\config\\MetaConfig.Properties" );
	
	MetaProperties = new Properties();
	
	MetaProperties.load(filse);
} catch (FileNotFoundException e) {
	
	// TODO Auto-generated catch block

	e.printStackTrace();
} catch (IOException e) {
	
	// TODO Auto-generated catch block
	
	e.printStackTrace();
   }	

 }


public void metaBroswerinit() {
	
String MetaBrowser = MetaProperties.getProperty("Browser");	

if(MetaBrowser.equalsIgnoreCase("Chrome")) {
	
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\WebDriver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Test_Data.implicitlywait));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Test_Data.pageloadwait));
	
}

else if (MetaBrowser.equalsIgnoreCase("FireFox")) {
	
    }
  }


public static void metaLaunchURL (String URL) {
driver.get(MetaProperties.getProperty("URL1"));	

}


}
