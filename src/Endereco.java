
public class Endereco {


	
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade ;
	private String estado;
	private String cep;


	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getnumero() {
		return numero;
	}
	public void setnumero (String numero) {
		this.numero = numero;
	}


	public String getcomplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento= complemento;
	}


	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getcidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getestado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
