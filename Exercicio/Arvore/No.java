package Arvore;

public class No {
    int chave;
    public No esq, dir;
    int nivel;

    public No() {
        this.chave = 0;
        this.nivel = 0;
        this.esq = null;
        this.dir = null;
    }

    public No(int chave, int nivel) {
        this.chave = chave;
        this.nivel = nivel;
        this.esq = null;
        this.dir = null;
    }

    public No getEsq() { return this.esq; }
    public void setLeft(No node) { this.esq = node;}
    public No getDir() { return this.dir; }
    public void setRight(No node) { this.dir = node;}
    public int getChave() { return this.chave; }
}
