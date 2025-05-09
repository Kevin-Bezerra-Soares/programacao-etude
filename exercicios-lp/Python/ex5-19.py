#!/usr/bin/python3.13
import clear
clear

# Modifique o programa 5-18 para aceitar valores decimais, ou seja, também contar moedas de 0,01, 0,02, 0,05, 0,010 e 0,50.

valor = float(input("\n Digite o valor a pagar: "))
cédulas = 0
atual = 100.0
aPagar = valor

while (True):

    if (atual <= aPagar):

        aPagar -= atual
        cédulas += 1
    
    else:

        print(f"\n {cédulas} cédulas de R${atual}")

        if (aPagar == 0.00):

            break

        if (atual == 100.00):

            atual = 50.00

        if (atual == 50.00):

            atual = 20.00

        elif (atual == 20.00):

            atual = 10.00

        elif (atual == 10.00):

            atual = 5.00

        elif (atual == 5.00):

            atual = 1.00

        elif (atual == 1.00):

            atual = 0.50

        elif (atual == 0.50):

            atual = 0.10

        elif (atual == 0.10):

            atual = 0.05

        elif (atual == 0.05):

            atual = 0.02

        elif (atual == 0.02):

            atual = 0.01

        