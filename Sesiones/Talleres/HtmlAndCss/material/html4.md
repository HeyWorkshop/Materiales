
## Etiquetas `<style>` y `<link>`
Entre las etiquetas con las que cuenta HTML, dos de ellas son `<style>`y `<link>`.

* La etiqueta `<style>` nos sirve para declarar estilos *css* dentro el mismo documento *.html*
* La etiqueta `<link>` nos permite declarar los estilos *css* en otro documento ( *.css* ) y ligarlo al documento *.html* para usar las reglas css declaradas en ese documento aparte.

Por lo tanto podemos decir que es lo mismo declarar los estilos así:
```html
<-- Este es el archivo .html -->

<!DOCTYPE html>
<html>
<head>
    <title> Mi Página Web </title>
    <style>
        p {
	    color: red;
        }
    </style>
</head>
<body>
    <p> Hola Mundo! </p>
</body>
</html>
```
A declararlos así:

```css
// Este es el archivo .css, llamado: main.css

p {
    color: red;
}
```
```html
<-- Este es el archivo .html -->

<!DOCTYPE html>
<html>
<head>
    <title> Mi Página Web </title>
    <link rel="stylesheet" type="text/css" href="main.css">
</head>
<body>
    <p> Hola Mundo! </p>
</body>
</html>
```

Las dos maneras de declarar las reglas css realizarán lo mismo, pero cabe recalcar que es una buena práctica tener las reglas css en un archivo aparte, de esta forma es más fácil manipular tanto el html como el css.

#### [INICIO](../README.md)
