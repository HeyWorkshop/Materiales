# Doxygen

Doxygen es un acrónimo de dox (_document_) y gen (_generator_), generador de documentación para código fuente.

Doxygen acepta multitud de lenguajes como C/C++, C, Java, Objective-C, Python, IDL (versiones Corba y Microsoft),
VHDL y en cierta medida para PHP, C# y D. La principal ventaja de Doxygen es sin duda que las directivas no son más 
que comentarios de forma que no tenemos que crear una documentación aparte, sino, simplemente, comentar el código.

Por ejemplo, antes de comenzar, todos entendemos esto o podemos obtener una idea de lo que realiza ¿no?.

```java
/**
* @brief Multiplica 2 matrices 3x3 y devuelve el resultado
* @param A La primera matriz al multiplicar de tamaño 3x3
* @param B La segunda matriz a multiplicar de tamaño 3x3
* @return Una nueva matriz C = AxB
*/
float ** multiplicaMatrices (float **A, float **B);
```

** Podemos observar que se parece bastante a Javadoc ¿no?**

## Pues comencemos a ver por qué

```java
// Lo siguiente es un comentario normal en Doxygen (que no "observa" Doxygen).
/*
 ... TEXTO ...
 */
 
 //Comentario Doxygen (dos asteriscos**)
 // + un asterisco al comienzo de cada linea interna (opcional)
 /**
  *  ...TEXTO...
 */
 
 // 1.- Estilo Javadoc (el anterior)
 /**
  *   ...TEXTO...
  */
  
  // 2.- Estilo Qt
  /*!
   * ...TEXTO...
   */
   
   // 3.- Usando varias lineas consecutivas para formar un bloque, cada una con 3 barras o 2 barras + exclamación:
   
   ///
   /// ...TEXTO...
   ///
   
   // o
   
   //!
   //! ...TEXTO...
   //!
   
   // 4.- Delimitando los bloques con muchos asteriscos:
   
   /**************************************************//**
    * ...TEXTO...
    ****************************************************/
    
    // Notar que la primera parte de la primera linea no forma parte del bloque
    // El bloque realmente comienza con el /** posterior
    // Si no comienza exáctamente con /** no es un bloque doxygen:
    
    /********************************************
     * ESTO NO ES UN BLOQUE DOXYGEN
     ********************************************/
```

Realmente son 2 estilos: Javadoc y Qt. Los otros dos no son estilos propiamente dichos: el cuarto es el primero utilizando más
asteriscos por cuestiones estéticas y el tercero es simplemente un conjunto de líneas seguidas que se toman como bloque( una linea de comentario
doxygen es cualquiera que comience por /// o //!)

## Etiquetas o directivas más comunes

Son:   @ y \

```java
/**
 * @brief Esta es una forma de indicar la directiva
 * \note Y esta es la otra
 */
```

* **brief: Indica que lo que sigue a continuación** es el resumen de la función/clase/estrucura/enumerado/etc documentado.
* **param: Parámetro de una función.** Debe estar seguido del nombre de la variable a la que nos referimos. Por ejemplo:
    
    ```java
    @param a explicacion de la variable
    ```
    
* **return: Lo que devuelve la función**
* **note: Una anotacion.**
* **see: Referencia a una función.**

## Poniendolo en práctica

Ya que tenemos conocimiento de Javadoc, podemos dar el siguiente paso, en este estilo la primera línea 
siempre se tomará como un @brief. Cualquier línea que no comience con una etiqueta se supone que forma parte de la 
descripción extendida (siempre que haya una línea en blanco de por medio). Veamos un ejemplo:

```java
/**
 * @brief Descripción resumida
 * Aqui sigue sienod un resumen
 *
 * Esto ya es la descripción detallada
 */
```

No tenemos que definir los comentarios justo antes de la declaración, podemos ponerlos justo después mediante comentarios en línea
que comienzan por '<'. Si el comentario es una única linea indica una descripción resumida:

```java
int a; ///< Descripción resumida de a
char b; //!< Descripción resumida de b
```
Los comentarios en bloque indican descripción extendida:

```java
float c; /*!< Descripción extendida de c */
bool d; /**< Descripción extendida de d */
double d; ///< Descripción extendida de d
            ///< Recordar que esto es un bloque!
```
## Documentando Funciones
No es necesario que la documentación de una función esté en el mismo código que la función.
Doxygen tiene la capacidad de recorrer todos los archivos fuente (esto se especifica en la configuración) y
busca en todos ellos la documentación de las funciones.
El comando asociado es **fn**, también es posible usar **var**. 
Los parámetros de la función se especifican con **param**, si ésta los tiene. 
Se emplea **brief** para agregar una breve descripción de la función. Para explicar el valor de retorno se usa **return**.

```java
/** \fn int *crear_arreglo(int L)
 * \brief Crea un arreglo de tamaño L
 * \param L Tamaño del arreglo.
 * \return Devuelve el puntero al arreglo.
 */ 
 
 ```
 
### Explicación:
* \fn va seguido de la declaración de la función a documentar
* \param explicación
* \brief va seguido de un texto descriptivo, puede ser de varias líneas.
* \return explicación
* El comando \fn puede omitirse, si y sólo si, la documentación de la función está justo antes de la declaración de la misma

# Ejemplo

```java
/**
 * \brief La clase Time representa un momento del tiempo.
 *
 * \author Nombre del Autor
 */
class Time {

  /**
   * @brief El constructor que inicializa el valor de tiempo.
   * \param timemillis Número de milisegundos desde el 1 de enero de 1970
   */
  Time(int timemillis) {
   ...
  }

  /**
   *  @brief Obtener la hora actual.
   * \return Un objeto time, con la hora actual.
   */
  public Time now() {
   ...
  }
}
```

Incluso podemos documentar algo en otra parte del código indicando a qué hace referencia con las directivas:
* **struct** para documentar una estructura
*	**union** para documentar una union
*	**enum** para documentar un enumerado
*	**fn** para documentar una función
*	**var** para documentar una variable, typedef o enum
*	**def** para documentar un #define
*	**typedef** para documentar un typedef
*	**file** para documentar un archivo
*	**namespace** para documentar un namespace
*	**class** para documentar una clase c++ o Java
*	**package** para documentar un paquete Java
*	**interface** para documentar una interfaz

### Nota:
Recordemos que Doxygen recorre el código fuente por lo que si colocamos @class y @struct y el nombre que les tenemos colocados las buscará en el código.

Ejemplo:

```java
/**
 * @class miClase
 * @brief Representa una clase vacía 
 */
 
 /**
  * @struct miEstructura
  * @brief Representa una estructura vacía
  */
  
  // Antes o después de los comentarios o incluso en otro fichero...
  
  class mi Clase{
  ...
  };
  
  struct miEstructura{
  ...
  };
```

## Generar DoxyFile desde la terminal

* Para generar el DoxyFile debemos encontrarnos donde se encuentre el .java (en la terminal) y escribimos:

```bash
$ doxygen -g 
```

* Modificar doxyfile abrir con el editor de texto:

**NOTA: Si queremos que sea recursivo (que verifique todos los archivos del paquete donde le hayamos seleccionado) debemos buscar la opcion:**
* RECURSIVE = YES (colocaremos YES).

Otras opciones importantes a configurar son:

* linea 35: El nombre del proyecto (Por ejemplo PROJECT_NAME = "Proyecto de prueba")
*	linea 41: La versión (PROJECT_NUMBER = 0.1.2)
*	linea 48: Directorio de salida (OUTPUT_DIRECTORY = ./doc)
*	linea 70: El idioma (OUTPUT_LANGUAGE = Spanish)
*	linea 707: Si queremos poder navegar por el código (SOURCE_BROWSER = YES)
*	linea 784: Si queremos generar la documentación HTML (GENERATE_HTML = YES por defecto)
*	linea 1095: Si queremos generar la documentación LaTeX (GENERATE_LATEX = YES por defecto)
*	linea 1223: Si queremos generar la documentación MAN (GENERATE_MAN = YES)
*	linea 1252: Si queremos generar la documentación XML (GENERATE_XML = YES)

**EXTRA:** Si colocamos EXTRACT_ALL: YES , Doxygen agregará a la documentación todo lo que encuentre (funciones, variables,etc) aunque no se hayan documentado.

Podemos tardar un buen rato en configurar la documentación a nuestro gusto. Una vez que ya lo tenemos simplemente ejecutamos

```bash
$ doxygen
```

## DoxyWizard

En dado caso que no queramos usar terminal siempre podemos usar la GUI de Doxygen, Doxywizard. Echemosle un vistazo.

[![image.png](https://s17.postimg.org/faktdh2m7/image.png)](https://postimg.org/image/u6jcl2e0r/)

[![image.png](https://s17.postimg.org/62skwsazj/image.png)](https://postimg.org/image/faktdhi1n/)

# Ejercicios

* [Ejercicio Doxygen](/Talleres/Documentacion/Ejercicios.md)


