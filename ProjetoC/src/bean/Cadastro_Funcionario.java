package bean;

public class Cadastro_Funcionario {
	private String registro;
	private String nome;
	private String tell;
	private String email;
	private String rg;
	private String cpf;
	private String data_nasc;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String comissao;
	
	public Cadastro_Funcionario(String registro,String nome,String tell,String email,String rg,String cpf,String data_nasc,
			String rua,String bairro,String cidade,String estado,String comissao) {
		this.registro = registro;
		this.nome = nome;
		this.tell = tell;
		this.email=email;
		this.rg = rg;
		this.cpf = cpf;
		this.data_nasc = data_nasc;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.comissao = comissao;
	
	
	

	}
	
	
	
	
	
	






	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTell() {
		return tell;
	}
	public void setTell(String tell) {
		this.tell = tell;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(String data_nasc) {
		this.data_nasc = data_nasc;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getComissao() {
		return comissao;
	}
	public void setComissao(String comissao) {
		this.comissao = comissao;
	}
	

	public Cadastro_Funcionario() {
		// TODO Auto-generated constructor stub
	}

}
