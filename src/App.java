public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World");
        
        
        empleados[] Empleados = new empleados[3];

        Empleados[0] = new empliadoafulltime("juan ", "23412423", 75924);
        Empleados[1] = new empliadodemidtime("lucas ", "342914", 8, 22);
        Empleados[2] = new empliadoafulltime("jose ", "12739432", 242556);

       
        for (empleados empleado : Empleados) {
           System.out.println("empleados: "+ empleado.getnombre()+ "salario mensual: $ "+ empleado.calcularsalario());
        }

       
       
        for(int i = 0; i<  Empleados.length; i++){
            System.out.println("Empleados "+ Empleados[i].getnombre() + ", salario mensual: $"+ Empleados[i].calcularsalario());
       }
    }
}
