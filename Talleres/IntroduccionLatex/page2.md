
#Estructura de un documento
De esta manera se inicia un documento en LaTeX. 
```
\documentclass{article}

\begin{document}

  . . .

\end{document}

```

Existen diferentes clases de documentos, algunas de las mas usadas son:
* __article__ - Para artículos o pequeños reportes.
* __books__ - Para libros.
* __slides__ - Para diapositivas.
* __letter__ - Para escribir cartas.
* __minimal__ - Para redactar documentos lo mas cortos posibles. No se puede cambiar la tipografía a lo largo del documento.
* __report__ - Para extensos reportes que contengan varias secciones o para pequeños libros.

##Preambulo
Se pueden agregar datos sobre el documento, como son el autor, el título del documento o la fecha.

```
\documentclass{article}

\begin{document}

\author{Rolando Valencia}
\title{Hola mundo.}
\date{1 de Marzo de 2017}

\end{document}

```
##Tipos de letra
Es posible cambiar la letra de nuestro documento a negrita o cursiva:
* \textbf	negrita
* \textit	itálica
* \textsl	helvética
* \texttt	courier
* \textsc	pequeñas Mayúsculas

... o bien podemos \emph{enfatizar} una \textit{parte del texto \emph{dentro} de otro}

##Crear índice 
Para crear un índice, debemos de utilizar el comando \tableofcontents el cual imprimira en la hoja el contenido de nuestro documento.
Dado que en nuestro ejemplo utilizamos article, debemos de poner \part{NombreParte} para designar las partes de nuestro documento.

```
\documentclass{article}

\begin{document}

\author{Rolando Valencia}
\title{Hola mundo.}
\date{1 de Marzo de 2017}

\tableofcontents
\part{Introduccion}
\part{Instalacion}
\part{Estructura del documento}
\part{Comandos basicos}


\end{document}

```
Para agregar subsecciones basta con agregar \section debajo de cada parte. Se pueden agregar \subsection y \\subsubsection. 

```
\documentclass{article}

\begin{document}

\author{Rolando Valencia}
\title{Hola mundo.}
\date{1 de Marzo de 2017}

\tableofcontents
\part{Introduccion}
\section{introduccion}
\subsection{intro}
\subsubsection{duccion}
\part{Instalacion}
\part{Estructura del documento}
\part{Comandos basicos}


\end{document}

```


##Tablas
Esta es la manera de insertar una tabla en LaTeX:
```
\documentclass{article}

\begin{document}

\begin{tabular}{lll} % lll es para alinear el contenido de las columnas hacia la izquierda.
                     % Podemos poner 'r' para alinear a la derecha o 'c' para centrar el elemento de la casilla.
 
Nombre & matricula & semestre   % Se utiliza & para separar los elementos de una fila.
Juan & 12345678 & 4to
Enrique & 9876543221 & 6to

\end{tabular}

\end{document}
```

Ahora, si queremos tener margenes en nuestra tabla debemos de añadir |(pipes) entre la orientación de cada una  de las columnas de la tabla.

```
\documentclass{article}

\begin{document}

\begin{tabular}{|l|l|l|} 

Nombre & matricula & semestre   
Juan & 12345678 & 4to
Enrique & 9876543221 & 6to

\end{tabular}

\end{document}

```

Para agregar los margenes horizontales es necesario añadir el comando \hline entre las filas de la tabla.


```
\documentclass{article}

\begin{document}

\begin{tabular}{|l|l|l|} 

\hline
Nombre & matricula & semestre 
\hline
Juan & 12345678 & 4to
\hline
Enrique & 9876543221 & 6to
\hline

\end{tabular}

\end{document}

```

##Ecuaciones matemáticas
Una de las razónes principales por la cuales se utiliza LaTeX es por su capacidad y agilidad para insertar ecuaciónes matemáticas en los documentos. 
Para insertar cualquier tipo de ecuación matemática, es necesario encerrarlo dentro de $ ... $.
Ademas latex tiene varias funciones matemáticas como:
* \sqrt - Raíz cuadrada.
* \frac - Sirve para agregar fracciones.

Tambien se pueden insertar __matrices__, de hecho algunas ya vienen predefinidas en LaTex:
* \begin{matrix} .. \end{matrix},

* \begin{pmatrix} .. \end{pmatrix}, ...

* \begin{bmatrix} .. \end{bmatrix}, ...

* \begin{vmatrix} .. \end{vmatrix}, ...


##Añadir imagenes
Para insertar imagenes en nuestro documento es necesario utilizar el paquete 'graphicx'.
Para utilizar un paquete en nuestro documento lo haremos de la manera \usepackage{graphicx}.

```
\documentclass{article}

\usepackage{graphicx}

\begin{document}[!htbp] 
\begin{figure}
\includegraphics[width=8]{nombreDeLaImagen}
\caption{gran imagen}

\end{figure}

\end{document}
```
Es muy importante que la imágen que se utilizara este en el mismo directorio en el que se encuentra el documento. 


#[anterior](https://github.com/RolandoVS/IntroduccionLatex/blob/master/page1.md) -- [siguiente](https://github.com/RolandoVS/IntroduccionLatex/blob/master/page3.md)
