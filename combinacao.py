#combinacao_


def combinacao(e, n, k):
    i = e+1
    while(i<=n):
        print(e,i)
        i+=1

n = int(input())
k = int(input())

for num in range(1,n+1): #para cada numero na sequencia de 1...n
    combinacao(num, n, k) #faca (m,m+1)...(m,n)
