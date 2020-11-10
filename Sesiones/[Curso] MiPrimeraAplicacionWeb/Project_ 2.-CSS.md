# 💅 And play harder

<p align="center">
  <img  src="https://github.com/MiguelRAvila/MiPrimeraAplicacionWeb/blob/master/image5.png">
</p>

## 🎨 ¡Ahora el diseño!
Para que la aplicación web se vea como la presentamos originalmente, debemos trabajar con un archivo de ``css`` para cambiar y mejorar los diseños. Primero cambiaremos el ``body``, para ello escribiremos la etiqueta "body" completa y realizaremos los siguientes cambios:

* El ``padding`` será de 10px para que no se pegue con el navegador
* el ``margin`` será de 0
* Su ``font-family`` será la que descargamos con Google Fonts

```css
body{
    padding: 10px;
    margin: 0;
    background-color: rgba(0,0,0,0.1);
    font-family: 'Titillium Web', sans-serif;
}
```
### 🖍 Hora de diseñar clases con el Contenido
Para poder añadir un diseño css a una clase, se usa el ``.`` antes del nombre de la clase para poder modificar su diseño. Primero haremos cambios al contenedor con la etiqueta ``.contenedor``.

* Su ``width`` será de 380px, para darle un valor absoluto de ancho
* Su ``margin`` tiene un valor nulo y ``auto``, para centrar nuestra aplicación.

```css
.contenedor{
    width:380px;
    margin:0 auto;
}
```
### 🖌 Diseñemos el Header
<p align="center">
  <img  src="https://github.com/MiguelRAvila/MiPrimeraAplicacionWeb/blob/master/image6.png">
</p>

El ``header`` contiene muchos cambios en cuanto a su diseño.


* El ``width`` es de 100% para definir su ancho.
* Su ``height`` es de 200px para que tenga el largo que vemos en el diseño original
* Su ``background-image`` tendrá una ``url`` que lo vincule directamente a la imagen que queramos ponerle a nuestra lista
* Otras propiedades como el ``background-size`` y el ``background-repeat`` se usan para brindarle unas caracteristicas adicionales como el tamaño de 100% 200% para ajustarlo al tamaño del Header, o para decirle a nuestro diseño que no queremos que ese fondo se repita para rellenar el espacio donde se encuentra.
* El ``border-radius`` se usa para dotar de un borde redondeado al header, usaremos 15px 15px 0 0 para darle un borde redondeado solo a los extremos superiores.
* La ``position`` tendrá un valor "relative" para que se mantenga dentro de nuestro contenedor

```css
.header{
    width: 100%;
    height:200px;
    background-image: linear-gradient(rgba(0,0,0,0.4), rgba(0,0,0,0.4)), url('../img/bg.jpg');
    background-size: 100% 200%;
    background-repeat: no-repeat;
    border-radius: 15px 15px 0 0;
    position: relative;
}
```
Dentro de nuestro header, tenemos un ``div`` con la clase ``clear`` que representa al botón que encontramos en la parte superior derecha de nuestro proyecto. Para diseñar y colocar este espacio donde estará el botón, usaremos los siguientes estilos:

* El ``widht`` y ``height`` son de 30px
* Su ``position`` tiene un valor "absolute" que significa que se lo asignaremos nosotros para que quede exactamente donde queremos
* Su valor de posición ``right`` tiene un valor de 20px y su valor de posición ``top`` también tiene 20px

```css
.clear{
    width : 30px;
    height: 30px;
    position: absolute;
    right:20px;
    top: 20px;
}
```

#### 🎞 Animaciones y Pseudo-clases

Vayamos aún más allá. Dentro de nuestro ``div`` con clase ``clear`` tenemos una etiqueta ``i``,  en dondé estará el icono que queremos utilizar para borrar todos los elementos de nuestra lista. Este pequeño pero importante elemento contiene dos propiedades muy especiales que involucran tanto animaciones como algo llamado Pseudo-clases.

Primero veamos el comportamiento y diseño que tiene el icono sin activarlo. Su diseño es bastante simple, solamente tiene las propiedades del ``font-size`` con un valor de 30px y su ``color`` con un valor de #FFF para darle un blanco.

```css
.clear i{
    font-size: 30px;
    color: #FFF;
}
```
En cambio, en su segundo diseño, tenemos algo sumamente curioso. Este ".clear i", obtiene la Pseudo-clase ``hover``, con lo que únicamente se verá el diseño descrito a continuación cuando el usuario coloca su puntero por encima del icono.

* La etiqueta ``cursor`` con el valor ``pointer`` cambia la forma del cursor. 
* El text-shadow le brinda de una pequeña sombra
* Nuestra primera animación es la propiedad ``transform`` con un valor ``rotate`` de "45 grados"

```css
.clear i:hover{
    cursor: pointer;
    text-shadow: 1px 3px 5px #000;
    transform: rotate(45deg);
}
```

#### 📆 La fecha y sus propiedades

Como podrán apreciar en nuestro diseño, tenemos un pequeño texto que nos enseña la fecha del día en el que nos encontramos. Algo que debemos tomar en cuenta es que usamos una id para poder modificar sus propiedades. Para conseguir ese diseño, debemos trabajar sobre estas propiedades:

* La propiedad ``position`` tiene el valor "absolute" para poder manejar su pocisión de forma manual
* Las propiedades ``botton`` y ``left`` se usan para posicionarlo como lo vemos en el diseño original
* Para modificar la fuente usamos las propiedades de ``color`` (con valor de #FFF), ``font-size`` (con valor de 25px) y ``font-family`` (para asignarle la fuente que descargamos anteriormente).

```css
#date{
    position: absolute;
    bottom: 10px;
    left: 10px;
    color: #FFF;
    font-size: 25px;
    font-family: 'Titillium Web', sans-serif;
}
```


### 📃 Diseñemos nuestra lista (contenido)
<p align="center">
  <img  src="https://github.com/MiguelRAvila/MiPrimeraAplicacionWeb/blob/master/image7.png">
</p>
Primero tenemos un ``div`` con una clase "contenido". Este contenido tiene tendrá en su interior a los elementos de la lista o "items". El contenido tiene las siguientes propiedades: 

```css
.contenido{
    width:100%;
    height: 350px;
    max-height:350px;
    background-color: #FFF;
    overflow: auto;
}

.contenido::-webkit-scrollbar { 
    display: none; 
}
```
Dentro de nuestro contenido, encontramos la etiqueta ``ul`` la cual nos permitirá comenzar una lista, este elemento tiene las propiedades:

```css
.contenido ul{
    padding:0;
    margin:0;
}
```
#### ✏ ¿Qué diseño tendrá cada To-do?
Este diseño pertenece a cada elemento ``li`` con la clase "item". Las propiedades más relevantes a mencionar son:

* La propiedad ``position`` tiene un valor "relative" pues buscamos que el elemento permanezca dentro del contenido. 
* El ``border-bottom`` le da a nuestro elemento la pequeña linea debaj o para diferenciar las tareas que agreguemos.

```css
.item{
    width:100%;
    height: 45px;
    min-height: 45px;
    position: relative;
    border-bottom: 1px solid rgba(0,0,0,0.1);
    list-style: none;
    padding: 0;
    margin: 0;
}
```
Cada una de nuestras tareas contará con diferentes iconos que nos servirán para marcarlas como tareas ya realizadas y para eliminarlas cuando ya no las necesitemos en la lista. Por ello, estos pequeños elementos tienen ciertas propiedades como la Pseudoclase ``hover`` para que hagan algo especifico cuando el usuario ponga el cursor sobre ellas.

Comencemos con el pequeño circulo al lado izquierdo. Este es el que nos indica si la tarea ya se realizo o no. Sus propiedades son:
```css
.item i.co{
    position: absolute;
    font-size: 25px;
    padding-left:5px;
    left:15px;
    top:10px;
}

.item i.co:hover{
    cursor: pointer;
}

.fa-check-circle{
    color:#6eb200;
}
```
El siguiente elemento que tienen nuestras tareas es el texto con la etiqueta ``p`` y con la clase "text". A su vez, cuando la tarea se ve acompletada, este texto sufrirá de un cambio, las palabras dentro del texto tendrán una linea que las atraviese. Esto lo haremos con herramientas de javascript, pero crearemos las clases aquí. El texto tiene las siguientes propiedades:

```css
.item p.text{
    position: absolute;
    padding:0;
    margin:0;
    font-size: 20px;
    left:50px;
    top:5px;
    background-color: #FFF;
    max-width:285px;
}

.lineThrough{
    text-decoration: line-through;
    color : #ccc;
}
```
Por último tenemos el icono del bote de basura para poder eliminar nuestra tarea. Al igual que el circulo tiene un pequeño ``hover`` para notar que el usuario coloca su cursor sobre el elemento.

```css
.item i.de{
    position: absolute;
    font-size: 25px;
    right:15px;
    top:10px;
}
.item i.de:hover{
    color:#af0000;
    cursor: pointer;
}
```

### 📎 Add-Item, sus estilos 
<p align="center">
  <img  src="https://github.com/MiguelRAvila/MiPrimeraAplicacionWeb/blob/master/image8.png">
</p>
La sección que contiene el espacio donde colocaremos el texto para añadir nuestras tareas, contiene 3 partes escenciales a las que debemos dar forma y estilos. La primera es a toda la sección en si con la clase ``add-item``, el icono de añadir item, y por ultimo el ``input``, que es donde colocamos el texto.

```css
.add-item{
    position: relative;
    height:40px;
    background-color: #FFF;
    padding: 10px;
    border-top: 1px solid rgba(0,0,0,0.1);
}
```
Ahora tenemos el pequeño icono que indica que agreguemos elementos:

```css
.add-item i{
    position: absolute;
    font-size: 40px;
    color: #4162f6;
}
```
Por último, daremos estilo al ``input``

```css
.add-item input{
    position: absolute;
    left: 50px;
    height: 35px;
    width: 310px;
    background-color: transparent;
    border: none;
    font-size: 20px;
    padding-left:10px;
}
```
### 💡 Web-kit 
Como habrán notado cuando descargamos el repositorio de nuestro proyecto, el documento tenía unas cuentas clases con propiedades ya declaradas en la última parte. A esto lo llamamos Webkits! Ya que cada navegador sigue teniendo ciertos elementos diferentes uno con otro, necesitamos de estas lineas de codigo para que nuestra página web luzca bien y como queremos en cada navegador.

```css
.add-item input::-webkit-input-placeholder { /* Chrome/Opera/Safari */
    color: #4162f6;
    font-family: 'Titillium Web', sans-serif;
    font-size: 20px;
}
.add-item input::-moz-placeholder { /* Firefox 19 */
    color: #4162f6;
    font-family: 'Titillium Web', sans-serif;
    font-size: 20px;
}
.add-item input:-ms-input-placeholder { /* IE 10 */
    color: #4162f6;
    font-family: 'Titillium Web', sans-serif;
    font-size: 20px;
}
.add-item input:-moz-placeholder { /* Firefox 18 */
    color: #4162f6;
    font-family: 'Titillium Web', sans-serif;
    font-size: 20px;
}
```
## 👅 Resumen del css
Al final de cada paso para llegar a nuestra primera Aplicación Web, pondré un ejemplo de como debió quedar tu código para poder continuar con el taller ❤. Tu ``CSS`` debe lucir de esta forma:

```css
/* Body */

*, *::before, *::after {
    transition: .2s;
}

body{
    padding: 10px;
    margin: 0;
    background-color: rgba(0,0,0,0.1);
    font-family: 'Titillium Web', sans-serif;
}

/* contenedor */
.contenedor{
    width:100%;
    margin:0 auto;
}

/* Header  */
.header{
    width: 100%;
    height:200px;
    background-image: linear-gradient(rgba(0,0,0,0.4), rgba(0,0,0,0.4)), url('../img/bg.jpg');
    background-repeat: no-repeat;
    border-radius: 15px 15px 0 0;
    position: relative;
}
.clear{
    width : 30px;
    height: 30px;
    position: absolute;
    right:20px;
    top: 20px;
}
.clear i{
    font-size: 30px;
    color: #FFF;
}
.clear i:hover{
    cursor: pointer;
    text-shadow: 1px 3px 5px #000;
    transform: rotate(45deg);
}

#date{
    position: absolute;
    bottom: 10px;
    left: 10px;
    color: #FFF;
    font-size: 25px;
    font-family: 'Titillium Web', sans-serif;
}

/* contenido  */
.contenido{
    width:100%;
    height: 350px;
    max-height:350px;
    background-color: #FFF;
    overflow: auto;
}
.contenido::-webkit-scrollbar { 
    display: none; 
}
.contenido ul{
    padding:0;
    margin:0;
}
.item{
    width:100%;
    height: 45px;
    min-height: 45px;
    position: relative;
    border-bottom: 1px solid rgba(0,0,0,0.1);
    list-style: none;
    padding: 0;
    margin: 0;
}
.item i.co{
    position: absolute;
    font-size: 25px;
    padding-left:5px;
    left:15px;
    top:10px;
}
.item i.co:hover{
    cursor: pointer;
}
.fa-check-circle{
    color:#6eb200;
}

.item p.text{
    position: absolute;
    padding:0;
    margin:0;
    font-size: 20px;
    left:50px;
    top:5px;
    background-color: #FFF;
    max-width:285px;
}

.lineThrough{
    text-decoration: line-through;
    color : #ccc;
}
.item i.de{
    position: absolute;
    font-size: 25px;
    right:15px;
    top:10px;
}
.item i.de:hover{
    color:#af0000;
    cursor: pointer;
}

/* Add Item  */
.add-item{
    position: relative;
    height:40px;
    background-color: #FFF;
    padding: 10px;
    border-top: 1px solid rgba(0,0,0,0.1);
    border-radius: 0 0 15px 15px;
}
.add-item i{
    position: absolute;
    font-size: 40px;
    color: #4162f6;
}

.add-item input{
    position: absolute;
    left: 50px;
    height: 35px;
    background-color: transparent;
    border: none;
    font-size: 20px;
    padding-left:10px;
}
.add-item input::-webkit-input-placeholder { /* Chrome/Opera/Safari */
    color: #4162f6;
    font-family: 'Titillium Web', sans-serif;
    font-size: 20px;
}
.add-item input::-moz-placeholder { /* Firefox 19 */
    color: #4162f6;
    font-family: 'Titillium Web', sans-serif;
    font-size: 20px;
}
.add-item input:-ms-input-placeholder { /* IE 10 */
    color: #4162f6;
    font-family: 'Titillium Web', sans-serif;
    font-size: 20px;
}
.add-item input:-moz-placeholder { /* Firefox 18 */
    color: #4162f6;
    font-family: 'Titillium Web', sans-serif;
    font-size: 20px;
}
```

## [Anterior](https://github.com/MiguelRAvila/MiPrimeraAplicacionWeb/blob/master/Project:%201.-HTML.md) - [Siguiente](https://github.com/MiguelRAvila/MiPrimeraAplicacionWeb/blob/master/Project:%203.-Nuestros%20elementos%2C%20nuestras%20clases.md)
