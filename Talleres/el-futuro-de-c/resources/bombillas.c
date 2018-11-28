#include <stdio.h>
#include <stdlib.h>

#define B 10000 //La cantidad de bombillas (Máximo 1000000000)
#define D 8 //El tamaño en bytes del tipo de dato

int main(){
  unsigned long *b=malloc(B+D);
  for (int c=1,m=1;c<=B;c++,m=c) {
    for (;;) {
      if (m>B) break;
      b[m/D]^=1UL<<m%D-1;
      m+=c;
    }
  }
  for (int c=0;c<B;c++) {
    if (b[c/D]&1UL<<c%D)
      printf("%d\n",c+1);
  }
  return 0;
}