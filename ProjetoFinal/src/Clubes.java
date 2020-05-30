import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Clubes {
    // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private int codIdentificador;
	private String nome;
	private Date dataFundacao;
	private String corEquipamento;
	private int contacto;
	private String email;
	private String morada;
	private List<Equipas> equipasEscalao;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public int getCodIdentificador() {
		return codIdentificador;
	}
	public void setCodIdentificador(int codIdentificador) {
		this.codIdentificador = codIdentificador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	public String getCorEquipamento() {
		return corEquipamento;
	}
	public void setCorEquipamento(String corEquipamento) {
		this.corEquipamento = corEquipamento;
	}
	public int getContacto() {
		return contacto;
	}
	public void setContacto(int contacto) {
		this.contacto = contacto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}
	public List<Equipas> getEquipasEscalao() {
		return equipasEscalao;
	}
	public void setEquipasEscalao(List<Equipas> equipasEscalao) {
		this.equipasEscalao = equipasEscalao;
	}


    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================


    // CONSTRUTOR DEFAULT
	
	public Clubes() {
		
	}
   

    // CONSTRUTOR COM PARÂMETROS

	public Clubes(int codIdentificador, String nome, Date dataFundacao, String corEquipamento, int contacto,
			String email, String morada) {
		super();
		this.codIdentificador = codIdentificador;
		this.nome = nome;
		this.dataFundacao = dataFundacao;
		this.corEquipamento = corEquipamento;
		this.contacto = contacto;
		this.email = email;
		this.morada = morada;
		this.equipasEscalao = new ArrayList<Equipas>();
	}


    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public void addEquipa(Equipas equipasEscalao) {
		this.equipasEscalao.add(equipasEscalao);
	}
   
	public void removeEquipa(Equipas equipasEscalao) {
		this.equipasEscalao.remove(equipasEscalao);
	}

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

	@Override
	public String toString() {
		return "Clubes [codIdentificador=" + codIdentificador + ", nome=" + nome + ", dataFundacao=" + dataFundacao
				+ ", corEquipamento=" + corEquipamento + ", contacto=" + contacto + ", email=" + email + ", morada="
				+ morada + ", equipasEscalao=" + equipasEscalao + "]";
	}

    // ----> equals()
}
