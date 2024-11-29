
// kids With Greatest Number Of Candies
// Time-Complexity --> O(n)
import java.util.ArrayList;
import java.util.List;

class kidsWithGreatNoOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Arrays.sort(candies);
        int max = 0;
        for (int x : candies) {
            max = Math.max(max, x);
        }
        List<Boolean> res = new ArrayList<>();
        int size = candies.length;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = candies[i] + extraCandies;
        }
        for (int i = 0; i < size; i++) {
            if (result[i] >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}