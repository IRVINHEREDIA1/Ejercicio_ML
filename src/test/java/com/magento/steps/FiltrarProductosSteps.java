package com.magento.steps;

import com.magento.pages.FiltrarProductosPage;
import com.magento.utils.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class FiltrarProductosSteps extends Base {

    FiltrarProductosPage filtrarproductospage = new FiltrarProductosPage();

    @Given("el usuario está en la página de mercado libre")
    public void elUsuarioEstáEnLaPáginaDeMercadoLibre() {
        driver.navigate().to(BASE_URL);
    }

    @And("selecciona el pais méxico")
    public void seleccionaElPaisMéxico() {
        driver.findElement(By.xpath("//li[@class=\"ml-site-mlm\"]/a[@class=\"ml-site-link\" and @id=\"MX\"]\n")).click();

    }

    @When("busca los productos de playstation")
    public void buscaLosProductosDePLaystation() throws InterruptedException {
        driver.findElement(By.id("cb1-edit")).sendKeys("playstation 5" + Keys.ENTER);
        //driver.findElement(By.className("nav-search-btn")).click();
        //Thread.sleep(5000);

    }

    @And("se aplica los filtros para los productos")
    public void seAplicaLosFiltrosParaLosProductos() throws InterruptedException {
        filtrarproductospage.seleccionaElFiltroDeLibre();
        filtrarproductospage.seleccionaElFiltroEstadoDeMexico();
        Thread.sleep(5000);
        filtrarproductospage.ordenoLosProductosDeMayorAMenor();
    }


    @And("obtengo e imprimo los cinco primeros elementos")
    public void obtengoEImprimoLosCincoPrimerosElementos() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.className("ui-search-layout__item")));
        List<WebElement> productNames = driver.findElements(By.className("ui-search-layout__item"));
        for (int i = 0; i < 5; i++) {
            String name = productNames.get(i).getText();
            System.out.println("Producto " + (i + 1) + ": " + name);
            
        }


    }


}
