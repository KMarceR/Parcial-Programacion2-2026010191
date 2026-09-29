public class App {
    public static void main(String[] args) throws Exception {
        Vendedor vendedor = new Vendedor("Marcela Rosales", 2000.0);
        System.out.println("--- Ejecución con Comisión Estándar ---");
        vendedor.mostrarDetalle();

        vendedor.cambiarEstrategia(new ComisionPersonalizada());
        System.out.println("--- Ejecución con Comisión Personalizada ---");
        vendedor.mostrarDetalle();

    }
}
