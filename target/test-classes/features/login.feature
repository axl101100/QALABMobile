@login
Feature: funcionalidad del carrito de compras
#
#  @login_success
#  Scenario: Login con credenciales válidas
#
#    Given que estoy en la aplicación de Swag Labs
#    When ingreso mis credenciales username "standard_user" y password "secret_sauce"
#    Then el inicio de sesión es exitoso

 # @login_user_locked
 # Scenario: Login con usuario bloqueado
 #
 #   Given que estoy en la aplicación de Swag Labs
 #   When ingreso mis credenciales username "locked_out_user" y password "secret_sauce"
 #   Then se muestra el mensaje de error "Sorry, this user has been locked out."

@CarritoCompras

  Scenario Outline: : Validar la funcionalidad del carrito de compras.
    Given que estoy en la aplicación de SauceLabs
    And valido que carguen correctamente los productos en la galeria
    When agrego <UNIDADES> del siguiente producto "<PRODUCTO>"
    Then valido el carrito de compra actualice correctamente

    Examples:
      | PRODUCTO                  | UNIDADES      |
      | Sauce Labs Backpack       | 1             |
      | Sauce Labs Bolt - T-Shirt | 1             |
      | Sauce Labs Bike Light     | 2             |