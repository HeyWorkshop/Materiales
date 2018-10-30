# Apuntadores y manejo de memoria dinámica
![Memoria](https://www.freeiconspng.com/uploads/ram-icon-png-18.png)

### El problema de las mil bombillas
En este ejemplo no tan básico se resuelve el siguiente problema:

"Después de ser secuestrado, te despiertas en una gran sala donde vemos 1.000 bombillas apagadas, numeradas del 1 al 1.000. Notas que te estás quedando sin oxígeno, por lo que necesitas salir de esa habitación. Al fondo ves una puerta. Intentas abrirla, pero no hay manera, es imposible, está bloqueada…

En ese momento, una voz grave sale de algún lugar de la habitación y dice lo siguiente:

‘Imagine que pudiera encender y apagar cada una de las bombillas que hay en la habitación. En esa hipotética situación, comenzando con la bombilla 1 y siguiendo un orden ascendente, colóquese mentalmente delante de cada bombilla y cambie de estado todas las que tengan un número que sea múltiplo de la bombilla en la que está situado en ese instante.

Tras llegar a la bombilla 1.000 y realizar dicha operación con ella, ¿qué bombillas terminarán encendidas? Piénselo bien, de su respuesta depende que salga de la habitación o que permanezca ahí para siempre. Si da con la respuesta correcta, recuperará su libertad. Tiene un minuto para dar con ella."
```
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
```
##### [Anterior](pagina2.md) -- [Siguiente](pagina4.md)