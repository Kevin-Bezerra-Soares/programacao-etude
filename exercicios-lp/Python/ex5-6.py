#!/usr/bin/python3.13
import clear
clear

# Altere o programa anterior para exibir os resultados no mesmo formato de uma tabuada de multiplicação:
# 2x1 = 2, 2x2 = 4, ...

n = int(input("\n Tabuada de: "))

x = 1
while (x <= 10):

    print (f"{n}x{x} = {n*x}")
    x += 1
