Feature:Filtros mercado libre

  @filtrosmc
  Scenario: Validar el filtrado en mercado libre mexico
    Given el usuario está en la página de mercado libre
    And selecciona el pais méxico
    When busca los productos de playstation
    And se aplica los filtros para los productos
    And obtengo e imprimo los cinco primeros elementos



