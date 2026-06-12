package PageObjects;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends BasePage {

    public ProductDetailsPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//ul[@class='breadcrumb']")
    WebElement breadcrumb;

    @FindBy(xpath = "(//ul[@class='breadcrumb']//li//a)[2]")
    WebElement breadcrumbProduct;

    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement labelProductName;

    @FindBy(xpath = "(//div[@id='content']//li)[1]")
    WebElement labelBrandName;

    @FindBy(xpath = "(//div[@id='content']//li)[2]")
    WebElement labelProductCode;

    @FindBy(xpath = "(//div[@id='content']//li)[3]")
    WebElement labelRewardPoints;

    @FindBy(xpath = "(//div[@id='content']//li)[4]")
    WebElement labelProductStockAvailability;

    @FindBy(xpath = "//div[@class='rating']//a[1]")
    WebElement labelReviews;

    @FindBy(xpath = "//div[@class='rating']//a[2]")
    WebElement linkWriteReview;

    @FindBy(xpath = "//span[@class='price-new']")
    WebElement labelProductPrice;

    @FindBy(xpath = "//li[contains(text(),'Ex Tax')]")
    WebElement labelProductPriceExcludedTax;

    @FindBy(xpath = "//button[@aria-label='Add to Wish List']")
    WebElement buttonAddToWishList;

    @FindBy(xpath = "//button[@title='Compare this Product']")
    WebElement buttonCompareProduct;

    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement textProductQuantity;

    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement buttonAddtoCart;

    @FindBy(xpath = "(//div[@class='image magnific-popup']//a//img)[1]")
    WebElement imageProductImage;

    @FindBy(xpath = "//div[@class='image magnific-popup']//div//a")
    WebElement imageProductSV;

    @FindBy(xpath = "//a[normalize-space()='Description']")
    WebElement labelDescriptionNav;

    @FindBy(xpath = "//a[normalize-space()='Specification']")
    WebElement labelSpecificationNav;

    @FindBy(xpath = "//a[contains(normalize-space(),'Reviews')]")
    WebElement labelReviewNav;

    @FindBy(xpath = "//div[@id='tab-description']")
    WebElement descriptionTexts;

    @FindBy(xpath = "//div[@id='tab-specification']")
    WebElement specificationText;











}
