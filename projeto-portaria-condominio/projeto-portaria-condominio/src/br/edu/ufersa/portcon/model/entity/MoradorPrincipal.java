package br.edu.ufersa.portcon.model.entity;

import java.time.LocalDate;

public class MoradorPrincipal {
	private String cpf;
	private String bloco;
	private int numero;
	private String rg;
	private String nome;
	private String telcomercial;
	private String telresidencial;
	private String telcelular;
	private String email;
	private LocalDate dataNasc;
	private boolean grupoWhatsapp;
	private boolean locatario;
	
	public MoradorPrincipal(String cpf, String bloco, int numero) {
		setCpf(cpf);
		setBloco(bloco);
		setNumero(numero);
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if(cpf != null && !(cpf.isEmpty()) && !(cpf.isBlank()))
			this.cpf = cpf;
		else
			this.cpf = "000.000.000-00";
	}
	public String getBloco() {
		return bloco;
	}
	public void setBloco(String bloco) {
		if(bloco != null && !(bloco.isEmpty()) && !(bloco.isBlank()))
			this.bloco = bloco;
		else
			this.bloco = "00";
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if(numero >= 0)
			this.numero = numero;
		else
			this.numero = 0;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		if(rg != null && !(rg.isEmpty()) && !(rg.isBlank()))
			this.rg = rg;
		else
			this.rg = "00.000.000-0";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome != null && !(nome.isEmpty()) && !(nome.isBlank()))
			this.nome = nome;
		else
			this.nome = "Fulaninho";
	}
	public String getTelcomercial() {
		return telcomercial;
	}
	public void setTelcomercial(String telcomercial) {
		if(telcomercial != null && !(telcomercial.isEmpty()) && !(telcomercial.isBlank()))
			this.telcomercial = telcomercial;
		else
			this.telcomercial = "+00 (00) 0000-0000";	
	}
	public String getTelresidencial() {
		return telresidencial;
	}
	public void setTelresidencial(String telresidencial) {
		if(telresidencial != null && !(telresidencial.isEmpty()) && !(telresidencial.isBlank()))
			this.telresidencial = telresidencial;
		else
			this.telresidencial = "+00 (00) 0000-0000";
	}
	public String getTelcelular() {
		return telcelular;
	}
	public void setTelcelular(String telcelular) {
		if(telcelular != null && !(telcelular.isEmpty()) && !(telcelular.isBlank()))
			this.telcelular = telcelular;
		else
			this.telcelular = "+00 (00) 0000-0000";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email != null && !(email.isEmpty()) && !(email.isBlank()))
			this.email = email;
		else
			this.email = "...@endmail.com";
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
	public boolean isGrupoWhatsapp() {
		return grupoWhatsapp;
	}
	public void setGrupoWhatsapp(boolean grupoWhatsapp) {
		this.grupoWhatsapp = grupoWhatsapp;
	}
	public boolean isLocatario() {
		return locatario;
	}
	public void setLocatario(boolean locatario) {
		this.locatario = locatario;
	}
}
