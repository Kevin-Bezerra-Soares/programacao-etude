#!/usr/bin/python3.13
import clear
clear

# Escreva um programa que calcule o preço a pagar pelo fornecimento de energia elétrica.
# Pergunte a quantidade de kWh consumida e o tipo de instalação: R para resodências,
# I para indústrias e C para comércios. 

kWh = float(input("\n Inforeme quantos kWh são cosumidos: "))
print ("\n [R] Residêncial;\n[I] Industrial;\n[C] Comerical;")
instalacao = input(" Informe o tipo de instalação: ")

if (instalacao == "R"):

    if (kWh <= 500):

        print (f"\n O valor da conta é R${kWh*0.40:10.2f}")

    else:

        print (f"\n O valor da conta é R${kWh*0.65:10.2f}")

if (instalacao == "I"):

    if (kWh <= 5000 ):

        print (f"\n O valor da conta é R${kWh*0.55:10.2f}")
    
    else:

        print (f"\n O valor da conta é R${kWh*0.60:10.2f}")

if (instalacao == "C"):

    if (kWh <= 1000):

        print (f"\n O valor da conta é R${kWh*0.55:10.2f} ")

    else:

        print (f"\n O valor da conta é R${kWh*0.60:10.2f}")

else: 

    print ("\n Esse tipo instalação não existe!")