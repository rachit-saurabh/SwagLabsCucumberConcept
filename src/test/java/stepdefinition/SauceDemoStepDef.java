package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SauceDemoStepDef {

	WebDriver driver;

	@Given("^User is already on a Login Page$")
	public void user_is_already_on_a_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.saucedemo.com/");
	}

	@When("^title of the page is Swag Labs$")
	public void title_of_the_page_is_Swag_Labs() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Swag Labs", title);
	}

	@Then("^user enters the username and password$")
	public void user_enters_the_username_and_password(DataTable table) {
		List<List<String>> data = table.raw();
		driver.findElement(By.id("user-name")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
	}

	@Then("^user clicks on Login button$")
	public void user_clicks_on_Login_button() {
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	}

	@Then("^user clicks on Add to Cart button$")
	public void user_clicks_on_Add_to_Cart_button() {
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
	}

	@Then("^user open the cart$")
	public void user_open_the_cart() {
		driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).click();
	}

	@Then("^user clicks on checkout button$")
	public void user_clicks_on_checkout_button() {
		driver.findElement(By.linkText("CHECKOUT")).click();
	}

	@Then("^user enters the firstname and lastname and postalcode$")
	public void user_enters_the_firstname_and_lastname_and_postalcode(DataTable table) {
		List<List<String>> data = table.raw();
		driver.findElement(By.id("first-name")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("last-name")).sendKeys(data.get(0).get(1));
		driver.findElement(By.id("postal-code")).sendKeys(data.get(0).get(2));
	}

	@Then("^user clicks on continue button$")
	public void user_clicks_on_continue_button() {
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	}

	@Then("^user clicks on finish button$")
	public void user_clicks_on_finish_button() {
		driver.findElement(By.linkText("FINISH")).click();
	}

	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

}
