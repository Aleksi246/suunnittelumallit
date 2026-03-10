package t9;

public class CountingSort implements SortingStrategy{
    //https://www.geeksforgeeks.org/dsa/counting-sort/
    @Override
    public void sortArray(int[] arr){
        int n = arr.length;
        if (n == 0) {
            return;
        }

        // find the maximum element
        int maxVal = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }

        // create and initialize cntArr array
        int[] cntArr = new int[maxVal + 1];
        for (int i = 0; i <= maxVal; i++) {
            cntArr[i] = 0;
        }

        // count frequency of each element
        for (int i = 0; i < n; i++) {
            cntArr[arr[i]]++;
        }

        // compute prefix sum
        for (int i = 1; i <= maxVal; i++) {
            cntArr[i] += cntArr[i - 1];
        }

        // build output array
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int v = arr[i];
            ans[cntArr[v] - 1] = v;
            cntArr[v]--;
        }

        //copied the ans to original array. obviosly this makes things slower but my strategy class method returns void so what can you do
        for (int i = 0; i < n; i++) {
        arr[i] = ans[i];
        }
    }
}
