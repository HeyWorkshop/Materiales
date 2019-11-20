# Nuestro primer objeto y interfaz

Interfaz Figura:
```java
public interface Figura{
	public double area();
	public double perimetro();
}
```
Clase abstracto FiguraImprimible:
```java
public abstract class FiguraImprimible implements Figura{

	public void imprimirArea() {
		System.out.println(this.area());
	}
	
	public void imprimirPerimetro() {
		System.out.println(this.perimetro());
	}
}
```

Clase Objeto Triangulo:
```java
public class Triangulo extends FiguraImprimible{

	private double base;
	private double altura;
	private double lados[];
	
	public Triangulo(double base, double altura, double[] lados) {
		this.base = base;
		this.altura = altura;
		this.lados = lados;
	}
	
	@Override
	public double area() {
		return base*altura/2;
	}

	@Override
	public double perimetro() {
		double temporal = 0;
		for(int i = 0; i < lados.length; i++) {
			temporal+=lados[i];//temporal = temporal + lados[i];
		}
		return temporal;
	}

}
```

Como instanciar nuestro nuevo objeto
```java
public class MiPrimeraAplicacion{
	public static void main(String[] args){
		Triangulo triangulo = new Triangulo(2,3,new double[]{2,3,4});
		triangulo.imprimirArea();
	}
}
```
## [Anterior](page8.md)  --  [Siguiente](page10.md)