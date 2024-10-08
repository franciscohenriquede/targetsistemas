# Função que verifica a letra 'a' na string
def verificar_letra_a(texto):
    quantidade_a = texto.lower().count('a')
    
    if quantidade_a > 0:
        print(f"A letra 'a' aparece {quantidade_a} vezes na string.")
    else:
        print("A letra 'a' não aparece na string.")

# Recebendo a string do usuário
texto = input("Digite uma string: ")

# Chamada da função
verificar_letra_a(texto)
