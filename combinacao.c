#include <stdio.h>

void combina(int num,int n, int k){
  int i = num+1;
  while(i<=n){
    printf("(%d,%d)\n",num,i);
    i+=1;
  }
}

int main(){
    int n,k;
    scanf("%d", &n);
    scanf("%d", &k);
    for(int num=1;num< n+1; num++){
      combina(num,n,k);
    }
  return 0;
}
