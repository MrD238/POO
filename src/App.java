public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!, llamada de metodos de otras clases");
        empleados[] Empleados = new empleados[3];

        Empleados[0] = new empliadoatiempocompleto("pepe ", "asdfa11111000-11d", 1440000);
        Empleados[1] = new empliadodemediotiempo("chepe ", "chepe23324hh", 12, 1222);
        Empleados[2] = new empliadoatiempocompleto("jostin arias ", "JOSTINS2024-1348U", 200000);

        for (empleados empleado : Empleados) {
           System.out.println("empleados: "+ empleado.getnombre()+ "salario mensual: $ "+ empleado.calcularsalario());
        }

       for(int i = 0; i<  Empleados.length; i++){
            System.out.println("Empleados "+ Empleados[i].getnombre() + ", salario mensual: $"+ Empleados[i].calcularsalario());
       }
    }
}