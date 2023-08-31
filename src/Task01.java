public class Task01 {
    public static String showAllNumbers(int a, int b) {
        String str = new String();
        if (a == b) {
            str = String.valueOf(a);
        } else if (a > b) {
            str = String.valueOf(a) + " " + showAllNumbers(a - 1, b);
        } else if (a < b) {
            str = String.valueOf(a) + " " + showAllNumbers(a + 1, b);
        }
        return str;
    }
}
