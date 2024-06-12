public class p4 {
    public static boolean isPalindromic(Integer num) {
        int rev_num = 0;
        int temp_num = num;

        while (temp_num > 0) {
            rev_num = rev_num * 10 + temp_num % 10;
            temp_num = temp_num / 10;
        }

        return rev_num == num;
    }

    public static int nextSmallerPalindromicNumber(Integer currentPal) {
        while (!isPalindromic(currentPal)) {
            --currentPal;
        }

        return currentPal;
    }

    public static void main(String[] args) {
        int largest = 999 * 999;
        boolean found = false;

        while (!found) {
            largest = nextSmallerPalindromicNumber(largest - 1);
            for (int i = 999; i > 99; --i) {
                if (largest % i == 0 && (largest / i) < 1000 && (largest / i) > 99) {
                    System.out.println(largest);
                    found = true;
                }
            }
        }
    }
}
