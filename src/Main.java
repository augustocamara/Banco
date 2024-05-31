public class Main {
    public static void main(String[] args) {
        Cliente Augusto = new Cliente();
        Augusto.setNome("Augusto");

        Conta cc = new ContaConrrente(Augusto);
        Conta poupanca = new ContaPoupanca(Augusto);
        cc.depositar(100);
        cc.transferir(50, poupanca);
        cc.depositar(300);
        cc.transferir(50, poupanca);
        poupanca.transferir(50, cc);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
