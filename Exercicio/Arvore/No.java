package Arvore;

public class no {
    int chave;
    int nivel;
    no esq, dir;

    public no() {
        this.chave = 0;
        this.nivel = 0;
        this.esq = null;
        this.dir = null;
    }

    public no(int chave,int nivel,no esq,no dir) {
        this.chave = chave;
        this.nivel = nivel;
        this.esq = esq;
        this.dir = dir;
    }

    public no getEsq() {
        return this.esq;
    }

    public no getDir() {
        return this.dir;
    }

    public int getChave() {
        return this.chave;
    }

    public int getNivel() {
        return this.nivel;
    }
}
