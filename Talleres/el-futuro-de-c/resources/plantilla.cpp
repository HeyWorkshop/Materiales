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