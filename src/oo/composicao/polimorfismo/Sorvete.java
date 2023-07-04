package oo.composicao.polimorfismo;

public class Sorvete {
    private double peso;

    public Sorvete(double peso) {
        this.setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(this.peso >= 0) {
            this.peso = peso;
        }
    }
}
