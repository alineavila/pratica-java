package oo.composicao;

public class Porta {
    boolean aberta;
    int idPorta;

    Porta(int idPorta){
        this.idPorta = idPorta;
    }

    void abrirPorta () {
        this.aberta = true;
    }
    void fecharPorta() {
        this.aberta = false;
    }

}
