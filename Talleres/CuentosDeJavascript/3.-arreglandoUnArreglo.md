# :postbox: ¿Cómo arreglar un arreglo? (y otro tipo de datos)

<p align="center">
  <img width="480" height="320" src="https://github.com/WorkshopTechnology/Materiales/blob/master/Talleres/CuentosDeJavascript/UnboxingDoodle.svg">
</p>

### :file_folder: Arreglo de datos
Con los arreglos de datos o ``arrays``, en javascript podemos guardar múltiples datos en un solo lugar. Su definición comienza y termina 
con un bracket, entre cada elemento colocaremos una coma, así:
```javascript
var miPrimeraCarga = ["FIS", "RSU", "Algoritmia"];
```
Cabe destacar que en Javascript un arreglo no está limitado solo a un tipo de datos, sino puede estar a muchos a la vez.
```javascript
var enQuePensamos = ["No reprobar", "Porqué Vscode es mejor que Atom", true, false, 123];
```
También es posible guardar un arreglo dentro de otro arreglo, como en el siguiente ejemplo:
```javascript
var valorEnCreditos = [["FIS", 16], ["Algoritmia", 16], ["RSU", 8000]];
```
Por lo tanto los arreglos son un recurso muy útil para estructurar información, pueden ser utilizados en muchas instancias, de muchas maneras.
> :gem: Dato curioso
> <br> Un string es realmente un arreglo de caracteres
> <br> ``var palabra = ["h", "o", "l", "a"]`` 

### :pencil: Métodos de un arreglo
Verás, un arreglo cuenta con muchas funciones las cuales podemos llamar "métodos", de momento no entremos en detalles en lo que es una función, lo que es importante que sepas, es que los arreglos tienen muchas cositas (métodos) las cuales nos pueden facilitar trabajar con ellos, como los siguientes
```javascript
var frutas = ["manzana", "pera", "bolsa de chetos"];
var cantidadDeFrutas = frutas.length;
// cantidadDeFrutas = 3;

// Veamos un ejemplo con números y Sort()
var numeritos = [3, 2, 1];
numeritos.sort();
// numeritos = [1, 2, 3];
```

### :pushpin: Acceder a un valor en el arreglo
De acuerdo, tenemos un muy útil conjunto de datos, ahora... ¿cómo accedemos a él? Excelente pregunta, podemos acceder a los valores del arreglo con un bracket al inicio y uno al final, donde al centro tendrán la posición del elemento que quieres buscar.

<p align="center">
  <img src="https://github.com/WorkshopTechnology/Materiales/blob/master/Talleres/CuentosDeJavascript/arrayExample.png">
</p>

Ahora veamos un ejemplo 
```javascript
var cosasChidas = ["Vscode", "Typescript", "Vim", "No usar Atom"];
// Ahora accedamos a uno en particular
var decisionCorrecta = cosasChidas[3];
// decisionCorrecta = "No usar Atom"
```

### :cyclone: Push y Pop
Pero, no quiero usar mi arreglo tan sólo como lo definí al comienzo, ¿entonces cómo agregamos y eliminamos valores ya definidos a un arreglo?
<br>
Aquí es donde entra en juego ``push`` y ``pop``. Los cuales sirven para agregar y eliminar valores respectivamente al final de un arreglo.
```javascript
var lenguajesDeProgramacionCool = ["Javascript", "Python", "Golang", "PsInt"];
// Ahora podemos eliminar el que está al final
lenguajesDeProgramacionCool.pop();
// Y agregar uno
lenguajesDeProgramacionCool.push("Scratch");
```

## [Anterior](https://github.com/WorkshopTechnology/Materiales/blob/master/Talleres/CuentosDeJavascript/1.5.-comentariosVariables,prettyThings.md) - [Siguiente](https://github.com/WorkshopTechnology/Materiales/blob/master/Talleres/CuentosDeJavascript/4.-%20reusandoConFunciones.md)
