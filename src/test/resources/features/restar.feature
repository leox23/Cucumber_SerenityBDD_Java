Feature: Restar
  Yo como matemático
  Quiero Restar
  Para no errar en el calculo

#Scenario: Restar numerous enteros
#  Given Quiero restar
#  When Resto 2 menos 2
#  Then Debera ver que el resultado de la resta es 0

# Ejemplo Scenario Outline
Scenario Outline: Restar numerous enteros
  Given Quiero restar
  When Resto <primerNumero> menos <segundoNumero>
  Then Debera ver que el resultado de la resta es <resultado>
  Examples:
  | primerNumero | segundoNumero | resultado |
  | 4            | 2             | 2         |
  | 2            | 2             | 0         |
