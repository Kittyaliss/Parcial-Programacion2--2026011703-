public class Main {

    public static void main(String[] args) {

        EstrategiaComision estrategia = new ComisionPersonalizada(9);

        Vendedor vendedor = new Vendedor(
                "Alejandra",
                1000,
                estrategia
        );

        vendedor.mostrarDetalle();
    }
}