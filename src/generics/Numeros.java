package generics;

public class Numeros<T extends Number>{ // assim eu limito meu generics a ser apenas do tipo numero

    T n1;

    Numeros(T n1) {
        this.n1 = n1;
    }
    int quadrado(){
       return (n1.intValue() * n1.intValue()); 
    }

    boolean absIgual(Numeros<?> obj) { // o ponto de interrogação faz com que eu possa receber qualquer parametro q nao seja do tipo T ja instanciado
        if (Math.abs(n1.doubleValue()) == Math.abs(obj.n1.doubleValue()))
            return true;
        return false;
    }

}
