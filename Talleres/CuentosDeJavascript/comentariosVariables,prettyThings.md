# :star2: Comentarios, variables: cosas bonitas

<p align="center">
  <img width="480" height="320" src="https://github.com/WorkshopTechnology/Materiales/blob/master/Talleres/CuentosDeJavascript/LovingDoodle.svg">
</p>

### :thought_balloon: Comentarios
Los comentarios son una gran forma de dejarte notas en tu código, ya que estos son ignoradas en ejecución. Hay dos formas de escribir 
comentarios en Javascript, primero tenemos `//` que es utilizado para una sóla línea.
```javascript
// El código ignorará toda esta línea
```
También puedes hacer un comentario multilínea con ``/*  */`` como el siguiente:
```javascript
/* Este se omite
en varias líneas */
```

### :100: Variables y tipos de datos
En la programación, los datos son todo lo importante para una computadora. Javascript nos proporciona siete tipos diferentes de datos, 
los cuales son ``undefined``,``null``,``boolean``,``symbol``,``number`` y ``object``. 
<br>
Aquí es donde las variables nos permiten almacenar estos datos, en javascript podemos crear una variable con la palabra clave ``var``.
```javascript
var nombrePersona;
```
:point_right: Al igual que podemos asignarle un valor posteriormente, o al momento de su creación.
```javascript
var nombrePersona;
nombrePersona = "Pepito II";
```
O también podemos hacer...
```javascript
var nombrePersona = "Pepito II";
```
Otra cosa importante a tomar en cuenta, es que las variables son "case sensitive", lo que quiere decir que tienes que respetar si sus 
letras son mayúsculas o minúsculas. ❕ 

### :camel: camelCase
Esto no es exclusivo a Javascript, pero es importante mencionar que un buen hábito de programación :fire: es definir variables siguiento el 
estilo ``camelCase``, lo cual es simplimente definir la primera letra de una variable en minúscula, y palabras consecuentes iniciando 
con mayúscula, así:
```javascript
var estoEsCamelCase = "Pepito Language";
```

### :heavy_division_sign: Operaciones matemáticas
Con las variables de tipo númerico es posible efectuar sumas tal cual lo haríamos en una libreta o pizarra. Existen muchos beneficios de tratar con variables, ya que podemos imitar el comportamiento tal cual vendría de una ecuación.
```javascript
var valeCinco = 3 + 2
// O también
var a = 2
var b = 3
var c = a + b 
// c = 5
```
Esto es posible para la multiplicación, división, resta o suma.

### :heavy_minus_sign: Incrementos y decrementos
Una forma más sencilla de sumar o restar solamente un valor a una variable es utilizando el operador ``++`` o ``--``
```javascript
var x = 4;
x++; // x = 5;

//

var y = 5;
y--; // y = 4
```

## [Anterior](https://github.com/WorkshopTechnology/Materiales/edit/master/Talleres/CuentosDeJavascript/queEsJavascript.md) - [Siguiente]()
