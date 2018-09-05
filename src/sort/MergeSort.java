package sort;

import java.util.Arrays;

public class MergeSort {

    int[] data;
    int[] temp;

    public MergeSort(int[] data) {
        this.data = data;
        this.temp = new int[data.length];
    }

    public void sort() {
        mergeSort(0, data.length-1);
    }

    private void mergeSort(int low, int high) {
        if (low < high) {
            int middle = low + (high-low) / 2;
            mergeSort(low, middle);
            mergeSort(middle + 1, high);
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = data[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        while (i <= middle && j <= high) {
            if (temp[i] <= temp[j]) {
                data[k] = temp[i];
                i++;
            } else {
                data[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            data[k] = temp[i];
            k++;
            i++;
        }
    }
}