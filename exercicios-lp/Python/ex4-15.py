#!/usr/bin/python3.13
import clear
clear

# Reescreva o programa a seguir com if-elif-else.

hora = int(input("\n Informe a hora atual: "))

if (hora < 12):

    print ("\n Bom dia!")

elif (hora >= 12 and hora <= 18):

    print ("\n Boa tarde!")

else: 

    print (" Boa noite! ")
