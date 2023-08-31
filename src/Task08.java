public class Task08 {
    public static int stepen(int a, int b) {
        int res;
        if (b < 2) {
            res = a;
        } else {
            res = a * stepen(a, b - 1);
        }
        return res;
    }
}
