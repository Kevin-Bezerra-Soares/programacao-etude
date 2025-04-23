#!/usr/bin/python3.13
import clear
clear

# Altere o programa anterior de forma a perguntar também o valor depositado mensalmante.
# Esse valor será depositado no início de cada mês, e você deve considerá-lo para o 
# cálculo de juros do mês seguinte.

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
    deposito += float(input(" Digite o valor que quer depositar neste mês: "))
    i += 1

print (f"\n Total da ganhos {ganho:.2f}.")