## Etiquetas

En HTML se usan etiquetas, donde cada una tiene una de inicio y otra de cierre: `<etiqueta> </etiqueta>`. Las etiquetas de inicio se diferencían de las de cierre, por el slash `/` antes del nombre de la misma.

Existen etiquetas base para realizar un documento HTML, tales como `<html>`, `<head>`, `<title>` y `<body>`.

- La etiqueta principal, que envuelve básicamente todo, es la etiqueta `<html>`, dentro de esta etiqueta se debe de escribir todo el documento. 

- Dentro de la etiqueta `<head>` van datos para el navegador que describen que usará el documento en sí, como un script, un archivo *.css*, el tipo de caracteres que se va a usar, el título de la pestaña, entre otras.

- En la etiqueta `<title>` se encontrará el título de la pestaña.

- La etiqueta `<body>` envuelve toda la página visible.

*Un ejemplo de una estructura html sería algo así:*

```html
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title> Título de la página </title>
    </head>
    <body>
        <h1> Hola Mundo! </h1>
    </body>
</html>
```

Usamos el `<!DOCTYPE html>` para que el navegador sepa que se trata de un archivo **HTML5**, mientras que la etiqueta `<meta charset="utf-8">` especifica que tipo de caracteres (ASCII) vamos a manejar en el documento.

##### Ejemplos de etiquetas en HTML5
Etiqueta | Definición
:---: | ---
`<p>` | Establece un párrafo
`<div>` | Contenedor de elementos genérico
`<ul>` | Genera una lista sin órden
`<ol>` | Genera una lista con órden
`<li>`| Establece un elemento de una lista con o sin órden.
`<a>` | Establece un [link](#).
`<img>` | Inserta una imagen

###### HTML5 tiene muchísimas etiquetas, por ello, si quieres ver más etiquetas puedes visitar la [MDN](https://developer.mozilla.org/en-US/docs/Web/HTML/Element) de Mozilla.

#### [INICIO](../README.md)
