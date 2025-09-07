import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> a = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            // Skip duplicates for i
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int l = i + 1, r = n - 1;
            while (l < r) {
                int s = arr[i] + arr[l] + arr[r];

                if (s == 0) {
                    a.add(Arrays.asList(arr[i], arr[l], arr[r]));

                    // Skip duplicates for l
                    while (l < r && arr[l] == arr[l + 1]) l++;
                    // Skip duplicates for r
                    while (l < r && arr[r] == arr[r - 1]) r--;

                    l++;
                    r--;
                } 
                else if (s < 0) {
                    l++;
                } 
                else {
                    r--;
                }
            }
        }
        return a;
    }
}
