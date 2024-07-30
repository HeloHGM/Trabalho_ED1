package Quest1;


import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a frase: ");
        String frase = scan.nextLine();

        // Remover espaços e converter para minúsculas para comparação
        String fraseNormalizada = frase.replaceAll("\\s+", "").toLowerCase();
        
        StringBuilder resultado = new StringBuilder();

        // Inverter a frase
        for (int i = fraseNormalizada.length() - 1; i >= 0; i--) {
            resultado.append(fraseNormalizada.charAt(i));
        }

        String fraseInvertida = resultado.toString();

        // Verificar se é um palíndromo
        if (fraseNormalizada.equals(fraseInvertida)) {
            System.out.println("O texto é um palíndromo.");
        } else {
            System.out.println("O texto não é um palíndromo.");
        }

        // Inverter palavras individualmente (opcional)
        String[] palavras = frase.split("\\s+");
        resultado.setLength(0); // Limpar o StringBuilder para reutilizar

        for (String palavra : palavras) {
            Stack<Character> pilha = new Stack<>();
            for (char letra : palavra.toCharArray()) {
                pilha.push(letra); // push adiciona no topo
            }
            while (!pilha.isEmpty()) {
                resultado.append(pilha.pop()); // pop remove do topo e mostra
            }
            resultado.append(" ");
        }

        System.out.println("Invertido: " + resultado.toString());
        scan.close();
    }
}
