import java.util.Date;

/**
 * <b><i>Jogadores</i></b></br></br>
 * 
 * A classe <strong>Jogadores</strong> oferece um conjunto de atributos
 * referente a cada atributo.</br></br>
 * 
 * 
 */

public class Jogadores extends Equipas{
    // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private int numeroCartaoCidadao;
	private String nome;
	private Date dataNascimento;
	private int contacto;
	private String email;
	private String posicao;
	private String pePreferido;

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
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public String getPePreferido() {
		return pePreferido;
	}
	public void setPePreferido(String pePreferido) {
		this.pePreferido = pePreferido;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT
	 
	public Jogadores() {
		   
	   }

	 
    // CONSTRUTOR COM PAR�METROS

	public Jogadores(int numeroCartaoCidadao, String nome, Date dataNascimento, int contacto, String email,
			String posicao, String pePreferido) {
		super();
		this.numeroCartaoCidadao = numeroCartaoCidadao;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.contacto = contacto;
		this.email = email;
		this.posicao = posicao;
		this.pePreferido = pePreferido;
	}


    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public void informacaoJogador() {
		System.out.println("--------Jogador--------");
		System.out.println(this.numeroCartaoCidadao);
		System.out.println(this.nome);
		System.out.println(this.dataNascimento);
		System.out.println(contacto);
		System.out.println(this.email);
		System.out.println(this.posicao);
		System.out.println(this.pePreferido);
		System.out.println("-----------------------");
	}
	
	@Override
	public void ordenarJogadores(Jogadores jogadores) {
		
	}


    // =======================================================
    // ============== M�TODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()
	
	@Override
	public String toString() {
		return "Jogadores [numeroCartaoCidadao=" + numeroCartaoCidadao + ", nome=" + nome + ", dataNascimento="
				+ dataNascimento + ", contacto=" + contacto + ", email=" + email + ", posicao=" + posicao
				+ ", pePreferido=" + pePreferido + "]";
	}


    // ----> equals()
}
