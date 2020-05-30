package projeto;
import java.util.Date;

public class Treinadores extends Equipas {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================

	private int numeroCartaoCidadao;
	private String nome;
	private Date dataNascimento;
	private int contacto;
	private String email;

	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	public int getNumeroCartaoCidadao() {
		return numeroCartaoCidadao;
	}

	public void setNumeroCartaoCidadao(int numeroCartaoCidadao) {
		this.numeroCartaoCidadao = numeroCartaoCidadao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
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

	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================

	// CONSTRUTOR DEFAULT

	public Treinadores() {

	}

	// CONSTRUTOR COM PARÂMETROS

	public Treinadores(int numeroCartaoCidadao, String nome, Date dataNascimento, int contacto, String email) {
		super();
		this.numeroCartaoCidadao = numeroCartaoCidadao;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.contacto = contacto;
		this.email = email;
	}

	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================
	
	
	
	
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================

	// ----> toString()

	@Override
	public String toString() {
		return "Treinadores [numeroCartaoCidadao=" + numeroCartaoCidadao + ", nome=" + nome + ", dataNascimento="
				+ dataNascimento + ", contacto=" + contacto + ", email=" + email + "]";
	}

	// ----> equals()
}
