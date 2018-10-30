# Argumentos en línea de comando
![terminal](http://icons.iconarchive.com/icons/kxmylo/simple/512/utilities-terminal-icon.png)

### Hola mundo 1.1
En este ejemplo básico se muestra como el ejecutable que obtenemos al compilar el programa puede recibir argumentos al momento de ejecutarlo desde la línea de comando.
``` 
#include <stdio.h>

int main(int argc, char *argv[])  {
	printf("El nombre del programa: %s\n", argv[0]);
	for (int c = 1; c < argc; c++) {
		printf("La cadena número %d: %s\n", c, argv[c]);
	}
}
``` 
##### [Anterior](pagina1.md) -- [Siguiente](pagina3.md)