import Arvore.*;

public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();

        No raiz = new No(10);
        raiz.esq = new No(5);
        raiz.dir = new No(20);
        raiz.dir.esq = new No(15);
        raiz.dir.dir = new No(30);

        arvore.setRaiz(raiz);

        System.out.println("Altura da árvore: " + arvore.alturaArvore());
    }
}
