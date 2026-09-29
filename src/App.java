public class App {
    public static void main(String[] args) throws Exception {
        Vendedor vendedor = new Vendedor("Karla Bonilla", 2000.0, new ComisionPersonalizada());
        vendedor.mostrarDetalle();

    }
}
