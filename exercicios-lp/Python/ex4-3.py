#!/usr/bin/python3.13
import clear
clear

# Escreva um programa que leia três números e que imprima o maior e o menor.

a = int(input("\n Informe um número: "))
b = int(input(" Informe o segundo número: "))
c = int(input(" Informe o terceiro número: "))

test1 = (a > b and a > c and b > c)
test2 = (b > a and b > c and a > c)
test3 = (c > a and c > b and a > b)

if (test2 == True):

    print(f"\n O {b} é maior e o {c} é o menor.")

if (test1 == True):

    print(f"\n O {a} é o maior e o {c} é o menor.")
