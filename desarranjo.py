n =int(input())
lista_aux=[]
lista=[]

def desarranja(vetor,vetor_aux,cont):
    if(cont == len(vetor)):
        print(vetor_aux)
    else:
        for i in range(len(vetor)):
            flag = False
            if vetor_aux[i] == 0 and i != cont:
                flag = False
            else:
                flag = True
            if(flag == False):
                vetor_aux[i]= vetor[cont]
                desarranja(vetor,vetor_aux,cont+1)
                vetor_aux[i] = 0
for i in range(n):
    lista.append(i+1)
    lista_aux.append(0)

desarranja(lista,lista_aux,0)
