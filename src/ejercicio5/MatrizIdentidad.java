package ejercicio5;

import presentacion.IOManager;

/**
 * 5)	Definir una función que dado un número n genere una matriz identidad de nxn y otra función que muestre la matriz
 */
public class MatrizIdentidad extends IOManager{

    public static int[][] generarMatriz(int n) {
        if(n < 2) {
            return null;
        }
        int matriz[][] = new int[n][n];

        for(int i = 0; i <= n-1; i++) {
            for(int j = 0; j <= n-1; j++) {
                if(i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        return matriz;
    }

    public static void mostrarMatriz(int n[][]) {
        for(int i = 0; i <= n.length-1; i++) {
            for(int j = 0; j <= n.length-1; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void run() {
        print("Ingrese un entero: ");
        int n = getInt();
        int[][] matriz = generarMatriz(n);
        if(matriz != null) {
            mostrarMatriz(generarMatriz(n));
        } else {
            print("El numero debe ser mayor a dos(2).");
        }
    }
}
