#!/usr/bin/python3.13
import clear
clear

# Modifique o programa anterior de forma a ler um número n.
# Imprima os n primeiros números primos.

número = int(input("\n Informe um número para verificar se é primo: "))
i = 3
primo = True

#if (número == 2):
#    print ("\n O 2 é um número primo. ")
if(número%2 != 0):
    
    while(i < número):
        if (número%i == 0):
            primo = False
            i += 2
            print(i)
        else:
            i += 2
            print(i)

#else: 
 #   print (f"\n O número {número} não é primo.")
 #   primo = False

    
#if (primo):

#    print(f"\n O número {número} é primo! ")
#else: 
    
#    print(f"\n O número {número} não é primo! ")

