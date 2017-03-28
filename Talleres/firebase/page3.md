# ![Firebase logo](imgs/firebase.png) Firebase
## Realtime Database

Primero, para modificar la base de datos debemos ir a **Database** → **Rules** y definir las siguientes reglas (solo para desarrollo)
```javascript
{
  "rules": {
    ".read": true,
    ".write": true
  }
}
```

Para crear una **referencia** a la base de datos usamos
```javascript
var dbRef = firebase.database().ref();
```
Crear un **hijo** en la referencia raíz llamado **object** es tan simple como
```javascript
const dbStudent = dbRef.child('student');
```
si usamos la función **set** para poner/reemplazar valores en la base de datos
```javascript
dbStudent.set({
	name: 'Juan',
	lastname: 'Escutia',
	age: 20
});
```

la base de datos quedaría así
```javascript
{
	student: {
		age: 20,
		lastname: 'Escutia',
		name: 'Juan'
	}
}
```

La función **on** escucha los cambios en la referencia de la base de datos especificada, y se utiliza de la siguiente forma
```javascript
dbStudent.on('value', function(data) {
	console.log( data.val() );
}
```

Cuando no necesitamos escuchar cambios del servidor utilizamos la función **once**
```javascript
dbStudent.once('value', function(data) {
	console.log( data.val() );
}
```

Cuando requerimos trabajar con listas de datos, es decir, eventos ocurriendo en los hijos de una referencia, en vez de usar **'value'**, usaremos alguno de los siguientes ejemplos dependiendo del caso de uso
```javascript
dbStudent.on('child_added' function(data){
	//some code
});
```

| Evento 			| Caso de uso	|
| :-------------:		| :------ 		|
| child_added		| Recupera una lista de ítems y escucha adiciones de ítems	|
| child_changed	| Escucha los cambios en los ítems en una lista 	|
| child_removed	| Escucha los ítems removidos de una lista 		|
| child_moved		| Escucha el orden en que los ítems de una lista cambian 	|

La función **push** nos genera una nueva referencia con un **key** aleatorio
```javascript
dbStudents.push().set({
	name: 'Agustín',
	lastname: 'Melgar',
	age: 18
});
```
la base de datos quedaría así
```javascript
{
	students: {
		-KbfWbtOjsptr7T8EqZ: {
			name: 'Agustín',
			lastname: 'Melgar',
			age: 18
		},
		-KbfYAHIpXwhptbRGc1T: {...},
		-KbfZD73W83pBDVTX4CZ: {...}
	}
}
```

El parámetro **data** es el dato que está siendo escuchado en la referencia, éste incluye parámetros como **key** (la llave del dato) y funciones como **val**(el valor de ese dato)
```javascript
dbStudents.on('child_added', function(data) {
	console.log( data.key ); // -KbfWbtOjsptr7T8EqZ

	console.log( data.val() );	/* {
								 * 	name: 'Agustín',
								 * 	lastname: 'Melgar',
								 * 	age: 18
								 * }
								 *
								 */

	console.log( data.val().name ); // Agustín
}
```

Métodos para **ordenar** datos

| Función 		| Uso	|
| :-------------:		| :------ 	|
| orderByChild()	| Ordena los resultados por el valor de una llave específica de un hijo	|
| orderByKey()	| Ordena los resultados por las llaves de los hijos					|
| orderByValue()	| Ordena los resultados por el valor de los hijos						|

Ejemplo de uso
```javascript
dbStudents.orderByChild('age');
```



## [Anterior](page2.md) - - [Siguiente](page4.md)
