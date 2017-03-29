# En un editor de texto

## Antes de empezar           
Es necesario que utilizar un editor de texto, y descargar un plugin para poder acceder a la terminal en el.

*Para Atom recomendamos el plugin: plataformio-ide-terminal


## Configuración

-Lo primero por hacer es crear una carpeta con el nombre del proyecto, y abrir esta carpeta en el editor de texto.

-Se requiere tener instalado node.js y npm

![as](https://cloud.githubusercontent.com/assets/22939434/24436646/e3ea7908-13f9-11e7-9caa-093332810f06.jpeg)
[Puedes descargar node.js aqui](https://nodejs.org/es/).

Se requiere utilizar un optimizador de tareas en este caso usaremos gulp.

## Instalando Gulp
-Se requiere instalar gulp,escribiendo lo siguiente en la terminal:

    npm install --global gulp-cli
  
-Se inicializa npm en el directorio de la carpeta del proyecto:

    npm init -y

Esto ocasionara que se cree un archivo **package.json** en la carpeta ,donde se guardaran las dependencias.

-Procederemos a instalar gulp como dependencia del proyecto.

    npm install --save-dev gulp

Notaras que aparecera lo siguiente en el archivo  **package.json**:

![gulp](https://cloud.githubusercontent.com/assets/22939434/24437355/dbc486b6-13fd-11e7-8e56-15e074b90fa4.jpeg)

*Todas las dependencias que instalemos apareceran en el archivo**package.json**.

## Trabajando en el gulpfile.js

-Lo siguiente es crear un dentro de la carpeta del proyecto un archivo gulpfile.js

![gulpfile](https://cloud.githubusercontent.com/assets/22939434/24437469/60291a0c-13fe-11e7-819f-153ce27b4f78.jpeg)


-A partir de ahora , traeremos las dependencias con el metodo **require**, empezando con gulp, escribiendo lo siguiente en el archivo **gulpfile.js**:

 ```javascript
const gulp = require('gulp'); 
 
```    
Recordando que el texto del parentesis tiene que tener el nombre del plugin.

-Lo siguiente por hacer es crear dos carpetas dentro de la carpeta del proyecto.Le puedes poner cualquier nombre a las carpetas nosotros les pondremos los siguientes nombres para ejemplificar: 

![src](https://cloud.githubusercontent.com/assets/22939434/24437879/e755a714-1400-11e7-8f9b-e09f245131e8.jpeg)
![des](https://cloud.githubusercontent.com/assets/22939434/24437880/e8882cf6-1400-11e7-934d-23063df3cb4e.jpeg)


-Dentro de la carpeta src( en nuestro caso ),crear un archivo .css.Le puedes poner cualquier nombre a las carpetas nosotros les pondremos los siguientes nombres para ejemplificar: 

![bart](https://cloud.githubusercontent.com/assets/22939434/24437926/4d76c050-1401-11e7-9fbf-12b42f3b443e.jpeg)

-Lo siguiente sera instalar gulp para postcss, escribiendo lo siguiente en la terminal:

    npm install --save-dev gulp-postcss
    
-Luego de esto se traera la dependencia gulp-postcss escribiendo lo siguiente en el archivo **gulpfile.js**:

 ```javascript
const postcss= require('gulp-postcss'); 
 
 ```    
 
-Se creara un vector donde se guardaran los nombres de los plugins, nosotros le pondremos el siguiente nombre:

 ```javascript
let postcssplugins=[

];
 
 ```    
 
-Crear una tarea escribiendo lo siguiente en el mismo archivo en el que estamos trabajando :

 ```javascript
gulp.task('nombre de la tarea', function(){
    gulp.src('./nombre de la carpeta con el archivo /*.css')
         .pipe(postcss(postcssplugins))
         .pipe(gulp.dest('./nombre de la otra carpeta'))

});
 
 ```    
 Para ejemplificar usaremos los siguientes nombres:
 
  ```javascript
gulp.task('tarea', function(){
    gulp.src('./src/*.css')
         .pipe(postcss(postcssplugins))
         .pipe(gulp.dest('./dist'))

});
 
 ```    
 
-Ahora se procedera a instalar los plugins en la terminal:

    npm install --save-dev nombre del plugin como esta en su repositorio

Descargando como ejemplo el plugin simple vars, se hace lo siguiente:

    npm install --save-dev postcss-simple-vars
  
  
-Se hara el require para el plugin:


 ```javascript
const simplevars = require('postcss-simple-vars'); 
 
```    

-Lo siguiente sera agregar el nombre del plugin en el vector:

 ```javascript
let postcssplugins=[
simplevars
];
 
 ```    

### El plugin esta listo para usarse

-Se prueba editando el archivo .css utilizando el plugin descargado,se guarda y se ejecuta la tarea gulp en la terminal, de la siguiente manera:

    gulp nombre de la tarea 
    
    gulp tarea

-Cuando el proceso en la terminal termine aparecera el archivo compilado .css en la carpeta de destino, de la siguiente manera:

![jfsjf](https://cloud.githubusercontent.com/assets/22939434/24438444/bbb7073e-1404-11e7-977f-518321eeda9f.jpeg)

**Algo incoveniente es que cada vez que se haga un cambio en el archivo .css se tendra que guardar y ejecutar la tarea en la terminal, pero esto tiene una solución.**

## Automatizando el proceso

-Se crea un tarea de gulp, con una tarea watch de la siguiente manera:

  ```javascript
gulp.task('default', function(){
    gulp.watch('./src/*.css',[nombre de la tarea]);
});
 
 ```    
 
   ```javascript
gulp.task('default', function(){
    gulp.watch('./src/*.css',[tarea]);
});
 
 ```    
El gulp.watch vigilara los archivos .css que estan contenidos en la carpeta y si hay algun cambio ejecutara, la tarea, asi lo unico que se tendra que hacer es ejecutar la tarea e ir guardando nuestros cambios en el archivo .css.















### [INICIO](https://github.com/juanmoguel/Introducci-n-a-Postcss/blob/master/Main.md)
