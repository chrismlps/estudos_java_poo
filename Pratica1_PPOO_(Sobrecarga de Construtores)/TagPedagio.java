public class TagPedagio {
    private String placa;
    private Double saldo;

    //Construtor/Tipo1(apenas placa)
    public TagPedagio(String placa) {
        this.placa = placa;
        this.saldo = 10.0;
    }
    //Construtor/Tipo2(placa e saldo)
    public TagPedagio(String placa, Double saldo) {
        this.placa = placa;
        this.saldo = saldo + 10.0;
    }
    //Metodo atualizarSaldo/
    public void atualizarSaldo(Double valor) {
        this.saldo += valor;
    }

    //Metodo passarNoPedagio/
    public void passarNoPedagio(Double valorPedagio) {
        if (this.saldo >= valorPedagio) {
            this.saldo -= valorPedagio;
            System.out.println("Passagem liberada para a placa " + this.placa + ". Novo saldo: " + this.saldo);
        } else {
            System.out.println("Passagem bloqueada para a placa " + this.placa + ". Saldo insuficiente!");
    }
}
}


