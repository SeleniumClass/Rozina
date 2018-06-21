/**
 * 
 */
package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryLogin {

	WebDriver driver;

	public PageFactoryLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//@FindBy(how = How.XPATH, using = "(//*[@class='ui-button-text'])[3]")
	@FindBy(id = "tdb3")
	private WebElement myAcctBtn;
	@FindBy(how = How.NAME, using = "email_address")
	private WebElement Username;
	@FindBy(how = How.NAME, using = "password")
	private WebElement password;
	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Sign In')])[2]")
	private WebElement signInbtn;
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Catalog')]")
	private WebElement catalog;
	@FindBy(how=How.XPATH,using="//*[contains(text(),'new products')]")
	private WebElement  products;
	@FindBy(how=How.XPATH,using="//div[@id='bodyContent']/div/div/div/span[1]/strong")
	private WebElement page1;
   // @FindBy(how = How.XPATH,using = "//a[contains(@href,'new')]")
   // private WebElement newProducts;
//    @FindBy (how = How.XPATH,using = "//*[@id='bodyContent']/div/div/div/span[1]/strong")
//    private WebElement firstPage;
	// private WebElement myAccountbtn;
	public WebElement getMyAccountbtn() {		
		return myAcctBtn;
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignInBtn() {
		return signInbtn;
	}
	public WebElement getCatalog() {
		return catalog;
	}
	public WebElement getProducts() {
		return products;
		}
	public WebElement getPage1() {
		return page1;
		}
//	public WebElement getFirstPage( ) {
//		return firstPage;
//	}
}
