package com.academiacapgemini.desafios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe utilizada para testar o metodo controiEscada da Questao1.
 */
class Questao1Test {
    /**
     * Teste válido para verificar a quantidade de degraus préfixado como saída de 6
     */
    @Test
    void constroiEscadaEquals6() {
        Questao1 q1 = new Questao1();
        assertEquals("     *\n" +
                "    **\n" +
                "   ***\n" +
                "  ****\n" +
                " *****\n" +
                "******\n", q1.constroiEscada(6));
    }

    /**
     * Teste válido para verificar a quantidade de degraus préfixado como saída de 9
     */
    @Test
    void constroiEscadaEquals9() {
        Questao1 q1 = new Questao1();
        assertEquals("        *\n" +
                "       **\n" +
                "      ***\n" +
                "     ****\n" +
                "    *****\n" +
                "   ******\n" +
                "  *******\n" +
                " ********\n" +
                "*********\n", q1.constroiEscada(9));
    }

    /**
     * Teste válido para verificar a quantidade de degraus préfixado como saída de 13
     */
    @Test
    void constroiEscadaEquals13() {
        Questao1 q1 = new Questao1();
        assertEquals("            *\n" +
                "           **\n" +
                "          ***\n" +
                "         ****\n" +
                "        *****\n" +
                "       ******\n" +
                "      *******\n" +
                "     ********\n" +
                "    *********\n" +
                "   **********\n" +
                "  ***********\n" +
                " ************\n" +
                "*************\n", q1.constroiEscada(13));
    }
}