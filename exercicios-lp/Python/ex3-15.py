#!/usr/bin/python3.13
import clear
clear

# Escreva um programa para calcular a redução de tempo de vida de um fumante.
# Pergunte a quantidade de cigarros fumados por dia e quantos anos ele já fumou.
# Considere que um fumante perde 10 minutos de vida a cada cigarro, 
# calcule quantos dias de vida ele perderá. Exiba o resultado em dias.

cigarros = int(input(" Quantos cigarros você fuma por dia? "))
anos = int(input(" Há quantos anos você fuma? "))

minutos = cigarros * 22
dias = minutos / 60 / 24 * anos * 365

print(" Você perdeu %.2f " % dias)
