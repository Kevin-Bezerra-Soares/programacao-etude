#!/usr/bin/python3.13
import clear
clear

# Criar um programa que mostre uma raiz quadrada pelo método da Regressão de Júlia.

raiz = int(input(" Informe a raiz que você quer procurar: "))
w = int(input(" Chute um candidato para essa raiz: "))
candidato = w + 1
w2 = w * w
test = 0


while (test != raiz):
    
    test = w2 + w + candidato
    if (test == raiz):
        print(" A raiz é:",candidato)

    w2 = test
    w = candidato
    candidato +=1

    if (test > raiz):
        print(" A raíz é irracional, paciência! ")
        break
  