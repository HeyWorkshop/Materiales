# 💼 Let´s work hard...

<p align="center">
  <img  src="https://github.com/MiguelRAvila/MiPrimeraAplicacionWeb/blob/master/image4.png">
</p>

## 💀 Primero el esqueleto
Primero, lo más divetido. Hacer un documento HTML básico con su ``head`` y ``body``, además de las etiquetas meta. Eso, o si tenemos Visual Studio Code, solamente escribir ``html:5``. 

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    
</body>
</html>
```
### 📏 Maquetemos
Debemos tener muy en cuenta cual es el contenido de nuestra aplicación web y como podemos maquetarla para que podamos añadirle estilos y posteriormente darle funcionalidad con Javascript. Esto lo haremos en el ``<body>`` y usaremos las siguientes etiquetas:

```html
<div class="contenedor">
        <div class="header">

        </div>
        <div class="contenido">
            <ul id="lista">
              
            </ul>
        </div>
        <div class="add-item">

        </div>
    </div>
```
### 📐 ¿Header?
Dentro del header colocaremos otro ``div`` para que contenga nuestro ícono de reinicio así como otro ``div`` para contener la fecha de nuestra lista.

```html
        <div class="header">
            <div class="clear">
                <i class="fa fa-refresh"></i>
            </div>
            <div id="date"></div>
        </div>
```
### 📃 Nuestro contenido: la lista
En nuestro contenido, más especificamente, dentro de nuestra ``ul`` con una id de "lista" escribiremos un item de ejemplo para que podamos guiarnos y más tarde lo diseñemos de la mejor forma posible. 

```html
        <div class="contenedor">
            <ul id="lista">
                <li class="item">
                    <i class="fa fa-circle-thin co" job="complete" id="0"></i>
                    <p class="text">Tomar un café</p>
                    <i class="fa fa-trash-o de" job="delete" id="0"></i>
                </li>
            </ul>
        </div>
```
### 📎 ¿Dónde añadimos un elemento a la lista?
Dentro de nuestro ``div`` con clase "add-item" encontraremos el ícono de añadir una nueva tarea a la lista, así como un ``input`` para que el usuario ingrese su tarea. 

```html
        <div class="add-item">
            <i class="fa fa-plus-circle"></i>
            <input type="text" id="input" placeholder="Añadir una tarea">
        </div>
```

## 👅 Resumen
Al final de cada paso para llegar a nuestra primera Aplicación Web, pondré un ejemplo de como debió quedar tu código para poder continuar con el taller ❤. Tu ``HTML`` debe lucir de esta forma:

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>To Do List</title>
</head>
<body>
    <div class="contenedor">
        <div class="header">
            <div class="clear">
                <i class="fa fa-refresh"></i>
            </div>
            <div id="date"></div>
        </div>
        <div class="contenido">
            <ul id="lista">
                <!-- <li class="item">
                    <i class="fa fa-circle-thin co" job="complete" id="0"></i>
                    <p class="text">Beber Café</p>
                    <i class="fa fa-trash-o de" job="delete" id="0"></i>
                </li> -->
            </ul>
        </div>
        <div class="add-item">
            <i class="fa fa-plus-circle"></i>
            <input type="text" id="input" placeholder="Añadir una tarea">
        </div>
    </div>
</body>
</html>
```

## [Anterior](https://github.com/MiguelRAvila/MiPrimeraAplicacionWeb/blob/master/3.-NuestroProyecto.md) - [Siguiente](https://github.com/MiguelRAvila/MiPrimeraAplicacionWeb/blob/master/Project:%202.-CSS.md)
