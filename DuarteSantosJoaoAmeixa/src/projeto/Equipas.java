package projeto;
import java.util.ArrayList;
import java.util.List;

public class Equipas extends Clubes {
    // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private int codIdentifacador;
	private String nome;
	private String escalao;
	private List<Jogadores> jogadores;
	private List<Treinadores> treinadores;

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================


	public int getCodIndentifacador() {
		return codIdentifacador;
	}
	public void setCodIndentifacador(int codIndentifacador) {
		this.codIdentifacador = codIndentifacador;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEscalao() {
		return escalao;
	}
	public void setEscalao(String escalao) {
		this.escalao = escalao;
	}
   public List<Jogadores> getJogadores() {
		return jogadores;
	}
	public void setJogadores(List<Jogadores> jogadores) {
		this.jogadores = jogadores;
	}
	public List<Treinadores> getTreinadores() {
		return treinadores;
	}
	public void setTreinadores(List<Treinadores> treinadores) {
		this.treinadores = treinadores;
	}
	
    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT


	public Equipas() {
	   
	}

    // CONSTRUTOR COM PARÂMETROS

	public Equipas(int codIndentifacador, String nome, String escalao) {
		super();
		this.codIdentifacador = codIndentifacador;
		this.nome = nome;
		this.escalao = escalao;
		this.jogadores = new ArrayList<Jogadores>();
		this.treinadores = new ArrayList<Treinadores>();
	}

    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public void addJogadores(Jogadores jogadores) {
		this.jogadores.add(jogadores);
	}
	
	public void removeJOgadores(Jogadores jogadores) {
		this.jogadores.remove(jogadores);
	}
	
	public void addTreinadores(Treinadores treinadores) {
		this.treinadores.add(treinadores);
	}
	
	public void removeTreinadores(Treinadores treinadores) {
		this.treinadores.remove(treinadores);
	}


    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

	@Override
	public String toString() {
		return "Equipas [codIndentifacador=" + codIdentifacador + ", nome=" + nome + ", escalao=" + escalao
				+ ", jogadores=" + jogadores + ", treinadores=" + treinadores + "]";
	}

    // ----> equals()
}
