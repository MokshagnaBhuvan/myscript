import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        double[] merge = new double[m + n];
        // if(m>n){
        // int size =m-n;
        // }
        // else{
        // size =n-m;
        // }
        for (int i = 0; i < m; i++) {
            merge[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            merge[m + i] = nums2[i];
        }
        Arrays.sort(merge);
        double mid = (m + n) / 2.0;
        if ((m + n) % 2 == 0) {

            return (merge[(int) mid - 1] + merge[(int) mid]) / 2.0;
        } else {

            return merge[(int) mid];
        }
        return 0;
    }
}