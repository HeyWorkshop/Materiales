# Id y Class

Como se mencionó anteriormente que al trabajar con css y usar las distintas referencias a las etiquetas usadas en el body para darles atributos, estas afectaban a todas por igual.
Pero a veces no deseamos que esto suceda, por eso utilizamos los identificadores o clases.
A continuación se muestra un ejemplo:
***
`<p class="primero">mi primer paragrafo</p>`

`<p class="segundo">mi segundo paragrafo</p>`

`<p class="tercero">mi tercer paragrafo</p>`

En el css se hará referencia a estas clases con un punto seguido del nombre de la clase:

.primero{
		
		color:green;
}
	
.segundo{
		
		color:red;
}
	
.tercero{
		
		color:blue;
}

***
A continuación se presenta una nueva etiqueta de html: `<div>`,
esta representa una "división", para el `<div>` es preferible usar el id.

`<div id="primero">mi primer paragrafo</div>`

`<div id="segundo">mi segundo paragrafo</div>`

`<div id="tercero">mi tercer paragrafo</div>`

En el css se hará referencia a estas clases con un # seguido del nombre del identificador:


`#primero{`
		
		color:green;
}
	
`#segundo{`
		
		color:red;
}
	
`#segundo{`
		
		color:blue;
}
***
#CSS externo

`<link rel="stylesheet" type="text/css" href="style.css"/>`

## [Anterior](page6.md)  --  [Siguiente](page8.md)