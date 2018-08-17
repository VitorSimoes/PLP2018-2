n =int(input())
lista_aux=[]
lista=[]

def permuta(vetor,vetor_aux,cont):
    if(cont == len(vetor)):
        print(vetor_aux)
    else:
        for i in range(len(vetor)):
            flag = False
            for j in range(cont):
                if(vetor_aux[j]==vetor[i]):
                    flag = True
            if(flag == False):
                vetor_aux[cont]= vetor[i]
                permuta(vetor,vetor_aux,cont+1)
for i in range(n):
    lista.append(i+1)
    lista_aux.append(0)

permuta(lista,lista_aux,0)
