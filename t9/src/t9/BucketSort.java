package t9;

import java.util.ArrayList;
import java.util.List;

public class BucketSort implements SortingStrategy{
    //https://www.geeksforgeeks.org/dsa/bucket-sort-2/
    //example is made for floats i have tho normilize my arrays or something idk yet

    @Override
    public void sortArray(int[] arr){
        // Function to sort arr[] of size n using bucket sort
        int n = arr.length;

        // 1) Create n empty buckets
        List<Integer>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }
        // 1.1) find min and max and use them to calculate the range of buckets
        // for example if range of buckets is 10 and min in array is 12 the first bucket or bucket in buckets[0] will hold numbers with value 12-21 buckets[1]will hold 22-31
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        int range = (int)(max - min) / n + 1;

        // 2) Put array elements in different buckets
        for (int i = 0; i < n; i++) {
            int bi = (int) (arr[i] - min) / range;
            buckets[bi].add(arr[i]);
        }

        // 3) Sort individual buckets using insertion sort
        for (int i = 0; i < n; i++) {
            insertionSort(buckets[i]);
        }

        // 4) Concatenate all buckets into arr[]
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }

    public static void insertionSort(List<Integer> bucket) {
        for (int i = 1; i < bucket.size(); ++i) {
            int key = bucket.get(i);
            int j = i - 1;
            while (j >= 0 && bucket.get(j) > key) {
                bucket.set(j + 1, bucket.get(j));
                j--;
            }
            bucket.set(j + 1, key);
        }
    }
}
