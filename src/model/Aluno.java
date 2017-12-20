package model;

public class Aluno {
	

	private String Matricula;
	private String Nome;
	private String Email;
	private int Idade;
	private String Sexo;
	private String Empresa;
	private String Cidade;
	

	public Aluno(String nome, String email, int idade, String cidade) {
		this.Nome = nome;
		this.Email = email;
		this.Idade = idade;
		this.Cidade = cidade;
	}
	
	
	

	public Aluno() {
		// TODO Auto-generated constructor stub
	}




	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public String getEmpresa() {
		return Empresa;
	}
	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}



	@Override
	public String toString() {
		return "Aluno [Matricula=" + Matricula + ", Nome=" + Nome + ", Email=" + Email + ", Idade=" + Idade + ", Sexo="
				+ Sexo + ", Empresa=" + Empresa + ", Cidade=" + Cidade + "]";
	}
	
	

	
}
