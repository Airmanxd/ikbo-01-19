import java.util.Scanner;

public class prac12 {
    public static void test_phone()
    {
        String phone;
        Scanner sc = new Scanner(System.in);
        phone = sc.nextLine();
        PhoneConverter ph = new PhoneConverter(phone);
        System.out.println(ph);
    }
    public static void test_shirt()
    {
        String[] data = {
                "S001, Black Polo Shirt, Black, XL",
                "S002, Black Polo Shirt, Black, L",
                "S003, Blue Polo Shirt, Blue, XL",
                "S004, Blue Polo Shirt, Blue, M",
                "S005, Tan Polo Shirt, Tan, XL",
                "S006, Black T-Shirt, Black, XL",
                "S007, White T-Shirt, White, XL",
                "S008, White T-Shirt, White, L",
                "S009, Green T-Shirt, Green, S",
                "S010, Orange T-Shirt, Orange, S",
                "S011, Maroon Polo Shirt, Maroon, S"
        };
        Shirt[] shirts = new Shirt[data.length];
        for(int i = 0; i < data.length; i++)
        {
            shirts[i] = new Shirt(data[i]);
            System.out.println(shirts[i]);
        }
    }

    public static void main(String[] args) {
        test_shirt();
    }
}
