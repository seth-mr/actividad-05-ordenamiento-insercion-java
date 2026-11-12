import java.util.Arrays;

public class Actividad05OrdenamientoInsercion {
    public static void main(String[] args) {
        int[] valores = {905, 210, 550, 102, 443};

        System.out.println("Arreglo inicial: " + Arrays.toString(valores));

        for (int i = 1; i < valores.length; i++) {
            int valorActual = valores[i];
            int j = i - 1;

            while (j >= 0 && valores[j] > valorActual) {
                valores[j + 1] = valores[j];
                j--;
            }

            valores[j + 1] = valorActual;
            System.out.println("Pasada " + i + ": " + Arrays.toString(valores));
        }

        System.out.println("Arreglo ordenado final: " + Arrays.toString(valores));
    }
}
