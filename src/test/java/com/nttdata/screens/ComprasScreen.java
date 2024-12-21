package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ComprasScreen extends PageObject {

    //Validar Prodcutos
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement textProductos;

    public boolean isProductDisplayed(){
        waitFor(ExpectedConditions.visibilityOf(textProductos));
        return textProductos.isEnabled();
    }


    // Localizadores para los productos

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"test-Item title\" and @text=\"Sauce Labs Backpack\"]")
    public WebElement productoBackpack;


    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"test-Item title\" and @text=\"Sauce Labs Bike Light\"]")
    public WebElement productoTShirt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"test-Item title\" and @text=\"Sauce Labs Bolt T-Shirt\"]")
    public WebElement productoBikeLight;

    // Localizador para el botón "Agregar al carrito"

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    public WebElement btnAgregarAlCarrito;

    // Localizador para el icono del carrito de compras
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    public WebElement carritoIcono;

    //CantidaDeProductos
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    public WebElement CantidaDeProductos;

}
