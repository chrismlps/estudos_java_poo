public class App {
    //Metodo main/
    public static void main(String[] args) {
        //Tag com apenas a placa (tag1)
        TagPedagio tag1 = new TagPedagio("ABC1D23");

        //Passando no pedágio com a tag1
        tag1.passarNoPedagio(15.0);

        //Tag com placa e saldo (tag2)
        TagPedagio tag2 = new TagPedagio("EFG4H56", 20.0);

        //Adicionando saldo na tag2
        tag2.atualizarSaldo(15.0);

        //Passando no pedágio com a tag2
        tag2.passarNoPedagio(23.0);
    }
}
