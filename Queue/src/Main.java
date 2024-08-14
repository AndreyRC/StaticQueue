public class Main {
    public static void main(String[] args) {
        // Cria uma fila de tamanho 5
        StaticQueue<Integer> fila = new StaticQueue<>(5);

        // Adiciona alguns elementos
        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.add(4);
        fila.add(5);

        // Tenta adicionar um elemento a uma fila cheia
        fila.add(6); // Deve mostrar "A fila está cheia"

        // Remove e imprime elementos da fila
        System.out.println("Elemento removido: " + fila.remove()); // Deve ser 1
        System.out.println("Elemento removido: " + fila.remove()); // Deve ser 2

        // Verifica se a fila está vazia e imprime o estado da fila
        System.out.println("A fila está vazia? " + fila.isEmpty()); // Deve ser falso
        System.out.println("A fila está cheia? " + fila.isFull());  // Deve ser verdadeiro

        // Limpa a fila
        fila.clear();
        System.out.println("A fila está vazia após limpar? " + fila.isEmpty()); // Deve ser verdadeiro
    }
}
