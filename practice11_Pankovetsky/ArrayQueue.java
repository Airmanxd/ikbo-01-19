import java.util.ArrayList;

public class ArrayQueue<T> extends AbstractQueue<T> {
    public ArrayQueue()
    {
        this.queue = new ArrayList<T>();
    }

    @Override
    public T peek() {
        if(queue != null)
            return queue.get(0);
        else
            return null;
    }

    @Override
    public T poll() {
        if (queue == null)
            return null;
        T temp = queue.get(0);
        queue.remove(0);
        return temp;
    }

    @Override
    public boolean offer(T element) {
        return queue.add(element);
    }
}
