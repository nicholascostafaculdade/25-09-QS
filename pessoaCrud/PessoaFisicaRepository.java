package pessoaCrud;

import java.util.ArrayList;

public class PessoaFisicaRepository implements IPessoaFisicaRepository {
	private ArrayList<PessoaFisica> pessoas;

	@Override
	public ArrayList<PessoaFisica> getPessoas() {
		return this.pessoas;
	}

	@Override
	public PessoaFisica getPessoa(int cpf) {
		PessoaFisica foundPessoa = null;

		for (int i = 0; i < this.pessoas.size(); i++) {
			if (this.pessoas.get(i).getCpf() == cpf) {
				foundPessoa = this.pessoas.get(i);
			}
		}

		return foundPessoa;
	}

	@Override
	public PessoaFisica updatePessoa(int cpf, String nome) {

		PessoaFisica foundPessoa = null;

		for (int i = 0; i < this.pessoas.size(); i++) {
			if (this.pessoas.get(i).getCpf() == cpf) {
				foundPessoa = this.pessoas.get(i);
				foundPessoa.setNome(nome);
				this.pessoas.set(i, foundPessoa);
			}
		}

		return foundPessoa;
	}

	@Override
	public Boolean deletePessoa(int cpf) {
		Boolean ok = false;

		for (int i = 0; i < this.pessoas.size(); i++) {
			if (this.pessoas.get(i).getCpf() == cpf) {
				this.pessoas.remove(i);
				ok = true;
			}
		}

		return ok;
	}
}
