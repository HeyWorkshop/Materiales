# Como funciona Foundation

Antes de empezar hagamos un ajuste a nuestro archivo **index.html**, como te habrás dado cuenta, por defecto trae un montón de estructuras ya creadas, sin embargo, nosotros queremos hacer nuestro propio proyecto, asi que las quitaremos.

**Antes**

![](assets/dir1.png)

y así es como debe quedar:

**Después**

![](assets/init1.png)

**IMPORTANTE!** Los scripts son necesarios para que Foundation funcione, así que hay que dejarlos.

Como te darás cuenta borré todo el contenido de estructuras desde la etiqueta `<body>` dejando unicamente los scripts de al final, antes de `</body>`.

## Empezemos

Para empezar daremos sentido al concepto de [Grillas](page2.md) que mecionamos anteriormente.

Veamoslo con un ejemplo:

Piensa en cada estructura de Foundation como un contenedor, donde las `.row` son las cajas y las `.column` es el contenido.

**Para buenas prácticas de programación yo sugiero dividir el código en secciones con un id. (No es necesario)**

Pongamosle una estructura para Redes sociales a nuestra página web

``` html
<section id="social-container">
  <div class="row">
    <div class="column">

    </div>
  </div>
</section>
```
Esta es la estructura básica de una estructura, ahora, ¿Recuerdas que teniamos un paquete de iconos?, ha llegado la hora de usarlo.


<!-- Este framework como algunos otros se basa en la característica **mobile-first**, esto quiere decir que la disposición de las columnas se heredadan de su antecesor(la disposición más pequeña), a menos que estas sean sobreescritas. -->

#### [Anterior](page5.md) -- [Siguiente](page7.md)
