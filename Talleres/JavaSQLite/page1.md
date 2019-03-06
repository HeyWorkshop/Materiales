## ¿Qué es Java? 
![Java](https://belitsoft.com/images/uploads/blog/JV.jpg)
**Java** es un lenguaje de programación de propósito general que es concurrente, basado en clases, orientado a objetos, y diseñado específicamente para tener la menor cantidad de dependencias de implementación posibles. 

El código Java compilado puede ejecutarse en todas las plataformas que admiten Java sin la necesidad de una recompilación. 

Las aplicaciones Java generalmente se compilan a un código de bytes que puede ejecutarse en cualquier **Máquina Virtual de Java** (JVM) independientemente de la arquitectura de la computadora.


## ¿Qué es SQLite?
![SQLite](https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/SQLite370.svg/1200px-SQLite370.svg.png) 
**SQLite** es un sistema de gestión de bases de datos relacionales contenido en una biblioteca de programación en C. A diferencia de muchos otros sistemas de administración de bases de datos, SQLite NO es un motor de base de datos cliente-servidor. Más bien, está incrustado en el programa final.

SQLite es una opción popular como software de base de datos integrado para **almacenamiento local** en software de aplicación, como los navegadores web. 

## JDBC
![JDBC](https://udemy-images.udemy.com/course/750x422/1981968_cc7e_3.jpg)

La **API de Conectividad de Base de Datos de Java** (JDBC) es el estándar de la industria para la conectividad independiente de la base de datos entre el lenguaje de programación Java y una amplia gama de bases de datos. 

Los pasos fundamentales involucrados en el proceso de conexión a una base de datos y ejecución de una consulta son los siguientes:

1. Importar paquetes JDBC.

2. Cargue y registre el Controlador JDBC.

3. Abra una conexión a la base de datos.

4. Crear un objeto de declaración para realizar una consulta.

5. Ejecute el objeto de declaración y devuelva un conjunto de resultados de consulta.

6. Procesar el conjunto de resultados.

7. Cierre los objetos de conjunto de resultados y declaración.

8. Cierre la conexión.


El Controlador JDBC para conectarse con una Base de Datos SQLite se encuentra aqui: [SQLite JDBC](https://bitbucket.org/xerial/sqlite-jdbc/downloads/)


## JAR
![JAR](https://cdn3.iconfinder.com/data/icons/files-36/512/File_types_Icon2_Jar-512.png)

Un **JAR (Java ARchive)** es un formato de archivo de paquetes que generalmente se usa para agregar muchos archivos de clase Java y los metadatos y recursos asociados (texto, imágenes, etc.) en un solo archivo para su distribución.

Los archivos JAR se empaquetan con el formato de archivo ZIP, por lo que puede usarlos para tareas como la _compresión_ de datos sin pérdida, el _archivado_, la _descompresión_ y el _desempaquetado_ de archivos. 
Normalmente tienen una extensión de archivo **.jar**.

Para ejecutar una aplicación empaquetada como un archivo JAR (requiere el encabezado de manifiesto de la clase "main")

```
java -jar app.jar
```


## ¿Qué vamos a utilizar?

* [Netbeans](https://netbeans.org/downloads/8.0.2/)
* [Tecnologia Java](https://www.java.com/en/download/)
* [Java SDK](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [SQLite JDBC](https://bitbucket.org/xerial/sqlite-jdbc/downloads/)
* [J-Calender](http://www.toedter.com/download/jcalendar-1.4.zip)
* [SQLite Browser](https://sqliteonline.com)

Usamos el IDE de **Netbeans** para facilitar el uso de SQLite con Java en una forma mas visual incluyendo el Framework: <strong>Java Swing</strong>



## [Página 2](/Talleres/JavaSQLite/page2.md)