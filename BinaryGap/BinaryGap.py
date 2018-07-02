def solution(N):
    # write your code in Python 3.6
    numeroBinario = str(bin(N)[2:])
    tamanho = 0
    soma = 0
    while (True):
        inicio = numeroBinario.find('1')
        if inicio == -1:
            break;
        numeroBinario = numeroBinario.replace('1', '*', 1)
        fim = numeroBinario.find('1')
        if fim == -1:
            break
        soma = fim - inicio -1 
        tamanho = soma if soma > tamanho else tamanho            
    return tamanho    
    pass
