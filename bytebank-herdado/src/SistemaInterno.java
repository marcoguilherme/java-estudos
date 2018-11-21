
public class SistemaInterno {
	private int senha = 2222;
	
	public void autentica(Autenticavel Au) {
		boolean autenticado = Au.autentica(this.senha);
		if(autenticado) {
			System.out.println("Autenticado com sucesso");
		}else {
			System.out.println("Senha invalida");
		}
	}
}
