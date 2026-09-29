public class ComisionPersonalizada implements EstrategiaComision {
    @Override
    public double calcularComision(double montoVenta) {
        String primerNombre = "Karla";
        int n = primerNombre.length();
        double porcentaje = (5 + n) / 100.0;
        return montoVenta * porcentaje;
    }
}
