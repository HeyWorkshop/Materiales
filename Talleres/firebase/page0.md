# ![Firebase logo](imgs/firebase.png) Firebase
##Conocimientos previos
###¿Qué es Firebase?
Firebase es una API multiplataforma que provee una serie de servicios como:

- Autenticación
- Bases de datos en tiempo real
- Almacenamiento
- Hosting
- Mensajería en la nube

con una sencilla implementación en

- Web
- Android
- iOS
- C++ (Arduino)
- Java (Aplicaciones de escritorio)

###¿En qué casos no sirve Firebase?
- Modelo de base de datos muy complicado
- Aplicaciones para uso masivo
- Gran tráfico de datos

###Objetos planos en javascript
- **Key**
Si comparamos un objeto plano de javascript con un objeto con un constructor, la llave sería el nombre de la propiedad del objeto
- **Value**
Análogamente, el valor es lo que se le asigna a dicha propiedad
- **Child**
Los hijos de un objeto plano son cada uno de las llaves con su respectivo valor.

Los objetos planos forman un árbol donde los hijos son los subárboles, los valores son las hojas y las llaves son los nodos intermedios.
###Bases de datos no relacionales
Firebase usa bases de datos NoSQL de tipo clave/valor para denotar el árbol de datos.
En específico se usa la notación JSON para el modelo de la base de datos.

###Funciones callback
Un callback es la llamada de una función que se envía como parámetro.
Las funciones observer en Firebase reciben al menos una función callback.

###Promises
Un promise es un objeto que se usa para el cómputo asincrónico, es decir, un objeto promise representa un valor que puede estar disponible ahora, en el futuro, o nunca.
La mayoría de las funciones en Firebase devuelven un objeto promise.

## [Anterior](index.md) - - [Siguiente](page1.md)