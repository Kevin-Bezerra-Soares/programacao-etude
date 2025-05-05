#!/usr/bin/python3.13
import clear
clear

# Modifique o programa anterior para que aceite respostas com letras maiúsculas e minúsculas em todas as questões.

pontos = 0
questão = 1

while (questão <= 3):

    resposta = input(f" Resposta da questão {questão}.")

    if (questão == 1 and (resposta == "b" or resposta == "B")):

        pontos += 1

    if (questão == 2 and (resposta == "a" or resposta == "A")):

        pontos += 1

    if (questão == 3 and (resposta == "d" or resposta == "D")):

        pontos += 1

    questão += 1

print (f"\n O alno fez {pontos} ponto(s).")
