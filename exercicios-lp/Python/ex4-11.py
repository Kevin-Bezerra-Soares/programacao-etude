#!/usr/bin/python3.13
import clear
clear

# Escreva um um programa para aprovar um empréstimo bancário para compra de uma casa.
# O programa deve perguntar o valor da casa a comprar, o salário e a quantidade de anos a pagar. 
# O valor da prestação mensal não pode ser superior a 30% do salário. Calcule o valor da prestação
# como sendo o valor da casa a comprar dividido pelo número de meses a pagar.

valorDaCasa = float(input("\n Informe o valor da casa: "))
salario = float(input(" Informe o seu salário: "))
anos = int(input(" Informe em quantos anos pretende financiar: "))

prestacao = valorDaCasa / anos / 12
test = (salario * 0.30)

if (prestacao > test):

    print (f"\n Seu financiamento não foi aprovado, o correspondente a 30% seu salário é menor do que a prestação de {prestacao:10.2f}.")

else: 

    print (f"\n Aprovado, a prestção ficou: {prestacao:10.2f}")