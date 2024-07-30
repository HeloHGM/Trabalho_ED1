package Quest2;

import java.util.Scanner;
import java.util.Stack;

public class Sem {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o caractere que deseja remover: ");
        char caractereARemover = scanner.nextLine().charAt(0);

        System.out.print("Digite a palavra em letras minúsculas: ");
        String palavra = scanner.nextLine();
        
        String palavraModificada = substituirCaractere(palavra, caractereARemover);
        System.out.println("Palavra modificada: " + palavraModificada);
        
        scanner.close();
    }
    
    public static String substituirCaractere(String palavra, char caractere) {
        Stack<Character> pilha = new Stack<>();
        
        // Empilha todos os caracteres, substituindo o caractere a ser removido por *
        int i = 0;
        while (i < palavra.length()) {
            char c = palavra.charAt(i);
            if (c == caractere) {
                pilha.push('*');
            } else {
                pilha.push(c);
            }
            i++;
        }

        // Desempilha os caracteres de volta para construir a string resultante
        StringBuilder resultado = new StringBuilder();
        while (!pilha.isEmpty()) {
            resultado.insert(0, pilha.pop());
        }

        return resultado.toString();
    }
}
