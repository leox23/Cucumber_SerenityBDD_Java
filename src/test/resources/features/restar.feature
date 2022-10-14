Feature: Restar
  Yo como matematico
  Quiero Restar
  Para no errar en el calculo

Scenario: Restar numeros enteros
  Given Quiero restar
  When Resto 2 menos 2
  Then Deberia ver que el resultado de la resta es 0