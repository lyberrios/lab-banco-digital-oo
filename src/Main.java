public class Main {
    public static void main(String[] args){
        Cliente nome = new Cliente();
        nome.setNome("Nome de usuario");

        Conta cc = new ContaCorrente(nome);
        Conta poupanca = new ContaPoupanca(nome);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
