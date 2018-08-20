def permuta(vetor,vetor_aux,cont)
  tam = vetor.size
  if cont == vetor.size
      print(vetor_aux)
  else
    for i in 0 .. tam - 1
      flag = false
      for j in 0.. cont 
        if(vetor_aux[j]==vetor[i])
          flag = true
        end
      end
      if(flag == false)
        vetor_aux[cont]= vetor[i]
        permuta(vetor,vetor_aux,cont+1)
      end
    end
  end

end

#main
n = gets.chomp.to_i
lista_aux=[]
lista=[]
i = 0
j = 0

while i < n do
  lista << i + 1
  lista_aux<< 0
  i += 1
end
    
permuta(lista,lista_aux,0)
