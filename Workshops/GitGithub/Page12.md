# **Ejercicios**
Los siguientes ejercicios te ayudaran a practicar los comandos de git trabajando con repositorios remotos.

**Ejercicio 1**

**1. Crea tu cuenta de Github**
***
**2. Crea un repositorio**   
Agregando una descripción.


[![repositorio.jpg](https://s26.postimg.org/b5bfbsl21/repositorio.jpg)](https://postimg.org/image/xu0mbd2fp/)
***
**3. Crea una carpeta en tu computadora**

<code> mkdir Nombre_carpeta</code>

[![image.jpg](https://s26.postimg.org/o871v2ba1/image.jpg)](https://postimg.org/image/okyg18tjp/)
***
**4. Clona tu repositorio**  
Haz la clonación dentro de tu carpeta creada anteriormente.

<code> git clone URL_repositorio </code>

Puedes copiar el link oprimiendo el botón en el repositorio.

[![image.jpg](https://s26.postimg.org/t1vednx5l/image.jpg)](https://postimg.org/image/ndp3mrst1/)

Observaras lo siguiente:

[![image.jpg](https://s26.postimg.org/pxpbum5qx/image.jpg)](https://postimg.org/image/pxpbum5qt/)

Notarás que ahora tu carpeta tendrá otra carpeta con el nombre del repositorio que creaste.

[![image.jpg](https://s26.postimg.org/gwfduqx7d/image.jpg)](https://postimg.org/image/syarow6fp/)

***
**5. Verifica que el repositorio remoto está configurado con tu proyecto**

<code> git remote -v </code>

Observaras lo siguiente:

[![image.jpg](https://s26.postimg.org/6dfe5kujd/image.jpg)](https://postimg.org/image/kjv50t5ed/)

***
**6. Crea un documento en la carpeta del repositorio remoto**

[![image.jpg](https://s26.postimg.org/qyyrb81i1/image.jpg)](https://postimg.org/image/jvqvvlw2d/)

[![image.jpg](https://s26.postimg.org/m8f0gse1l/image.jpg)](https://postimg.org/image/gk8ppw9p1/)

***
**7. Indicale a git que siga el nuevo documento y haz commit**

<code> git add Nombre_documento </code>

<code> git commit -m "Mensaje" </code>

[![image.jpg](https://s26.postimg.org/5zys7b57d/image.jpg)](https://postimg.org/image/ut8c7yo7p/)

***
**8. Sube los cambios al repositorio remoto**

<code> git push Nombre_Repositorio_remoto Nombre_rama </code>

En este caso:

<code> git push origin master </code>

[![image.jpg](https://s26.postimg.org/3lbi0mec9/image.jpg)](https://postimg.org/image/klue9ardh/)

Notaras lo siguiente en el repositorio de Github:

[![image.jpg](https://s26.postimg.org/9ot2kj4m1/image.jpg)](https://postimg.org/image/tjf46njth/)

***
**9. Cambia tu documento**

[![image.jpg](https://s26.postimg.org/h629zqu55/image.jpg)](https://postimg.org/image/6vzv0i49h/)

***
**10. Haz commit**

<code> git add Nombre_documento </code>

<code> git commit -m "Mensaje" </code>

[![image.jpg](https://s26.postimg.org/8cbdin76h/image.jpg)](https://postimg.org/image/nl1awf0ut/)

***
**11. Sube tus cambios de nuevo**

<code> git push Nombre_Repositorio_remoto Nombre_rama </code>

En este caso:

<code> git push origin master </code>

[![image.jpg](https://s26.postimg.org/v2aibmqe1/image.jpg)](https://postimg.org/image/mwsgdh251/)

Notaras lo siguiente en el repositorio:

[![image.jpg](https://s26.postimg.org/od3yvm521/image.jpg)](https://postimg.org/image/580pluqdx/)

