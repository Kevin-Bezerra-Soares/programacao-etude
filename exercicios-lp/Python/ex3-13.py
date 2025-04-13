#!/usr/bin/python3.13
import clear
clear

# Escreva um programa que converta uma temperatura digitada em °C em °F. 
# A fórmula para essa conversão é: F = (9*C)/5 + 32

celsius = float(input(" Informe a temperatura em °C: "))


fahrenheit = (9*celsius)/5 + 32

print (" A temperatura em graus Fahrenheit é %.2f " % fahrenheit)
