package com.nttdata.steps;

import com.nttdata.screens.ComprasScreen;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSteps {

    WebDriver webDriver;
    ComprasScreen comprasScreen;


    public void agregarProductoPorNombreYUnidades(String producto, int unidades) {
        WebElement productoElement = null;

        switch (producto) {
            case "Sauce Labs Backpack":
                productoElement = comprasScreen.productoBackpack;
                break;
            case "Sauce Labs Bolt - T-Shirt":
                productoElement = comprasScreen.productoTShirt;
                break;
            case "Sauce Labs Bike Light":
                productoElement = comprasScreen.productoBikeLight;
                break;
            default:
                throw new IllegalArgumentException("Producto no encontrado: " + producto);
        }

        if (!productoElement.isDisplayed()) {
            throw new AssertionError("El producto " + producto + " no está visible.");
        }

        productoElement.click();

        // Agregar la cantidad de productos al carrito
        for (int i = 0; i < unidades; i++) {

            comprasScreen.btnAgregarAlCarrito.click();
        }

        System.out.println("Se agregaron " + unidades + " unidades del producto " + producto + " al carrito.");
    }


    public void validarCarritoDeCompra(int unidadesEsperadas) {

        comprasScreen.carritoIcono.click();

        String cantidadText = comprasScreen.CantidaDeProductos.getText();

        int cantidadActual = Integer.parseInt(cantidadText);

        if (cantidadActual != unidadesEsperadas) {
            throw new AssertionError("La cantidad de productos en el carrito no es correcta. Esperada: " + unidadesEsperadas + ", pero actual: " + cantidadActual);
        }

        System.out.println("El carrito de compras se actualizó correctamente con " + cantidadActual + " productos.");
    }

    public void validoProductos() {
        Assert.assertTrue("Visibilidad de título products", comprasScreen.isProductDisplayed());
    }
}



