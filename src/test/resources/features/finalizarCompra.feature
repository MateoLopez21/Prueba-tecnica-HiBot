Feature: Finalizar Compra

  Scenario: Un usuario registrado puede finalizar la compra
    Given El usuario ha agregado dos productos al carrito
    When El usuario ingresa la informacion correctamente
    Then Deberia visualizar el mensaje de orden finalizada