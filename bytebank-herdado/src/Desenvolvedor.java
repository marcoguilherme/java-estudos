
public class Desenvolvedor extends Funcionario implements Autenticavel {
	
	private Autenticador autenticador;
	
	public Desenvolvedor(){
		autenticador = new Autenticador();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public double getBonificacao() {
		return super.salario * 1.2;
	}

}
