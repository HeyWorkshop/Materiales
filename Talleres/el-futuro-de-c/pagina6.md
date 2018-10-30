# Utilizando mi módulo en Node.js
![node.js logo](https://nodejs.org/static/images/logos/nodejs-new-pantone-black.png)
En el siguiente ejemplo tenemos un programa escrito en Node.js el cual utiliza el módulo de C para resolver el problema de las bombillas. Al ejecutar el programa se puede observar como los resultados obtenidos por la rutina de C pueden ser utilizados por Node.js
```
'use strict'

const child_exec = require('child_process').exec;

child_exec('./bombillas', (error, stdout, stderr) => {
	if (error) throw(error);
	let bombillas = stdout.slice(0, stdout.length - 1).split('\n').map(elemento => Number(elemento));

	console.log('Bombillas encendidas', bombillas);
});
```

##### [Anterior](pagina5.md) -- [Siguiente](pagina7.md)