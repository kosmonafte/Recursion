public class Task03 {
    public static int summ(int a){
        int sum = 0;
        if ((int)(a/10) == 0) {
            sum = a;
        } else {
            sum += a%10 + summ((int)(a / 10));
        }
        return sum;
    }
}
