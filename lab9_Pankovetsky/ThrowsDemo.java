import java.util.Scanner;

public class ThrowsDemo {
    private String getDetails(String key) throws Exception
    {
        if (key.equals(""))
        {
            throw new Exception("Key set to an empty string");
        }
        return "data for " + key;
    }
    public void getKey()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Key ");
        boolean l = false;
        while(!l)
        {
            l = true;
            String key = sc.nextLine();
            try
            {
                printDetails(key);

            }
            catch (Exception e)
            {
                l = false;
                System.out.println("Key set to an empty string");
            }
        }

    }
    public void printDetails(String key) throws Exception
    {
        String message = getDetails(key);
        System.out.println(message);

    }

    public static void main(String[] args) {

    }
}
