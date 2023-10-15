package desafio;

import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois <= parametroUm) {
            throw new ParametrosInvalidosException();
        } else {
            for (int i = parametroUm; i < parametroDois; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}
