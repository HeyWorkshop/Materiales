# Lo escencial
## Comandos básicos

* `$ git init`
Este comando marca el inicio de nuestro proyecto, aquí le decimos a Git que empiece a monitorear todos nuestros cambios.

* `$ git status`
Estado de nuestro proyecto.

* `$ git add <Nombre del archivo/Path del archivo>` 
Con este comando decidimos qué archivos están listos para el siguiente paso. **Nota:** Añadiendo <.> se agrega todo lo de la carpeta.

* `$ git commit -m "Mensaje del commit"`
Guardamos los cambios con un mensaje para identificarlos. 

* `$ git commit --amend -m "Nuevo mensaje del commit"` Sobreescribimos el último commit con nuevos datos.

* `$ git log`
Nos da una lista de todos los commits de la **rama actual** con su respectiva información.  

* `$ git reflog`
Nos da una lista de todos los commits del **repositorio** con su respectiva información.

* `$ git checkout <Nombre de la rama o identificador del commit>`
Con este comando viajamos a través de nuestros commits o nuestras ramas.
 ***

## Comandos para ayuda

* `$ git help <comando>`

* `$ git <comando> --help`

* `$ man git-<comando>`

## Estados de los archivos

Cada archivo de tu directorio de trabajo puede estar en uno de estos dos estados: 
* Bajo seguimiento (**tracked**)
* Sin seguimiento (**untracked**)

Los archivos **bajo seguimiento** son aquellos que existían en la última instantánea; pueden estar: 
* Sin modificaciones (**unmodified**) 
* Modificados (**modified**)
* preparados (**staged**)

Los archivos **sin seguimiento** son todos los demás —cualquier archivo de tu directorio que no estuviese en tu última instantánea ni está en tu área de preparación—.

A medida que editas archivos, Git los ve como modificados, porque los has cambiado desde tu última confirmación. Preparas estos archivos modificados y luego confirmas todos los cambios que hayas preparado, y el ciclo se repite.

![File Status](Images/filestatus.jpg)

***

## [Anterior](Page3.md)  --  [Siguiente](Page5.md)
