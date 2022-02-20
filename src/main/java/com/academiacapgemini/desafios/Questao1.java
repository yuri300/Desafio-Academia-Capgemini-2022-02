package com.academiacapgemini.desafios;

import java.util.Scanner;

/**
 * Esta classe é utilizada para formar uma escada baseada no numero de degraus informado pelo usuário.
 *
 * @author Yuri Santana Carvalho
 */
public class Questao1 {
    /**
     * Metodo para construir uma escada com a quantidade de degraus informado.
     *
     * @param n entrada de inteiros
     * @return saída contendo a escada formada com o número informado.
     */
    public String constroiEscada(int n) {
        String escada = "";
        // for loop que percorre pelas linhas
        for (int i = 0; i < n; i++) {
            // for loop que percorre pelas colunas
            for (int j = 1; j < n - i; j++) {
                //imprime os espacos em branco
                escada = escada + " ";
            }
            for (int k = 0; k <= i; k++) {
                // imprime os asteriscos
                escada = escada + "*";
            }
            // pula uma linha
            escada = escada + "\n";
        }
        return escada;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o número de degraus: ");
        int n = sc.nextInt();
        Questao1 q1 = new Questao1();
        System.out.print(q1.constroiEscada(n));
    }
}
