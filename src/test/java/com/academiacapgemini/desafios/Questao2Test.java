package com.academiacapgemini.desafios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de teste para validar senha da Questao2
 */
class Questao2Test {
    /**
     * Teste válido para senha com todas as regras.
     */
    @Test
    void validaSenhaEqualsValida() {
        Questao2 q2 = new Questao2();
        assertEquals(-1, q2.validaSenha("Ya3&ab"));
    }

    /**
     * Teste inválido para senha com 5 caracteres.
     */
    @Test
    void validaSenhaEqualsInvalida5caracteres() {
        Questao2 q2 = new Questao2();
        assertEquals(1, q2.validaSenha("Ya3&a"));
    }

    /**
     * Teste inválido para senha vazia.
     */
    @Test
    void validaSenhaEqualsInvalidaVazia() {
        Questao2 q2 = new Questao2();
        assertEquals(6, q2.validaSenha(""));
    }
}