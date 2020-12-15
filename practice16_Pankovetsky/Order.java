public interface Order {
    boolean add(Item item);
    boolean remove(String name);
    int removeAll(String name);
    int dishQuantity();
    Object[] getDishes();
    int costTotal();
    String[] dishesNames();
    Object[] sortedDishesByCostDesc();
}
