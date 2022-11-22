package br.edu.ufersa.portcon.model.entity;

import java.time.LocalDate;

public class Morador {
	private MoradorPrincipal mp;
	private int idMorador;
	private static int id_morador;
	private String nome;
	private String parentesco;
	private LocalDate dataNasc;
	
	public Morador(){
		id_morador++;
		setIdMorador();
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
	public int getIdMorador() {
		return idMorador;
	}
	private void setIdMorador() {
		this.idMorador = id_morador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome != null && !(nome.isEmpty()) && !(nome.isBlank()))
			this.nome = nome;
		else
			this.nome = "Fulaninho(a)";
	}
	public String getParentesco() {
		return parentesco;
	}
	public void setParentesco(String parentesco) {
		if(parentesco != null && !(parentesco.isEmpty()) && !(parentesco.isBlank()))
			this.parentesco = parentesco;
		else
			this.parentesco = "Amigo";
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate dataNasc) {
		if(dataNasc != null)
			this.dataNasc = dataNasc;
		else 
			this.dataNasc = LocalDate.of(1, 1, 1900);
	}
	
	
}
