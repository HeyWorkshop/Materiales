# Tu primera aplicación en Java

1. Creamos nuestro primer proyecto.
2. Creamos una clase llamada `MiPrimeraAplicacion` con el método principal(main). Debera aparecer algo similar a esto:
```java
public class MiPrimeraAplicacion{
	public static void main(String[] args){
	
	}
}
```
#### ¿Que es el método principal(main)?
El método principal de Java es el punto de entrada de cualquier programa Java. Su sintaxis es siempre `public static void main (String[] args)`. Solo puede cambiar el nombre del argumento de matriz de cadenas.

## Aplicación Hola Mundo
Vamos a imprimir nuestra primera aplicación "Hola Mundo" en Java. Para imprimir en Java usamos `System.out.println("Hola Mundo");`.

Lo introducimos en el método principal para que Java lo puede interpretar. Que quedaria algo asi:
```java
public class MiPrimeraAplicacion{
	public static void main(String[] args){
		System.out.println("Hola Mundo");
	}
}
```

## [Anterior](page0.md)  --  [Siguiente](page2.md)