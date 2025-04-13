#!/usr/bin/python3.13
import clear
clear

# Faça um programa que calcule o aumento de um salário. Ele deve solicitar o valor do salário e a porcentagem do aumento.
# Exiba o valor do aumento e di novo salário.

salario = float(input(" Informe seu salário: "))
print (" Que mixaria!? hahahaha ")

aumento = int(input(" Informe o aumento: "))
print(" Amém! hahahhaha")

aumento = salario * aumento / 100

print (" Parabéns, seu salário teve um aumento de %.2f e ficou %.2f!" % (aumento, aumento + salario))
