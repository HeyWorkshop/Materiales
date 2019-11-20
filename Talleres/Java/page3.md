# Conceptos Básicos en Java
Aquí los vamos a ver por encima entrando en detalle sobre todas sus características
- Objeto
- Clase
- Paquete
- Interfaz
- Herencia

### Objeto
Es un elemento de software que intenta representar un objeto del mundo real. De esta forma un objeto tendrá sus propiedades y acciones a realizar con el objeto. Estas propiedades y acciones están encapsuladas dentro del objeto, cumpliendo así los principios de encapsulamiento.
Un **objeto** tiene su estado (o estados) y su comportamiento. Esto se modela mediante propiedades (o variables) y métodos. Incluso un objeto puede contener a su vez a otro tipo de objeto.

### Clase
Las clases representan los prototipos de los objetos que tenemos en el mundo real. Es decir, **es una generalización de un conjunto de objetos**. A su vez **los objetos serán instancias de una determinada clase**.

### Interfaz
Un **interfaz** es una forma de establecer un contrato entre dos elementos. Un **interfaz** indica qué acciones son las que una determinada clase nos va a ofrecer cuando vayamos a utilizarla.

### Paquete
Un  **paquete**  es una forma de  _organizar elementos de software mediante un espacio de nombres_. Así podremos afrontar desarrollos grandes de software facilitando la forma de encontrar o referirnos a un elemento.

### Herencia
La **herencia** es una forma de estructurar el software. Mediante la **herencia** podemos indicar que una clase hereda de otra. Es decir la clase extiende las capacidades (propiedades y métodos) que tenga y añade nuevas propiedades y acciones.
Una de las cosas que tienes que saber en la herencia es que en el constructor de la clase que hereda (o clase hija) se deberá de llamar al constructor de la clase padre. Para ello se utiliza el método especial `super();`

## [Anterior](page2.md)  --  [Siguiente](page4.md)