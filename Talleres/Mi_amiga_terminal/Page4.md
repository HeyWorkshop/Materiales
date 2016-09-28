#COMANDOS EXTRAS  
###También puedes descargar archivos desde la terminal usando un link de descarga directa  
* **curl:** curl -O 'https://enlace_archivo.com/archivo.zip'  
* **wget:** wget 'https://enlace_archivo.com/archivo.zip'  


Nota: el comando **wget** solo funciona en sistemas Linux.
***

###Puedes escanear la red y verificar cuántos hosts hay en ella  
**nmap te permite explorar redes, determina el nombre del nodo y escanea puertos. Se debe usar en modo root.**  
* sudo nmap -sP 192.168.1.1/24  


[![nmap.png](https://s5.postimg.org/h5lx2i8fb/nmap.png)](https://postimg.org/image/qde5j7fhf/)    
***  
###Comando sudo  
El comando sudo te permite realizar ciertas acciones en modo root. Para instalar programas, actualizarlos y remover paquetes del sistema es necesario ejecutar este comando.  

* **sudo apt-get install nombre_paquete:** te permite instalar programas/paquetes.  
* **sudo apt-get update:** te permite actualizar la lista de paquetes que se hallan en el repositorio.  
* **sudo apt-get upgrade:** te permite actualizar las aplicaciones que se hallan en el sistema.  
*  **sudo apt-get remove nombre_paquete:** te permite remover paquetes del sistema.  

***
