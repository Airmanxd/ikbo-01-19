import java.util.Scanner;

public class Prac9 {
    public static void main(String[] args) throws BadINNException{
        String Name, Surname, MiddleName, INN;
        Scanner sc = new Scanner(System.in);
        Name = sc.nextLine();
        Surname = sc.nextLine();
        MiddleName = sc.nextLine();
        INN = sc.nextLine();
        Client cl = new Client(Name, Surname, MiddleName, INN);

    }
}
