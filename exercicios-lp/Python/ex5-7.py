#!/usr/bin/python3.13
import clear
clear

# Modifique o programa anterior de forma que o usuário também digite o início e o fim da tabuada,
# em vez de começar com 1 e 10.

início = int(input("\n Informe o início da tabuada: "))
fim = int(input("\n Informe o fim da tabuada: "))
n = int(input("\n Informe o número da tabuada: "))

while (início <= fim):

    print (f"{n}x{início} = {n * início}")
    início +=1

