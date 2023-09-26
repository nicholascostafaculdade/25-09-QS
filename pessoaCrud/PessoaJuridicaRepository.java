package pessoaCrud;

import java.util.ArrayList;

public class PessoaJuridicaRepository implements IPessoaJuridicaRepository {
	private ArrayList<PessoaJuridica> pessoas;

	@Override
	public ArrayList<PessoaJuridica> getPessoas() {
		return this.pessoas;
	}

	@Override
	public PessoaJuridica getPessoa(int cnpj) {
		PessoaJuridica foundPessoa = null;

		for (int i = 0; i < this.pessoas.size(); i++) {
			if (this.pessoas.get(i).getCnpj() == cnpj) {
				foundPessoa = this.pessoas.get(i);
			}
		}

		return foundPessoa;
	}

	@Override
	public PessoaJuridica updatePessoa(int cnpj, String nome) {

		PessoaJuridica foundPessoa = null;

		for (int i = 0; i < this.pessoas.size(); i++) {
			if (this.pessoas.get(i).getCnpj() == cnpj) {
				foundPessoa = this.pessoas.get(i);
				foundPessoa.setNome(nome);
				this.pessoas.set(i, foundPessoa);
			}
		}

		return foundPessoa;
	}

	@Override
	public Boolean deletePessoa(int cnpj) {
		Boolean ok = false;

		for (int i = 0; i < this.pessoas.size(); i++) {
			if (this.pessoas.get(i).getCnpj() == cnpj) {
				this.pessoas.remove(i);
				ok = true;
			}
		}

		return ok;
	}
}
