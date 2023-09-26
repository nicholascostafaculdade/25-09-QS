package pessoaCrud;

import java.util.ArrayList;

public interface IPessoaFisicaRepository {
	ArrayList<PessoaFisica> getPessoas();
	PessoaFisica getPessoa(int cpf);
	PessoaFisica updatePessoa(int cpf, String nome);
	Boolean deletePessoa(int cpf);
}
