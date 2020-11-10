# 🧠 Comencemos con Javascript

En este momento comenzaremos con los pasos para elaborar el cerebro de nuestra aplicación web. 

## 🤗 Conceptos

### Tipos de datos
En javascript existen muchos tipos de datos, entre los más importantes que usaremos serán las variables, declaradas ``var`` o ``let``, las constantes ``const``, los strings, que son cadenas de caracteres. 

### querySelector
El metodo ``querySelector`` nos devuelve el primer elemento del documento (utilizando un recorrido ordenado de los nodos de nuestro documento) que coincida con el grupo especificado de selectores. En este caso, queremos que busque el elemento que tenga la clase ".clear".Y el elemento que nos devuelva lo guardamos en la constante ``clear``. 

```js
const clear = document.querySelector(".clear");
```

### getElementById
El metodo ``getElementById`` nos devuelve el elemento que contenga el id único (sensible a mayusculas) de nuestro documento. En este caso lo usaremos para obtener los elementos de la fecha, lista y nuestro input.

## ✔ Seleccionar elementos
Primero debemos seleccionar que elementos de nuestro documento html necesitaremos para comenzar a trabajar. Para ello, utilizaremos la interfaz ``document`` para decirle a nuestro código que trabajaremos en el documento HTML al que esta vinculado. Tambien usaremos los metodos ``querySelector`` y ``getElementById``.


```js
const dateElement = document.getElementById("date");
const list = document.getElementById("lista");
const input = document.getElementById("input");
```

## 👀 Declarando clases
Como mencionamos anteriormente en el apartado de css y de html, declaramos ciertas clases y les dimos cierto diseño para poder usarlas posteriormente. Es en este momento donde declararemos estas clases en constanes para poder usarlas de una forma mas sencilla en el futuro. Esto se hace para no tener que escribir el nombre completo de la clase sino simplemente llamarla mediante una constante declarada. Las declararemos en mayusculas para diferenciarlas del resto. 

```js
const CHECK = "fa-check-circle";
const UNCHECK = "fa-circle-thin";
const LINE_THROUGH = "lineThrough";
```

## 📆 ¿Como mostramos la fecha?
Para mostrar la fecha de nuestro documento, necesitaremos llamar a la constante que declaramos arriba ``dateElement`` y usaremos su propiedad ``innerHTML``, esto lo igualaremos al metodo ``toLocaleDateString()`` que contendrá en sus parentesis dos propiedades ("idioma y lugar del idioma", "opciones")

```js
dateElement.innerHTML = today.toLocaleDateString("es-US", options);
```

Declaremos arriba de este codigo una constante llamada ``options`` la cual contendrá las propiedades que mostrarán la forma en como se verá nuestra fecha. Estas propiedades son ``month``, ``day`` y ``weekday``, las cuales nos permitirán cambiar la forma en como se ve el mes, la fecha y el día respectivamente. 

```js
const options = { month:"short", day:"numeric", weekday:"long"};
```

Tambien declararemos una constante llamada ``today`` para almacenar dicha fecha. Ya habiendo terminado todo esto, nuestro código lucirá asi:

```js
const options = { month:"short", day:"numeric", weekday:"long"};
const today = new Date();

dateElement.innerHTML = today.toLocaleDateString("es-US", options);
```

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

// Mostrar fecha
const options = { month:"short", day:"numeric", weekday:"long"};
const today = new Date();

dateElement.innerHTML = today.toLocaleDateString("es-US", options);

```

## [Anterior](https://github.com/MiguelRAvila/MiPrimeraAplicacionWeb/blob/master/Project:%202.-CSS.md) - [Siguiente](https://github.com/MiguelRAvila/MiPrimeraAplicacionWeb/blob/master/Project:%204.-A%C3%B1adir%20un%20to-do:%20funciones%20y%20condicionales.md)
