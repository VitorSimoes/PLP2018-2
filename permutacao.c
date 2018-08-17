#include <stdio.h>
#include <stdlib.h>
void permuta(int *vet,int *vetor_aux,int cont,int tam);

void permuta(int *vet,int *vetor_aux,int cont,int tam)
{
  int flag;
    if(cont==tam)
    {
      for(int i=0;i< cont; i++){
        printf("%d ",vetor_aux[i]);
      }
    }else
    {
      for(int i=0; i<tam;i++)
      {
        flag=0;
        for(int j=0;j<=cont;j++)
        {
          if(vetor_aux[j]==vet[i])
            {
              flag=1;
            }
        }
        if(flag == 0 )
        {
          vetor_aux[cont]=vet[i];
          permuta(vet,vetor_aux,cont++,tam);
        }
      }
    }

}

int main(){
    int n;
    scanf("%d", &n);
    int vet[n],vetor_aux[n];
    for(int i=0;i< n; i++){
      vet[i]=i+1;
      vetor_aux[i]=0;
    }
    permuta(vet,vetor_aux,0,n);
  return 0;
}
