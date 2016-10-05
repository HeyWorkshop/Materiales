# Shell Scripting  
[![bash.jpg](http://s5.postimg.org/rbp0505k7/bash.jpg)](http://postimg.org/image/e7jfsbdib/)  

A tráves del shell BASH puedes escribir fragmentos de código (Scripts) para automatizar ciertas tareas que desees.  
Por ejemplo:  
Para la fecha xx/xx/xxxx, el sistema actualizará sus paquetes y creará un directorio quitándole permisos de escritura y asignándole un nuevo propietario.  
# Características BASH  
## Comentarios  
Los comentarios en Bash se hacen línea a línea con el símbolo #  
 #!/bin/bash  
 #  
 #Hola Mundo comentado  
 #  
***
## Variables  
Las variables no tienen tipo, es decir, una variable puede contener una cadena, un número, etc. sin necesidad de definirlo.  
La sintáxis es:  
**nombre_variable=valor_variable**  
Es obligatorio no dejar espacios antes o despues del simbolo ‘=’ ya que sino BASH interpretará la variable como un comando Linux.  
**Ejemplo:**  
 #!/bin/bash  
 #Asignación y salida de variables  
 mi_variable="Hola mundo, esto es un ejemplo"  
 echo $mi_variable  
***
## Paso de variables  
Cuando ejecutas desde tu terminal tienes la posibilidad de pasarle más argumentos.  
Por ejemplo:  

./myScript.sh hola 4  

Para recuperar estos valores escribe $ y a continuación el número de posición del argumento pasado. El primer argumento $1 = "hola", y el segundo argumento $2 = 4. La variable $0 es el nombre del archivo (myScript.sh).  

**Para recuperar los valores dentro del script:**  
 #!/bin/bash  
 #  
 # Paso de variables  
 #  
 echo "Tu primer argumento es" $1  
 echo "Tu segundo argumento es" $2  

***
##Operaciones aritméticas en BASH  
**Operador suma**  
* ((suma=3+5))  
* ((suma=$var1+$var2))  
* ((suma=$var1+5))  

**Operador resta**  
* ((resta=8-2))  
* ((resta=$var1-$var2))  
* ((resta=$var1-5))  

**Operador multiplicación**  
* ((multiplicacion=3*5))  
* ((multiplicacion=$var1*$var2))  
* ((multiplicacion=$var1*5))  

**Operador división**  
* ((division=8/4))  
* ((division=$var1/$var2))  
* ((division=$var1/2))

**Operador módulo**  
* ((modulo=9%2))  
* ((modulo=$var1%$var2))  
* ((modulo=$var1%3))  

***
## Comparaciones y expresiones  
La evaluación de una expresión da como resultado verdadero o falso. Si la comparación o evaluación de la expresión es verdadera se ejecutará el bucle o la condicional, si es falsa la evaluación no se ejecutará.  

**La sintáxis es:**  

[ expresión ]  

Un ejemplo de expresión sería [ 3 -eq 5 ] que comprueba si el valor 3 es igual a 5. Como es incorrecto, el valor que devuelve es falso. Los símbolos [ y ] tienen que estar obligatoriamente separados por un espacio.

### Comparaciones numéricas:  

**numero1 -eq numero2:**	Devuelve verdadero si 'numero1' es igual a 'numero2'.  

**numero1 -ge numero2:**	Devuelve verdadero si 'numero1' es igual o mayor a 'numero2'.  

**numero1 -gt numero2:**	Devuelve verdadero si 'numero1' es mayor a 'numero2'.  

**numero1 -le numero2:**	Devuelve verdadero si 'numero1' es igual o menor a 'numero2'.  

**numero1 -lt numero2:**	Devuelve verdadero si 'numero1' es menor a 'numero2'.  

**numero1 -ne numero2:**	Devuelve verdadero si 'numero1' no es igual a 'numero2'.  

***
### Comparaciones de cadenas   

**cadena1 = cadena2:** Devuelve verdadero si 'cadena1' es idéntica a 'cadena2'.  

**cadena1 != cadena2:** Devuelve verdadero si 'cadena1' no es idéntica a 'cadena2'.  

**cadena1:**	Devuelve verdadero si 'cadena1' es nulo.  

**-n cadena1:** Devuelve verdadero si la longitud de caracteres de 'cadena1' es mayor que cero.  

**-z cadena1:** Devuelve verdadero si la longitud de caracteres de 'cadena1' es cero.  

***
### Comparaciones de ficheros  

**-d nombrefichero:** Devuelve verdadero si el fichero es un directorio.  

**-f nombrefichero:** Devuelve verdadero si el fichero es un archivo.  

**-r nombrefichero:** Devuelve verdadero si el fichero puede ser leído.  

**-w nombrefichero:**	Devuelve verdadero si el fichero puede ser escrito.  

**-x nombrefichero:** Devuelve verdadero si el fichero es ejecutable.  

***
### Comparación de expresiones  

**!expresión:** Devuelve verdadero si la expresión no se cumple.  

**expresión1 -a expresión2:** Devuelve verdadero si la expresión1 y la expresión2 se cumplen (también vale &&).  

**expresión1 -o expresión2:** Devuelve verdadero si la expresión1 o la expresión2 se cumplen (también vale ||).  

***
## Condicionales  
En programación, una sentencia condicional es una instrucción que se pueden ejecutar o no en función del valor de una expresión. En Bash, las condicionales más populares son los siguientes:  

**If – Then**  
if [ expresión ]  
then  
comandos  
fi  

***
**If – Then – Else**  
if [ expresión ]  
then  
comandos  
else  
comandos  
fi  

***
**If – Then – Else if – Else**  
if [ expresión1 ]  
then  
comandos  
elif [ expresión2 ]  
then  
comandos  
else  
comandos  
fi  

***
**Case**  
case cadena in  
cadena1)  
comandos  
;;  
cadena2)  
comandos  
;;  
\*)  
comandos  
;;  
esac  

Se comprueba cadena. Si concuerda con cadena1 se ejecutará los comandos correspondientes hasta llegar a ;;. Lo mismo ocurre con cadena2. Si cadena no coincide con cadena1 o cadena2 entonces se ejecutará \*. Se puede añadir tantas cadenas de verificación como uno desee.  
***
## Bucles  
**For**  

for (( inicializador; condición; incremento ))  
do  
	comandos  
done  

**Ejemplo:**  
 #!/bin/bash  
 for (( c=1; c<=5; c++ ))  
 do  
 	echo "Bienvenido $c veces..."  
 done  
***
**While**  

while [ expresión ]  
do  
comandos  
done  
***
# ¿Cómo ejecutar tus scripts BASH?  

 1) Abre tu editor de textos preferido.

 2) Escribe el siguiente código:  
  ***
      *          #!/bin/bash  
      *          echo "Hola mundo"  
      *          # Código y más código...  
  ***
**La primera línea no es obligatoria pero sirve para documentar con qué shell está hecho el script, el resto es código tuyo.**  

3) Guárdalo como holamundo.sh  

4) Para lanzar el script BASH, primero dale permisos de ejecución. Para ello escribe en tu terminal de comandos:  
***
chmod u+x holamundo.sh  
***
5) Ejecuta el script escribiendo en la consola:  
***
./holamundo.sh  
***  
# [Ejercicios](/Tallers/Mi_amiga_terminal/Page6.md)
