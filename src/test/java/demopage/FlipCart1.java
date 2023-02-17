package demopage;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public  class FlipCart1 {

	public static void main(String[] args) {
		
		
	    WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/client");
	
    		
		driver.findElement(By.id("userEmail")).sendKeys("kalyanmusali9642@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Kalyan7095@");
		driver.findElement(By.id("login")).click();
		
		
		
	//findout all elements in a page
		List<WebElement> products= driver.findElements(By.cssSelector(".mb-3"));
		
   //select one product and dispaly that name also in cansole 
	     WebElement prod=products.stream().filter(product->
		product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
	
	//click add to cart
	     prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	}

}
