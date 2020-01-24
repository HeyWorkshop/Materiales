# 🔄 Complete, Remove, Repeat

En esta sección aprenderemos a completar y remover nuestras tareas asi como a escuchar cuando el usuario realiza estas acciones. Para esta sección necesitaremos los conocimientos básicos de los metodos ``toggle`` asi como de ``classList`` y ``parentNode`` 

## 📚 Conceptos de está sección

El metodo ``toggle`` nos proporciona la capacidad de mostrar u ocultar elementos y contenido de nuestro sitio web. En este caso mostraremos y ocultaremos clases.

Usar ``classList`` es una forma práctica de acceder a la lista de clases de un elemento como una cadena de texto delimitada por espacios a través de element.className.

La propiedad de sólo lectura ``node.parentNode`` devuelve el padre del nodo. 

## ✔Completando una tarea
Para decirle a nuestra aplicación que se ha acompletado o removido una tarea, primero debemos crear las funciones de completado y de removido. Entonces creamos una función:

```js
function completeToDo(element) {
  
}
```
Luego, agregaremos los elementos que cambiaremos, en este caso, si una tarea es completada, queremos que el ícono del circulo cambie al igual que el texto, el cual ahora estará tachado. En caso de que el usuario quite el completado a la tarea, tambien queremos que cambie para mostrar que la tarea aún no ha sido completada, esto lo lograremos de la siguiente forma:

```js
function completeToDo(element) {
  element.classList.toggle(CHECK);
  element.classList.toggle(UNCHECK);
  element.parentNode.querySelector(".text").classList.toggle(LINE_THROUGH);
}
```
Y ahora debemos actualizar el estado de esta tarea en el objeto:

```js
function completeToDo(element) {
  element.classList.toggle(CHECK);
  element.classList.toggle(UNCHECK);
  element.parentNode.querySelector(".text").classList.toggle(LINE_THROUGH);
  
  LIST[element.id].done = LIST[element.id].done ? false : true;
}
```
## ❌Removiendo una tarea
Ahora, para decirle a nuestra aplicación que la tarea se ha removido, debemos crear una función:

```js
function removeToDo(element) {
  
}
```
En este momento lo que hacemos es darle funcionalidad, usaremos el ``element.parentNode`` para remover el elemento y luego marcaremos como verdadera a la  variable trash.

```js
function removeToDo(element) {
    element.parentNode.parentNode.removeChild(element.parentNode);

    LIST[element.id].trash = true;
}
```
## 🎯Target Element
Ahora crearemos la sección que escucha cuando el usuario clickea uno de los elementos para completar o remover una tarea, esto lo haremos con un ``addEventListener`` de la siguiente forma:

```js
list.addEventListener("click", function(event){

    const element = event.target;
    const elementJob = element.attributes.job.value;
    
} );
```
Declaramos un evento de tipo "clicK" y una función para realizar. Lo primero que hacemos es declarar las constantes element, y elementJob. Las cuales ya hemos utilizado para las funciones de completado y remover tareas. 

Ahora, lo que haremos es añadir una condicional y dependiendo de que atributo se añadio al ``elementJob``, realizaremos o un completado o un removido de la tarea. (El valor del ``elementJob`` se consigue del código de cada tarea)

```js
list.addEventListener("click", function(event){

    const element = event.target;
    const elementJob = element.attributes.job.value;
    
        if (elementJob == "complete") {
        completeToDo(element);
        }else if(elementJob == "delete") {
        removeToDo(element);
        }
    
} );
```

## 👅 Resumen
Al final de cada paso para llegar a nuestra primera Aplicación Web, pondré un ejemplo de como debió quedar tu código para poder continuar con el taller ❤. Tu  documento ``js`` debe lucir de esta forma:

```js

// Completar una tarea

function completeToDo(element) {
    element.classList.toggle(CHECK);
    element.classList.toggle(UNCHECK);
    element.parentNode.querySelector(".text").classList.toggle(LINE_THROUGH);

    LIST[element.id].done = LIST[element.id].done ? false : true;

}

// Remover una tarea
function removeToDo(element) {
    element.parentNode.parentNode.removeChild(element.parentNode);

    LIST[element.id].trash = true;

}

// Target elements

list.addEventListener("click", function(event){
    const element = event.target;
    const elementJob = element.attributes.job.value;

    if (elementJob == "complete") {
        completeToDo(element);
    }else if(elementJob == "delete") {
        removeToDo(element);
    }
} );

```

## [Anterior](https://github.com/MiguelRAvila/MiPrimeraAplicacionWeb/blob/master/Project:%204.-A%C3%B1adir%20un%20to-do:%20funciones%20y%20condicionales.md) - [Siguiente](https://github.com/MiguelRAvila/MiPrimeraAplicacionWeb/blob/master/Project:%206.-Recordando%20nuestras%20tareas.md)
