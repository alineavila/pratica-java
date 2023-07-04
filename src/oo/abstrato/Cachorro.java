package oo.abstrato;

public class Cachorro extends Mamifero{

    @Override
    public String mamar() {
        return "usando leite";
    }

//    @Override
//    public String mover() {
//        return "usando as patas";
//    } // ESSE MÉTODO É FINAL EM MAMIFERO
}
