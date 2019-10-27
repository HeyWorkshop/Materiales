# :tophat: Reusando código, con la magia de las funciones

<p align="center">
  <img width="480" height="320" src="https://github.com/WorkshopTechnology/Materiales/blob/master/Talleres/CuentosDeJavascript/ZombieingDoodle.svg">
</p>

### :link: Definición de una función
En Javacript podemos dividir el código en partes reutilizables llamadas "funciones". Las cuales pueden similares a la siguiente:
```javascript
function nombreDeFuncion(){
  // lo que hace
  // ...
}
```
Posteriormente podríamos invocar la función llamándola como ``nombreDeFuncion()``. Cada vez que se llame ejecutará el código que tiene entre las llaves.

### :satellite: Pasar valores como argumentos
Los parámetros son valores que actúan cómo placeholders, es decir, espacios donde serán colocadas variables que la función utilizará cuando sea llamada. En la definición, las variables que son llamadas placeholders se denominan ``Parameters``, pero cuando los valores son pasados a la función a la hora de ser llamada, podemos llamarlos ``argumentos``.
```javascript
function sumadorDeValores(x, y){
  console.log(x + y);
}

sumadorDeValores(2,3) // Esto imprime 5
```

### :microscope: Scope
Existen dos scopes (alcances) de las variables de Javascript, ``Global`` y ``Local``, las variables definidas fuera del bloque de una función, son de scope Global. Si no usamos var nuestras variables pueden estar definidas de manera global, lo que implica que las podemos utilizar dentro y fuera de una función, inclusive si las definimos dentro de la función.
```javascript
function upsNoGlobal(){
estoEsUnMalHabito = 1;
}
estoEsUnMalHabito = 2; 
// esto es valido, estamos accediendo a una variable que fue definida dentro de una función.
```
Por eso es importante utilizar ``var`` al definir variables.

### :leftwards_arrow_with_hook: Retornar valores en una función
Hasta ahora al usar una función hemos utilizado ``console.log(valor)``, lo cual imprime ``valor`` en la consola. Sin embargo, ¿qué tal si queremos usar el valor retornado de la función? Para eso podemos utilizar la palabra clave ``return``, donde especificaremos el valor a retornar por la función.
```javascript

function sumadorAlternativa1(x, y){
  var suma = x + y;
  return suma;
}

function sumadorAlternativa2(x, y){
  return (x + y)
}

var resultado = sumadorAlternativa1(10, 2);
var resultado2 = sumadorAlternativa2(2, 10);
// resultado = 12;
// resultado2 = 12;
```

## [Anterior](https://github.com/WorkshopTechnology/Materiales/blob/master/Talleres/CuentosDeJavascript/arreglandoUnArreglo.md) - Siguiente
