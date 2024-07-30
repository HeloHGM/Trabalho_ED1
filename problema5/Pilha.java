package problema5;

import java.util.LinkedList;
import java.util.Random;

public class Pilha {
    private LinkedList<Integer> pilhaF;
    private LinkedList<Integer> pilhaP;
    private Random random;

    public Pilha() {
        this.pilhaF = new LinkedList<>();
        this.pilhaP = new LinkedList<>();
        this.random = new Random();
        separarNumeros(); 
    }

    public LinkedList<Integer> getPilhaF() {
        return pilhaF;
    }

    public LinkedList<Integer> getPilhaP() {
        return pilhaP;
    }

    public void separarNumeros() {
        for (int i = 0; i < 1000; i++) {
            int num = random.nextInt(1000); 
            if (pilhaF.contains(num)) {
                pilhaP.addFirst(num); 
            } else {
                pilhaF.addFirst(num); 
            }
        }
    }
}
