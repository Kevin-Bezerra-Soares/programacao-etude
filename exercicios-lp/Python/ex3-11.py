#!/usr/bin/python3.13
import clear
clear

# Faça um programa que solicite o preço de uma mercadoria e o percentual de desconto.
# Exiba o valor do desconto e o preço a pagar.


mercadoria = float(input(" Informe o valor: "))

desconto = int(input(" Informe a porcentagem de desconto: "))


desconto = mercadoria * desconto / 100

print (" Seu desconto foi de %.2f e o total ficou %.2f!" % (desconto, mercadoria - desconto))
