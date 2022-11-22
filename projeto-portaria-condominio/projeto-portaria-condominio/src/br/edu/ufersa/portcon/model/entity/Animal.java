package br.edu.ufersa.portcon.model.entity;

public class Animal {
	private MoradorPrincipal mp;
	private int idAnimal;
	private static int id_animal;
	private String tipo;
	private String raca;
	private String cor;
	
	public Animal() {
		id_animal++;
		setIdAnimal();
	}
	
	public String getCpf_mp() {
		return mp.getCpf();
	}
	public void setCpf_mp(String cpf_mp) {
		if(cpf_mp != null && !(cpf_mp.isEmpty()) && !(cpf_mp.isBlank()))
			this.mp.setCpf(cpf_mp);
		else
			this.mp.setCpf("000.000.000-00");
	}
public int getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal() {
		this.idAnimal = id_animal;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		if(tipo != null && !(tipo.isEmpty()) && !(tipo.isBlank()))
			this.tipo = tipo;
		else
			this.tipo = "Não tem ideia";
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		if(raca != null && !(raca.isEmpty()) && !(raca.isBlank()))
			this.raca = raca;
		else
			this.raca = "Desconhecida";
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		if(cor != null && !(cor.isEmpty()) && !(cor.isBlank()))
			this.cor = cor;
		else
			this.cor = "Marrom";
	}
	
}
