package Quest8;


import java.util.Random;


// sorteie 1000 números variando entre -100 a 100. Crie uma classe chamada
// TestaPilha que vai conter duas pilhas (objetos N e P) respectivamente, Realizar as
// seguintes operações:
// − se positivo, inserir na pilha P;
// − se negativo, inserir na pilha N;
// − se zero, retirar um elemento de cada pilha e imprimir esses números.

public class TestaPilha {

    static class Pilha {
        private int[] elementos;
        private int topo;

        public Pilha(int capacidade) {
            elementos = new int[capacidade];
            topo = -1;
        }

        public boolean estaVazia() {
            return (topo == -1);
        }

        public boolean estaCheia() {
            return (topo == elementos.length - 1);
        }

        public void empilhar(int elemento) {
            if (estaCheia()) {
                System.out.println("Erro: Pilha cheia!");
            } else {
                topo = topo + 1;
                elementos[topo] = elemento;
            }
        }

        public int desempilhar() {
            if (estaVazia()) {
                System.out.println("Erro: Pilha vazia!");
                return -1;
            } else {
                int elementoRemovido = elementos[topo];
                topo = topo - 1;
                return elementoRemovido;
            }
        }

        public void imprimirPilha() {
            if (estaVazia()) {
                System.out.println("Pilha vazia");
            } else {
                for (int i = topo; i >= 0; i--) {
                    System.out.print(elementos[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Pilha pilhaN = new Pilha(1000); // Pilha para números negativos
        Pilha pilhaP = new Pilha(1000); // Pilha para números positivos
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int numero = random.nextInt(201) - 100; // Sorteia um número entre -100 e 100

            if (numero > 0) {
                pilhaP.empilhar(numero);
            } else if (numero < 0) {
                pilhaN.empilhar(numero);
            } else {
                int numN = pilhaN.desempilhar();
                int numP = pilhaP.desempilhar();

                if (numN != -1 && numP != -1) {
                    System.out.println("Zero encontrado. Removendo elementos:");
                    System.out.println("Número negativo removido: " + numN);
                    System.out.println("Número positivo removido: " + numP);
                } else {
                    System.out.println("Zero encontrado, mas uma das pilhas está vazia.");
                }
            }
        }

        // Imprimir as pilhas ao final
        System.out.println("Pilha de números positivos (P):");
        pilhaP.imprimirPilha();

        System.out.println("Pilha de números negativos (N):");
        pilhaN.imprimirPilha();
    }
}
