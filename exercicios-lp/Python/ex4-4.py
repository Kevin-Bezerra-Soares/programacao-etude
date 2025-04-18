#!/usr/bin/python3.13
import clear
clear

# Escreva um programa que pergunte o salário do funcionário e calcule o valor do aumento.
# Para salários superiores a R$ 1.250, calcule um aumento de 10%. 
# Para os inferiores ou iguais, de 15%.

salario = float(input("\n Informe o valor do seu salário: "))

if (salario <= 1250.00):

    print (f"\n Seu salário aumentou para {salario*1.15}.")

else:

    print (f"\n Seu novo salário aumentou para {salario*1.10}.")