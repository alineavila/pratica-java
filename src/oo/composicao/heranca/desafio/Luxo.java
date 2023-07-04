package oo.composicao.heranca.desafio;

public interface Luxo {
    void ligarAr();

    default void desligarAr() {
        return;
    }

    /*
    * É possível dar uma implementação padrão para um método em uma interface
    */

    default int velocidadeDoAr() {
        return 1;
    }

}
