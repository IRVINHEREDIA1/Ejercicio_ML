package com.magento.steps;

import com.magento.factory.LoginFactory;
import com.magento.pages.LoginPage;
import com.magento.utils.Base;
import com.magento.utils.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginSteps extends Base {

    //LoginPage loginPage = new LoginPage(); POM
    LoginFactory loginFactory = new LoginFactory(driver);

    @Given("user is on login page {string}")
    public void user_is_on_login_page(String url) {
        driver.navigate().to(BASE_URL+url);
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String user, String pass) {
        //loginPage.fillLoginForm(user,pass); // POM
        loginFactory.doLoginWithPageFactory(user, pass); //PF
    }

    @When("user enters and password")
    public void user_enters_and_password(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> loginData = dataTable.asLists();
        for (List<String> list: loginData) {
            driver.findElement(By.name("login[username]")).sendKeys(list.get(0));
            driver.findElement(By.name("login[password]")).sendKeys(list.get(1));
        }

    }

    @When("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        //loginPage.clickOnLogin(); POM
        loginFactory.clickLoginPF(); // PF
    }

    @Then("message displayed {string}")
    public void message_displayed(String msg) {
        //assertion
    }

    @Given("el usuario está en la página de mercado libre")
    public void elUsuarioEstáEnLaPáginaDeMercadoLibre() {
        driver.navigate().to(BASE_URL);
    }

    @And("selecciona el pais méxico")
    public void seleccionaElPaisMéxico() {
        driver.findElement(By.xpath("//li[@class=\"ml-site-mlm\"]/a[@class=\"ml-site-link\" and @id=\"MX\"]\n")).click();

    }

    @When("busca los productos de laystation")
    public void buscaLosProductosDeLaystation() throws InterruptedException {
        driver.findElement(By.id("cb1-edit")).sendKeys("playstation 5");
        driver.findElement(By.className("nav-search-btn")).click();
        Thread.sleep(5000);
           }

    @And("selecciona el filtro de libre")
    public void seleccionaElFiltroDeLibre() throws InterruptedException {
        WebElement eleFiltro = driver.findElement(By.partialLinkText("Nuevo"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", eleFiltro);
        eleFiltro.click();


    }

    @And("selecciona el filtro estado de mexico")
    public void seleccionaElFiltroEstadoDeMexico() throws InterruptedException {
        WebElement eleFiltroEM = driver.findElement(By.partialLinkText("Estado De México"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", eleFiltroEM);
        eleFiltroEM.click();
        Thread.sleep(1000);
    }

    @And("ordeno los productos de mayor a menor")
    public void ordenoLosProductosDeMayorAMenor() throws InterruptedException {
        driver.findElement(By.className("andes-dropdown__trigger")).click();
        driver.findElement(By.id(":R1b55ie:-menu-list-option-price_desc")).click();
        Thread.sleep(1000);
    }

    @And("obtengo e imprimo los cinco primeros elementos")
    public void obtengoEImprimoLosCincoPrimerosElementos() throws InterruptedException {
        List<WebElement> productNames = driver.findElements(By.className("ui-search-layout__item")); // Reemplaza con el selector del precio

        // Iterar y extraer los primeros 5 nombres y precios
        for (int i = 0; i < 5; i++) {
            String name = productNames.get(i).getText();
            System.out.println("Producto " + (i + 1) + ": " + name);
            Thread.sleep(10000);
        }


    }
}
