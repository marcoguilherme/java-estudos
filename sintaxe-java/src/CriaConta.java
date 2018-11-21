
public class CriaConta {
	public static void main(String[] args) {
		
		Cliente marco = new Cliente();
		
		marco.nome = "Marco Guilherme";
		marco.cpf = "222.222.222-22";
		marco.profissao = "Desenvolvedor";
		
		Conta contaDoMarco = new Conta();
		
		contaDoMarco.nomeDoTitular = marco;
		contaDoMarco.saldoDaConta = 200.00;
		contaDoMarco.numeroDaConta = 2222;
		contaDoMarco.numeroDaAgencia = 1212;
		
		System.out.println(contaDoMarco.nomeDoTitular.nome);
		
		Conta contaDoGuilherme = new Conta();
		contaDoGuilherme.saldoDaConta = 0.00;
		contaDoGuilherme.numeroDaConta = 2222;
		contaDoGuilherme.numeroDaAgencia = 1212;
		
		if(contaDoMarco.transfere(300.00, contaDoGuilherme)){
			System.out.println("Transferencia feita com sucesso!");
			System.out.println("Saldo Marco: " + contaDoMarco.saldoDaConta);
			System.out.println("Saldo Guilherme " + contaDoGuilherme.saldoDaConta);
		}else{
			System.out.println("Saldo insuficiente");
		};
		
	}
}
