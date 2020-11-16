### Selectores
Para poder editar sólo los elementos que nosotros deseemos existen los *selectores*. Los básicos son por `elemento`, `clase` e `ID`. Todo esto se declara en el HTML.

- **Elemento:** modifica el elemento HTML en general, afectando a todos los elementos con ese nombre de etiqueta. `<p></p>`
- **Clase:** modifica los elementos que compartan el mismo nombre de clase. `<p class="btn"></p>`
- **ID:** modifica un único elemento, sin afectar a ningún otro. `<p id="btn1"></p>`

*Teniendo los elementos de HTML con sus debidas clases y/o ID's, ahora podemos proceder a seleccionarlos con CSS para poder modificarlos:*

**Elemento:** se usa unicamente el nombre de la etiqueta `p`
```css 
p {
    
}
```
**Clase:** se usa un "." seguido del nombre de la clase `.btn`
```css 
.btn {
    
}
```
**ID:** se usa un "#" seguido del nombre del ID `#btn1`
```css 
#btn1 {
    
}
```

#### [INICIO](../README.md)
