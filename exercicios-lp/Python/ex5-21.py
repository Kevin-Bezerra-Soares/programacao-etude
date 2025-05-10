#!/usr/bin/python3.13
import clear
clear

# Reescreva o programa 5.1 de forma a continuar executando até que o valor digitado seja 0. 
# Utilize repetições aninhadas.
valor = 1
while (valor !=0):
    valor = int(input("\n Digite o valor a pagar: "))
    cédulas = 0 
    atual = 50
    aPagar = valor


    while (True):

        if (atual <= aPagar):

            aPagar -= atual
            cédulas += 1
        
        else:

            print(f"\n {cédulas} cédulas de R${atual}")

            if (aPagar == 0):

                break

            if (atual == 50):

                atual = 20

            elif (atual == 20):

                atual = 10

            elif (atual == 10):

                atual = 5

            elif (atual == 5):

                atual = 1

            cédulas = 0