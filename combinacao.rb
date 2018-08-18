i = 0

def combinar(v, k, aux = [])
  tam = v.size
  if k == 1
    for i in 0..tam -1
      print (aux + [v[i]])
    end
  else
    for i in 0.. tam - k+1
      combinar(v[i+1..tam], k-1, aux+[v[i]])
    end
  end

end

n = gets.chomp.to_i
k = gets.chomp.to_i
vetor = []

while i < n do
  vetor << i + 1
  i += 1
  
end

combinar(vetor, k)