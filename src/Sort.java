import java.util.Arrays;

import sort.*;

public class Sort {
    public static void main(String[] args) {
        int[] mData = {7, 1, 22, 6, 4, 19};

        MergeSort mSorter = new MergeSort(mData);
        mSorter.sort();
        System.out.println(Arrays.toString(mData));

        int[] qData = {7, 1, 22, 6, 4, 19};

        QuickSort qSorter = new QuickSort(qData);
        qSorter.sort();
        System.out.println(Arrays.toString(qData));
    }
}