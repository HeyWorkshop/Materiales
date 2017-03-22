# GULP
## ¿QUÉ ES GULP?

Gulp.js es un build system(sistema de construcción) que permite automatizar tareas comunes de desarrollo.
Adicionalmente Gulp.js está construído con Javascript, funciona sobre Node.js y es Open Source, así que su código fuente lo puedes encontrar en github.


## ¿POR QUÉ TE DEBERÍA INTERESAR USAR GULP?

Muchas de las tareas que tenemos que hacer como desarrolladores son repetitivas. Compilar Stylus, refrescar el navegador al hacer un cambio, comprimir los archivos js y css... Gulp nos permite automatizar todas esas tareas para poder aprovechar el tiempo en actividades más productivas. El **tiempo es el activo MÁS VALIOSO , y cuantas más tareas podamos automatizar, más tiempo podremos enfocarnos en cosas importantes**.

Para hacer todo esto nos permite definir tareas (`tasks`) en las que definimos la lógica de cada cosa que queramos automatizar.




## INSTALACIÓN

Gulp funciona bajo Node.js. Para instalarlo, abre una terminal y ejecuta: 

```npm install -g gulp``` 


Esto instalará Gulp de forma global en el equipo. 

Si estás usando Linux o Mac, tal vez necesites anteponer la palabra sudo para poder ejecutar este comando con los permisos de administrador, así:

```markup
sudo npm install -g gulp
```

Verificamos que Gulp.js ha sido instalado correctamente.

```markup
gulp -v
```

Si lo tenemos instalado correctamente, nos mostrará lo siguiente:
```
CLI version 3.8.6
Local version undefined
```
Donde CLI version es la versión de Gulp.js instalada en nuestro sistema y Local version es la versión de Gulp.js instalada en nuestro proyecto local, pero como aún no hemos creado nuestro proyecto nos saldrá undefined.

Ahora hay que instalarlo de forma local en el directorio de tu proyecto:

```markup
npm install --save-dev gulp 
```


Por último, crea un archivo llamado gulpfile.js en el directorio raíz de tu proyecto, y por el momento, incluye el siguiente contenido:

```
var gulp = require('gulp');

gulp.task('default', function() {  
  console.log('gulp!');
});
```

Si ahora vas a la terminal y ejecutas gulp, aparecerá algo como lo siguiente:
```
[20:40:29] Using gulpfile ~/Escritorio/tutorial-gulp/gulpfile.js
[20:40:29] Starting 'default'...
gulp!  
[20:40:29] Finished 'default' after 55 μs
```

#### ¡Listo! : Ya sabes cómo instalar Gulp :)


## PRIMEROS PASOS..

### GULP.TASK()

Con el método `gulp.task() ` definimos una tarea, este método toma 3 argumentos: 
+ el nombre de la tarea
+  la ó las tareas de las que depende esta tarea 
+   la función que ejecutará al llamar esta tarea.

```
var gulp = require('gulp');

gulp.task('default', function() {  
  console.log('gulp!');
});

gulp.task('hola', function() {  
  console.log('Hola!');
});
```

Si nos vamos a la terminal, podremos ejecutar cada tarea poniendo` gulp` + el nombre de la tarea:

```markup
gulp hola       
```

La tarea default es la que se ejecutará por defecto, cuando tan solo pongamos gulp.

(Por lo explicado , y usando el ejemplo arriba expuesto , si escribieramos en la terminal `gulp hola`, el resultado sería :`Hola!`.
En cambio, si escribieramos en la terminal `gulp `, el resultado sería : `gulp!`)



### Plugins

Existen multitud de plugins para hacer tareas con Gulp. Para poder usarlos, antes debemos instalarlos. 

En el sitio web de Gulp puedes buscar entre los plugins existentes. Los plugins están en npm, por lo que se instalan igual que cualquier otro paquete, con npm install.

Si no sabes cómo funciona un plugin, busca en su documentación. En ocasiones puede ser que el plugin únicamente haga de conector a la librería que hace todo el trabajo, por lo que en ese caso la documentación de la librería suele ser suficiente (a los plugins únicamente se les suele pasar un objeto con la configuración).

### Abrir, modificar y guardar archivos

Para poder realizar operaciones sobre archivos, antes debemos decir a Gulp dónde se encuentran.

Esto lo hacemos con el método `src()`, indicando la ruta o un array con las rutas de todos los archivos que queramos.

```markup
gulp.src('src/css/estilos.css')
```
Con el  método `pipe()`le decimos a Gulp qué queremos hacer sobre los archivos,es decir,sirve para encadenar tareas.
Y con el método `dest() ` indicamos dónde queremos guardar el archivo.

```markup
gulp.src('src/css/estilos.css')  
  .pipe(minify())
  .pipe(gulp.dest('css/'));
  ```
Este método acepta como parámetro una ruta válida en el sistema, y guardará el archivo con el mismo nombre. En caso de que ya exista un archivo con ese nombre, lo sobreescribirá.

Cabe destacar que Gulp no hace las operaciones directamente sobre el archivo, sino que carga el archivo en memoria y debemos indicarlo cuándo y dónde queremos guardar los cambios.

#### Renombrar archivos
Gulp no trae incorporado ningún método para cambiar el nombre del archivo, pero podemos instalar un plugin para ello:
```markup
npm install --save-dev gulp-rename  
```
A este plugin le indicamos el nuevo nombre del archivo, y después lo guardamos en la ruta que queramos con ` gulp.dest()`.
```markup
gulp.task('css', function() {  
  gulp.src('estilos.css')
    .pipe(minify())
    .pipe(rename('estilos.min.css'))
    .pipe(gulp.dest('.'));
});

```
Cada vez que ejecutemos gulp css se comprimirá el contenido del archivo CSS, modificaremos su nombre y lo guardaremos en el mismo directorio.

#### Observar cambios en los archivos

A veces queremos hacer operaciones cada vez que modifiquemos un archivo. Para observar cuándo un archivo es modificado usamos el método ` watch.`
Siguiendo el anterior ejemplo con el archivo CSS, podemos querer que nuestro archivo se comprima cada vez que guardamos los cambios.
```markup
gulp.task('watch', function () {  
  gulp.watch('estilos.css', ['css']);
});
```

Como primer parámetro recibe el nombre del archivo a observar, y como segundo un array con las tareas que debe ejecutar cuando haya cambios. Si queremos observar varios archivos, podemos usar el asterisco * como comodín:
```markup
*.css -> Todos los archivos CSS del directorio
*.js -> Todos los archivos JS del directorio
* -> Todos los archivos del directorio
css/*.css -> Todos los archivos CSS del directorio css/  
**/*.css -> Todos los archivos CSS, incluyendo los subdirectorios
```

#### Encadenar tareas

Podemos indicar que, al ejecutar una tarea, se ejecute otra antes. Por ejemplo, que la tarea que comprime el CSS antes ejecute Stylus. Para ello tenemos que pasar un array con el nombre de las tareas como segundo parámetro al método task.
```markup
gulp.task('css', ['stylus'], function() {  
  gulp.src('estilos.css')
    .pipe(minify())
    .pipe(rename('estilos.min.css'))
    .pipe(gulp.dest('.'));
});
```



Ahora, al hacer gulp css también se ejecutará la tarea stylus.

##### Si deseas saber más ,ingresa a : http://gulpjs.com/
:) 
Otras páginas que podrían serte de ayuda:

https://frontendlabs.io/1669--gulp-js-en-espanol-tutorial-basico-primeros-pasos-y-ejemplos

https://www.smashingmagazine.com/2014/06/building-with-gulp/