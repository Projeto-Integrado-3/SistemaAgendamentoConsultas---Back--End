package br.com.clinica.model1;

public class Paciente {
	 int idPaciente;
     String nome;
     String cpf;
     String dataNascimento;
     String sexo;
     String endereco;
     int numero;
     String bairro;
     String cidade;
     String uf;
     String telefone;
     String email;
     
     public Paciente(int idPaciente, String nome, String cpf, String dataNascimento, String sexo, String endereco, int numero, String bairro, String cidade, String uf, String telefone, String email) {
         this.idPaciente = idPaciente;
         this.nome = nome;
         this.cpf = cpf;
         this.dataNascimento = dataNascimento;
         this.sexo = sexo;
         this.endereco = endereco;
         this.numero = numero;
         this.bairro = bairro;
         this.cidade = cidade;
         this.uf = uf;
         this.telefone = telefone;
         this.email = email;
     }
}
