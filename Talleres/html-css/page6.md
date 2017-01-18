#Mas propiedades de CSS

A continuación de presenta las propiedades básicas que pueden ser utilizadas en css.

body{
	
	background-color:orange;
	font-size: 20px;
	font-family: Arial;
	word-spacing: 30px;
}
***
##Imágenes
body{
		
		background-image: url(imagen.jpg);
		background-repeat: no-repeat;
		background-position: 100px 100px;
}
***
##Bordes
p{

		border: 1px solid black;
		margin: 50px;
}
***
##Width & Heigth

Podemos manipular el ancho de cualquier elemento con la propiedad `width: 10px;`
Podemos manipular el ancho de cualquier elemento con la propiedad `heigth: 10px;`
***
##Estados de links

Esta referencia se dirige al status por defecto de la etiqueta "a".

a:link{

		font-size:30px;
		text-decoration:none;
}

Esta referencia se dirige al status cuando hacemos click en la etiqueta "a".
	
a:active{

		font-size:60px;
		color:blue;
}
	
Esta referencia se dirige al status cuando pasamos por encima de la etiqueta "a" con el cursor.

a:hover{

		background-color: yellow;
}
	
Esta referencia se dirige al status cuando la etiqueta "a" ya se le hizo un click.

a:visited{

		color:black;
}

## [Anterior](page5.md)  --  [Siguiente](page7.md)