package com.academiacapgemini.desafios;

import java.util.Scanner;

/**
 * Classe utilizada para validar regras de senha
 *
 * @author Yuri Santana Carvalho
 */
public class Questao2 {
    /**
     * Método utilizado para verificar se todas as regras de senhas
     * estão válidas. O método recebe um campo de senha
     * e retorna -1 caso seja uma senha válida e 0 caso seja inválida.
     *
     * @param campoSenha campo de senha a ser validado.
     * @return valor inteiro contendo o número -1 para válido e 0 para inválido
     * e os demais casos significa a falta de caracteres na senha.
     */
    public int validaSenha(String campoSenha) {

        //variavel que contem todos os casos permitidos
        String caracteresEspeciais = "!@#$%^&*()-+";
        // variavel do tipo char para iterar no valor de entrada do usuario
        char caractereAtual;
        //Quantidade de numeros presente na entrada
        int numerosPresentes = 0;
        // Quantidade de letras maiusculas presente na entrada
        int maiusculasPresentes = 0;
        // Quantidade de letras minusculas presente na entrada
        int minusculasPresentes = 0;
        // Quantidade de caracteres especiais presente na entrada
        int caracteresEspeciaisPresentes = 0;
        // Quantidade de digitos que falta na entrada
        int contFaltaDigitos = 0;

        //verifica se a entrada esta vazia
        if (campoSenha.length() == 0)
            return 6;

        /* for loop para percorrer a entrada e detectar
         o numero de ocorrencias de cada regra */
        for (int i = 0; i < campoSenha.length(); i++) {
            caractereAtual = campoSenha.charAt(i);
            if (campoSenha.length() < 6) {
                contFaltaDigitos = 6 - campoSenha.length();
            } else if (Character.isDigit(caractereAtual)) {
                numerosPresentes = numerosPresentes + 1;
            } else if (Character.isUpperCase(caractereAtual)) {
                maiusculasPresentes = maiusculasPresentes + 1;
            } else if (Character.isLowerCase(caractereAtual)) {
                minusculasPresentes = minusculasPresentes + 1;
            } else if (caracteresEspeciais.contains(String.valueOf(caractereAtual))) {
                caracteresEspeciaisPresentes = caracteresEspeciaisPresentes + 1;
            }
        }
        /* if statement para verificar todas as
        ocorrencias que aconteceram na entrada.*/
        if ((numerosPresentes >= 1) &
                (maiusculasPresentes >= 1) &
                (minusculasPresentes >= 1) &
                (caracteresEspeciaisPresentes >= 1) &
                (campoSenha.length() >= 6)) {
            return -1; // -1 informa que a senha foi validada e 0 é um valor nao valido.
        }
        return contFaltaDigitos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Questao2 q2 = new Questao2();
        System.out.println("informe o seu nome: ");
        String nome = sc.nextLine();

        String senha;
        do {
            System.out.println(nome + ", informe a senha que " +
                    "voce deseja baseado " +
                    "nos criterios da rede social: ");
            senha = sc.nextLine();
            System.out.println(q2.validaSenha(senha)); //Ya3&ab
        }
        while (q2.validaSenha(senha) != -1);
        System.out.println("Cadastro finalizado com Sucesso.");
    }
}
