#include <stdio.h>

int main(int argc, char *argv[])  {
	printf("El nombre del programa: %s\n", argv[0]);
	for (int c = 1; c < argc; c++) {
		printf("La cadena número %d: %s\n", c, argv[c]);
	}
	return 0;
}