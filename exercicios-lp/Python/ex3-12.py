#!/usr/bin/python3.13
import clear
clear

# Escreva um programa que calcule o tempo de uma viagem de carro.
# Pergunte a distância a percorrer e a velocidade média esperada para a viagem.

deltaS = float(input(" Informe a distância da viagem: "))
vmedia = float(input(" Informe a velocidade média esperada: "))

deltaT = deltaS / vmedia

print (" O tempo médio esperado é %.2f " % deltaT)
