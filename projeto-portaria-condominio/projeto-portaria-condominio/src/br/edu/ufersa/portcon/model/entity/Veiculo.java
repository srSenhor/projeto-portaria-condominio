package br.edu.ufersa.portcon.model.entity;

public class Veiculo {
	private MoradorPrincipal mp;
	private String placa;
	private String modelo;
	private String cor;
	private String marca;
	
	public String getCpf_mp() {
		return mp.getCpf();
	}
	public void setCpf_mp(String cpf_mp) {
		if(cpf_mp != null && !(cpf_mp.isEmpty()) && !(cpf_mp.isBlank()))
			this.mp.setCpf(cpf_mp);
		else
			this.mp.setCpf("000.000.000-00");
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		if(placa != null && !(placa.isEmpty()) && !(placa.isBlank()))
			this.placa = placa;
		else
			this.placa = "AAAAAAA";
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if(modelo != null && !(modelo.isEmpty()) && !(modelo.isBlank()))
			this.modelo = modelo;
		else
			this.modelo = "Generico";
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		if(cor != null && !(cor.isEmpty()) && !(cor.isBlank()))
			this.cor = cor;
		else
			this.cor = "Sem cor";
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		if(marca != null && !(marca.isEmpty()) && !(marca.isBlank()))
			this.marca = marca;
		else
			this.marca = "Generica";
	}
	
}
