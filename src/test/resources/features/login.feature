
Feature: Login on Luma ecommerce

  Scenario Outline: Successful Login with valid credentials
    Given user is on login page "/customer/account/login/"
    When user enters "<username>" and "<password>"
    And  user clicks on sign in button
    Then message displayed "Account Information"
    Examples:
      | username            | password     |
      | lruizajax@gmail.com | ckzsd68REn@cgp5      |
      | lruiz23@gmail.com   | lruiz23@#@@! |

  Scenario: Successful Login with datatable
    Given user is on login page "/customer/account/login/"
    When user enters and password
      | lruizajax@gmail.com | ckzsd68REn@cgp5 |
    And  user clicks on sign in button
    Then message displayed "Account Information"

  @Login
  Scenario: Validar el filtrao en mercado libre mexico
    Given el usuario está en la página de mercado libre
    And selecciona el pais méxico
    When busca los productos de laystation
    And selecciona el filtro de libre
    And selecciona el filtro estado de mexico
    And ordeno los productos de mayor a menor
    And obtengo e imprimo los cinco primeros elementos



