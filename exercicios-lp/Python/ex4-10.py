#!/usr/bin/python3.13
import clear
clear

# Escreva um programa que leia dois números e que pergunte qual operação você deseja realizar.
# Você deve poder calcular soma (+), subtração (-), multiplicação (*) e divisão.
# Exiba o resultado da operação solicitada. 
print ("[1] adição: +\n")
print ("[2] subtração: -\n")
print ("[3] multiplicação: *\n")
print ("[4] divisão: /\n")
operacao = input("\n Informe qual oparação você quer realizar:")

numero1 = float(input(" Informe o primeiro número: "))
numero2 = float(input(" Informe o segundo número: "))

if (operacao == "1"):

    print (f" O resultado é {numero1+numero2:10.2f}")

elif (operacao == "2"):

    print (f" O resultado é {numero1-numero2:10.2f}")

elif (operacao == "3"):

    print (f" O resultado é {numero1*numero2:10.2f}")

elif(operacao == "4"):
    
    print (f" O resultado é {numero1/numero2:10.2f}")

else:

    print("\n Entrada inorreta! ")


