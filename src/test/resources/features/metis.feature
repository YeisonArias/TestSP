Feature: Login App

  Scenario: Login App Metis
    Given que Yeison quiere Acceder a Metis
    When el ingresa el usuario y la clave
    |usuario|clave|
    |demo   |demo |
    Then el verifica el mensaje "Bootstrap-Admin-Template"