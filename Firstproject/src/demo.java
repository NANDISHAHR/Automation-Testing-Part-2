import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {

	public static void main(String[] args) {
		System.out.println("Hello");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\nandish.h.r\\browserdriver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\nandish.h.r\\browserdriver\\geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\nandish.h.r\\browserdriver\\msedgedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver= new FirefoxDriver();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");

	}

}
