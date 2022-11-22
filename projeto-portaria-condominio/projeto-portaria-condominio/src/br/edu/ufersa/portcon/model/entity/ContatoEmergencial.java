package br.edu.ufersa.portcon.model.entity;

public class ContatoEmergencial {
	private MoradorPrincipal mp;
	private String idContato;
	private String parentesco;
	private String telefone;
	private String nome;
	
	public String getCpf_mp() {
		return mp.getCpf();
	}
	public void setCpf_mp(String cpf_mp) {
		if(cpf_mp != null && !(cpf_mp.isEmpty()) && !(cpf_mp.isBlank()))
			this.mp.setCpf(cpf_mp);
		else
			this.mp.setCpf("000.000.000-00");
	}
	public String getIdContato() {
		return idContato;
	}
	public void setIdContato(String idContato) {
		if(idContato != null && !(idContato.isEmpty()) && !(idContato.isBlank()))
			this.idContato = idContato;
		else
			this.idContato = "DSFSD";
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		if(telefone != null && !(telefone.isEmpty()) && !(telefone.isBlank()))
			this.telefone = telefone;
		else
			this.telefone = "+00 (00) 0000-0000";
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
	
}
