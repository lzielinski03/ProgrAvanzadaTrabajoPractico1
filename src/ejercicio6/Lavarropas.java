package ejercicio6;

import ejercicio6.model.Color;
import ejercicio6.model.ConsumoEnergetico;

public class Lavarropas extends Electrodomestico {

    private int carga;

    public Lavarropas() {
        super();
        this.carga = 5;
    }

    public Lavarropas(int carga) {
        super();
        this.setCarga(carga);
    }

    public Lavarropas(int precioBase, Color color, ConsumoEnergetico consumoElectrico, int peso, int carga) {
        this.setPrecioBase(precioBase);
        this.setColor(color);
        this.setConsumoElectrico(consumoElectrico);
        this.setPeso(peso);
        this.carga = carga;
    }

    @Override public double calcularPrecioFinal() {
        return super.calcularPrecioFinal() + this.calcularPrecioCarga();
    }

    public int calcularPrecioCarga(){

        final int carga = this.getCarga();

        if( carga >= 3 && carga <= 5) return 250;
        if( carga >= 6 && carga <= 10) return 400;
        if( carga > 10) return 800;

        return 0;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        if(carga <= 1) {
            this.carga = 1;
        } else {
            this.carga = carga;
        }
    }
}
