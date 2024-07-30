package problema4;
import java.util.LinkedList;
public class Main{
    public static void main(String[] args) {
        Fila fila = new Fila();
    
        System.out.println("Fila 1 original: " + fila.getFila1());
    
        LinkedList<Integer> filaInvertida = Fila.inverterFila(fila.getFila1());
    
        System.out.println("Fila 2 invertida: " + filaInvertida);
    }
}
