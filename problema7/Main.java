package problema7;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> fila = new LinkedList<>();
        
        for (int i = 0; i < 20; i++) {
            fila.add(i + 1); 
        }

        System.out.println("Fila original: " + fila);
        
        fila = InverterFila.inverterFila(fila);

        System.out.println("Fila invertida: " + fila);
    }
}
