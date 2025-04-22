#!/usr/bin/python3.13
import clear
clear

# Escreva um programa que verifique se um número é palíndromo.
# Um número é palíndromo se continua o mesmo caso seus dígitos
# sejam invertidos. Exemplos: 454, 10501.

num = input("\n Digite um número para verficar se é palíndromo: ")
cont = len(num)
i = 0
x = -1
test = ""
while (cont >= 1):

    print (num[x:cont])
    test += (num[x:cont])
    cont -= 1
    x -= 1

if (num == test):

    print (f"\n São palíndromos os {num} e {test}.")

else: 

    print (f"\b Não são palíndromos os {num} e {test}!")
