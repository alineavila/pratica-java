package oo.composicao.desafio;

public class DesafioTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Garrafa", 348.51);
        Produto p2 = new Produto("Copo", 43.65);
        Produto p3 = new Produto("Jarra", 51.21);
        Produto p4 = new Produto("Panela", 48.51);

        Item i1 = new Item(p1, 3);
        Item i2 = new Item(p2, 1);
        Item i3 = new Item(p3, 1);
        Item i4 = new Item(p4, 1);

        Compra compra1 = new Compra();
        compra1.adicionarItem(i1);
        compra1.adicionarItem(i2);

        Compra compra2 = new Compra();
        compra2.adicionarItem(i3);
        compra2.adicionarItem(i4);

        Cliente cliente1 = new Cliente("Aline");
        cliente1.adicionarCompra(compra1);
        cliente1.adicionarCompra(compra2);

        System.out.println(cliente1.obterValorTotal());








    }
}
