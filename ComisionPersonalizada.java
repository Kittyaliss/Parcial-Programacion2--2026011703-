public class ComisionPersonalizada implements EstrategiaComision {

    private int cantidadLetras;

    public ComisionPersonalizada(int cantidadLetras) {
        this.cantidadLetras = cantidadLetras;
    }

    @Override 
    public double calcularComision(double montoVenta) {
        double porcentaje = 5 + cantidadLetras;
        return montoVenta * (porcentaje /100);
    }
}