public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10}; // Arreglo de ejemplo
        mergeSort(arr); // Llamada al algoritmo de Merge Sort
        System.out.println("Arreglo ordenado: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Método que implementa el algoritmo de Merge Sort
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return; // Si el arreglo tiene menos de dos elementos, ya está ordenado
        }

        // Encuentra el punto medio
        int middle = arr.length / 2;

        // Divide el arreglo en dos mitades
        int[] left = new int[middle];
        int[] right = new int[arr.length - middle];

        System.arraycopy(arr, 0, left, 0, middle);
        System.arraycopy(arr, middle, right, 0, arr.length - middle);

        // Ordena cada mitad de forma recursiva
        mergeSort(left);
        mergeSort(right);

        // Fusiona las dos mitades ordenadas
        merge(arr, left, right);
    }

    // Método que fusiona dos subarreglos ordenados
    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Compara y fusiona los elementos de left y right
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Si quedan elementos en left
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Si quedan elementos en right
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
