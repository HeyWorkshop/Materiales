# Herramientas para documentar código (INTRODUCCIÓN)

¿Porque debería documentar mi código?

Porque **documentar el código de un programa** es añadir suficiente información para lograr explicar lo que hace, punto por punto, de esta forma no sólo los ordenadores sabrán que hacer, sino que además los humanos lograrán entender lo que se está haciendo y por qué.
En pocas palabras: El código se documenta para que el programa se pueda reparar y modificar en el futuro.

## ¿Por qué primero ver Javadoc y luego Doxygen?

Doxygen utiliza como uno de sus estilos el de Javadoc, entre muchos otros a los que un programador tiene posibilidad de utilizar, igualmente utiliza estilos como C++ y algunos otros, sin embargo con Javadoc podremos aprender dos formas de documentar diferentes y de generar documentación HTML.

## ¿Entederé Javadoc sin saber java?

Serás capaz de aprender las bases de Javadoc y Doxygen para generar documentación HTML y en otros formatos, sin embargo no es necesario que conozcas del todo Java para poder utilizar estos estilos, Doxygen utiliza el estilo de Javadoc sin embargo este puede ser utilizado en otros lenguajes de programación como C++, C y Python. Ahora sólo necesitaremos entender lo que realiza cada clase, método o atributo que nos encontremos comentando, más adelante cada quien será libre de aprender Java y de utilizar estas herramientas para documentar los programas que necesiten.

## Instalación

* Necesitaremos JDK para Javadoc
* Doxygen
* La Terminal (No es del todo necesaria, porque podemos utilizar el IDE o la GUI de Doxygen)
* IDE o editor de texto

## Verificación

Entremos a la terminal y verifiquemos si poseemos Doxygen y Javadoc

 Verifiquemos que poseamos Javadoc
```bash
$ javadoc
```
 Verifiquemos que poseamos Doxygen
 ```bash
$ doxygen -v
```

## SOLUCIÓN DE ERRORES
*Deberias tener el JDK instalado sino, procede a instalarlo.
*Para los que posean Windows necesitarmeos:
 **Configurar el JDK de la siguiente manera:**
 
### Entraremos a nuestro explorar de archivos, al disco local principal, program files, java, jdk, bin y copiamos esa dirección:
(Puede o no ser la siguiente en tu PC, verificalo)
```text
C:\Program Files\Java\jdk1.8.0_162\bin
```
### Ahora nos vamos al explorador de archivos donde aparece los discos locales, colocamos click derecho y propiedades
**Entramos a configuración avanzada**

[![image.png](https://s17.postimg.org/4c4yhim27/image.png)](https://postimg.org/image/4c4yhim23/)

### Luego variables de entorno

[![image.png](https://s17.postimg.org/4c4yhk42n/image.png)](https://postimg.org/image/gqrqhvvkr/)

### Colocamos en PATH y editar

[![image.png](https://s17.postimg.org/i5tb6mjtb/image.png)](https://postimg.org/image/6gpbinsuj/)

### Colocamos nuevo, pegamos la dirección y aceptar a lo demás:

**NOTA: Verifiquemos que igual tengamos en PATH la siguiente dirección:**
```text
C:\Program Files\doxygen\bin
```

[![image.png](https://s17.postimg.org/dwol4gvzj/image.png)](https://postimg.org/image/ssn4c27e3/)


# Temas y Ejercicios
* [Javadoc](Talleres/Documentacion/Javadoc.md)
* [Doxygen](Talleres/Documentacion/Doxygen.md)
* [Ejercicios](Talleres/Documentacion/Ejercicios.md)
