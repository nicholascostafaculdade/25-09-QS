package pessoaCrud;

import java.util.ArrayList;

public interface IPessoaJuridicaRepository {
	ArrayList<PessoaJuridica> getPessoas();
	PessoaJuridica getPessoa(int cnpj);
	PessoaJuridica updatePessoa(int cnpj, String nome);
	Boolean deletePessoa(int cnpj);
}