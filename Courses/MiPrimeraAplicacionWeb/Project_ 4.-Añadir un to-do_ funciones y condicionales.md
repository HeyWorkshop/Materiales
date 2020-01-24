# ⭕ La función To Do

A lo largo de esta siguiente parte de nuestro taller veremos que para lograr añadir nuevos elementos necesitaremos conocimientos las funciones, condicionales, y el metodo insertAdjacentHTML. Para que al momento de teclear ENTER en nuestro teclado se añada una nueva funcion, necesitaremos otros conocimientos como son el metodo addEventListener.
## 🤗 Conceptos

### 👀 ¿Qué es una función?
Cuando se desarrolla una aplicación compleja, es muy habitual utilizar una y otra vez las mismas instrucciones. Para ello se crearon las funciones, las cuales son un conjunto de instrucciones que se agrupan para realizar una tarea concreta y que se pueden reutilizar fácilmente. 

La mayor parte de las funciones no necesitan de ningun tipo de información extra, pero en las aplicaciones reales estas necesitan de variables llamadas argumentos. Estos argumentos se indican dentro de parentesis al lado del nombre de la función y se separan con una coma.

Por ejemplo, en una funcion sencilla que quiere sumar dos numeros:

```js
//Definimos la función
function suma(numeroa, numerob) {
  var resultado = numeroa + numerob;
  alert("El resultado es " + resultado);
}

//Declaramos los numeros que queremos que sume
var numeroa = 3;
var numerob = 4;

//Llamamos a la funcion para que imprima el resultado
suma(numeroa, numerob);
```

### 🔀 Condiciones 
En las condiciones, como en cualquier otro lenguaje de programación verifica si una condición se cumple como verdadera, en caso de serlo, ejecuta una sentencia y en caso contrario ejecuta otra (o no hace absolutamente nada).

```js
if(condicion1) {
  sentencia1
} else {
  sentencia1.1
}
```
Al igual, existen los operadores condicionales ternarios que usaremos mucho de aquí en adelante. Los componentes que la forman es:

* La condición, que evalua si es verdadera o falsa
* Las expresiones ``option1`` y ``option2`` que se ejecutaran dependiendo de la condición 

```js
let nombreDeLaVariable = condición ? option1 : option2;
```

Por ejemplo, una función donde queremos saber cual es el valor mayor entre dos numeros:

```js
let max = ( num1 > num2 ) ? num1 : num2 ;
//En este caso, si el ``num1`` es mayor a ``num2``, se guardara en la variable ``max`` el ``num1``, y en caso contrario
// Se guardará el ``num2``
```

### ✂ insertAdjacentHTML
Este metodo nos ayudará para insertar una nueva tarea en nuestra aplicacion web. Funciona mediante el uso de dos propiedades ``position`` y ``text``. En la primera indicamos en que parte del documento queremos añadir el texto HTML ( beforebegin, afterbegin, beforeend, afterend ). Y en el text, escribimos que es lo que deseamos agregar a nuestro documento

```js
element.insertAdjacentHTML(position, text);
```

### 🔈🔉🔊Los eventos
Uno de los conceptos que más se usan en la programación es el evento. Pero ¿Qué es un evento? Dicho de forma breve, un evento es un suceso que propicia el usuario, y lo que queremos hacer es escucharlo. Queremos tener una forma de escuchar cuando el usuario hace un click en algún botón, cuando pulsa una tecla o cuando selecciona algo de nuestro sitio web. 

## 🤓 Hora de aplicar los conceptos

### Nuestra funcion addToDo
Primero debemos definir nuestra función ``addToDo`` para hacer nuestro trabajo más sencillo. Esta funcion usara (de momento) el parametro ``toDo`` para funcionar, el cual será el texto de nuestra tarea.

```js
function addToDo(toDo){
  
}
```

Luego de esto, creamos dentro de la función, nuestro ``insertAdjacentHTML``

```js
function addToDo(toDo){
   
   list.insertAdjacentHTML(position, item);
}
```
Entonces, te darás cuenta de que no tenemos declarados ni ``position`` ni ``item`` entonces los agregaremos arriba. 

La constante ``item`` equivale al ejemplo que colocamos anteriormente en nuestro HTML con algunos cambios ligeros.

```js
    const item = `

    <li class="item">
        <i class="fa fa-circle-thin co" job="complete" id="0"></i>
        <p class="text">${toDo}</p>
        <i class="fa fa-trash-o de" job="delete" id="0"></i>
    </li>

    `;
```
Mientras que la constante ``position`` tendrá el valor "beforeend" para que cada vez que añadamos una tarea, se agregue hasta el final.


```js
  const position = "beforeend";
```

De esta forma, nuestra funcion (de momento) lucirá de esta forma:


```js
function addToDo(toDo){

     const item = `

     <li class="item">
          <i class="fa fa-circle-thin co" job="complete" id="0"></i>
          <p class="text">${toDo}</p>
          <i class="fa fa-trash-o de" job="delete" id="0"></i>
     </li>

     `;
    
    const position = "beforeend";
    
   list.insertAdjacentHTML(position, item);
}
```
Para comprobar que todo esto funciona de forma correcta, haremos una prueba llamando la funcion con el parametro "Beber café"

```js
addToDo("Beber café");
}
```

## 💻 Escuchemos una tecla
Para escuchar una tecla necesitaremos unos pequeños conceptos extra que son el ``addEventListener`` y que es un "keyup". Explicados de forma breve, el metodo ``addEventListener`` nos ayuda a literalmente "escuchar" cuando el usuario interactua con nuestra aplicación de cualquier forma y "keyup" es una sintaxis que nos devuelve el numero asignado a cada tecla de nuestro teclado. 

Como lo que queremos es escuchar si el usuario tecleo el ENTER, entonces debemos identificar cual es el código que identifica el ordenador (keyCode) de la tecla ENTER. En este caso, lo identifica con el ``13``, cada letra tiene una KeyCode diferente.

Para comenzar a escuchar cuando el usuario teclea ENTER, comenzaremos usando el ``addEventListener``:

```js
document.addEventListener("keyup", function(even) {
  if(event.keyCode === 13) {
    const toDo =input.value;
    
    //Checar si el input no esta vacio
    if(toDo) {
      addToDo(toDo);
    }
    //Luego, vaciamos el input
    input.value = "";
  }
});
```
Luego de hacer esto, necesitaremos añadir nuevos parametros a nuestra funcion addToDo (añadimos las variables ``id``, ``done`` y ``trash``) Asi como remplazamos los valores de la id por esta misma variable. 

```js
function addToDo(toDo, id, done, trash){
     
     const item = `

     <li class="item">
          <i class="fa fa-circle-thin co" job="complete" id="${id}"></i>
          <p class="text">${toDo}</p>
          <i class="fa fa-trash-o de" job="delete" id="${id}"></i>
     </li>

     `;
    
    const position = "beforeend";
    
   list.insertAdjacentHTML(position, item);
}
```
Ahora debemos preguntarle al sistema si la tarea ha sido eliminada, si ha sido completada y si esta tachada con una linea, lo haremos de la siguiente forma:

```js
if(trash){ return; }

const DONE = done ? CHECK : UNCHECK;
const LINE = done ? LINE_THROUGH : "";

     const item = `

     <li class="item">
          <i class="fa ${DONE} co" job="complete" id="${id}"></i>
          <p class="text ${LINE}">${toDo}</p>
          <i class="fa fa-trash-o de" job="delete" id="${id}"></i>
     </li>

     `;

```
Entonces, ahora que hemos logrado que nuestro programa cambie las clases y las ides, así como colocar el texto que queremos para nuestra tarea. Ahora necesitamos declarar un objeto que guarde y reciba el texto, la id, y que conozca si nuestra tarea esta completa o si el usuario la ha borrado, es por ello que debemos declarar estas variables (LISTA, id)

```js
let LIST = [], 
id = 0;
```

Y ahora actualizamos nuestro código usando este nuevo objeto ``LISTA`` que hemos creado. Esta lista guardará los valores ``toDo`` ``id`` ``done`` ``trash``, todo esto usando el método ``PUSH`` para guardar los datos dentro, de esta forma:

```js
document.addEventListener("keyup", function(even) {
  if(event.keyCode === 13) {
    const toDo =input.value;
    
    //Checar si el input no esta vacio
    if(toDo) {
      addToDo(toDo, id, false, false);
      
            LIST.push({
            name : toDo,
            id : id, 
            done: false,
            trash: false,
            
        });
        id++;
    }
    //Luego, vaciamos el input
    input.value = "";
  }
});
```
NOTA: Además, debemos de agregar la operación ``id++`` para que las id's de cada tarea sea diferente. (Así, la primera tarea tiene el id=1, la segunda id=2, etc.)

Y ahora podemos comprobar que en nuestra consola de javascript, se estan guardando estos valores. 

## 👅 Resumen
Al final de cada paso para llegar a nuestra primera Aplicación Web, pondré un ejemplo de como debió quedar tu código para poder continuar con el taller ❤. Tu  documento ``js`` debe lucir de esta forma:

```js

//Select the elements
const clear = document.querySelector(".clear");
const dateElement = document.getElementById("date");
const list = document.getElementById("lista");
const input = document.getElementById("input");

//Classes names
const CHECK = "fa-check-circle";
const UNCHECK = "fa-circle-thin";
const LINE_THROUGH = "lineThrough";

//Variables
let LIST = [], 
id = 0;

// Mostrar fecha
const options = { month:"short", day:"numeric", weekday:"long"};
const today = new Date();

dateElement.innerHTML = today.toLocaleDateString("es-US", options);

//Añadir una tarea
function addToDo(toDo, id, done, trash){
    
    if(trash) {
        return;
    }
    
    const DONE = done ? CHECK : UNCHECK;
    const LINE = done ? LINE_THROUGH : "";

    const item = `

    <li class="item">
        <i class="fa ${DONE} co" job="complete" id=${id}></i>
        <p class="text ${LINE}">${toDo}</p>
        <i class="fa fa-trash-o de" job="delete" id=${id}></i>
    </li>

    `;
    const position = "beforeend";

    list.insertAdjacentHTML(position, item);

}

//Escuchar Enter
document.addEventListener("keyup", function(even) {
  if(event.keyCode == 13) {
    const toDo =input.value;
    
    //Checar si el input no esta vacio
    if(toDo) {
      addToDo(toDo, id, false, false);
      
            LIST.push({
            name : toDo,
            id : id, 
            done: false,
            trash: false,
            
        });
        //Añadimos una unidad al valor de la id
        id++;
    }
    //Luego, vaciamos el input
    input.value = "";
  }
});

```

## [Anterior](https://github.com/MiguelRAvila/MiPrimeraAplicacionWeb/blob/master/Project:%203.-Nuestros%20elementos%2C%20nuestras%20clases.md) - [Siguiente](https://github.com/MiguelRAvila/MiPrimeraAplicacionWeb/blob/master/Project:%205.-%20Completar%20y%20Remover%20una%20tarea.md)
