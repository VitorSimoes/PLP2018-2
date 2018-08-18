n = gets.chomp.to_i
i = 0

vetor = []

while i < n do
  vetor << i + 1
  i += 1
  
end

def permutar(vetor)
  return [vetor] if vetor.size < 2
  perm = []

  vetor.each{ |aux|
    permutar(vetor - [aux]).each{|aux2|
      perm << ([aux] + aux2)
    }
  }
  
  perm
  
end

print permutar(vetor)

