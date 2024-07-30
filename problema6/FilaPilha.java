package problema6;
import java.util.LinkedList;
import java.util.Random;

public class FilaPilha {
    private Random random;
    private LinkedList<Integer> fila;
    private LinkedList<Integer> pilha;

    public FilaPilha() {
        this.random = new Random();
        this.fila = new LinkedList<>();
        this.pilha = new LinkedList<>();
        sortearNumeros(); 
        processarFila();  
    }

    private void sortearNumeros() {
        for (int i = 0; i < 1000; i++) {
            fila.add(random.nextInt(1000) + 1);
            fila.add(-(random.nextInt(1000) + 1)); 
        }
    }

    private void processarFila() {
        while (!fila.isEmpty()) {
            int num = fila.poll(); 

            if (num > 0) {
                pilha.addFirst(num); 
            } else {
                if (!pilha.isEmpty()) {
                    System.out.println("Número negativo: " + num + ", retirado da pilha: " + pilha.poll()); 
                } else {
                    System.out.println("Número negativo: " + num + ", mas a pilha está vazia.");
                }
            }
        }
    }

    public LinkedList<Integer> getFila() {
        return fila;
    }

    public LinkedList<Integer> getPilha() {
        return pilha;
    }
}
