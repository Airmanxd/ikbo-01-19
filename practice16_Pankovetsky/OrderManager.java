import java.util.Arrays;
import java.util.Collection;

public class OrderManager implements Order {
    final LinkedListN2<Item> stuff;

    public OrderManager(Collection<Item> collection) {
        this.stuff = new LinkedListN2<>(collection);
    }

    public OrderManager() {
        this.stuff = new LinkedListN2<>();
    }


    @Override
    public boolean add(Item item) {
        return stuff.add(item);
    }

    @Override
    public boolean remove(String name) {
        for (Item i : stuff.toArray())
            if (i.getName().equals(name))
                return stuff.remove(i);

        return false;
    }

    @Override
    public int removeAll(String name) {
        int c = 0;
        for (Item i : stuff.toArray())
            if (i.getName().equals(name)) {
                stuff.remove(i);
                c++;
            }
        return c;
    }

    @Override
    public int dishQuantity() {
        return stuff.getSize();
    }

    @Override
    public Object[] getDishes() {
        return stuff.toArray();
    }

    @Override
    public int costTotal() {
        int cost = 0;

        for (Item i : stuff.toArray())
            cost += i.getCost();

        return cost;
    }

    @Override
    public String[] dishesNames() {
        int i = 0;
        String[] res = new String[stuff.getSize()];
        for (Item a : stuff.toArray())
        {
            res[i] = a.getName();
            i++;
        }
        return res;
    }

    @Override
    public Item[] sortedDishesByCostDesc() {
        Item[] res = stuff.toArray();
        int[] temp = new int[res.length];
        for (int i = 0; i < res.length; i++)
        {
            temp[i] = res[i].getCost();
        }
        Arrays.sort(res, (d1, d2) -> d2.getCost() - d1.getCost());
        return res;
    }
}
