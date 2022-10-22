package stepdefinitions;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {
	String quantity;
	WebDriver driver = Hooks.driver;
	
	@When("I select the product {string}")
	public void i_select_the_product(String product) {
		WebElement btnAddToCart = driver.findElement(By.xpath("//div[text()='"+product+"']//following::button[1]"));
		btnAddToCart.click();	
	}

	@Then("items in the cart should be {int}")
	public void items_added_should_be(int int1) {
		WebElement btnAddToCart = driver.findElement(By.className("shopping_cart_badge"));
		
		quantity = btnAddToCart.getText();
		Assert.assertEquals(Integer.parseInt(quantity) , int1);	
	}
	
	@When("I select the below products")
	public void i_select_the_below_products(List<String> products) {
		for(String product:products) {
			WebElement btnAddToCart = driver.findElement(By.xpath("//div[text()='"+product+"']//following::button[1]"));
			btnAddToCart.click();
		}
	}


}
