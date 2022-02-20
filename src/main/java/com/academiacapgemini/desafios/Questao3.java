package com.academiacapgemini.desafios;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Classe utilizada para encontrar anagramas e pares de substrings da Questao3
 */
public class Questao3 {
    /**
     * Metodo que verifica anagrama e os pares de substrings que contem dentro do anagrama.
     *
     * @param caracteresAnagrama Entrada do anagrama
     * @return retorna um numero inteiro com todos os pares de substrings do anagrama
     */
    public int vefificaAnagrama(String caracteresAnagrama) {

        HashMap<String, Integer> map = new HashMap<>();
        int contTotal = 0;

        // Gera todas as substrings
        for (int i = 0; i < caracteresAnagrama.length(); i++) {
            for (int j = i + 1; j <= caracteresAnagrama.length(); j++) {

                String subStringAtual = caracteresAnagrama.substring(i, j);

                // ordena em ordem alfabetica
                char[] chars = subStringAtual.toCharArray();
                Arrays.sort(chars);
                subStringAtual = String.valueOf(chars);
                /* if statement para verificar se a substring
                ordenada já foi encontrada anteriormente.*/
                if (map.containsKey(subStringAtual)) {
                    // verifica quantas vezes a substring foi vista anteriormente e incrementa o contTotal.
                    int value = map.getOrDefault(subStringAtual, 0);
                    contTotal += value;
                    map.merge(subStringAtual, 1, Integer::sum);
                } else {
                    /* caso não tenha sido vista anteriormente insere e atribui
                    como 1(a partir de agora já possui ocorrencias).*/
                    map.put(subStringAtual, 1);
                }
            }
        }
        return contTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Questao3 q3 = new Questao3();
        System.out.println("Informe o anagrama que deseja verificar: ");
        String anagrama = sc.nextLine();
        System.out.println(q3.vefificaAnagrama(anagrama));

    }
}