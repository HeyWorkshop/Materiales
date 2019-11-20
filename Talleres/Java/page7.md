
# Arrays
Un array Java es una estructura de datos que nos permite almacenar una ristra de datos de un mismo tipo. El tamaño de los arrays se declarará en un primer momento y no podrá cambiar en tiempo de ejecución como puede producirse en otros lenguajes. La declaración de un array en Java y su inicialización se realiza de la siguiente manera:
```java
tipoDato nombreArray[];
nombreArray = new tipoDato[size];
```

Ejemplo:
```java
int numeros[];
numeros = new int[10]
```

Igual podemos incializar Arrays
```java
int numeros[] = new int[] {1, 2, 3};
```
#### Método length
length: Devuelve el tamaño del array.

```java
import java.util.Scanner;

public class MiPrimeraAplicacion{
	public static void main(String[] args){
		int numeros[] = new int[5]
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<numeros.length; i++){
			// Asignacion de valor
			numeros[i] = scanner.nextInt();
		}
	}
}
```
## [Anterior](page6.md)  --  [Siguiente](page8.md)