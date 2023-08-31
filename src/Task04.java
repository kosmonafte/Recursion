public class Task04 {
    public static String reverse(int a){
        String str = new String();
        if ((int)(a/10) == 0) {
            str = String.valueOf(a);
        } else {
            str += a%10 + " " + reverse((int)(a / 10));
        }
        return str;
    }
}
