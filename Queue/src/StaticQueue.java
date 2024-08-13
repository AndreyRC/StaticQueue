public class StaticQueue<T> implements InterfaceQueue<T>{
    protected T[] queue;
    private int base;
    private int top;

    @Override
    public void CircularQueue(int tamanho) {
        this.queue = (T[]) new Object[tamanho];
        this.base = 0;
        this.top = 0;
    }
    public void add(T data) {
        if (isFull()) {
            System.out.println("A fila está cheia");
        } else {
            this.queue[top] = data;
            top += 1;
        }
    }
    public T remove() {
        if (isEmpty()) {
            System.out.println("A fila está vazia");
            return null;
        } else {
            this.base++;
            return this.queue[this.base];

        }

    }
    public boolean isFull() {
        if (this.top == queue.length + 1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpty() {

        if (this.base == this.top) {
            return true;
        } else {
            return false;
        }
    }
    public void clear() {
        this.base = 0;
        this.top = 0;
    }
}
