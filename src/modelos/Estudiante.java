package modelos;

import java.util.ArrayList;

public class Estudiante{
    //Informacion del estudiante
    private String matricula;
    private String nombre;
    private String apellido;
    private String facultad;
    private int edad;
    private String direccion;
    private String telefono;
    private ArrayList<Paralelo> paralelos;

    public Estudiante() {
    }

    public Estudiante(String matricula, String nombre, String apellido, String facultad, int edad, String direccion, String telefono) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.facultad = facultad;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    public void setParalelos(ArrayList<Paralelo> paralelos) {
        this.paralelos = paralelos;
    }
    //Getter y setter de Matricula

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //Getter y setter del Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Getter y setter del Apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    //Getter y setter de la Facultad
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    //Getter y setter de la edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Getter y setter de la direccion
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //Getter y setter del telefono

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
        
    
    
    
            
        
        
