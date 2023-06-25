package classes_e_metodos.desafio_modulo;

public class Pessoa {

    String nomePessoa;
    double pesoPessoa;

    Pessoa(String nomePessoa, double pesoPessoa) {
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;

    }


    void comer(Comida c) {
        this.pesoPessoa = this.pesoPessoa + c.pesoComida;
    }

    void imprimirPeso(){
        System.out.println("Elton pesa " +this.pesoPessoa+"kg");
    }

}
