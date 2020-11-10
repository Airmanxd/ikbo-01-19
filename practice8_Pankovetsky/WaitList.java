import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> cont;

    public WaitList() {
        this.cont = new ConcurrentLinkedQueue<>();
    }

    public WaitList(Collection<E> cont) {
        this.cont = new ConcurrentLinkedQueue<>(cont);
    }

    @Override
    public String toString() {
        return "WaitList: " + cont;
    }

    @Override
    public void add(E element) {
        cont.add(element);
    }

    @Override
    public E remove() {
        return cont.remove();
    }

    @Override
    public boolean contains(E element) {
        return cont.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> contentCheck) {
        return cont.containsAll(contentCheck);
    }

    @Override
    public boolean isEmpty() {
        return cont.isEmpty();
    }
}