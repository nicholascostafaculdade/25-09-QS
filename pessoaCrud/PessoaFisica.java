package pessoaCrud;

public class PessoaFisica extends Pessoa {
	private int cpf;

	public PessoaFisica(String nome) {
		super(nome);
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	
}
