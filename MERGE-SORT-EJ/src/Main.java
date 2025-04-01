public class Main {

    public static void main(String[] args) {

        int[] arr = {1,2,4,8,0,5,6,7,1,100,90,35,36,85,9,1,2};
        MergeSort.mergeSort(arr);
        System.out.println("Arreglo ordenado: ");

        for (int num : arr) {

            System.out.print(num + " ");

        }

    }

}
