public class Shirt {
    String id, name, color, size;
    public Shirt(String data)
    {
        String[] temp = data.split(",");
        this.id = temp[0];
        this.name = temp[1];
        this.color = temp[2];
        this.size = temp[3];
    }
    public Shirt(){};
    public String toString()
    {
        return String.format("id: %s\nname: %s\ncolor: %s\nsize: %s", id, name, color, size);
    }
}
