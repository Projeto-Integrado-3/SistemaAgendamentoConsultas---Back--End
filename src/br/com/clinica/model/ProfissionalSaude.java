package br.com.clinica.model;

public class ProfissionalSaude {
	    int idProfSaude;
	    String nome;
	    String cpf;
	    String endereco;
	    int numero;
	    String bairro;
	    String cidade;
	    String uf;
	    String telefone;
	    String email;
	    String especialidade;
	    int registro;

	    public ProfissionalSaude(int idProfSaude, String nome, String cpf, String endereco, int numero, String bairro, String cidade, String uf, String telefone, String email, String especialidade, int registro) {
	        this.idProfSaude = idProfSaude;
	        this.nome = nome;
	        this.cpf = cpf;
	        this.endereco = endereco;
	        this.numero = numero;
	        this.bairro = bairro;
	        this.cidade = cidade;
	        this.uf = uf;
	        this.telefone = telefone;
	        this.email = email;
	        this.especialidade = especialidade;
	        this.registro = registro;
	    }


}

