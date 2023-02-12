public class NumerosPrimos {
        public static void main(String[] args) {

            int n = 5; //variable para el número de posiciones que vamos a mostrar
            int divisibles; //variable para los divisores que se usan para sacar numeros primos
            int posicion = 0; //las posiciones del arreglo
            int[] arreglo = new int[n];  //arreglo

            for (int i = 0; posicion < n; i++) {
                divisibles = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        divisibles++;
                    }
                }
                if (divisibles == 2) {
                    arreglo[posicion] = i;
                    posicion++;
                }
            }
            for (int p = 0; p < arreglo.length; p++) {
                System.out.println("" + arreglo[p]);
            }
        }
    }