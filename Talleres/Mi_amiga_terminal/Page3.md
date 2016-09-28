#Alias en consola

##¿Qué es?
Un Alias, como su nombre lo indica, nos servirá para reemplazar una palabra o serie de palabras con otra más corta y sencilla.

Un ejemplo práctico puede ser entrar a la carpeta "JavaProjects" que está dentro de la carpeta "Documents". La forma normal sería escribir: "cd Documents/JavaProjects", pero con un alias podemos hacerlo escribiendo solamente "javap".

##¿Cómo se hace?
Crear un alias es realmente sencillo. La sintáxis sería:

```alias palabra_corta='comando o palabras a reemplazar' ```

Usando el ejemplo anterior sería:

```
alias javap='cd Documents/Develop/Java_Projects'
```

Nota: Esta es la forma temporal.

##Hacerlo de forma permanente
Si lo que queremos es tener el alias para nuestro día a día se necesita escribirlo en el fichero .bashrc/.zshrc  que se encuentra en /home .
Hacerlo es muy sencillo, para esto solo se necesita un editor de texto, aquí usaremos "nano".

*El siguiente comando abrirá el fichero en el editor:
```sudo nano .bashrc ```  //usando zsh//   ```sudo nano .zshrc```

*Procedemos a escribirlo de la misma forma que en la consola : 
```alias palabra_corta='comando o palabras a reemplazar' ```

*Guardamos el fichero modificado y lo cargamos de nuevo en la consola con el comando:
```source .bashrc ``` //usando zsh// ```source .zshrc ```

Así de sencillo podemos ahorrarnos mucho tiempo.

