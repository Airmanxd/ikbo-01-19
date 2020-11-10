public class Client {
    String Name, Surname, MiddleName, INN;
    public Client(String Name, String Surname, String MiddleName, String INN) throws BadINNException
    {
        if (INN.matches("[0-9]+"))
        {
            this.Name = Name;
            this.Surname = Surname;
            this.MiddleName = MiddleName;
            this.INN = INN;

        }
        else
        {
            throw new BadINNException();
        }
    }
}
