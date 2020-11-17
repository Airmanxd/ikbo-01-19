public interface QueueEx<T> {
    T element();
    T peek();
    T poll();
    boolean offer(T element);
}
