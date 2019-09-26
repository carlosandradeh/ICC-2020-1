/**
 * Clase para practicar el uso de arreglos y la estructura for.
 */
public class Arreglos {

    /**
     * Regresa el índice de un elemento en el arreglo dado, o -1 si no aparece.
     * @param arr el arreglo en el cual se buscará el parámetro k
     * @param k el entero a buscar
     * @return el índice de k en arr, o -1 si no aparece
     */
    public static int buscar(int[] arr, int k) {
        // Implementar
        int posicion = -1;
        for (int i=0; i<arr.length ; i++) {
            if (arr[i] == k) {
                posicion = i;
            }
        }
        return posicion ;
    }

    /**
     * Regresa el mayor entero de un arreglo. Puedes suponer que arr contiene al menos un elemento.
     * @param arr el arreglo
     * @return el elemento máximo de arr
     */
    public static int max(int[] arr) {
        // Implementar
        int max = arr[0];
        for (int i = 0; i<arr.length ; i++ ) {
            if (arr[i] > max ) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * Determina si existen dos elementos consecutivos en el arreglo dado que sumen a k.
     * @param arr el arreglo en el que se buscará
     * @param k el número a buscar
     * @return true si existen dos elementos consecutivos que sumen a k
     */
    public static boolean consecutivos(int[] arr, int k) {
        // Implementar
        for (int i = 0; i<arr.length -1 ; i++ ) {
            if (arr[i] + arr[i+1] == k) { //SUMA el elemento del indice i + el indice i+1
                return true;
            }
        }
        return false;
    }

    /**
     * Suma todos los elementos de un arreglo.
     * @param arr el arreglo en el que se trabajará
     * @return int que es la suma de todos sus elementos
     */
    public static int suma(int[] arr){
        int suma = 0;
        for (int  i = 0 ; i<arr.length ; i ++ ) {
            suma+= arr[i];
        }
        return suma;
    }

    /**
     * Pruebas unitarias para verificar que tus implementaciones son correctas.
     */
    public static void main(String[] args) {
        pruebasDe2a4();
        // Tus pruebas
        int[] numeros = {1,2,3,4,5};
        int pbuscar = buscar(numeros, 3); //debe de dar el indice 2
        int pmax = max(numeros); //debe de dar 5
        boolean pconsecutivos = consecutivos(numeros, 3); //debe de dar true
        int psuma = suma(numeros); //debe de dar 15
        //EL mensaje para ver si lo hice bien
        System.out.println("PRUEBAS UNITARIAS int[] numeros = {1,2,3,4,5}"+"\nEl indice que buscaste: "+ pbuscar + "\nEl max de tu arreglo es: " + pmax + "\nExisten elementos consecutivos? : " + pconsecutivos + "\nLa suma de los elementos es: " + psuma);
    }

    private static void pruebasDe2a4() {
        var random = new java.util.Random();
        int COTA = 20, N = 15 + random.nextInt(10);
        var mal = false;
        var arrI = new Integer[N];
        int aPos = 0, bPos = 0;
        while (aPos == bPos) {
            aPos = random.nextInt(arrI.length);
            bPos = random.nextInt(arrI.length);
        }
        arrI[0] = random.nextInt(COTA);
        for (int i = 1; i < arrI.length; i++) {
            arrI[i] = arrI[i - 1] + random.nextInt(COTA) + 1;
        }
        
        java.util.Collections.shuffle(java.util.Arrays.asList(arrI));
        int[] arr = java.util.Arrays.stream(arrI).mapToInt(Integer::intValue).toArray();
        int a = arr[aPos], b = arr[bPos];

        // Buscar
        if (buscar(arr, a) != aPos) {
            imprimir("arr = %s", java.util.Arrays.toString(arr));
            imprimir("buscar(arr, %d) debió regresar %d pero regresó %d.\n", a, aPos, buscar(arr, a));
            mal = true;
        }
        if (buscar(arr, b) != bPos) {
            imprimir("arr = %s", java.util.Arrays.toString(arr));
            imprimir("buscar(arr, %d) debió regresar %d pero regresó %d.\n", b, bPos, buscar(arr, b));
            mal = true;
        }
        if (buscar(arr, Integer.MIN_VALUE) != -1) {
            imprimir("arr = %s", java.util.Arrays.toString(arr));
            imprimir("buscar(arr, %d) debió regresar %d pero regresó %d.\n", 
                Integer.MIN_VALUE, -1, buscar(arr, Integer.MIN_VALUE));
            mal = true;
        }

        // Max
        int max = java.util.Arrays.stream(arr).max().getAsInt();
        if (max(arr) != max) {
            imprimir("arr = %s", java.util.Arrays.toString(arr));
            imprimir("max(arr) debió regresar %d pero regresó %d.\n", max, max(arr));
            mal = true;
        }

        // Consecutivos
        if (consecutivos(arr, -10)) {
            imprimir("arr = %s", java.util.Arrays.toString(arr));
            imprimir("consecutivos(arr, -10) debió regresar false pero regresó true.\n");   
            mal = true;
        }
        int c = aPos < arr.length - 1 ? aPos : bPos;
        if (!consecutivos(arr, arr[c] + arr[c + 1])) {
            imprimir("arr = %s", java.util.Arrays.toString(arr));
            imprimir("consecutivos(arr, %d) debió regresar true pero regresó false.\n",
                arr[c] + arr[c + 1]);
            mal = true;
        }

        if (!mal) {
            System.out.println("Los incisos 2, 3, y 4 están bien.");
        }
    }
    
    private static void imprimir(String format, Object... objs) {
        System.out.println(String.format(format, objs));
    }

}