package negocio;

import ejercicio1.CalculoImpuesto;
import ejercicio2.NumerosPares;
import ejercicio3.NumerosPrimos;
import ejercicio4.NumeroPrimo;
import ejercicio5.MatrizIdentidad;
import ejercicio6.EjercicioSeisControler;
import modelo.Menu;
import persistencia.MenuDB;
import presentacion.IOManager;
import presentacion.IOMenu;

public class MenuController {

    public void runMenu(){
        IOManager io = new IOManager();
        MenuDB mdb = new MenuDB();
        IOMenu iom = new IOMenu();
        Menu miMenu = mdb.getMenu();

        boolean fin = false;

        while(!fin) {
            iom.mostrar(miMenu);

            switch (iom.getSelectedMenu(miMenu.getSize())) {
                case 1:
                    io.print("1 - Calculo impuesto.");
                    io.print("2 - Numeros Pares.");
                    io.print("3 - Numeros Primos.");
                    io.print("4 - Numero Primo.");
                    io.print("5 - Matriz identidad.");
                    io.print("6 - Contabilizar lote electrodomesticos.");
                    io.print("7 - Salir.");

                    switch (iom.getSelectedMenu(7)){
                        case 1:
                            CalculoImpuesto.run();
                            break;
                        case 2:
                            NumerosPares.run();
                            break;
                        case 3:
                            NumerosPrimos.run();
                            break;
                        case 4:
                            NumeroPrimo ejercicio4 = new NumeroPrimo();
                            ejercicio4.run();
                            break;
                        case 5:
                            MatrizIdentidad ejercicio5 = new MatrizIdentidad();
                            ejercicio5.run();
                            break;
                        case 6:
                            EjercicioSeisControler.run();
                            break;
                        case 7:
                            io.print("Adios!!!");
                            fin = true;
                            break;
                        default:
                            break;
                    }

                    io.print("\n");
                    break;
                case 2:
                    io.print("Coming soon!!\n");
                    break;
                case 3:
                    io.print("Adios!!!");
                    fin = true;
                    break;
            }
        }
    }

}