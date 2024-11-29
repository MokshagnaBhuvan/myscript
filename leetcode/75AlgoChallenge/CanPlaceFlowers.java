public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        boolean res = true;
        for (int i = 0; i < flowerbed.length - 1; i++) {
            int a = flowerbed[i];
            int b = flowerbed[i + 1];
            if ((a == 0) && (b == 0)) {
                count++;
                flowerbed[i + 1] = 1;
            }

        }
        if (n != count) {
            res = false;
        }
        return res;
    }
}
