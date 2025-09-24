/*
 Atividade 1 - Estrutura de Dados (Pilha)

 Objetivo:
 Implementar uma pilha em Java para inverter a ordem das letras
 de cada palavra de uma string, preservando a ordem das palavras.

 Exemplo 1:
 Entrada:  ESTE EXERCICIO E MUITO FACIL
 Saída:    ETSE OICICREXE E OTIUM LICAF

 Exemplo 2:
 Entrada:  UM CIENTISTA DA COMPUTACAO E UM TECNOLOGO EM SISTEMAS PARA INTERNET DEVEM RESOLVER OS PROBLEMAS LOGICAMENTE
 Saída:    MU ATSITNEIC AD OACATUPMOC E MU OGOLONCET ME SAMETSIS ARAP TENRETNI MEVED REVLOSER SO SAMELBORP ETNEMACIGOL

*/

import java.util.Stack;

public class atividade01 {

    // Método que inverte cada palavra usando pilha
    public static String inverterPalavras(String frase) {
        StringBuilder resultado = new StringBuilder();
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            // Quando encontra espaço, esvazia a pilha (final da palavra)
            if (c == ' ') {
                while (!pilha.isEmpty()) {
                    resultado.append(pilha.pop());
                }
                resultado.append(" "); // mantém o espaço
            } else {
                pilha.push(c);
            }
        }

        // Esvaziar última palavra da frase
        while (!pilha.isEmpty()) {
            resultado.append(pilha.pop());
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        // Teste com exemplo 1
        String exemplo1 = "ESTE EXERCICIO E MUITO FACIL";
        System.out.println("Original:  " + exemplo1);
        System.out.println("Invertido: " + inverterPalavras(exemplo1));

        // Teste com exemplo 2
        String exemplo2 = "UM CIENTISTA DA COMPUTACAO E UM TECNOLOGO EM SISTEMAS PARA INTERNET DEVEM RESOLVER OS PROBLEMAS LOGICAMENTE";
        System.out.println("\nOriginal:  " + exemplo2);
        System.out.println("Invertido: " + inverterPalavras(exemplo2));
    }
}

