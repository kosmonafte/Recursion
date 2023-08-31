public class Task10 {
    public static int maxDevider(int a, int b, int c) {
        int res;
        if (a%c == 0 && b%c == 0) {
            res = c;
        } else {
            res = maxDevider(a, b, c - 1);
        }
        return res;
    }
}
