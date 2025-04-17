#!/usr/bin/python3.13
import clear
clear

# Reescreva o Programa 4.4 e calcule a conta da operadora Tchau usando else.

plano = input("\n Qual é o seu plano de celular? ")

if (plano == "falapouco" or plano == "falamuito"):

    if (plano == "falapouco"):

        minutosNoPlano = 100
        extra = 0.20
        preco = 50
    else:

        minutosNoPlano = 500
        extra = 0.20
        preco = 50

    minutosConsumidos = int(input("\n Quantos minutos você consumiu? "))
    print ("\n Você vai pagar: ")
    print (f" Preço do plano R${preco:10.2f}")
    suplemento = 0

    if (minutosConsumidos > minutosNoPlano):

        suplemento = extra * (minutosConsumidos - minutosNoPlano)
    
    print (f"\n Suplemento R${suplemento:10.2f}.")
    print (f" Total R${preco + suplemento:10.2f}.")
else:

    print ("\n Não existe esse plano. ")