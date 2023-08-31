
public class Task07 {

    public static String palindrom(String str){
        String res = new String();
        if (str.length() == 0 || str.length() == 1) {
            res = "YES";
        } else if (str.charAt(0) == str.charAt(str.length()-1)) {
            res = palindrom(str.substring(1, str.length()-1));
        } else {
            res = "NO";
        }
        return res;
    }
}
