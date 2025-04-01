public class MergeSort {

    public static void mergeSort(int[] arreglo) {

        if (arreglo.length < 2) {

            return;

        }

        int mitad_Arr = arreglo.length / 2;

        int[] prim_Arr = new int[mitad_Arr];
        int[] seg_Arr = new int[arreglo.length - mitad_Arr];

        System.arraycopy(arreglo, 0, prim_Arr, 0, mitad_Arr);
        System.arraycopy(arreglo, mitad_Arr, seg_Arr, 0, arreglo.length - mitad_Arr);


        mergeSort(prim_Arr);
        mergeSort(seg_Arr);


        merge(arreglo, prim_Arr, seg_Arr);
    }


    public static void merge(int[] arreglo, int[] prim_Arr, int[] seg_Arr) {

        int i = 0;
        int j = 0;
        int k = 0;


        while (i < prim_Arr.length && j < seg_Arr.length) {
            if (prim_Arr[i] <= seg_Arr[j]) {

                arreglo[k] = prim_Arr[i];
                i++;

            } else {

                arreglo[k] = seg_Arr[j];
                j++;

            }

            k++;

        }


        while (i < prim_Arr.length) {

            arreglo[k] = prim_Arr[i];
            i++;
            k++;

        }


        while (j < seg_Arr.length) {

            arreglo[k] = seg_Arr[j];
            j++;
            k++;

        }

    }

}
