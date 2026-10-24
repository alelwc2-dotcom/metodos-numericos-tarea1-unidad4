package dif_e_Integracion;

public class Main {
    public static void main(String[] args) {
        double a = 0.0;
        double b = 1.0;
        double tolerancia = 0.00001;

        System.out.println("=== COMPARACIÓN DE MÉTODOS DE INTEGRACIÓN NUMÉRICA ===");
        System.out.println("Intervalo: [" + a + ", " + b + "] | Tolerancia: " + tolerancia);
        System.out.println("------------------------------------------------------");

        double resultadoTrapecio = TrapecioCompuesto.integrarConTolerancia(a, b, tolerancia);
        System.out.println("[Trapecio Compuesto]");
        System.out.println("- Valor de la Integral: " + resultadoTrapecio);

        double resultadoSimpson = SimpsonCompuesto.integrarConTolerancia(a, b, tolerancia);
        System.out.println("\n[Simpson 1/3 Compuesto]");
        System.out.println("- Valor de la Integral: " + resultadoSimpson);
    }
}
