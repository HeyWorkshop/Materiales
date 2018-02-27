# Solución JAVADOC

```java
/**
 * Clase EmpleadoAsalariado
 * 
 * Contiene informacion de cada empleado de tipo asalariado
 * 
 * @author Moises
 * @version 1.0
 */
public class EmpleadoAsalariado {
    
    //Atributos
    
    /**
     * Nombre del empleado
     */
    private String nombre;
    /**
     * Apellido del empleado
     */
    private String apellido;
    /**
     * Edad del empleado
     */
    private int edad;
    /**
     * Salario del empleado
     */
    private double salario;
    
    //Metodos publicos
    
    /**
     * Suma un plus al salario del empleado si el 
     * empleado tiene más de 40 años
     * @param sueldoPlus
     * @return <ul>
     *           <li>true: se suma el plus al sueldo</li>
     *           <li>false: no se suma el plus al sueldo</li>
     *         </ul>
     */
    public boolean plus(double sueldoPlus){
        boolean aumento= false;
        if(edad>40 && compruebaNombre()){
            salario+=sueldoPlus;
            aumento=true;
        }
        return aumento;
    }
    
    //Metodos privados
    /**
     * Comprueba que el nombre no este vacio
     * @return <ul>
     *           <li>true: el nombre es una cadena vacia</li>
     *           <li>false: el nombre no es una cadena vacia</li>
     *         </ul>
     */
    private boolean compruebaNombre(){
        if(nombre.equals("")){
            return false;
        }
        return true;
    }
    
    //Constructores
    /**
     * Constructor por defecto
     */
    public EmpleadoAsalariado(){
        this ("","",0,0);
    }
    /**
     * Constructor con 4 parametros
     * @param nombre nombre del empleado
     * @param apellido apellido del empleado
     * @param edad edad del empleado
     * @param salario salario del empleado
     */
    public EmpleadoAsalariado(String nombre, String apellido, int edad, double salario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }
}
```

# Solución Doxygen

```java
/**
 * @brief La clase Alumno representa a un estudiante de una escuela 
 * @author Moises
 * @version 1.0
 * @date Febrero 2018
 */
public class Alumno {
    
    /**
     * Matricula del estudiante (ID de identificación)
     */
    private String matricula;
    /**
     * Nombre del alumno
     */
    private String nombre;
    /**
     * Apellido paterno del estudiante (Primer apellido)
     */
    private String apellidoPaterno;
    
    private String apellidoMaterno; /** Apellido materno del alumno, estudiante, igualmente es el segundo apellido de parte de la madre */
 
    private int Nosemestre; ///< El numero de semestre

    
    /**
     * @brief Obtener matricula del alumno
     * @return un String, con la matrícula 
     */
    private String obtenerMatricula(){
        return this.matricula;
    }
    
    /**
     * @brief Calcula el costo a pagar por el estudiante
     * @param Nosemestre Es el número del semestre que el alumno se encuentra cursando
     * @return un entero, con el costo a pagar
     */
    public int costoAPagar(int Nosemestre){
        if(Nosemestre >= 4 ){
            return 1400;
        }
        else{
            return 1000;
        }
    }
    /**
     * @brief Constructor de alumno
     * @param matricula Es el numero de identificación del alumno
     * @param nombre Nombre del alumno
     * @param apellidoPaterno Primero apellido del alumno
     * @param apellidoMaterno Segundoa apellido del alumno
     * @param Nosemestre Número de semestre que se encuentra cursando el alumno
     */
    public Alumno(String matricula, String nombre, String apellidoPaterno, String apellidoMaterno, int Nosemestre) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.Nosemestre = Nosemestre;
    }

}
```
