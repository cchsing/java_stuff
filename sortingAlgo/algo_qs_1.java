package sortingAlgo;

public class algo_qs_1 {

    public static void quicksort1(int[] array) {
        quicksort1(array, 0, array.length - 1);
    }

    public static void quicksort1(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = array[(left + right) / 2];
        int index = partition(array, left, right, pivot);
        quicksort1(array, left, index - 1);
        quicksort1(array, index, right);
    }

    public static int partition(int[] array, int left, int right, int pivot) {
        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public static void swap(int[] array, int left, int right) {
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }

    public static void main(String[] args) {

    }

}