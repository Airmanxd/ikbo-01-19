import java.util.regex.Pattern;

public class lab12 {
    public static void main(String[] args) {
        String regex = "(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/(19[0-9]{2}|[2-9][0-9]{3})";
        String[] arr = {"29/02/8727", "30/14/2003", "01/01/2003", "29/12/3491", "30-04-2003", "1/1/1899", "0/2/1999"};
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + ": " + Pattern.compile(regex).matcher(arr[i]).matches());

    }
}
