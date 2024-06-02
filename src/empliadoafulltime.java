public class empliadoafulltime extends empleados {

    private double salarioaunal;

    public empliadoafulltime(String nombre, String numeroIdent, double salarioaunal){
        super(nombre, numeroIdent);
        this.salarioaunal = salarioaunal;
    }

    
    public double calcularsalario(){
        return salarioaunal / 12;
    }

}
