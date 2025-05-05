#!/usr/bin/python3.13
import clear
clear

# Escreva um programa para controlar uma pequena máquina registradora.
# Você deve solicitar ao usurário que digie o código do produto e a quantidade comprada.
# Utilize a tabela de código para obter o preço de cada produto.
# Seu programa deve exibir o total das compras depois que o usurário digitar 0.
# Qualquer outro código deve gerar a mensagem de erro "Código inválido".

código = int(input("\n Informe o código do produto: "))
quantidade = int(input("\n Informe a quantidade deste produto: "))
total = 0.0

if (quantidade == 1):

    quantidade = 0

while (código != 0):

    if (código == 1):
        
        total += 0.50 * quantidade

    elif (código == 2):

        total += 1.00 * quantidade

    elif (código == 3):
        
        total += 4.00 * quantidade

    elif (código == 5):
        
        total += 7.00 * quantidade

    elif (código == 9):

        total += 8.00 * quantidade

    else:

        print("\n Código inválido! ")
    
    código = int(input("\n Digite outro código ou [0] para finalizar!"))
    quantidade = int(input("\n Caso queria mais alguma coisa digite a quantidade ou [0]."))
    
print (f"\n O valor total ficou {total:.2f}")
