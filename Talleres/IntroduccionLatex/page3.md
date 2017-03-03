#Comando básicos.
##\maketitle
Sirve para imprimir todos los datos de preambulo en el documento.
##\newpage
Este comando nos sirve para mandar todo el contenido que se encuentre debajo de el a una nueva página del documento. 
##\tableofcontents
Con este comando imprimimos el índice de las secciones del documento.

##\label y \ref
Podemos hacer referencia a diversas partes de nuestro documento gracias a los comando \laber y \ref.
\label genera una etiqueta en una sección de nuestro documento.
\ref es el comando con el cual llamamos a dicha etiqueta. 

```
\documentclass{article}

\begin{document}

\author{Rolando Valencia}
\title{Introduccion a latex}
\date{1 de Marzo de 2017}

\tableofcontents
\part{Introduccion}
\section{introduccion}\label{sec:introduccion}
\subsection{intro}
\subsubsection{duccion}
\part{Instalacion}
\part{Estructura del documento}
\part{Comandos basicos}


Por favor revisen la seccion de la introduccion \ref{sec:introduccion}

\end{document}


```

##\newcommand
Un atractivo de LaTeX es que nos permite crear nuestros propios comandos. Ya sea que inserte un texto o una imagen cada vez que deseemos llamarla. Para demostrarlo creare un nuevo comando llamado 'formula general' el cual me imprimira dicha formula cada vez que yo lo llame. 
```
\documentclass[12pt]{article}

\begin{document}

\author{Rolando Valencia}
\title{Hola mundo.}
\date{1 de Marzo de 2017}

\tableofcontents
\part{Introduccion}\label{part:introduccion}
\section{introduccion}
\subsection{intro}
\subsubsection{duccion}
\part{Instalacion}
\part{Estructura del documento}
\part{Comandos basicos}
\newcommand{\f}{
$x = \frac{-b±\sqrt{b^2-4ac}}{2a}$
}


Por favor revisen la seccion de la introduccion \ref{part:introduccion}

\f

\end{document}
```


#[anterior](https://github.com/RolandoVS/IntroduccionLatex/blob/master/page2.md)
