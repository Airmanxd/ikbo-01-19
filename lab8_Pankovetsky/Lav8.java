import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lav8 {
    public static void main(String[] args) {
        File f = new File("text.txt");
        try(FileWriter writer = new FileWriter("text.txt", false)) // false значит, что информация в файле будет заменена
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the text you want to write in the file");
            String usertext = sc.nextLine();
            writer.append(usertext);
            writer.flush();

        }
        catch(IOException io)
        {
            System.out.println(io.getMessage());
        }
    }
}
