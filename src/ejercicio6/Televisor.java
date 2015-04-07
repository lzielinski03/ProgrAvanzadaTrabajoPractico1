package ejercicio6;

import ejercicio6.model.Color;
import ejercicio6.model.ConsumoEnergetico;

public class Televisor extends Electrodomestico{

    private int pulgadas;

    public Televisor() {
        super();
        this.setPulgadas(15);
    }

    public Televisor(int pulgadas) {
        super();
        this.setPulgadas(pulgadas);
    }

    public Televisor(int precioBase, Color color, ConsumoEnergetico consumoElectrico, int peso, int pulgadas) {
        this.setPrecioBase(precioBase);
        this.setColor(color);
        this.setConsumoElectrico(consumoElectrico);
        this.setPeso(peso);
        this.pulgadas = pulgadas;
    }

    @Override public double calcularPrecioFinal() {
        return super.calcularPrecioFinal() + this.calcularPrecioPulgadas();
    }

    public double calcularPrecioPulgadas() {

        final int pugadas = this.getPulgadas();

        if( pulgadas >= 10 && pulgadas <= 15) return 150;
        if( pulgadas >= 16 && pulgadas <= 20) return 500;
        if( pulgadas > 20) return 700;

        return 0;
    }


    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        if(pulgadas <= 0) {
            this.pulgadas = 1;
        } else {
            this.pulgadas = pulgadas;
        }
    }
}
