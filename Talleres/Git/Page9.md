# **Trabajando con repositorios remotos usando Git**  
Estos son los comandos básicos para manipular tus repositorios remotos:

**Listar repositorios remotos**  
Para poder consultar los repositorios remotos que tenemos configurados podemos hacer uso del comando <code>remote</code>. Este mostrará una lista con los nombres de los repositorios. Si ya has clonado alguno, al menos te mostrará "origin", que es el nombre por defecto que Git le asigna al repositorio clonado.  

<code>git remote</code>  

[![remote.png](https://s5.postimg.org/59q2xxc87/remote.png)](https://postimg.org/image/ph3iq89pf/)  


También puedes visualizar el nombre del repositorio remoto seguido de su URL asociado, usando:

<code>git remote -v</code>  

[![remoteV.png](https://s5.postimg.org/5nrexiwbr/remote_V.png)](https://postimg.org/image/e60v1v2ub/)
***

**Clonar repositorios**  
Puedes clonar repositorios remotos y agregarlos a tu entorno local y así comenzar a trabajar y colaborar en dicho repositorio. Esto se realiza de la siguiente manera:   

<code>git clone url_del_repositorio_remoto</code>  

[![clone.png](https://s5.postimg.org/rbkylpm3r/clone.png)](https://postimg.org/image/vxh2u27mr/)  
***
**Agregar y eliminar remotos**  
Si ya has creado un repositorio local, puedes enlazarlo con un repositorio remoto de la siguiente manera:  

<code>git remote add nombre_remoto url_remoto</code>  

[![addremote.png](https://s5.postimg.org/sf52xo6qv/addremote.png)](https://postimg.org/image/ey84eswf7/)  

Ahora, si deseas eliminar algún remoto, solo debes ejecutar:  
<code>git remote rm nombre_remoto url_remoto</code>  

[![rmremote.png](https://s5.postimg.org/5eyflc8x3/rmremote.png)](https://postimg.org/image/y4lbhzcwz/)  
***
**Visualizar ramas remotas**  


## [Anterior](Page7.md)  --  [Siguiente](Page8.md)
