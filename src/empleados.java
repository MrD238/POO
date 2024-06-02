abstract public class empleados {

    private String nombre;
    private String numeroIdent;

    public empleados(String nombre, String numeroIdent){
        this.nombre = nombre;
        this.numeroIdent = numeroIdent;
    }

    public String getnombre(){
        return nombre;
    }

    public String getnumeroIdent(){
        return numeroIdent;
    }
    
    public abstract double calcularsalario();
}
