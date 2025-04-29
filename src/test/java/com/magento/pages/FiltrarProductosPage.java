package com.magento.pages;

import com.magento.utils.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FiltrarProductosPage extends Base {

    public void seleccionaElFiltroDeLibre() {

        WebElement eleFiltro = driver.findElement(By.partialLinkText("Nuevo"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", eleFiltro);
        wait.until(ExpectedConditions.elementToBeClickable(eleFiltro));
        eleFiltro.click();
    }

    public void seleccionaElFiltroEstadoDeMexico() {
        WebElement eleFiltroEM = driver.findElement(By.partialLinkText("Estado De México"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", eleFiltroEM);
        wait.until(ExpectedConditions.elementToBeClickable(eleFiltroEM));
        eleFiltroEM.click();

    }

    public void ordenoLosProductosDeMayorAMenor() {
        wait.until(ExpectedConditions.elementToBeClickable(By.className("andes-dropdown__trigger")));
        driver.findElement(By.className("andes-dropdown__trigger")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(":R1b55ie:-menu-list-option-price_desc")));
        driver.findElement(By.id(":R1b55ie:-menu-list-option-price_desc")).click();


    }

}

