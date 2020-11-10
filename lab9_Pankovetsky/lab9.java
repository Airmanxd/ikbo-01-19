import java.util.Scanner;

public class lab9 {
    public static void exceptionDemo()
    {
        try
        {
            System.out.println(2.0/0.0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero");
        }
    }
    public static void exceptionDemo2()
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            String intString = sc.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (ArithmeticException e){
            System.out.println("Division by 0");
        }
        catch (NumberFormatException e){
            System.out.println("Wrong input format");
        }
        finally{
            System.out.println("Finally");
        }
    }
    public static void main(String[] args) {
        exceptionDemo();
        exceptionDemo2();
        //блок finally выполняется вне зависисомости от остальных блоков
    }
}
