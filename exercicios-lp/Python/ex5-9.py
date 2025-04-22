#!/usr/bin/python3.13
import clear
clear

# Escreva um programa que leia dois números. Imprima a divisão inteira do primeiro pelo segundo.
# Utilize apenas os operadores de soma e subtração para calcular o resultado. Lembre-se de que 
# podemos entender o quociente da divisão de dois números como a quantidade de vezes que podemos
# retirar o divisor do dividendo. Logo: 20 / 4 = 5 uma vez que podemos subtrair 4 cinco vezes
# de 20.

dividendo = int(input("\n Informe o dividendo da operação: "))
divisor = int(input("\n Informe o divisor da operação: "))
div1 = dividendo 

quociente = 0
while (dividendo >= divisor):

    dividendo -= divisor
    quociente += 1

print (f"\n {div1}/{divisor}={quociente}, resto: {dividendo}")
