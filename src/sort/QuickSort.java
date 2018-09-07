package sort;

public class QuickSort {
    int[] data;

    public QuickSort(int[] data) {
        this.data = data;
    }

    public void sort() {
        quickSort(0, data.length - 1);
    }

    private void quickSort(int low, int high) {
        // TODO
    }

    private int partition(int low, int high) {
        // TODO
        return 1;
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}