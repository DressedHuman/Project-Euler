public class p9 {
    public static boolean check(int a, int b, int c) {
        if (a * a + b * b == c * c) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean found = false;
        int a = 1;

        while (!found && 3 * (a + 1) <= 1000) {
            int b = a + 1;
            int limit = (1000 - a) / 2;
            while (!found && b <= limit) {
                int c = (1000 - a - b);
                if (c * c == a * a + b * b) {
                    System.out.printf("%d, %d, %d\n", a, b, c);
                    System.out.println(a*b*c);
                    found = true;
                }
                ++b;
            }
            ++a;
        }
    }
}