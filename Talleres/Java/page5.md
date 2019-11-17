# Estructuras de Control
Hay tres tipos de estructuras de control:

- Ramas condicionales, que usamos para elegir entre dos o más rutas. Hay tres tipos en Java: _if/else/else if_, _ternary operator_ and _switch_.
- Ciclos que se utilizan para iterar a través de múltiples valores / objetos y ejecutar repetidamente bloques de código específicos. Los tipos de ciclos básicos en Java son _for_, _while_ and _do while_.
- Declaraciones de ramificación, que se utilizan para alterar el flujo de control en los ciclos. Hay dos tipos en Java: _break_ and _continue_.

### If/Else/Else If
```
if(expresion2){
	//operacion 1
}else if(expresion2){
	//operacion 2
}else{
	//operacion 3
}
```
Ejemplo:
```
int count = 2;
if(count > 2){
	System.out.println("Variable count es mayor que 2");
}else{
	System.out.println("Variable count es no es mayor que 2");
}
```

### Operación Ternaria
```
System.out.println(expresion ? operacion1 : operacion2);
```
Usaremos el ejemplo anterior
```
int count = 2;
System.out.println(count > 2 ? "mayor que 2" : "no es mayor que 2");
```

### Switch
```
switch(variable){
case valor1:
	operacion1
	break;
case valor2:
	operacion2
	break;
default:
	operacion3
	break;
}
```
Ejemplo:
```
int count = 3;
switch (count) {
case 0:
    System.out.println("count es igual a 0");
    break;
case 1:
    System.out.println("count es igual a 1");
    break;
default:
    System.out.println("count es negativo o mayor que 1");
    break;
}
```

### Ciclos

for loop
```
for(int i = 1; i <= 50; i++){
	System.out.println(i);
}
```
while loop
```
int i = 1;
while(i <= 50){
	System.out.println(i);
	i++;
}
```

### Break y Continue
Podemos usar `break;` para salir de un ciclo antes que se termina.
```
for(int i = 1; i <= 10; i++){
	if(i == 5){
		break;
	}
	System.out.println(i);
}
```
Igual esta `continue;` para saltar al resto del ciclo donde estamos.
```
for(int i = 1; i <= 10; i++){
	if(i == 5){
		continue;
	}
	System.out.println(i);
}
```
## [Anterior](page4.md)  --  [Siguiente](page6.md)