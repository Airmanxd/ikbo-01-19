public final class Drink implements Item{
    final int cost;
    final String name, description;

    public Drink(String name, String description) {
        this.name = name;
        this.cost = 0;
        this.description = description;
    }

    public Drink(int price, String name, String description) {
        this.cost = price;
        this.name = name;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
