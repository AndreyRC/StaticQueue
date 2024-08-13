public interface InterfaceQueue<T> {
    void CircularQueue(int size);
    void add(T data);
    public T remove();
    public void clear();
    public boolean isFull();
    public boolean isEmpty();

}
