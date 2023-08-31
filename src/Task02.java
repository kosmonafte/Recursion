public class Task02 {
    public static String degree(int a){
        String str = new String();
        if (a == 2) {
            str = "YES";
        } else if (a % 2 == 0) {
            str = degree(a / 2);
        } else {
            str = "NO";
        }
        return str;
    }
}
