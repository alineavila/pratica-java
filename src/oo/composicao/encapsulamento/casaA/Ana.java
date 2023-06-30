package oo.composicao.encapsulamento.casaA;

public class Ana {

    private String segredo = "...";
    String facoDentroDeCasa = "..."; // nivel de visibilidade pacote ou default
    protected String formaDeFalar = "..."; // é visivel no mesmo pacote e tbm passa por herança
    public String todosSabem = "...";

}
