#!/usr/bin/python3.13
import clear
clear

# Escreva um programa que leia números inteiros do teclado. 
# O programa deve ler os números até que o usuário digite 0 (zero).
# No final da execução exiba a quantidade de números digitados,
# assim como a média aritmética.

numero = int(input("\n Digite um número inteiro: ")) 
i = 1
test = 0
while (True):

    test = int(input(" Informe outro número: "))
    if (test == 0):
        break
    else:
        numero += test
        i += 1

print (f"\n A média aritmética dos {i} números digitados é {numero / i:.2f}.")

