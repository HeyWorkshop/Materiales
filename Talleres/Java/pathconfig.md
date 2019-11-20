# Cómo configurar la variable  PATH

En Windows, para que  **javac.exe**  sea reconocido, se pueden seguir los siguientes pasos:

1.  Hacer clic en el botón derecho de  **_"Equipo"_**.
2.  Seleccionar  **_"Propiedades"_**.
3.  Pinchar en  **_"Configuración avanzada del sistema"_**  >  **_"Variables de entorno"_**.
4.  Seleccionar la variable  PATH.
5.  Pulsar en el botón  **_"Editar"_**.
6.  En el  **_"Valor de la variable"_**  –sin borrar lo que ya hay– añadir al final un punto y coma ";" seguido de la ruta donde se encuentre el archivo  **javac.exe**. Por ejemplo:
```
;C:\Program Files\Java\jdk1.8.0_212\bin
```
7. Para verificar que hemos hecho los pasos bien abrimos la terminal y escribimos `java -version`, debe aparece algo así:
```
java version "1.8.0_212"
Java(TM) SE Runtime Environment (build 1.8.0_212-b10)
Java HotSpot(TM) 64-Bit Server VM (build 25.212-b10, mixed mode)
```
## [Anterior](page0.md)
