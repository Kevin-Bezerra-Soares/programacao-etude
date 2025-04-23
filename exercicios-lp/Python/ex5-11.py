#!/usr/bin/python3.13
import clear
clear

# Escreva um programa que pergunte o depósito inicial e a taxa de de juros de uma poupança. ]
# Exiba os valores mês a mês para os 24 primeiros meses.
# Escreva o total ganho com juros no período.

depositoInic = float(input("\n Informe o depósito inicial da poupança: "))
juros = float(input("\n Informe a taxa de juros que renderá: "))
deposito = depositoInic
rendimento = 0.0
ganho = 0.0

i = 1
while (i <= 24):

    rendimento = deposito * (juros / 100)
    deposito += rendimento
    ganho += rendimento
    print (f" Mês:{i}  Valor:{deposito:20.2f}")
    i += 1

print (f"\n Total da ganhos {ganho}.")