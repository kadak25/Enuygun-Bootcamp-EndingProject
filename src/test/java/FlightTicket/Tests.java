package FlightTicket;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.apache.logging.log4j.*;

import java.time.Duration;
import java.util.List;

import static Constants.Constants.*;

public class Tests {

    WebDriver driver;


    Logger log = LogManager.getLogger("Tests");


    //Before start tests set up our driver here.
    @BeforeClass
    public void setup() {
        try {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(URL);
            driver.manage().window().maximize();
            log.info("driver setup completed");
        } catch (Exception e) {
            log.error(e);
        }

    }

    //Take an origin input from Constants class and then enter the label.
    @Test(priority = 1)
    public void OriginInput() {
        try {
            driver.findElement(originInputLocator).click();
            driver.findElement(originInputLocator).sendKeys(originInput);
            waitFor(suggestOriginLocator);
            driver.findElement(suggestOriginLocator).sendKeys(Keys.ENTER);
            log.info("origin spot succesfully selected");
        } catch (Exception e) {
            log.error(e);
        }


    }

    //Take a destination input from Constants class and then enter the label.
    @Test(priority = 2)
    public void DestinationInput() {
        try {
            driver.findElement(destinationInputLocator).click();
            driver.findElement(destinationInputLocator).sendKeys(destinationInput);
            waitFor(suggestDestinationLocator);
            driver.findElement(suggestDestinationLocator).sendKeys(Keys.ENTER);
            log.info("destination spot succesfully selected");
        } catch (Exception e) {
            log.error(e);
        }

    }
//    @Test(priority = 3)
//    public void DepartureDateSelect() {
//        List<WebElement> calendar = driver.findElements(By.cssSelector(" [aria-disabled='false'] [class='CalendarDay__content']"));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        calendar.get(0).click();
//
//    }

    //Take a departure date from DateUtil class and then enter the label.
    @Test(priority = 3)
    public void DepartureDateSelect() {
        try {
            driver.findElement(departureDateTableLocator).click();
            List<WebElement> columns = driver.findElements(By.tagName("td"));
            DateUtil.clickGivenDay(columns, DateUtil.getCurrentDayPlus(-3));
            log.info("departure date succesfully selected");
        } catch (Exception e) {
            log.error(e);
        }

    }

    //Take a return date from DateUtil class and then enter the label.
    @Test(priority = 4)
    public void ReturnDateSelect() {
        try {
            driver.findElement(returnDateTableLocator).click();
            driver.findElement(returnDateInTableLocator).click();
            log.info("return datr succesfully selected");
        } catch (Exception e) {
            log.error(e);
        }
    }


    //After choose all information click button for search a ticket.
    @Test(priority = 5)
    public void FindTicket() {
        try {
            driver.findElement(findTicketButtonLocator).click();
            log.info("find ticket button clicked");
        } catch (Exception e) {
            log.error(e);
        }
    }

    //Select a departure ticket.
    @Test(priority = 6)
    public void SelectDepartureTicket() {
        try {
            waitFor(graphicLocator);
            driver.findElement(ddd).click();
            log.info("departure ticket selected");
        } catch (Exception e) {
            log.error(e);
        }
    }

    //Select a departure ticket.
    @Test(priority = 7)
    public void SelectReturnTicket() {
        try {
            waitFor(graphicLocator);
            driver.findElement(selectFlightSpanButtonLocator).click();
            log.info("return ticket selected");
        } catch (Exception e) {
            log.error(e);
        }
    }

    //Choose a Flight.
    @Test(priority = 8)
    public void ChooseFlight() {
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.findElement(chooseFlightButtonLocator).click();
            log.info("flight choosed");
        } catch (Exception e) {
            log.error(e);
        }

    }

    //After all test runned it's close the browser.
    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    private void waitFor(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    private void Wait(By locator) {
        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driverWait.until(ExpectedConditions.elementToBeClickable(locator));

    }
}
