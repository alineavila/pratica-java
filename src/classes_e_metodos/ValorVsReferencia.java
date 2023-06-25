package classes_e_metodos;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // atribuição por valor (tipo primitivo)

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 =  new Data(1,6,2022);
        Data d2 = d1; // atribuição por referência (Objeto)

        d1.dia = 31;
        d2.mes = 12;

        // as duas variaveis apontam para o mesmo endereço de memoria
        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        // passar o objeto também envia o endereço em memoria
        // o ideal é que não mexa no objeto que recebe como parâmetro
        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

    }

    static void voltarDataParaValorPadrao(Data d) {
        d.dia = 1;
        d.mes=1;
        d.ano = 1970;
    }
}
