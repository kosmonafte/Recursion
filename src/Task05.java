public class Task05 {
    public static String reverse(int a){
        String str = new String();
        if ((int)(a/10) == 0) {
            str = String.valueOf(a);
        } else {
            str += reverse((int)(a / 10)) + " " + a%10;
        }
        return str;
    }
    //Переделал прям совсем без строк, хотя я думаю там имелось ввиду что нельзя использовать методы класса String,
    //в первом варианте они тоже не использовались
    public static void reverseNoStr(int a){
        if ((int)(a/10) == 0) {
            System.out.print(String.valueOf(a)+" ");
        } else {
            reverseNoStr((int)(a / 10));
            System.out.print(a%10+" ");
        }
    }
}
