package modelo;
//As variáveis estão na ordem que o banco de dados recebe
public class Dono {
	private String nome;
	private Integer cpf;
	private String endereco;
	private Integer fone;
	private String servico;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Integer getFone() {
		return fone;
	}
	public void setFone(Integer fone) {
		this.fone = fone;
	}
	public String getServico() {
		return servico;
	}
	public void setServico(String servico) {
		this.servico = servico;
	}
	
}

