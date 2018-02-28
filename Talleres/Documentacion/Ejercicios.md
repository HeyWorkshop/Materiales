# Ejercicio JAVADOC

```java
public class Empleado {
    
    //Atributos
    
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;
    
    //Metodos publicos
    
    public boolean plus(double sueldoPlus){
        boolean aumento= false;
        if(edad>40 && compruebaNombre()){
            salario+=sueldoPlus;
            aumento=true;
        }
        return aumento;
    }
    
    //Metodos privados
    
    private boolean compruebaNombre(){
        if(nombre.equals("")){
            return false;
        }
        return true;
    }
    
    //Constructores
    
    public Empleado(){
        this ("","",0,0);
    }
    
    public Empleado(String nombre, String apellido, int edad, double salario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }
}

```

# Ejercicio Doxygen

```java

public class Alumno {
    
    
    private String matricula;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int Nosemestre;

    private String obtenerMatricula(){
        return this.matricula;
    }

    public int costoAPagar(int Nosemestre){
        if(Nosemestre >= 4 ){
            return 1400;
        }
        else{
            return 1000;
        }
    }
    
    public Alumno(String matricula, String nombre, String apellidoPaterno, String apellidoMaterno, int Nosemestre) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.Nosemestre = Nosemestre;
    }

}

```

# Soluciones
* [Solucion](/Talleres/Documentacion/Soluciones.md)
