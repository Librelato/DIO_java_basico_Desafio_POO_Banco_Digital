public class App {
    public static void main(String[] args) throws Exception {
        Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);

        Cliente gefferson = new Cliente();
		gefferson.setNome("Gefferson");

		Conta poupanca = new ContaPoupanca(venilton);

        try {
            //cc.sacar(1000);
            cc.depositar(100);
            cc.transferir(200, poupanca);
            
            cc.imprimirExtrato();
            poupanca.imprimirExtrato();
        } catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
