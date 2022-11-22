package br.edu.ufersa.portcon.model.entity;

public class Empregado {
	private MoradorPrincipal mp;
	private String rg;
	private String nome;
	private String cargo;
	private String turno;
	
	public String getCpf_mp() {
		return mp.getCpf();
	}
	public void setCpf_mp(String cpf_mp) {
		if(cpf_mp != null && !(cpf_mp.isEmpty()) && !(cpf_mp.isBlank()))
			this.mp.setCpf(cpf_mp);
		else
			this.mp.setCpf("000.000.000-00");
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
			this.nome = "Fulaninho(a)";
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		if(cargo != null && !(cargo.isEmpty()) && !(cargo.isBlank()))
			this.cargo = cargo;
		else
			this.cargo = "Arrumadeiro(a)";
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		if(turno != null && !(turno.isEmpty()) && !(turno.isBlank()))
			this.turno = turno;
		else
			this.turno = "Integral";
	}
}
