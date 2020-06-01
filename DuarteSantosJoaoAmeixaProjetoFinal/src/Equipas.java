import java.util.ArrayList;
import java.util.List;

/**
 * <b><i>Equipas</i></b></br></br>
 * 
 * A classe <strong>Equipas</strong> oferece um conjunto de atributos
 * referente a cada atributo.</br></br>
 * 
 * 
 */

public class Equipas extends Clubes {
	
    // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private int codIdentifacador;
	private String nome;
	private String escalao;
	private List<Jogadores> jogadores = new ArrayList<Jogadores>();
	private List<Treinadores> treinadores = new ArrayList<Treinadores>();


    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public int getCodIdentifacador() {
		return codIdentifacador;
	}
	public void setCodIdentifacador(int codIdentifacador) {
		this.codIdentifacador = codIdentifacador;
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

	public Equipas(int codIdentifacador, String nome, String escalao) {
		super();
		this.codIdentifacador = codIdentifacador;
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
	
	public void removeJogadores(int codigo) {
        int jogadorRemover = Jogadores(codigo);
        if (jogadorRemover == -1) {

        } else

        this.jogadores.remove(jogadorRemover);
    }

    public void editJogadores(int codigo, Jogadores jogadores) {
        int jogadorRemover = Jogadores(codigo);
        if (jogadorRemover == -1) {

        } else

        this.jogadores.set(jogadorRemover, jogadores);
    }

    public int Jogadores(int codigo) {
        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getNumeroCartaoCidadao() == codigo)
                return i;
        }
        return -1;
    }
	
	public void addTreinadores(Treinadores treinadores) {
		this.treinadores.add(treinadores);
	}
	
	public void removeTreinadores(int codigo) {
        int treinadorRemover = Treinadores(codigo);
        if (treinadorRemover == -1) {

        } else

        this.jogadores.remove(treinadorRemover);
    }

    public void editTreinadores(int codigo, Treinadores treinadores) {
        int treinadorRemover = Treinadores(codigo);
        if (treinadorRemover == -1) {

        } else

        this.treinadores.set(treinadorRemover, treinadores);
    }

    public int Treinadores(int codigo) {
        for (int i = 0; i < treinadores.size(); i++) {
            if (treinadores.get(i).getNumeroCartaoCidadao() == codigo)
                return i;
        }
        return -1;
    }
	
	@Override
	public void numeroJogadores(Jogadores jogadores) {
		this.jogadores.size();
	}
	
	@Override
	public void numeroTreinadores(Treinadores treinadores) {
		this.treinadores.size();
	}
	
	public void ordenarJogadores(Jogadores jogadores) {
		
	}


    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

	@Override
	public String toString() {
		return "Equipas [codIdentifacador=" + codIdentifacador + ", nome=" + nome + ", escalao=" + escalao
				+ ", jogadores=" + jogadores + ", treinadores=" + treinadores + "]";
	}

    // ----> equals()
}
