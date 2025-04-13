#!/usr/bin/python3.13
import clear
clear

# Escreva um programa que pergunte a quantidade de km percorridos por um carro alugado pelo usuário,
# assim como a quantidade de dias pelos quais o carro foi alugado.
# Calcule o preço a pagar, sabendo que o carro custa R$60 por dia e R$ 0,15 por km rodados.

km = float(input(" Informe quantos km foram percorridos. "))
dias = int(input(" Informe quantos dias ficou alugado: "))

km = km * 0.15
dias = dias * 60

print (" O valor do aluguel ficou %.2f R$ " % (km + dias))

