## Variables

Las variables son identificadores que pueden cambiar de valor a lo largo de nuestro programa. En Javascript se implementan poniendo la 
palabra reservada **var** y luego el nombre que le queramos asignar a la variable, por ejemplo:

**var nombre_variable;** 

El tipo de variable depende completamente del valor que se le asigne, es decir, podemos tener una variable de tipo número si le asignamos
un número o puede ser de tipo texto (string) si le asignamos una cadena de texto entre comillas, por ejemplo;

**var variable_numero = 1;** 

**var variable_texto = "esto es un texto";** 

Los nombres de las variables únicamente pueden empezar con una letra o con _ seguido de numeros o símbolos.

## Funciones 

Las funciones sirven para agrupar un bloque de código (procedimiento) que puede servirnos muchas veces a lo largo del programa, este bloque de código únicamente se va a realizar cuando la función sea llamada.
La creación de funciones sirve para evitar que nuestro programa tenga código repetido.

Para definir una función utilizamos la palabra reservada **function** seguido del nombre que le queramos poner a la función, luego se colocan () y dentro de ellos la cantidad de parámetros que vaya a necesitar la función separados por comas, al final colocamos {} y dentro de ellas todas
las lineas de código que queremos que se ejecuten dentro de la función

* *Un parámetro es un valor (variable) que pueda necesitar la función a lo largo de su procedimiento. *

Ejemplo:

**function nombre_funcion (parametro1, parametro2)**

**{**

  **procedimiento**

**}**



Para llamar a la función únicamente escribimos el nombre de la función en el lugar que deseemos que se ejecute seguido de () con los valores con los que queramos que trabaje y al final un ;

Ejemplo:

**nombre_funcion(valor1, valor2);**

## [Siguiente](Page3.md)
