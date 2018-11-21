
public class Conta {
	int numeroDaConta;
	int numeroDaAgencia;
	double saldoDaConta;
	Cliente nomeDoTitular;
	
	public void deposita(double valor) {
		this.saldoDaConta += valor;
	}
	
	public Boolean saca(double valor) {
		if(this.saldoDaConta >= valor) {
			this.saldoDaConta -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public Boolean transfere(double valor, Conta destino) {
		if(this.saldoDaConta >= valor) {
			this.saldoDaConta -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
}
