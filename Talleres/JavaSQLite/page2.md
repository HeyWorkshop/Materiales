# Java Swing
![Swing](https://upload.wikimedia.org/wikipedia/commons/c/cc/Gui-widgets.png)

**Swing** es un conjunto de herramientas de widget GUI para Java. Forma parte de Java Foundation Classes (JFC) de Oracle: una API para proporcionar una interfaz **Gráfica de Usuario** (GUI) para programas Java.


## Eventos de Java Swing
![Swing Events](https://docs.oracle.com/javase/tutorial/figures/uiswing/events/2eventsource.gif)

Todas las aplicaciones GUI son impulsadas por **Eventos**. Una aplicación reacciona a diferentes tipos de eventos que se generan durante su vida útil. Los eventos son generados principalmente por el usuario de una aplicación, pero también pueden generarse por otros medios, como una conexión a Internet, un administrador de ventanas o un temporizador.

En el **Modelo de Eventos**, hay 3 participantes:

* Event Source
* Event Object
* Event Listener

El **Event Source** (Origen del Evento) es el objeto cuyo estado cambia y genera eventos. 

El **Event Object** (Objeto del Evento) encapsula los cambios de estado en el origen del evento. 

El **Event Listener** (Detector de Eventos) es el objeto que quiere ser notificado. El objeto de origen del evento delega la tarea de manejar un evento en el detector de eventos.


## Swing Palette
![Swing Palette](https://netbeans.org/images_www/v7/3/features/client-swing-palette-full.png)

La **Paleta de Componentes** proporciona un acceso rápido a los componentes comúnmente utilizados (JavaBeans) disponibles para agregar a formularios.

Un **Java Bean** es un componente de software reutilizable que se puede manipular visualmente en una herramienta de creación.
Los JavaBean (componentes) son unidades de software reutilizables y autónomas que pueden componerse visualmente en componentes y aplicaciones compuestas.

### JFrame
Es un contenedor de nivel superior que se utiliza para representar los requisitos mínimos para una ventana. 
Esto incluye los bordes, la capacidad de cambio de tamaño, la barra de título, los controles (minimizar/maximizar), y los controladores de eventos (e.j. windowClose).

### JPanel
Es una clase genérica utilizada para agrupar otros componentes.
Es útil cuando se trabaja con LayoutManagers (e.j. GridLayout) que agrega componentes a diferentes JPanels que luego se agregarán al JFrame para crear la GUI. 
Será más manejable en términos de diseño y reutilización.


### JLabel
Un objeto que puede mostrar texto, una imagen o ambos. Puede especificar en qué parte del área de visualización de la etiqueta se alinean los contenidos de la etiqueta al establecer la alineación vertical y horizontal.

### JButton
Una implementación de un botón que realiza una Acción cuando es presionada.

### JTextField
Es un componente ligero que permite la edición de una sola línea de texto.

### JPasswordField
Es un componente ligero que permite la edición de una sola línea de texto donde la vista indica que se escribió algo, pero NO muestra los caracteres originales.

## JCalendar
![JCalendar](https://i.stack.imgur.com/3Fv5y.png)

**JCalendar** (Seleccionador de Fechas en Java) es un Bean para seleccionar gráficamente una fecha. 

JCalendar está compuesto de varios otros Java Beans: 

* JDayChooser
* JMonthChooser 
* JYearChooser

Añadir componentes al Swing Palette: **Clic Derecho** -> **Palette Manager** -> **Add...**

Se puede descargar el **.jar** aqui: 
[jcalendar-1.4.jar.zip](http://www.toedter.com/download/jcalendar-1.4.zip)


## [Página 3](/Talleres/JavaSQLite/Page3.md)