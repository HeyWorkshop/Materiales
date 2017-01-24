# **Foundation 6**
***
Documentación: http://foundation.zurb.com/sites/docs/
***
![alt text](http://foundation.zurb.com/assets/img/learn/features/svgs/code-reduction-01.svg)

## Descripción
Foundation es un framework que permite agregar estilos y comportamientos a un sitio web, haciendo más fácil y ágil el maquetado.

## Objetivos
- Dominar el sistema de grillas para aplicarlo al manejo de diversos frameworks.

- Entender la característica *flex-box* para mejorar la eficacia de futuros proyectos.

- Conocer herramientas que permitan evaluar y detectar errores de optimización en el diseño de una página web.

## Entorno de trabajo

http://foundation.zurb.com/sites/download.html/

http://zurb.com/playground/foundation-icon-fonts-3



## Conceptos Básicos
***

## Grid
Foundation se basa en un sistema de grillas de máximo 12 columnas por fila.
Las columnas se identifican con `.column` o `.columns` y las filas con `.row`

Las `.column` existen dentro de las `.row`

```html
<div class="row">
  <div class="column">
    ...
  </div>
</div>
```

## Flex-Grid
Foundation incorpora la característica *flex-box*, que es un modo de diseño que nos permite crear estructuras para sitios web de una forma mas fácil. *Recuerda que ésta característica aún no es soportada por todos los navegadores.*

## Breakpoints
Foundation incorpora 3 *breakpoints* para distintos tamaños de pantalla que existen, permitiendo así el **Responsive-Design**

|  mobile screens | >= 640 pixels | >= 1024 pixels |
| ----------------|:-------------:| --------------:|
| `small-`        | `medium-`     | `large-`       |

Este framework como algunos otros se basa en la característica **mobile-first**, esto quiere decir que la disposición de las columnas se heredadan de su antecesor(la disposición más pequeña), a menos que estas sean sobreescritas.

![alt text](https://s3.amazonaws.com/codementor_content/2015-Jun-week3/foundation-grid-example.png)

## Enlaces

##### Optimización

Reduce el peso de tus imagenes:
https://tinypng.com

Minifica tus archivos css:
http://csscompressor.com

Agiliza la carga de tus imágenes:
http://dinbror.dk/blog/blazy/?ref=demo-page


##### Debbug

Levanta un servidor local con:

`python -m SimpleHTTPServer`

Debbugea tu página web en otros dispositivos:

`chrome://inspect/#devices`

Que tan óptimizada está tu página web:
https://developers.google.com/speed/pagespeed/insights/

##### Complementos

Añade *carga* a tus imagenes:
http://loading.io

Encuentra el JavaScript que necesites agregar a tu proyecto:
https://cdnjs.com

Comprueba la compatibilidad en los navegadores de los elementos que utilizas:
http://caniuse.com
