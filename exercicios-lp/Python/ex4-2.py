#!/usr/bin/python3.13
import clear
clear

# Escreva um programa que pergunte a velocidade do carro de um usuário.
# Caso ultrapasse 80 km/h, exiba uma mensagem dizendo que o usuário foi multado.
# Nesse caso, exiba o valor da multa, cobrando R$5 por quilômetro acima de 80 km/h.

velocidade = float(input(" Informe a velocidade: "))
multa = 0
km = 0
if (velocidade > 80):

    km = velocidade - 80
    multa = km * 5

    print (f" Você ultrapassou o limite de velocidade, foi multado em R${multa}.")

print (" Está dentro da velocidade. ")
