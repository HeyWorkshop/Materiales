# Polymer

Necesitaremos:
* npm
* bower
* polyserve
* webcomponentsjs

## Instalación (producción)

Para usar Polymer en producción necesitas:
* bower
* webcomponentsjs
* polymer
* Nodejs
Seguidamente, instalar la libería **_Polymer_**

```bash
$ npm install -g polymer-cli
```

La bandera _--save_ es para agregar la dependencia al archivo bower.json

Iniciemos un nuevo proyecto con Polymer
```bash
$ polymer init
```

## Instalación (CDN)

Importar la siguiente etiqueta en el archivo que va a consumir el webcomponent

```html
<script src="https://polygit.org/components/webcomponentsjs/webcomponents-lite.js"></script>
```

Importar la siguiente etiqueta en el archivo que será consumido como webcomponent

```html
<link rel="import" href="https://polygit.org/components/polymer/polymer.html">
```

# Extras

## Instalación de npm

Primero, instalamos Node.js, puedes hacerlo desde la [página oficial](https://nodejs.org/en/), o ejecutar los siguientes comandos en tu terminal

```bash
$ sudo apt-get update
$ sudo apt-get install nodejs
$ sudo apt-get install npm
```

## Instalación de bower

Luego, instalaremos bower ejecutando los siguientes comandos en tu terminal
```bash
$ sudo npm install -g bower
```

## Creación nativa de un custom element
En la carpeta del proyecto, iniciar un proyecto con bower

```bash
$ bower init
```
Posteriormente, instala **_webcomponentsjs_**
```bash
$ bower install --save webcomponentsjs 
```
Luego instalemos polyserve
```bash
$ sudo npm isntall polyserve -g
```
Creemos un archivo llamado `index.html`, dentro de las etiquetas `<head>`, importemos el siguiente archivo
```html
<script src="/bower_components/webcomponentsjs/webcomponents-hi.js"></script>
```
Una vez creado nuestro archivo `index.html`, crearemos otro archivo con el nombre de nuestro componente
```text
mi-componente.html
```
**IMPORTANTE:** Por convención los custom elements **siempre** deben de llevar un nombre compuesto por **dos palabras** y deben de estar de **separadas por guión medio**, como se muestra en el ejemplo.

# Creación de un elemento con Polymer
En la carpeta del proyecto, iniciar un proyecto con Polymer

```bash
$ polymer init
```
Para ejecutar el servidor usa
```bash
$ polymer serve
```