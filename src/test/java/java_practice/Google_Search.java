package java_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_Search {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		// maximize window
		driver.manage().deleteAllCookies();
		// delete all the cookies
		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");

		WebElement elem = driver.findElement(By.name("q"));
		elem.sendKeys("iphone");
		//WebElement elem=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		//elem.sendKeys("selenium");
		//<ul jsname="bw4e9b" class="G43f7e" role="listbox"><li data-view-type="1" class="sbct" role="presentation" jsaction="click:.CLIENT;mouseover:.CLIENT"><div class="eIPGRd"><div class="sbic sb27"></div><div class="pcTkSc" role="option"><div class="wM6W7d WggQGd"><span>iphone<b> 14</b></span></div><div class="ClJ9Yb" style="display: none;"><span></span></div></div><div class="AQZ9Vd" jsaction="click:.CLIENT;contextmenu:.CLIENT" role="button" aria-label="Delete from history"><style data-iml="1666241417704">.JCHpcb:hover{color:#1a73e8;text-decoration:underline;}.JCHpcb{color:#80868b;font:13px arial,sans-serif;cursor:pointer;align-self:center}@media (hover:hover){.sbai{visibility:hidden}.sbhl .sbai{visibility:inherit}}</style><div class="sbai JCHpcb">Delete</div></div></div></li><li data-view-type="1" class="sbct" role="presentation" jsaction="click:.CLIENT;mouseover:.CLIENT"><div class="eIPGRd"><div class="sbic sb43"></div><div class="pcTkSc" role="option"><div class="wM6W7d"><span>iphone<b> 13</b></span></div><div class="ClJ9Yb" style="display: none;"><span></span></div></div><div class="AQZ9Vd" jsaction="click:.CLIENT;contextmenu:.CLIENT" role="button" aria-label="Delete from history" style="display: none;"><style data-iml="1666241417704">.JCHpcb:hover{color:#1a73e8;text-decoration:underline;}.JCHpcb{color:#80868b;font:13px arial,sans-serif;cursor:pointer;align-self:center}@media (hover:hover){.sbai{visibility:hidden}.sbhl .sbai{visibility:inherit}}</style><div class="sbai JCHpcb">Delete</div></div></div></li><li data-view-type="1" class="sbct" role="presentation" jsaction="click:.CLIENT;mouseover:.CLIENT"><div class="eIPGRd"><div class="sbic sb43"></div><div class="pcTkSc" role="option"><div class="wM6W7d"><span>iphone<b> 14 pro max</b></span></div><div class="ClJ9Yb" style="display: none;"><span></span></div></div><div class="AQZ9Vd" jsaction="click:.CLIENT;contextmenu:.CLIENT" role="button" aria-label="Delete from history" style="display: none;"><style data-iml="1666241417704">.JCHpcb:hover{color:#1a73e8;text-decoration:underline;}.JCHpcb{color:#80868b;font:13px arial,sans-serif;cursor:pointer;align-self:center}@media (hover:hover){.sbai{visibility:hidden}.sbhl .sbai{visibility:inherit}}</style><div class="sbai JCHpcb">Delete</div></div></div></li><li data-view-type="1" class="sbct" role="presentation" jsaction="click:.CLIENT;mouseover:.CLIENT"><div class="eIPGRd"><div class="sbic sb43"></div><div class="pcTkSc" role="option"><div class="wM6W7d"><span>iphone<b> 14 release date</b></span></div><div class="ClJ9Yb" style="display: none;"><span></span></div></div><div class="AQZ9Vd" jsaction="click:.CLIENT;contextmenu:.CLIENT" role="button" aria-label="Delete from history" style="display: none;"><style data-iml="1666241417704">.JCHpcb:hover{color:#1a73e8;text-decoration:underline;}.JCHpcb{color:#80868b;font:13px arial,sans-serif;cursor:pointer;align-self:center}@media (hover:hover){.sbai{visibility:hidden}.sbhl .sbai{visibility:inherit}}</style><div class="sbai JCHpcb">Delete</div></div></div></li><li data-view-type="1" class="sbct" role="presentation" jsaction="click:.CLIENT;mouseover:.CLIENT"><div class="eIPGRd"><div class="sbic sb43"></div><div class="pcTkSc" role="option"><div class="wM6W7d"><span>iphone<b> 14 pro</b></span></div><div class="ClJ9Yb" style="display: none;"><span></span></div></div><div class="AQZ9Vd" jsaction="click:.CLIENT;contextmenu:.CLIENT" role="button" aria-label="Delete from history" style="display: none;"><style data-iml="1666241417704">.JCHpcb:hover{color:#1a73e8;text-decoration:underline;}.JCHpcb{color:#80868b;font:13px arial,sans-serif;cursor:pointer;align-self:center}@media (hover:hover){.sbai{visibility:hidden}.sbhl .sbai{visibility:inherit}}</style><div class="sbai JCHpcb">Delete</div></div></div></li><li data-view-type="1" class="sbct" role="presentation" jsaction="click:.CLIENT;mouseover:.CLIENT"><div class="eIPGRd"><div class="sbic sb43"></div><div class="pcTkSc" role="option"><div class="wM6W7d"><span>iphone</span></div><div class="ClJ9Yb" style="display: none;"><span></span></div></div><div class="AQZ9Vd" jsaction="click:.CLIENT;contextmenu:.CLIENT" role="button" aria-label="Delete from history" style="display: none;"><style data-iml="1666241417704">.JCHpcb:hover{color:#1a73e8;text-decoration:underline;}.JCHpcb{color:#80868b;font:13px arial,sans-serif;cursor:pointer;align-self:center}@media (hover:hover){.sbai{visibility:hidden}.sbhl .sbai{visibility:inherit}}</style><div class="sbai JCHpcb">Delete</div></div></div></li><li data-view-type="1" class="sbct" role="presentation" jsaction="click:.CLIENT;mouseover:.CLIENT"><div class="eIPGRd"><div class="sbic sb43" style=""></div><div class="pcTkSc" role="option"><div class="wM6W7d"><span>iphone<b> 13 pro max</b></span></div><div class="ClJ9Yb" style="display: none;"><span></span></div></div><div class="AQZ9Vd" jsaction="click:.CLIENT;contextmenu:.CLIENT" role="button" aria-label="Delete from history" style="display: none;"><style data-iml="1666241417704">.JCHpcb:hover{color:#1a73e8;text-decoration:underline;}.JCHpcb{color:#80868b;font:13px arial,sans-serif;cursor:pointer;align-self:center}@media (hover:hover){.sbai{visibility:hidden}.sbhl .sbai{visibility:inherit}}</style><div class="sbai JCHpcb">Delete</div></div></div></li><li data-view-type="1" class="sbct" role="presentation" jsaction="click:.CLIENT;mouseover:.CLIENT"><div class="eIPGRd"><div class="sbic sb43"></div><div class="pcTkSc" role="option"><div class="wM6W7d"><span>iphone<b> 11</b></span></div><div class="ClJ9Yb" style="display: none;"><span></span></div></div><div class="AQZ9Vd" jsaction="click:.CLIENT;contextmenu:.CLIENT" role="button" aria-label="Delete from history" style="display: none;"><style data-iml="1666241417704">.JCHpcb:hover{color:#1a73e8;text-decoration:underline;}.JCHpcb{color:#80868b;font:13px arial,sans-serif;cursor:pointer;align-self:center}@media (hover:hover){.sbai{visibility:hidden}.sbhl .sbai{visibility:inherit}}</style><div class="sbai JCHpcb">Delete</div></div></div></li><li data-view-type="1" class="sbct" role="presentation" jsaction="click:.CLIENT;mouseover:.CLIENT"><div class="eIPGRd"><div class="sbic sb43"></div><div class="pcTkSc" role="option"><div class="wM6W7d"><span>iphone<b> 12</b></span></div><div class="ClJ9Yb" style="display: none;"><span></span></div></div><div class="AQZ9Vd" jsaction="click:.CLIENT;contextmenu:.CLIENT" role="button" aria-label="Delete from history" style="display: none;"><style data-iml="1666241417704">.JCHpcb:hover{color:#1a73e8;text-decoration:underline;}.JCHpcb{color:#80868b;font:13px arial,sans-serif;cursor:pointer;align-self:center}@media (hover:hover){.sbai{visibility:hidden}.sbhl .sbai{visibility:inherit}}</style><div class="sbai JCHpcb">Delete</div></div></div></li><li data-view-type="1" class="sbct" role="presentation" jsaction="click:.CLIENT;mouseover:.CLIENT"><div class="eIPGRd"><div class="sbic sb43"></div><div class="pcTkSc" role="option"><div class="wM6W7d"><span>iphone<b> 13 pro</b></span></div><div class="ClJ9Yb" style="display: none;"><span></span></div></div><div class="AQZ9Vd" jsaction="click:.CLIENT;contextmenu:.CLIENT" role="button" aria-label="Delete from history" style="display: none;"><style data-iml="1666241417704">.JCHpcb:hover{color:#1a73e8;text-decoration:underline;}.JCHpcb{color:#80868b;font:13px arial,sans-serif;cursor:pointer;align-self:center}@media (hover:hover){.sbai{visibility:hidden}.sbhl .sbai{visibility:inherit}}</style><div class="sbai JCHpcb">Delete</div></div></div></li></ul>
        //<div class="wM6W7d"><span>iphone<b> 13 pro</b></span></div>
   List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
	// System.out.println("total number of suggestions in search box:::===>" +
	// list.size());
		for (int i = 0; i<list.size(); i++) {
			// System.out.println("List of elemnts fund : " + list.get(i).getText());
			if (list.get(i).getText().contains("iphone 14")) {
				// System.out.println("Clicking element is a : " + list.get(i).getText());
				Thread.sleep(3000);
				list.get(i).click();
				break;

			}

		}
	}
	//Practice
	/*public static void google_Search() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url="https://www.google.com/";
		driver.get(url);
		
		WebElement ele=driver.findElement(By.name("q"));
		ele.sendKeys("iphone");
		List<WebElement> list=driver.findElements(By.xpath(""));
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().contains("iphone14")) {
				Thread.sleep(3000);
				list.get(i).click();
				break;
			}
			
		}
	}*/
	/*public static void googleSearch() {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url="";
		driver.get(url);
		
		WebElement elem=driver.findElement(By.id(""));
		elem.sendKeys("");
		List<WebElement> list=driver.findElements(By.xpath(""));
		for(int i=0;i<=list.size();i++) {
			if(list.get(i).getText().contains("")) {
				list.get(i).click();
			}
		}
	}*/
	/*public static void googleSearch() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url="";
		driver.get(url);
		
		WebElement elem=driver.findElement(By.xpath(""));
		elem.sendKeys("iphone");
		List<WebElement> list=driver.findElements(By.xpath(""));
		for(int i=0; i<=list.size();i++) {
			if(list.get(i).getText().contains("iphone 14")) {
				list.get(i).click();
				
			}
		}
	}*/
	/*public static void googleSearch() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url="";
		driver.get(url);
		
		WebElement elem=driver.findElement(By.xpath(""));
		elem.sendKeys("iphone");
		List<WebElement> list=driver.findElements(By.xpath(""));
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().contains("iphone 14")) {
				list.get(i).click();
				
			}
			
		}
		
		
	}*/
	/*public static void getGoogleSearch() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
		
		WebElement element=driver.findElement(By.name("q"));
		element.sendKeys("iphone");
		
		List<WebElement>list=driver.findElements(By.xpath("//ul[@class='G43f7e']//li/descendant::div[@class='wM6W7d']"));
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().contains("iphone 14 release date")) {
				list.get(i).click();
			}
			
		}
	}*/
	/*public static void getIphone() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://www.google.com");
		WebElement ele=driver.findElement(By.name("q"));
		ele.sendKeys("iphone");
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e']//li/descendant::div[@class='wM6W7d WggQGd']"));
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getText().contains("iphone 14 pro")) {
				list.get(i).click();
			}
		}
	}*/
	
}


	


