package problema7;
import java.util.LinkedList;
import java.util.Stack;

public class InverterFila {

    public static LinkedList<Integer> inverterFila(LinkedList<Integer> fila) {
        Stack<Integer> pilha = new Stack<>();
        
        while (!fila.isEmpty()) {
            pilha.push(fila.poll());
        }
        
        while (!pilha.isEmpty()) {
            fila.add(pilha.pop());
        }
        
        return fila;
    }

}

