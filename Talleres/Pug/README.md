# Pug

## Temas puntuales

* Template engine
  * Handlebars
  * Haml (Ruby)
  * Blade
  * JSP
  * PHP
* ¿Porqué PUG?
  * Basado en JS
  * Sintáxisis sencilla (sólo identaciones)
  * Compatible con HTML
  * Soporte en VueJs, ReactJs y Webpack
* ¿Cómo trabajar con PUG?
  * Compilado por dos maneras:
    * [pug-cli](https://github.com/pugjs/pug-cli)
    * [prepros](https://prepros.io/)
  * [Codepen](https://codepen.io/)
  * [Playground](https://amio.github.io/pug-playground/)
* Sintaxis

# ¿Qué es un template engine?
Es un motor de plantillas en términos de web. Permite generar la estructura  HTML y mterle datos, de un bd, json, api,etc.

# Sintaxis
>Definir un tipo de identación, si mezclas tabs y espacios el archivo pudede crashear!

Etiquetas HTML en pug: 
```pug
h1 Hola mundo Workshop
p Hola mundo Workshop
```
Anidaciones se hacen con identaciones:
```pug
h1 Hola mundo Workshop
  p lorem ipsum 
```
Atributos de etqiuetas, separados por espacios o comas:
```pug
a(href="www.google.com.mx") Google
link(rel="stylesheet" href="css/styles.css")
```
Clases y Id's (igual que en css):
```pug
body.main
h1#title
```
Scripts y estilos en el documento: 
```pug
script.
style.
```
Styles inline:
```pug
h1(style={color: "red", "font-size": "200px"})
```
Ignorar palabras como etiquetas:
```pug
p
  | Lorem ipsum
```
Interpolación:
```pug
p lorem #[span Hola mundo] ipsum
```