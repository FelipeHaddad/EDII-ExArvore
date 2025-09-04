package Arvore;

public class No {
    int chave;
    public No esq, dir;

    public No(int chave) {
        this.chave = chave;
        this.esq = null;
        this.dir = null;
    }

    public No getEsq() { return this.esq; }
    public No getDir() { return this.dir; }
    public int getChave() { return this.chave; }
}
