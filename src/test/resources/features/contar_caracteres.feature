Feature: Contar Carecteres
  Yo como escritor
  Quiero contar caracteres
  Para conocer el numero de caracteres que tiene las palabras

  Scenario: Contar Caracteres de una palabra
    Given quiero contar caracteres
    When cuento los caracteres de la palabra Mama
    Then deberia ver que el numero de caracteres es 4

  Scenario: Contar Caracteres de un listado de palabras
    Given quiero contar caracteres
    When cuento los caracteres del listado
      | mama |
      | papa |
    Then deberia ver que el numero de caracteres es 8