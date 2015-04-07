package presentacion;

import java.util.Scanner;

public class IOManager {

    public void print(String mensaje) {
        System.out.println(mensaje);
    }

    public void print(int mensaje) {
        System.out.println(mensaje);
    }

    public void print(Double mensaje) {
        System.out.println(mensaje);
    }

    public void print(Float mensaje) {
        System.out.println(mensaje);
    }

    public int getInt() {
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextInt()) {
            this.print("Debe ingresar un entero.");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    public Double getDouble() {
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextDouble()) {
            this.print("Debe ingresar un numero.");
            scanner.nextLine();
        }
        return scanner.nextDouble();
    }

    public String getString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
