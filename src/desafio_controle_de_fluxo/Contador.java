package desafio_controle_de_fluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro número:");
            int parametro1 = scanner.nextInt();
            System.out.println("Digite o segundo número:");
            int parametro2 = scanner.nextInt();
            
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int interacoes = parametro2 - parametro1;
        for (int i = 1; i <= interacoes; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
