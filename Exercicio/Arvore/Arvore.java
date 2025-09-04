package Arvore;

import java.util.LinkedList;
import java.util.Queue;

public class Arvore {
    private No raiz;

    public Arvore() {
        this.raiz = null;
    }

    public int alturaArvore() {
        if (raiz == null) {
            return -1;
        }
        return calcularAltura(raiz);
    }

    private int calcularAltura(No node) {
        if (node == null) {
            return 0;
        }

        int alturaEsq = calcularAltura(node.getEsq());
        int alturaDir = calcularAltura(node.getDir());

        return 1 + Math.max(alturaEsq, alturaDir);
    }

    public void niveisNos() {
        if (raiz == null) {
            System.out.println("A árvore está vazia.");
            return;
        }

        Queue<No> fila = new LinkedList<>();
        fila.add(raiz);

        while (!fila.isEmpty()) {
            No atual = fila.poll(); // remove o primeiro da fila

            System.out.println("Nível " + atual.nivel + " -> " + atual.chave);

            if (atual.esq != null) {
                fila.add(atual.esq);
            }
            if (atual.dir != null) {
                fila.add(atual.dir);
            }
        }
    }

    public void mostrarHierarquico() {
        mostrarHierarquicoRec(raiz, 0);
    }

    private void mostrarHierarquicoRec(No node, int nivel) {
        if (node == null) {
            return;
        }

        // Primeiro percorre a direita (vai "subindo" na impressão)
        mostrarHierarquicoRec(node.dir, nivel + 1);

        // Espaços para representar a hierarquia
        for (int i = 0; i < nivel; i++) {
            System.out.print("    "); // 4 espaços por nível
        }
        System.out.println(node.chave);

        // Depois percorre a esquerda
        mostrarHierarquicoRec(node.esq, nivel + 1);
    }


    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }
}
