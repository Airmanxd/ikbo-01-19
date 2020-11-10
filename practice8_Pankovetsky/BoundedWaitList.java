
public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if (capacity>0)
        {
            super.add(element);
            capacity--;
        }
        else
        {
            System.out.println("The limit has been reached");
        }
    }

    @Override
    public String toString() {
        return "BoundedWaitList:" + cont;
    }
}