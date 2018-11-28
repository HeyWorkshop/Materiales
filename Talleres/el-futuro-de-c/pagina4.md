# Clases plantilla
![C++ logo](https://raw.githubusercontent.com/isocpp/logos/master/cpp_logo.png)

### Creando un contenedor
En este ejemplo básico se implementa una clase plantilla que puede contener cualquier tipo de dato en su interior, además se hace un overload al operador << para mostrar su contenido.

```
#include <iostream>

template <class T>
class Contenedor {
public:
	T valor;
	Contenedor(T valor) {
		this -> valor = valor;
	}
};

template <class T>
std::ostream& operator<<(std::ostream& os, const Contenedor<T>& dt)  
{  
    os << "Contengo el valor: " << dt.valor << '\n';  
    return os;  
}  

int main() {
	Contenedor<int> contenedor(5);
	std::cout << contenedor;
	return 0;
}
```
##### [Anterior](pagina3.md) -- [Siguiente](pagina5.md)