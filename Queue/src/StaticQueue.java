public class StaticQueue<T> implements InterfaceQueue<T>{
    protected T[] queue;
    private int base;
    private int top;

    public StaticQueue(int tamanho) {
        this.queue = (T[]) new Object[tamanho];
        this.base = 0;
        this.top = 0;
    }
    @Override
    public void add(T data) {
        if (isFull()) {
            System.out.println("A fila está cheia");
            return;
        } else {
            this.queue[top] = data;
            System.out.println("Elemento "+data+ " adicionado");
            top += 1;
        }
    }
    @Override
    public T remove() {
        if (isEmpty()) {
            System.out.println("A fila está vazia");
            return null;
        } else {
            T valor = this.queue[this.base];
            this.base++;
            return valor;

        }

    }
    @Override
    public boolean isFull() {
        if (this.top == queue.length) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public boolean isEmpty() {

        if (this.base == this.top) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void clear() {
        this.base = 0;
        this.top = 0;
    }
}
