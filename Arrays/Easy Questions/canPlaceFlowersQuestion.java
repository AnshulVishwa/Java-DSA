public class canPlaceFlowersQuestion {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean left = false;
        boolean right = false;
        int i = 1;
        
        if (flowerbed.length == 1) {
            return (flowerbed[0] == 0 ? n <= 1 : n == 0);
        }

        if (flowerbed[0] == 0 && flowerbed.length > 1 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            n--;
        }
        
        if (flowerbed[flowerbed.length - 1] == 0 && flowerbed.length > 1 && flowerbed[flowerbed.length - 2] == 0) {
            flowerbed[flowerbed.length - 1] = 1;
            n--;
        }
        
        while (i + 1 < flowerbed.length && n > 0) {
            if (flowerbed[i - 1] == 1) {
                left = false;
            } else {
                left = true;
            }

            if (flowerbed[i + 1] == 1) {
                right = false;
            } else {
                right = true;
            }

            if (left && right && flowerbed[i] == 0) {
                flowerbed[i] = 1;
                n--;
                i++;
            }
            i++;
        }
        
        return n <= 0;
    }
    public static void main(String[] args) {
        int arr[] =  { 0 , 1 , 0 , 0 , 1 , 1 , 0 };
        int n = 2;
        canPlaceFlowers(arr, n);
    }
}
