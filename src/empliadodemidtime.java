public class empliadodemidtime extends empleados{

    private double salarioporHora;
    private int horastrabjadas;

    public empliadodemidtime(String nombre, String numIddent, double salarioporHora, int horastrabjadas){
        super(nombre, numIddent);
        this.salarioporHora = salarioporHora;
        this.horastrabjadas = horastrabjadas;
    }

    @Override
    public double calcularsalario(){
        return salarioporHora = horastrabjadas * 4;
    }

}
