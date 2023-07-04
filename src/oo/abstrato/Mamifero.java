package oo.abstrato;

public abstract class Mamifero extends Animal {


    public abstract String mamar();

    @Override
    public final String mover() { // não pode ser sobrescrito nas subclasses
        return "saindo do lugar";
    }

}
