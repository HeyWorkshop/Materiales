# Javadoc
Javadoc es una utilidad de Oracle para la generación de documentación de APIs en formato HTML a partir de código fuente Java. 
Igualmente es el estándar de la industria para documentar clases de Java. La mayoría de los IDEs lo generan automáticamente.

Al diseñar Java se distinguieron que los comentarios o anotaciones en el código que el compilador ignora 
pero que son útiles para los programadores se usaban para dos propósitos diferentes que son:

**1.-Explicar el propósito de sentencias o grupos de sentencias (Útiles para el propiot autor y otros que deseen modificarlo).**

**2.-Para explicar qué hace una “pieza” cerrada de código. 
Estos son útiles para quien quiera utilizar esta “pieza” en su propio programa, y que por lo tanto 
necesita saber lo que hace y no como se las ha arreglado el programador para conseguir el resultado.**

## Primer tipo (Internos)

Para el primer tipo se usan comentarios **internos** donde se usan los caracteres

```text
// comentario
```

o

```text
/* Aqui va el comentario, incluso podemos abarcar varias líneas de código */
```

## Ejemplo

```java
int suma = 0; // al principio la suma vale 0 


// vamos sumando cada uno de los cuadrados entre 1 y 100 y acumulando el resultado
for (int i=1; i<=99; i+=2)
    suma += i;

// finalmente mostramos el resultado por pantalla
System.out.println(suma);    // ¿por cierto, que valor se mostrará por pantalla?

```
## Segundo tipo (Javadoc)

```text
/** Comentario */
```

o

```text
/* Bloque de comentario
  Bloque de comentario*/
```
##¿Cuándo poner un comentario?

### Tipo Javadoc
* Al principio de cada clase
* Al principio de cada método
* Ante cada variable de clase

### Tipo interno
**Por conveniencia:**
* Al principio de fragmento de código no evidente
* A lo largo de los bucles
**Y por si acaso:**
* Siempre que hagamos algo raro
* Siempre que el código no sea evidente

## Tipos de indicadores Javadoc

* **@author nombreDelAutor descripción.** 
Indica quién escribió el código al que se refiere el comentario. Si son varias personas se escriben los nombres separados por comas o se repite el indicador, según se prefiera. Es normal incluir este indicador en el comentario de la clase y no repetirlo para cada método, a no ser que algún método haya sido escrito por otra persona. 

* **@version númeroVersión descripción.** Si se quiere indicar la versión. Normalmente se usa para clases, pero en ocasiones también para métodos. 

* **@param nombreParámetro descripción.** Para describir un parámetro de un método. 

* **@return descripción.** Describe el valor de salida de un método. 

* **@see nombre descripción.** Cuando el trozo de código comentado se encuentra relacionada con otra clase o método, cuyo nombre se indica en nombre. 

* **@throws nombreClaseExcepción descripción.** Cuando un método puede lanzar una excepción ("romperse" si se da alguna circunstancia) se indica así. 

* **@deprecated descripción.** Indica que el método (es más raro encontrarlos para una clase) ya no se usa y se ha sustituido por otro. 

* **@exception descripción.** Es la excepción que se puede llegar a generar. Es un sinónimo para @exception.

* **@since descripción.**  Es la versión desde que se incluye.

##Ejemplo Javadoc

```java
 1 /**
      2  * Ejemplo: círculos.
      3  *
      4  * @author José A. Mañas - fprg5000
      5  * @version 23.9.2005
      6  */
      7 public class Circulo {
      8     private double centroX;
      9     private double centroY;
     10     private double radio;

     12     /**
     13      * Constructor.
     14      * @param cx centro: coordenada X.
     15      * @param cy centro: coordenada Y.
     16      * @param r radio.
     17      */
     18     public Circulo(double cx, double cy, double r) {
     19         centroX = cx;
     20         centroY = cy;
     21         radio = r;
     22     }

     24     /**
     25      * Getter.
     26      * @return centro: coordenada X.
     27      */
     28     public double getCentroX() {
     29         return centroX;
     30     }

     48     /**
     49      * Calcula la longitud de la circunferencia (perímetro del círculo).
     50      * @return circunferencia.
     51      */
     52     public double getCircunferencia() {
     53         return 2 * Math.PI * radio;
     54     }

     64     /**
     65      * Desplaza el círculo a otro lugar.
     66      * @param deltaX movimiento en el eje X.
     67      * @param deltaY movimiento en el eje Y.
     68      */
     69     public void mueve(double deltaX, double deltaY) {
     70         centroX = centroX + deltaX;
     71         centroY = centroY + deltaY;
     72     }

     74     /**
     75      * Escala el círculo (cambia su radio).
     76      * @param s factor de escala.
     77      */
     78     public void escala(double s) {
     79         radio = radio * s;
     80     }
     81 }
```
     
## Generar Javadoc desde terminal
     
Desde la terminal, iremos a donde se encuentra nuestro archivo .java y colocaremos

```bash
$ javadoc archivo.java
```
En dado caso que queramos guardar la documentación en un destino específico:

```bash
$ javadoc -d destino archivo.java
```
#Ejercicio

[Ejercicio Javadoc](Ejercicios.md)
