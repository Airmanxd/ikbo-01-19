import java.util.Arrays;
import java.util.HashMap;

public class InternetOrder extends OrderManager{
    private HashMap<String, Order> orders;

    public InternetOrder()
    {
        orders = new HashMap<>();
    }

    public boolean add(String address, Order order)
    {
        orders.put(address, order);
        return true;
    }

    public Order getOrder(String address)
    {
        return orders.get(address);
    }

    public boolean delete(String address)
    {
        return orders.remove(address) != null;
    }

    public boolean add(String address, Item item)
    {
        return getOrder(address).add(item);
    }
    public void getOrders()
    {
        orders.forEach((k, v)
                -> System.out.println(k + ": " + Arrays.toString(v.sortedDishesByCostDesc())));
    }
}
