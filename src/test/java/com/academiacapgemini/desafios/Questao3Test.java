package com.academiacapgemini.desafios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de teste para verificar os anagramas e pares de substrings validos.
 */
class Questao3Test {
    /**
     * Teste válido para anagrama e seus pares de substrings com 3 pares
     */
    @Test
    void vefificaAnagramaEqualsValidoTresOcorrencias() {
        Questao3 q3 = new Questao3();
        assertEquals(3, q3.vefificaAnagrama("ifailuhkqq"));
    }

    /**
     * Teste válido com zero ocorrencias para anagrama e seus pares de substrings
     */
    @Test
    void vefificaAnagramaEqualsZeroOcorrencias() {
        Questao3 q3 = new Questao3();
        assertEquals(0, q3.vefificaAnagrama("av"));
    }

    /**
     * Teste válido para anagrama e seus pares de substrings com 2 pares
     */
    @Test
    void vefificaAnagramaEqualsValidoDuasOcorrencias() {
        Questao3 q3 = new Questao3();
        assertEquals(2, q3.vefificaAnagrama("aviao"));
    }
}