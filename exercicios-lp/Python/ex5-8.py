#!/usr/bin/python3.13
import clear
clear

# Escreva um programa que leia dois números. Imprima o resultado da multiplicação do primeiro pelo segundo.
# Utilize apenas os operadores de soma e subtração para calcular o resultado. Lembre-se de que podemos entender
# a multiplicação de dois números como somas sucessivas de um deles.
# Assim: 4x5 = 5+5+5+5 = 4+4+4+4+4

n1 = int(input("\n Informe o primeiro fator: "))
n2 = int(input("\n Informe o segundo: "))

fator = n2
i = 1
while (i < n1):

    n2 += fator
    i += 1

print (f"{n1}x{fator} = {n2}")
