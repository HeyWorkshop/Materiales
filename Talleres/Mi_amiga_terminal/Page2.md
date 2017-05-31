# ¿Qué es BASH?  
Es un intérprete de comandos para sistemas operativos de tipo Unix, a través de este shell podremos realizar diversas actividades y manipular el entorno operativo; Manipular y movernos a través de ficheros y sistemas de archivos, controlar ciertos procesos que están ocurriendo en el sistema, etc...

### Archivos y directorios
***
 **ls** lista los archivos y directorios.  
 **ls -a** lista los archivos y directorios incluyendo los ocultos.  
 **ls -ltr** lista los archivos y directorios mostrando fecha de creación.  
***
 **cd nombre_directorio/** cambio de directorio.  
 **cd ..** regresa al directorio anterior.  
 **pwd** muestra la ruta al directorio actual.  
 **mkdir nombre_directorio** crea un directorio.  
 **rmdir** borro directorios.    
 **cp archivo nueva/ruta/**: copia archivos.  
 **rm nombre_archivo** borra archivos.  
 **mv archivo /nueva/ruta**: mueve o renombra archivos y directorios.  
 ***
 **find nombre_archivo** busca archivos.  
 **tar -cvf cualquier_nombre.tar nombre_archivo** empaqueto archivos .tar.    
 **tar -xvf nombre_archivo** descomprime archivos .tar  
 **gzip -9 archivo** comprime archivos gz.  
 **gzip -d archivo** descomprime archivos gz.
***  
**chmod +r** asigno permiso de lectura a archivos y directorios.  
**chmod -r** quito permiso de lectura a archivos y directorios.  

[Ejercios](/Talleres/Mi_amiga_terminal/Ejercicios.md)

### Usuarios  
--> passwd: permite cambiar la contraseña.  
--> whoami: muestra el nombre de usuario.  
--> id: muestra datos de identificación del usuario.  
--> who: muestra los usuarios del sistema.  
--> last: información de los últimos usuarios que han usado el sistema.  

**chmod +x** asigno permiso de ejecución a archivos.  
**chmod -x** quito permiso de ejecución a archivos.  

**chmod +rwx** asigno todos los permisos a archivos y directorios.  
**chmod -rwx** quito todos los permisos a archivos y directorios.  

Ejemplo:  
***chmod -rwx mi_carpeta/archivo.txt***
***
### Usuarios  
***
**passwd** permite cambiar la contraseña.  
**whoami** muestra el nombre de usuario.  
**id** muestra datos de identificación del usuario.  
**who** muestra los usuarios del sistema.  
**last** información de los últimos usuarios que han usado el sistema.  
***
### Procesos
***
**top** muestra los procesos que se están ejecutando y permite matarlos.  
**ps** muestra la lista de procesos del usuario.  
**ps aux** muestra la lista de procesos de la máquina.  
**kill id-del-proceso** mata proceso por ID.  
***
### Red  
***
**ifconfig** muestra la configuración del dispositivo de red.  
**iwconfig** muestra la configuración del dispositivo de red inalámbrico.  
**nmap** escanea la red y muestra los puertos que se encuentran disponibles. (Ver más acerca de este comando en el apartado 'Comandos extras')  
**ping direccion_ip** indica si hay respuesta por parte del servidor.  
***
### Sistema  
***
**reboot** reinicia la máquina.  
**shutdown** apaga el sistema.  
**uptime** muestra el tiempo transcurrido de encendida la máquina.  
***

# NOTA:  
### Cada comando tiene diversos parámetros con los que se modifica su comportamiento, por ejemplo:  
--> ls -a: lista los archivos incluyendo los que se hallan ocultos.  
### En clase veremos algunos parámetros que pueden ser anexados a los comandos, y posteriormente se realizarán ejercicios.  
