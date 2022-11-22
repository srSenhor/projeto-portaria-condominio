package br.edu.ufersa.portcon.model.entity;

import java.time.LocalDate;

public class InfoLocacao {
	private MoradorPrincipal mp;
	private String nome_empresa;
	private String nome_contato;
	private String telefone;
	private LocalDate dataMudanca;
	private LocalDate dataFimContrato;
	
	public String getCpf_mp() {
		return mp.getCpf();
	}
	public void setCpf_mp(String cpf_mp) {
		if(cpf_mp != null && !(cpf_mp.isEmpty()) && !(cpf_mp.isBlank()))
			this.mp.setCpf(cpf_mp);
		else
			this.mp.setCpf("000.000.000-00");
	}
	public String getNome_empresa() {
		return nome_empresa;
	}
	public void setNome_empresa(String nome_empresa) {
		if(nome_empresa != null && !(nome_empresa.isEmpty()) && !(nome_empresa.isBlank()))
			this.nome_empresa = nome_empresa;
		else
			this.nome_empresa = "Ficticio";
	}
	public String getNome_contato() {
		return nome_contato;
	}
	public void setNome_contato(String nome_contato) {
		if(nome_contato != null && !(nome_contato.isEmpty()) && !(nome_contato.isBlank()))
			this.nome_contato = nome_contato;
		else
			this.nome_contato = "Jetosbaldo";
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		if(telefone != null && !(telefone.isEmpty()) && !(telefone.isBlank()))
			this.telefone = telefone;
		else
			this.telefone = "+00 (00) 0000-0000";
	}
	public LocalDate getDataMudanca() {
		return dataMudanca;
	}
	public void setDataMudanca(LocalDate dataMudanca) {
		if(dataMudanca != null)
			this.dataMudanca = dataMudanca;
		else 
			this.dataMudanca = LocalDate.of(1, 1, 2000);
	}
	public LocalDate getDataFimContrato() {
		return dataFimContrato;
	}
	public void setDataFimContrato(LocalDate dataFimContrato) {
		if(dataFimContrato != null)
			this.dataFimContrato = dataFimContrato;
		else 
			this.dataFimContrato = LocalDate.of(1, 1, 2004);
	}
	
}
