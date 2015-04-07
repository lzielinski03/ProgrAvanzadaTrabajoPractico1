package ejercicio6;

import ejercicio6.model.Color;
import ejercicio6.model.ConsumoEnergetico;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Leonardo on 31/03/2015.
 */
public class EjercicioSeisControler {

    public static void run(){

        List<Electrodomestico> lote = new ArrayList<>();

        lote.add(new Televisor());
        lote.add(new Televisor(20));
        lote.add(new Televisor(2000, Color.NEGRO, ConsumoEnergetico.D, 10, 24));

        lote.add(new Lavarropas());
        lote.add(new Lavarropas(-3));
        lote.add(new Lavarropas(7, Color.ROJO, ConsumoEnergetico.B, 15, 7));

        int cantidadTelevisores = 0;
        int cantidadLavarropas = 0;
        double precioLoteTotal = 0;

        for(Electrodomestico elemento: lote) {

            if(elemento instanceof Televisor) {
                precioLoteTotal += ((Televisor) elemento).calcularPrecioFinal();
                cantidadTelevisores++;
            } else if(elemento instanceof Lavarropas) {
                precioLoteTotal += ((Lavarropas) elemento).calcularPrecioFinal();
                cantidadLavarropas++;
            }
        }

        System.out.println("Cantidad total de televisores en lote: " + cantidadTelevisores);
        System.out.println("Cantidad total de lavarropas en lote: " + cantidadLavarropas);
        System.out.println("Precio total del lote: $" + precioLoteTotal);

    }
}
