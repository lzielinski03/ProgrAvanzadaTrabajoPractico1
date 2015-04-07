package ejercicio1;

/**
 * Created by leonardo on 27/03/2015.
 */
public class CalculoImpuesto {

    public static double calcularPrecioFinal(double precioDelProducto) {
        return precioDelProducto * 0.34;
    }

    public static void run() {
        double d1 = 34;
        System.out.println("El precio final del producto es $" + calcularPrecioFinal(d1));
        // El precio final del producto es $41.14

        double d2 = 150.34;
        System.out.println("El precio final del producto es $" + calcularPrecioFinal(d2));
        // El precio final del producto es $181.9114

    }
}
