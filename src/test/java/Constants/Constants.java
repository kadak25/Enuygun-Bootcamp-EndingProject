package Constants;

import org.openqa.selenium.By;

import java.util.Calendar;
import java.util.Date;

public class Constants {
    public static final String URL = "https://www.enuygun.com/ucak-bileti/";
    public static final String originInput = "İstanbul";
    public static final String destinationInput = "Amsterdam";
    public static final By originInputLocator = By.id("OriginInput");
    public static final By destinationInputLocator = By.id("DestinationInput");
    public static final By suggestOriginLocator = By.xpath("//input[@aria-activedescendant=\"react-autowhatever-OriginInput-section-0-item-0\"]");
    public static final By suggestDestinationLocator = By.xpath("//input[@aria-activedescendant=\"react-autowhatever-DestinationInput-section-0-item-0\"]");
    public static final By departureDateTableLocator = By.id("DepartureDate");
    public static final By returnDateTableLocator = By.id("ReturnDate");
    public static final By returnDateInTableLocator = By.xpath("//td[@aria-label='Perşembe, 8 Eylül 2022']");
    public static final By findTicketButtonLocator = By.xpath("//button[@class='primary-btn block']");
    public static final By graphicLocator = By.xpath("//body[1]/div[3]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]");
    public static final By ffff = By.xpath("//body/div[@class='body-content']/div[@id='SearchRoot']/div/div[@class='row']/div[@class='col']/div[@class='search-result search-result-departure-only']/div[@class='search-result-body combine']/div[@class='flight-list flight-list-departure']/div/div[@class='flight-list-body']/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]/div[2]");
    public static final By ddd = By.xpath("//body/div[contains(@class,'body-content')]/div[@id='SearchRoot']/div/div[contains(@class,'row')]/div[contains(@class,'col')]/div[contains(@class,'search-result search-result-departure-only')]/div[contains(@class,'search-result-body combine')]/div[contains(@class,'flight-list flight-list-departure')]/div/div[contains(@class,'flight-list-body')]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/div[2]");
    public static final By selectFlightSpanButtonLocator = By.xpath("//body/div[@class='body-content']/div[@id='SearchRoot']/div/div[@class='row']/div[@class='col']/div[@class='search-result search-result-departure-only']/div[@class='search-result-body combine']/div[@class='flight-list flight-list-departure']/div/div[@class='flight-list-body']/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]/div[1]");
    public static final By chooseFlightButtonLocator = By.id("tooltipTarget_0");


}
