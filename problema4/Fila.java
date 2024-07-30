package problema4;
import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

public class Fila {
    Random random = new Random();
    private LinkedList<Integer> fila1;

    public Fila() {
        this.fila1 = new LinkedList<>();
        for (int i = 0; i < 100; i++) { 
            fila1.add(random.nextInt(100)); 
        }
    }

    public LinkedList<Integer> getFila1() {
        return fila1;
    }

    public void setFila1(LinkedList<Integer> fila1) {
        this.fila1 = fila1;
    }

    public static LinkedList<Integer> inverterFila(LinkedList<Integer> fila1) {
        Stack<Integer> pilha = new Stack<>();

        while (!fila1.isEmpty()) {
            pilha.push(fila1.poll());
        }

        LinkedList<Integer> filaInvertida = new LinkedList<>();
        while (!pilha.isEmpty()) {
            filaInvertida.add(pilha.pop());
        }

        return filaInvertida;
    }


}
