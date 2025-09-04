package Arvore;

public class Arvore {
    private No raiz;

    public Arvore() {
        this.raiz = null;
    }

    public int alturaArvore() {
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

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }
}
