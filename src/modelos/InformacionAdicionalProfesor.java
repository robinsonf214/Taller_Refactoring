package modelos;

public class InformacionAdicionalProfesor {
    public int añosdeTrabajo;
    public String facultad;
    public double BonoFijo;
    public double calcularSueldo(Profesor prof){
        double sueldo=0;
        sueldo= this.añosdeTrabajo*600 + this.BonoFijo;
        return sueldo;
    }
}
