public final class Dish implements Item{
    final int cost;
    final String name, description;

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Dish(String name, String description) {
        this.name = name;
        this.cost=0;
        this.description = description;
    }

    public Dish(int cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

}
