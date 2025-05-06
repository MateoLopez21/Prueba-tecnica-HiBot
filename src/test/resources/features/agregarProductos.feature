Feature: Agregar productos al carrito

  Scenario: El usuario agrega productos aleatorios al carrito
    Given El usuario ha iniciado sesion correctamente
    When Agrega 2 productos al carrito
    Then Deberia visualizar los 2 productos agregados en el carrito