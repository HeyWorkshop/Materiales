# Give me some action!

Es momento de poner en práctica todos los conocimientos base y experimentar con el despliegue de aplicaciones hacia Heroku.

Utlizaremos 2 repositorios open source externos para experimentar con el despliegue de aplicaciones.
* [A NodeJS todo list](https://github.com/amirrajan/nodejs-todo)
* [A NodeJS chat](https://github.com/amirrajan/nodejs-chat)

*Nota: Todo el código utilizado fue creado por [Amir Rajan](https://github.com/amirrajan), su uso es meramente con fines educativos y no se busca lucrar con el código fuente*

Para cada una de estas aplicaciones primero ejecutaremos las aplicaciones de forma local en nuestra computadora y luego la subiremos a Heroku para que todos podamos acceder por medio de un navegador web.

**Nota:** Es necesario que tengas configurada tu llave pública y la asocies con tu cuenta de Github para clonar el repositorio por medio de SSH. Para esto puedes revisar [la documentación de Github](https://help.github.com/articles/checking-for-existing-ssh-keys/)

### A NodeJS chat

Primero debemos correr de forma local el proyecto, para ello haremos lo siguiente:

```
$ git clone git@github.com:amirrajan/nodejs-chat.git
$ cd nodejs-chat
$ npm install
$ node start.js
```

Finalmente podemos entrar a `http://localhost:3000` y ver la aplicación en acción.

Ahora, debemos hacer el despliegue a heroku

```
$ heroku login
$ heroku create
$ git push heroku master
$ heroku open
```

Puedes ir a tu dashboard de aplicaciones en Heroku y verificar la creación de la app https://dashboard.heroku.com/apps

##### Resolución de problemas.

La aplicación probablemente haya iniciado con un error y no podamos abrirla desde Heroku, este error se encuentra en el commit [e4653a0](https://github.com/amirrajan/nodejs-chat/tree/e4653a02f20942e3ccd72bd7f29223eaa786cecd). Para resolver este problema debemos revisar los Logs de nuestra aplciación en Heroku. Para ver los Logs podemos ejecutar `$ heroku logs` en nuestra terminal o acceder desde el panel de nuestra aplicación en Heroku.


En el caso del ejemplo del chat esto es lo que debes hacer:

* En el archivo package.json del código del proyecto debemos ubicar el siguiente bloque:

```json
"scripts": {
  "start": "node server.js"
}
```  

* El script que Heroku ejecuta para correr nuestra aplicación apunta hacia el incorrecto, por lo tanto debemos cambiar el bloque anterior por el siguiente:

```json
"scripts": {
    "start": "node start.js"
}
```

* Finalmente no olvides registrar tus cambios en Git y volver a subir el código a Heroku.

```
$ git add --all
$ git commit -m "Fix server start"
$ git push heroku master
$ heroku open
```

### A NodeJS todo list

Para este ejemplo dependemos del uso de [Redis](https://redis.io/), el cual es una estructura de almacén de datos en memoria.

* [Instalar Redis en Windows](https://github.com/rgl/redis/downloads)
* [Instalar Redis en Ubuntu](https://hostpresto.com/community/tutorials/how-to-install-and-configure-redis-on-ubuntu-14-04/)

```
$ sudo apt-get update
$ sudo apt-get upgrade
$ sudo apt-get -y install redis-server
$ sudo service redis-server status
redis-server is running
```

* [Instalar Redis en Mac](http://jasdeep.ca/2012/05/installing-redis-on-mac-os-x/)
  * Ejecutar `$ brew install redis`

Primero debemos correr de forma local el proyecto, para ello haremos lo siguiente:

```
$ git clone git@github.com:amirrajan/nodejs-todo.git
$ cd nodejs-todo
$ redis-server
$ npm install
$ node server.js
```

Finalmente podemos entrar a `http://localhost:3000` y ver la aplicación en acción.

Ahora, debemos hacer el despliegue a heroku

```
$ heroku login
$ heroku create
$ git push heroku master
$ heroku open
```

Puedes ir a tu dashboard de aplicaciones en Heroku y verificar la creación de la app https://dashboard.heroku.com/apps

##### Resolución de problemas.

La aplicación probablemente haya iniciado con un error y no podamos abrirla desde Heroku. Si ejecutamos el siguiente comando `$ heroku logs` veremos desde nuestra terminal los Logs de nuestra aplicación en Heroku y podremos notar que el problema se encuentra en la línea:

```
throw "Not sure how to connect to redis.";
```

Este error se debe a que nuestra aplicación depende directamente de un servicio adicional (Addon) llamado [Redis](https://redis.io/). Heroku nos provee de una forma muy sencilla de activiar este servicio por medio de [RedisToGo](https://devcenter.heroku.com/articles/redistogo)

Para listar todos los addons ejecutamos `$ heroku addons` . Si no hemos configurado ningún Addon la consola nos mostrará un mensaje explicandonos esto.

```
$ heroku addons:create redistogo
$ heroku restart
```

Esto agregará el servicio adicional que necesitamos para poder correr nuestra aplicación en Heroku sin errores, y además reiniciaremos el Dyno en el que se encuentra nuestra aplicación para asegurar que se considera el servicio adicional recién agregado. Si volvemos a listar todos los addons, ejecutando `$ heroku addons` ahora veremos algo como:

```
Add-on                             Plan  Price  State
─────────────────────────────────  ────  ─────  ───────
redistogo (redistogo-rigid-17428)  nano  free   created
 └─ as REDISTOGO

The table above shows add-ons and the attachments to the current app (quiet-beyond-66089) or other apps.
```

## [Anterior](PAGE3.md) - - [Siguiente](PAGE5.md)
