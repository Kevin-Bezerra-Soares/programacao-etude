#!/usr/bin/python3.13

anos  = int(input("\n Digite sua idade: \n"))
meses = int(input(" Digite os meses: \n"))
dias  = int(input(" Digite os dias: \n "))

resp = ((anos * 365) + (meses * 30) + dias)

print("\n Sua idade em dias é: ", resp)