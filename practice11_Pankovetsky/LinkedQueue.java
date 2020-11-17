import java.util.LinkedList;
import java.util.List;

public class LinkedQueue<T> extends AbstractQueue<T> {

    public LinkedQueue()
    {
        this.queue = new LinkedList<T>();
    }

    @Override
    public T peek()
    {
        if(queue == null)
            return null;
        else
            return queue.get(0);
    }

    @Override
    public T poll()
    {
        if(queue == null)
            return null;
        T temp = queue.get(0);
        queue.remove(0);
        return temp;
    }

    @Override
    public boolean offer(T element)
    {
        return queue.add(element);
    }
}
