# Configuración e Instalación

* Tener una cuenta en [Heroku](https://signup.heroku.com/) (Mantén tu contraseña a mano, será útil en siguientes puntos)
* Tener una aplicación hecha y lista para desplegar en alguno de los [lenguajes soportados por Heroku](https://www.heroku.com/languages)
* Instalar [Heroku Toolbet](https://devcenter.heroku.com/articles/heroku-cli) de acuerdo a tu sistema operativo

## Iniciar sesión con Heroku

* Ejecutar en la terminal `heroku login`
* Ingresar correo y contraseña
* Si es la primera vez, te preguntará si deseas crear una clave pública, **deberás aceptar**.

```
heroku login
Enter your Heroku credentials.
Email: adam@example.com
Password (typing will be hidden):
Authentication successful.
```

## Heroku y Git

Heroku usa Git para la gestión del código que se despliega en Heroku. Por lo tanto es *obligatorio* trabajar tus repositorios con git.

*Recordemos que para iniciar un repositorio de Git...*

```
$ cd app_folder
$ git init
$ git add --all
$ git commit -m "First commit"
```

## Despligue de una aplicación en Heroku

**Nota:** Dependiendo el lenguaje de programación que uses, tu proyecto puede necesitar un archivo de configuración diferente para que le digamos a Heroku como ejecutar diferentes partes de nuestra aplciación. Puedes revisar la [documentación de Heroku](https://devcenter.heroku.com/articles/procfile) para más información.

Para desplegar nuestra fabulosa aplicación hacia Heroku necesitamos:

* Crear una aplicación en Heroku:

```
$ heroku create
```
* Desplegar la aplicación en Heroku:

```
$ git push heroku master
```
* Al finalizar el despliegue de la aplicación podrás abrir tu aplicación en un navegador web desde tu terminal:

```
$ heroku open
```

##### Otros comandos de heroku

* `$ heroku info`
* `$ heroku config`
* `$ heroku ps`
* `$ heroku logs`
* `$ heroku run rake task:name`
* `$ heroku run rake db:migrate`

## [Anterior](PAGE2.md) - - [Siguiente](PAGE4.md)
