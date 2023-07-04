package oo.composicao.heranca.desafio;

public class Celta extends Carro implements Esportivo, Luxo {



    public Celta(int velocidade_maxima){
        super(velocidade_maxima);
        setDelta(15);
    }

    Celta(){
        super(150);
    }
//    void acelerar() {
//        super.acelerar();
//        super.acelerar();
//        super.acelerar();
//
//    }


    @Override
    public void ligarTurbo() {
        setDelta(35);
    }

    @Override
    public void desligarTurbo() {
        setDelta(15);
    }

    @Override
    public void ligarAr() {

    }

    @Override
    public void desligarAr() {

    }
}
