Feature: Iniciar sesion en el sistema

  Scenario: Inicio de sesion con credenciales validas
    Given El usuario navega a la pagina de inicio de sesion
    When Ingresa las credenciales correctas
    Then El usuario deberia ver la pagina principal