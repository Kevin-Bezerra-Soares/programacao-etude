#!/usr/bin/python3.13
import clear
clear

# Escreva um programa que pergunte a distância que um passageiro deseja percorrer em km.
# Calcule o preço da passagem, cobrando R$0,50 por km para viagens de até 200 km, 
# e R$ 0,45 para viagens mais longas.

km = float(input("\n Informe a distância que quer pecorrer: "))

if (km < 200):

    print (f"\n A passagem custa {km*0.50} reais.")

else:

    print (f"\n A passagem custa {km*0.45} reais.")