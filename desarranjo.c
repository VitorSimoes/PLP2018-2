#include <stdio.h>
#include <stdlib.h>

void arranja(int*,int*,int, int);
int flag;

int main(void){
    int n;

    scanf("%d",&n);
    int vet[n], aux[n];

    for(int i=0;i<n;i++){
        vet[i] = i+1;
        aux[i] = 0;
    }

    arranja(vet, aux, 0, n);

    return 0;
}

void arranja(int* vet, int *aux,int cont, int n){


    if(cont == n){
        for(int e=0;e<n;e++){
            printf("%d ",aux[e]);
        }
        printf("\n");
    }

    else{
        for(int i=0;i<n;i++){
            flag = 0;
            if ((aux[i] == 0) && (i != cont))
            {
              flag = 0;
            }else{
              flag = 1;
            }
            if(flag == 0){
                aux[cont]=vet[i];
                arranja(vet, aux,cont+1,n);
                aux[i]=0;
            }
        }
    }


}
