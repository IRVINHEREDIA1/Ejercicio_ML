package com.magento.runner;


import cucumber.runtime.SerenityObjectFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        objectFactory = SerenityObjectFactory.class,
        features = "src/test/resources/features/",
        glue = "com.magento", // recordar el path de hooks
        plugin = {"summary","pretty",
                "html:target/cucumber",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        monochrome = false,
        publish = true,
        tags = "@filtrosmc",
        dryRun = false
)
public class TestRunner  {
}
