# Ramas (Branches)

![Rama](Images/Rama.png)

### ¿Qué es una rama?

Es una linea de tiempo en nuestro proyecto, que nos sirven para arreglar errores, experimentar, hacer grandes cambios, etc.

### Ejemplo práctico

Vamos a presentar un ejemplo simple de ramificar y de fusionar, con un flujo de trabajo que se podría presentar en la realidad. Imagina que sigues los siguientes pasos:

1. Trabajas en un sitio web.
2. Creas una rama para un nuevo tema sobre el que quieres trabajar.
3. Realizas algo de trabajo en esa rama.

En este momento, recibes una llamada avisándote de un problema crítico que has de resolver. Y sigues los siguientes pasos:

1. Vuelves a la rama de producción original.
2. Creas una nueva rama para el problema crítico y lo resuelves trabajando en ella.
3. Tras las pertinentes pruebas, fusionas (merge) esa rama y la envías (push) a la rama de producción.
4. Vuelves a la rama del tema en que andabas antes de la llamada y continuas tu trabajo.

![Trabajador](Images/trabajador.gif)

***

#### Head

Head es en el commit donde nos encontramos. Es decir, que si nosotros hacemos un checkout, éste será nuestro head.

![Head](Images/head.png)

#### Rama Main

La rama main es en donde comenzamos a trabajar, es la rama principal y estable de nuestro proyecto.

**Nota:** Esta rama suele usarse para tener las versiones "estables" de los proyectos.

### Manejando las ramas

* Crear una rama es tán simple como escribir

`$ git branch <Nombre de la rama>`

Para luego pasarnos a ella escribiendo `$ git checkout <Nombre de la rama>`

**O**

* Podemos crear la rama y pasarnos a ella directamente (**Usado mayormente**)

`$ git checkout -b <Nombre de la rama>`

* Para ver nuestras ramas locales

`$ git branch`

* Para ver las ramas locales y remotas

`$ git branch -a`

* Para eliminar una rama

`$ git branch -d <Nombre de la rama>`

***


## [Anterior 👈](Page4.md)  -  [👉 Siguiente](Page6.md)