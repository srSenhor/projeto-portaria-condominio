package br.edu.ufersa.portcon.model.entity;

public class Apartamento {
	private MoradorPrincipal mp;
	private String situacao;
	
	public String getBloco() {
		return mp.getBloco();
	}
	public void setBloco(String bloco) {
		if(bloco != null && !(bloco.isEmpty()) && !(bloco.isBlank()))
			this.mp.setBloco(bloco);
		else
			this.mp.setBloco("00");
	}
	public int getNumero() {
		return mp.getNumero();
	}
	public void setNumero(int numero) {
		if(numero >= 0 )
			this.mp.setNumero(numero);
		else
			this.mp.setNumero(0);
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		if(situacao != null && !(situacao.isEmpty()) && !(situacao.isBlank()))
			this.situacao = situacao;
		else
			this.situacao = "Não locado";
	}
}
