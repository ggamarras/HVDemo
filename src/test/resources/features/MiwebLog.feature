Feature: Login seguro usando Vault

  Scenario: Acceso con credenciales desde HashiCorp Vault
    Given el usuario abre la página de login
    When el usuario ingresa credenciales válidas desde Vault
    Then el usuario accede correctamente