import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Table {
    public static void main(String[] args) {
       // WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
//        login
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        driver.findElement(By.id("btnLogin")).click();
        System.out.println("test poll");

//click on PIm option
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        while (true){
            driver.findElement(By.id("ohrmList_chkSelectAll")).click();
            driver.findElement(By.id("btnDelete")).click();
            driver.findElement(By.id("dialogDeleteBtn")).click();
            //Thread.sleep(2000);
        }

    }
    }

