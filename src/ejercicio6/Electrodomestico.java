package ejercicio6;

import ejercicio6.model.Color;
import ejercicio6.model.ConsumoEnergetico;

/**
 * Created by Leonardo on 29/03/2015.
 */
public abstract class Electrodomestico {

    private int precioBase;
    private Color color;
    private ConsumoEnergetico consumoElectrico;
    private int peso;

    public Electrodomestico() {
        this.precioBase = 1000;
        this.color = Color.BLANCO;
        this.consumoElectrico = ConsumoEnergetico.F;
        this.peso = 15;
    }

    public Electrodomestico(int precioBase, Color color, ConsumoEnergetico consumoElectrico, int peso) {
        this.precioBase = 1000;
        this.color = Color.BLANCO;
        this.consumoElectrico = ConsumoEnergetico.F;
        this.peso = 15;
    }

    public double calcularPrecioFinal() {
        return this.getPrecioBase() + this.calcularPrecioEnergetico() + this.calcularPrecioPeso();
    }

    public double calcularPrecioEnergetico() {
        switch(this.getConsumoElectrico()){
            case A:
                return 800;
            case B:
                return 700;
            case C:
                return 500;
            case D:
                return 300;
            case E:
                return 100;
            case F:
                return 50;
            default:
                break;
        }
        return 0;
    }

    public int calcularPrecioPeso() {

        final int peso = this.getPeso();

        if(peso >= 10 && peso >= 19) return 50;
        if(peso >= 20 && peso >= 39) return 50;
        if(peso >= 40 && peso >= 59) return 50;
        if(peso >= 60) return 50;

        return 0;
    }


    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ConsumoEnergetico getConsumoElectrico() {
        return consumoElectrico;
    }

    public void setConsumoElectrico(ConsumoEnergetico consumoElectrico) {
        this.consumoElectrico = consumoElectrico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if(peso <= 0) {
            this.peso = 1;
        } else {
            this.peso = peso;
        }
    }
}
