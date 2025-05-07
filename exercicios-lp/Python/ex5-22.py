#!/usr/bin/python3.13
import clear
clear

# Escreva um programa que exiba uma lista de opções (menu):
# adição, subtração, divisão, multiplicação e sair.
# Imprima a tabuada da operação escolhida.

print ("\t [1]: adição +;\n\t [2]: subtrção -;\n\t [3]: multiplicação *;\n\t [4]: divisão /;\n\t [Q ou q]: para sair; ")
opt = input("\n Digite a operação aritimética da tabuada: \n") 
n = int(input("\n Informe quantos cálulos você quer nessa tabuada: "))
numero = int(input("\n Informe de qual número vai ser essa tabuada: "))
i=1

if (opt == "1"):
    while (i < n):
        print(f" {i} + {numero} = {i+numero}")
        i+=1

elif (opt == "2"):
    while (i < n):
        print(f" {i} - {numero} = {i-numero}")
        i+=1

elif (opt == "3"):
    while (i < n):
        print(f" {i} X {numero} = {i*numero}")
        i+=1

elif (opt == "4"):
    while (i < n):
        print(f" {i} / {numero} = {i/numero}")
        i+=1

elif (opt == "q" or "Q"):
    print ("\n Understandeble, have a nice day! ")

else:
    
    print("\n Entrada inválida! ")