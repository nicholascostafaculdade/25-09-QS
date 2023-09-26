package pessoaCrud;

public class PessoaJuridica extends Pessoa {
	private int cnpj;

	public PessoaJuridica(String nome) {
		super(nome);
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
