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
<code>git remote rm nombre_remoto</code>  

[![rmremote.png](https://s5.postimg.org/5eyflc8x3/rmremote.png)](https://postimg.org/image/y4lbhzcwz/)  
***
**Visualizar ramas remotas**  
Para ver las ramas remotas a las que hacemos seguimiento, usa el el comando <code>branch</code> seguido del parámetro <code>-r</code>.  

<code>git branch -r</code>  

[![branchr.png](https://s5.postimg.org/hrg16sysn/branchr.png)](https://postimg.org/image/6f3fp0q3n/)  

***

**Obtener cambios de mi repositorio remoto**  
Para obtener los cambios actuales de tu repositorio remoto es necesario "jalarlos" hacia tu repositorio local, esto se puede realizar a tráves de los comandos <code>git pull</code> y <code>git fetch</code>.  

**git pull**  
Con este comando obtienes los datos más recientes del repositorio remoto y los mezclas con los datos de tu repositorio local.  
<code>git pull remoto rama</code>  

[![pull.png](https://s5.postimg.org/m1up2e3vr/pull.png)](https://postimg.org/image/75w5ussgz/)  

**git fetch**  
Con este comando obtienes los datos más recientes del repositorio remoto, sin embargo estos no se mezclan automáticamente con tu repositorio local.  
<code>git fetch remoto rama</code>  

[![fetch.png](https://s5.postimg.org/wr8dunfon/fetch.png)](https://postimg.org/image/wegzogxer/)
***  

**Subir cambios a mi repositorio remoto**  
Una vez que has terminado de trabajar con el repositorio local y ya has hecho las modificaciones requeridas, es momento de actualizar el repositorio remoto con los cambios que has realizado. Para ello se utiliza el comando <code>git push remoto rama</code>.  

[![push.png](https://s5.postimg.org/3q41l8v8n/push.png)](https://postimg.org/image/biupd817n/)
***

**¿Cómo funciona <code>git stash</code>?**  
Este comando te permite guardar tus cambios de manera temporal en tu repositorio local, sin necesidad de realizar un commit. Esto suele ser útil cuando necesitas realizar un <code>pull</code> y aún no quieres que tus cambios actuales se mezclen con los que se hallan en el repositorio remoto.  

[![stash.png](https://s5.postimg.org/9fka5k1ev/stash.png)](https://postimg.org/image/3rdzenx2b/)  

Para verificar la pila de stash, es necesario ejecutar:  
<code>git stash list</code>  

[![stashlist.png](https://s5.postimg.org/8ek1gfkfb/stashlist.png)](https://postimg.org/image/prubvafqb/)  

Para obtener el último stash almacenado, es necesario ejecutar:  
<code>git stash pop</code>  

[![stashpop.png](https://s5.postimg.org/6o10ey2w7/stashpop.png)](https://postimg.org/image/oqu365yqr/)

Para obtener un stash en particular, es necesario ejecutar:  
<code>git stash apply stashname</code>  

[![stashapply.png](https://s5.postimg.org/zexu508pz/stashapply.png)](https://postimg.org/image/cq8n5frc3/)  

Para eliminar un stash almacenado, es necesario ejecutar:  
<code>git stash drop stashname</code>  

[![stashdrop.png](https://s5.postimg.org/5cxuk7wo7/stashdrop.png)](https://postimg.org/image/4ano1odur/)  
***
## [Anterior](Page7.md)  --  [Siguiente](Page10.md)
