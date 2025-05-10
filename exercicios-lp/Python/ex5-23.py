#!/usr/bin/python3.13
import clear
clear

# Escreva um programa que leia um número e verifique se é ou não um número primo.
# Para fazer essa verificação, calcule o resto da divisão do número por 2 e depois
# por todos os números ímpares até o número lido. Se o resto de uma dessas divisões
# for igual a zero, o número não é primo. Observe que 0 e 1 não são primos e que 2 
# é o único número primo que é par.

número = int(input("\n Informe um número para verificar se é primo: "))
i = 3
primo = True

if (número == 2):
    print ("\n O 2 é um número primo. ")
elif(número%2 != 0):
    
    while(i < número):
        if (número%i == 0):
            primo = False
            i += 2
            print(i)
        else:
            i += 2
            print(i)

else: 
    print (f"\n O número {número} não é primo.")
    primo = False

    
if (primo):

    print(f"\n O número {número} é primo! ")
else: 
    
    print(f"\n O número {número} não é primo! ")

