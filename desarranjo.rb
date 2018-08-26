n = gets.chomp.to_i
lista_aux = []
lista = []
i = 0

def desarranja(vetor,vetor_aux,cont)
  tam = vetor.size
  if cont == vetor.size
    print(vetor_aux)
  else
    for i in 0..tam -1
      flag = false
        if vetor_aux[i] == 0 and i != cont
          flag = false
        else
          flag = true
        end
        if flag == false
          vetor_aux[i]= vetor[cont]
          desarranja(vetor,vetor_aux,cont+1)
          vetor_aux[i] = 0
        end
      end
    end
end

while i < n do
  lista << i + 1
  lista_aux<< 0
  i += 1
  
end
desarranja(lista,lista_aux,0)