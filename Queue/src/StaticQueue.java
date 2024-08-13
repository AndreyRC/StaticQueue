public class StaticQueue<T> implements InterfaceQueue<T> {
    protected T[] queue;
    private int base;
    private int top;

    // Construtor que aceita um argumento para o tamanho da fila
    public StaticQueue(int tamanho) {
        this.queue = (T[]) new Object[tamanho];
        this.base = 0;
        this.top = 0;
    }

    // Adiciona um elemento à fila
    @Override
    public void add(T data) {
        if (isFull()) {
            System.out.println("A fila está cheia");
        } else {
            this.queue[top] = data;
            top = (top + 1) % queue.length;
        }
    }

    // Remove e retorna um elemento da fila
    @Override
    public T remove() {
        if (isEmpty()) {
            System.out.println("A fila está vazia");
            return null;
        } else {
            T data = this.queue[base];
            this.queue[base] = null; // Limpa a referência para ajudar com a coleta de lixo
            base = (base + 1) % queue.length;
            return data;
        }
    }

    // Verifica se a fila está cheia
    @Override
    public boolean isFull() {
        return (top + 1) % queue.length == base;
    }

    // Verifica se a fila está vazia
    @Override
    public boolean isEmpty() {
        return base == top;
    }

    // Limpa a fila
    @Override
    public void clear() {
        this.base = 0;
        this.top = 0;
        // Opcional: limpar a fila para ajudar com a coleta de lixo
        for (int i = 0; i < queue.length; i++) {
            queue[i] = null;
        }
    }
}
