public class Task09 {
    public static int sum(int a, int b) {
        int res;
        if (a == b) {
            res = b;
        } else {
            res = a + sum(a+1, b);
        }
        return res;
    }
}
