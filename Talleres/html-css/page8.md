#Position

Ahora veremos otra propiedad de CSS llamada position:
Utilizaremos los siguiente div como ejemplo

`<div id="primero">mi primer paragrafo</div>`

`<div id="segundo">mi segundo paragrafo</div>`

`<div id="tercero">mi tercer paragrafo</div>`

##absolute

La posición absolute utiliza las coordenadas indicadas en los atributos declarados en el css.

`#segundo{`

		border: 1px solid black;
		width:100px;
		top:100px;
		left:100;
		position:absolute;
	}
***
##relative

La posición relative, igualmente utiliza las coordenadas indicadas, pero respetando su espacio natural en la web.

`#segundo{`

		border: 1px solid black;
		width:100px;
		top:100px;
		left:100;
		position:relative;
	}
***
##fixed

La posición fixed resulta ser la mas interesante por su diversas aplicaciones, esta utiliza las coordenadas indicadas, pero mantiene esa posicion de forma permanente, incluso si la página tiene un scroll.

`#segundo{`

		border: 1px solid black;
		width:100px;
		top:100px;
		left:100;
		position:fixed;
	}

## [Anterior](page7.md)  --  [Siguiente](page9.md)