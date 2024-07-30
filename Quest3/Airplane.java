package Quest3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Aviao {
    private String nome;
    private int identificador;

    public Aviao(String nome, int identificador) {
        this.nome = nome;
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    @Override
    public String toString() {
        return "Avião{" +
                "nome='" + nome + '\'' +
                ", identificador=" + identificador +
                '}';
    }
}

public class Airplane {

    public static void main(String[] args) {
        Queue<Aviao> filaDeEspera = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nControle de Pista de Decolagem");
            System.out.println("1. Listar o número de aviões aguardando na fila de decolagem");
            System.out.println("2. Autorizar a decolagem do primeiro avião da fila");
            System.out.println("3. Adicionar um avião à fila de espera");
            System.out.println("4. Listar todos os aviões na fila de espera");
            System.out.println("5. Listar as características do primeiro avião da fila");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.println("Número de aviões aguardando na fila de decolagem: " + filaDeEspera.size());
                    break;
                case 2:
                    if (!filaDeEspera.isEmpty()) {
                        Aviao autorizado = filaDeEspera.poll();
                        System.out.println("Autorizado a decolar: " + autorizado);
                    } else {
                        System.out.println("Não há aviões na fila de decolagem.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do avião: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o identificador do avião: ");
                    int identificador = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha
                    filaDeEspera.add(new Aviao(nome, identificador));
                    System.out.println("Avião adicionado à fila de espera.");
                    break;
                case 4:
                    if (!filaDeEspera.isEmpty()) {
                        System.out.println("Aviões na fila de espera:");
                        for (Aviao aviao : filaDeEspera) {
                            System.out.println(aviao);
                        }
                    } else {
                        System.out.println("Não há aviões na fila de espera.");
                    }
                    break;
                case 5:
                    if (!filaDeEspera.isEmpty()) {
                        Aviao primeiro = filaDeEspera.peek();
                        System.out.println("Primeiro avião na fila: " + primeiro);
                    } else {
                        System.out.println("Não há aviões na fila de espera.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
