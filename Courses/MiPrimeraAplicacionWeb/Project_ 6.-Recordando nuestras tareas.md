# 📦 BONUS: Guardando en el storage
Este es el último paso de nuestra aplicación web, aquí guardaremos nuestra información para que cuando recarguemos la página, nuestras tareas sigan ahi!

## 🤗 Conceptos
### 🤔 ¿LocalStorage?
Cuando queremos que ciertos datos, variables o información se guarden en la memoria local del usuario, usamos la herramienta ``localStorage`` para hacerlo. Esta herramienta tiene diferentes métodos a utilizar, como lo son el ``setItem`` que sirve para almacenar, o el ``getItem`` que nos sirve para obtener información del almacenamiento local. Usaremos esta herramienta para guardar nuestras tareas y recuperarlas cuando recarguemos la página.

### 🤓JSON
En palabra simples, JSON es un formato ligero de intercambio de datos. Puede que leerlo y escribirlo es simple para humanos, pero para las máquinas es simple interpretarlo y generarlo. En javascript, usaremos las funciones ``parse`` y ``stringify`` de JSON para interpretar strings y para convertir información a strings respectivamente.

### 😦 Métodos extra que usaremos
#### lenght
El metodo .lenght se utiliza para recuperar el ultimo elemento de una variable/objeto de cierta clase. Por ejemplo, nosotros usaremos más adelante este metodo para recuperar el ultimo "id" que se haya guardado. Este metodo devuelve el siguiente elemento del que se almaceno, lo cual significa que si el usuario almacena 10 tareas, el metodo ``lenght`` nos devolvera el id numero 11. 


## ✏ Apliquemos los conceptos de localStorage
### 🔀Cambiemos las variables (again)
Lo primero que debemos hacer es modificar la forma en la que declaramos las variables ``LISTA`` e ``Id`` en la sección de Variables. Esto es porque al momento de recuperar las tareas que no hemos eliminado, necesitaremos que estos valores no sean declarados en cero, sino solamente existan sin ningun valor dentro. 

```js
//Variables

let LIST, id;
```

### 💻Añadir tareas a nuestro almacenamiento local
Para lograr añadir los datos a nuestro almacenamiento local, usaremos el ``localStorage`` con su función ``setItem`` para añadir estos valores al almacenamiento local. Ahora, para especificar en donde y a que variable se agregaran, modificaremos las propiedades "key" y el "value" que queremos almacenar. Además, usaremos el método ``JSON.stringify()`` para convertir nuestra LISTA en un string. (NOTA ROJA: Este código lo debemos colocar en todas las secciones donde la variable objeto LISTA se vea modificada

```js
localStorage.setItem("TODO", JSON.stringify(LIST)); 
```
En este caso, nosotros actualizamos la LISTA en dos puntos:

```js
//Escuchar Enter
document.addEventListener("keyup", function (event) {
    if (event.keyCode == 13) {
        const toDo = input.value;
        //Si el input no está vacio
        if (toDo) {
            addToDo(toDo, id, false, false);
            LIST.push({
                name: toDo,
                id: id,
                done: false,
                trash: false,
            });
            // Añadir tares al almacenamiento local
            localStorage.setItem("TODO", JSON.stringify(LIST));
            id++;
        }
        input.value = "";
    }
});
// Target elements

list.addEventListener("click", function (event) {
    const element = event.target;
    const elementJob = element.attributes.job.value;

    if (elementJob == "complete") {
        completeToDo(element);
    } else if (elementJob == "delete") {
        removeToDo(element);
    }

    // Añadir tares al almacenamiento local
    localStorage.setItem("TODO", JSON.stringify(LIST));
});
```
### 💾Recuperemos tareas del almacenamiento local
Para recuperar nuestras tareas del almacenamiento local del usuario, nosotros declararemos otra variable, la cual llamaremos ``data``, para almacenar ahi toda esa información que guardamos. Eso lo haremos usando el metodo ``getItem`` del ``localStorage`` para recuperar dicha información.

```js
//Obtener las tareas del almacenamiento local
let data = localStorage.getItem("TODO");
```
Ahora, lo más importante, necesitaremos una condicional, ya que si la variable ``data`` está vacia, significará que el usuario no tenia tareas guardadas cuando dejo de usar la aplicación, o es la primera vez que la usa. 

En caso de que la variable "data" tenga algo dentro, nosotros recuperaremos esos valores y los recuperaremos con ``JSON.parse()`` y ``.length`` para almacenarlos de vuelta en LIST e Id respectivamente. Y entonces podremos cargar esa información con la función ``loadItem`` que crearemos proximamente (en 5 minutos).

Sin embargo, si no existen datos dentro, lo que haremos es darle un valor 0 a las variables LIST e Id.

```js
if (data) {

    LIST = JSON.parse(data);
    id = LIST.length;
    loadList(LIST);
    
} else {

    LIST = [];
    id = 0;
}
```
### 💽¡Carguemos las tareas!
Para finalizar con nuestra aplicación, crearemos la función que cargará las tareas que recuperamos en el paso anterior y las mostrará al usuario. Esto lo lograremos creando una función llamada ``loadList`` que usará un "array" como parametro:

```js
function loadList(array){

}
```
Y ahora, tenemos que hacer un loop, con otra función dentro de nuestra función con el array junto con el metodo ``forEach``, con parametro de ``item`` para modificar todos los elementos de nuestra LISTA.

```js
//Cargar items
function loadList(array) {

    array.forEach(function (item) {
    

    });
}
```
Ahora, dentro de esta nueva función, llamaremos a nuestra vieja amiga, la función ``addTodo`` y le asignaremos los valores "(item.name, item.id, item.done, item.trash)" de esta forma:

```js
//Cargar tareas
function loadList(array) {

    array.forEach(function (item) {
    
    addToDo(item.name, item.id, item.done, item.trash);
    
    });
}
```
### ❌Borremos todo!
Ahora, para finalizar nuestro proyecto, y darle funcionalidad al botoncito de "borrar todo" en la esquina superior derecha de nuestro proyecto, nosotros haremos lo siguiente:

Usando la constante que declaramos al inicio ``clear`` y el metodo ``addEventListener``, crearemos una función, que al mometode escuchar un clicl, elimine el localStorage y recargue la página.

```js
clear.addEventListener("click", function () {
    localStorage.clear();
    location.reload();
})
```

## 👅 Resumen
Ya hemos finalizado nuestro código de Javascript! Y si todo ha salido bien, tu código ``js`` debe lucir de la siguiente forma:

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

let LIST, id;

//Obtener las tareas del almacenamiento local
let data = localStorage.getItem("TODO");

if (data) {
    LIST = JSON.parse(data);
    id = LIST.length;
    loadList(LIST);
} else {
    LIST = [];
    id = 0;
}

//Cargar tareas
function loadList(array) {
    array.forEach(function (item) {
        addToDo(item.name, item.id, item.done, item.trash);
    });
}

//Clear Button
clear.addEventListener("click", function () {
    localStorage.clear();
    location.reload();
})

// Mostrar fecha
const options = { month: "short", day: "numeric", weekday: "long" };
const today = new Date();

dateElement.innerHTML = today.toLocaleDateString("es-US", options);

// Añadir una tarea

function addToDo(toDo, id, done, trash) {

    if (trash) {
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

// Escuchar Enter

document.addEventListener("keyup", function (event) {
    if (event.keyCode == 13) {
        const toDo = input.value;
        //Checar si el input no esta vacio
        if (toDo) {
            addToDo(toDo, id, false, false);
            LIST.push({
                name: toDo,
                id: id,
                done: false,
                trash: false,
            });
            // Añadir tares al almacenamiento local
            localStorage.setItem("TODO", JSON.stringify(LIST));
            //Añadimos una unidad al valor de la id
            id++;
        }
        //Luego, vaciamos el input
        input.value = "";
    }
});

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

list.addEventListener("click", function (event) {
    const element = event.target;
    const elementJob = element.attributes.job.value;

    if (elementJob == "complete") {
        completeToDo(element);
    } else if (elementJob == "delete") {
        removeToDo(element);
    }

    // Añadir tares al almacenamiento local
    localStorage.setItem("TODO", JSON.stringify(LIST));
});
```

## [Anterior](https://github.com/MiguelRAvila/MiPrimeraAplicacionWeb/blob/master/Project:%205.-%20Completar%20y%20Remover%20una%20tarea.md) - [Home](https://github.com/MiguelRAvila/MiPrimeraAplicacionWeb/blob/master/1.-home.md)

