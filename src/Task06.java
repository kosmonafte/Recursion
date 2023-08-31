public class Task06 {
    public static int reverse(int a){
        int sum = 0;
        if ((int)(a/10) == 0) {
            sum = a;
        } else {
            sum = a%10;
            sum *= 10;
            sum += reverse(a/10);
        }
        return sum;
    }
}
