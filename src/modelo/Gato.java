package modelo;
//As váriáveis estão na ordem de inserção no banco de dados
public class Gato {
	private String nome;
	private Float peso;
	private String sexo;
	private Integer idade;
	private String fasevida;
	private String raca;
	private String antrabica;//ante rábica
	private String castrado;
	private String dono;//nome do dono
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Float getPeso() {
		return peso;
	}
	public void setPeso(Float peso) {
		this.peso = peso;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getFasevida() {
		return fasevida;
	}
	public void setFasevida(String fasevida) {
		this.fasevida = fasevida;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getAntrabica() {
		return antrabica;
	}
	public void setAntrabica(String antrabica) {
		this.antrabica = antrabica;
	}
	public String getCastrado() {
		return castrado;
	}
	public void setCastrado(String castrado) {
		this.castrado = castrado;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	

}

