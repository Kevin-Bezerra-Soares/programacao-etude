#!/usr/bin/python3.13
import clear
clear

# Escreva um programa que pergunte o valor inicial de uma divida e o juro mensal.
# Pergunte também o valor mensal a ser pago. Imprima o número de meses para que 
# a dívida seja paga, o total pago e o total de juros pago.

dividaInicial = float(input("\n Informe o valor inicial da dívida :"))
juro = float(input("\n Informe o valor do juro mensal: "))
parcela = float(input("\n Informe o valor da parcela que quer pagar: "))
divida=dividaInicial 
i=1
totalPago = 0.0
totalJuros = 0.0
Juros = 0.0

while (divida > 0):

    Juros = divida * (juro / 100)
    divida += Juros
    totalJuros += Juros
    print (i,divida, Juros)
    divida -= parcela
    totalPago += parcela
    i += 1
    if (divida < 0):

        totalPago += divida

print (f"\n Sua dívida será quitada em {i} meses, o total de juros será {totalJuros}, você pagará no total {totalPago}.")