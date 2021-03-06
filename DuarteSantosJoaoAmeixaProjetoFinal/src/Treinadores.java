import java.util.Date;

/**
 * <b><i>Treinadores</i></b></br></br>
 * 
 * A classe <strong>Treinadores</strong> oferece um conjunto de atributos
 * referente a cada atributo.</br></br>
 * 
 * 
 */

public class Treinadores extends Equipas{
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

    // CONSTRUTOR COM PAR�METROS

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

	public void informacaoTreinador() {
		System.out.println("--------Treinador--------");
		System.out.println(this.numeroCartaoCidadao);
		System.out.println(this.nome);
		System.out.println(this.dataNascimento);
		System.out.println(contacto);
		System.out.println(this.email);
		System.out.println("-------------------------");
	}
	
    // =======================================================
    // ============== M�TODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

	@Override
	public String toString() {
		return "Treinadores [numeroCartaoCidadao=" + numeroCartaoCidadao + ", nome=" + nome + ", dataNascimento="
				+ dataNascimento + ", contacto=" + contacto + ", email=" + email + "]";
	}

    // ----> equals()
}
