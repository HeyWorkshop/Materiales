#Fusiones (Merge)
####¿Qué es?
Es la creación de un nuevo commit juntando una rama con otra.

![Merge](Images/merge.png)

####¿Cómo se hace?

1. Te sitúas en la rama que va a absorber (**haces checkout**)
2. Usas el comando `merge` para fusionarlos

`$ git merge <Nombre de la rama por absorber>`

###Tipos de fusiones (Merge)

#### **Fast-Forward**

Simple y automático. Solo va a hacer la fusión, esto pasa normalmente cuando se trabaja con archivos diferentes o líneas de código distintas. **No hay conflictos**

![Fast Forward Merged](Images/fastforward.png)

***

#### **Manual Merge**
Largo y manual. Antes de hacer la fusión tiene que pasar por nosotros, normalmente ocurre cuando se trabaja en los mismos archivos o líneas de códigos. **Hay conflictos**

![Manual merge](Images/3way.png)

##Conflictos

Algunas veces la unión de dos ramas no resulta tan bien, sino que ocurre un conflicto, esto pasa cuando los commits de la rama a fusionar y la rama actual modifican la misma parte en un archivo en particular y git no puede decidir cuál versión elegir, y te avisa que tú debes resolverlo.

**Impresión en consola**

```
Auto-merging index.html
CONFLICT (content): Merge conflict in index.html
Automatic merge failed; fix conflicts and then commit the result.
```

Git nos proporciona una ayuda diciéndonos que archivo tiene el conflicto, el cual al abrirlo nos muestra cuáles son los cambios tanto de una rama como de la otra:

![conflicto](Images/conflict.png)

donde tenemos que elegir entre lo que está entre <<<<<<< HEAD y ======= que es contenido que tenemos en la rama donde estamos haciendo el merge (master) o entre ======= y >>>>>>> contenido donde están los cambios hechos en la rama que queremos unir (contenido).

Para ello arreglamos el archivo con los cambios elegidos, guardamos, agregamos y hacemos commit de los cambios.

* Para deshacer un merge

`$ git reset --merge ORIG_HEAD`

***

## [Anterior](Page5.md)