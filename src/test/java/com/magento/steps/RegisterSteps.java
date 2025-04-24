package com.magento.steps;

import com.github.javafaker.Faker;
import com.magento.utils.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.Locale;

public class RegisterSteps extends Base {

    Faker faker = new Faker(new Locale("en-US"));
    @Given("user is on register page {string}")
    public void user_is_on_register_page(String url) {
        driver.navigate().to(BASE_URL+url);
    }
    @When("user fill out form with his information")
    public void user_fill_out_form_with_his_information() {
        String email = faker.internet().emailAddress();
        String password = faker.internet().password(8,10,true,true);
        driver.findElement(By.id("firstname")).sendKeys(faker.address().firstName());
        driver.findElement(By.id("lastname")).sendKeys(faker.address().lastName());
        driver.findElement(By.id("email_address")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("password_confirmation")).sendKeys(password);
    }

    @When("user fill out form with his information with invalid email")
    public void user_fill_out_form_with_his_information_with_invalid_email() {

    }

    @When("user clicks on register button")
    public void user_clicks_on_register_button() {
        driver.findElement(By.xpath("//*[@id='form-validate']/div/div[1]/button/span")).submit();
    }
    @Then("message diplayed {string}")
    public void message_diplayed(String msg) {

    }
}
