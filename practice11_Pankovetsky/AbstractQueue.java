import java.util.Collection;
import java.util.List;

public class AbstractQueue<T> implements QueueEx<T> {
    List<T> queue;

    @Override
    public T element() {
        T element = peek();
        if (element != null)
            return element;
        else
            return null;
    }

    public boolean add(T element)
    {
        if (offer(element))
            return true;
        else
            return false;
    }

    public boolean add_multiple(Collection<? extends T> collection)
    {
        boolean b = false;
        for(T i : collection)
        {
            if (add(i))
                b = true;
        }
        return b;
    }

    public T remove()
    {
        T element = poll();
        if(element != null)
            return element;
        else
            return null;
    }
    public String toString()
    {
        return queue.toString();
    }
    @Override
    public boolean offer(T element) {
        return false;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public T poll() {
        return null;
    }
}
