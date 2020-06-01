import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <b><i>Competicoes</i></b></br></br>
 * 
 * A classe <strong>Competicoes</strong> oferece um conjunto de atributos
 * referente a cada atributo.</br></br>
 * 
 * 
 */

public class Competicoes {
    // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private int codIdentificador;
	private String nome;
	private Date dateInicio;
	private Date dateFIm;
	private List<Jogos> jogos = new ArrayList<Jogos>();
	private List<Equipas> equipaEscalao = new ArrayList<Equipas>();


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
	public Date getDateInicio() {
		return dateInicio;
	}
	public void setDateInicio(Date dateInicio) {
		this.dateInicio = dateInicio;
	}
	public Date getDateFIm() {
		return dateFIm;
	}
	public void setDateFIm(Date dateFIm) {
		this.dateFIm = dateFIm;
	}
	public List<Jogos> getJogos() {
		return jogos;
	}
	public void setJogos(List<Jogos> jogos) {
		this.jogos = jogos;
	}
	public List<Equipas> getEquipaEscalao() {
		return equipaEscalao;
	}
	public void setEquipaEscalao(List<Equipas> equipaEscalao) {
		this.equipaEscalao = equipaEscalao;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

	public Competicoes() {

	}

    // CONSTRUTOR COM PARÂMETROS

	public Competicoes(int codIdentificador, String nome, Date dateInicio, Date dateFIm) {
		super();
		this.codIdentificador = codIdentificador;
		this.nome = nome;
		this.dateInicio = dateInicio;
		this.dateFIm = dateFIm;
		this.jogos = new ArrayList<Jogos>();;
		this.equipaEscalao = new ArrayList<Equipas>();
	}

    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public void addEquipa(Equipas equipaEscalao) {
		this.equipaEscalao.add(equipaEscalao);	
	}
	
	public void removeEquipa(int codigo) {
        int equipaRemover = Equipa(codigo);
        if (equipaRemover == -1) {

        } else

        this.equipaEscalao.remove(equipaRemover);
    }

    public void editEquipa(int codigo, Equipas equipaEscalao) {
        int equipaRemover = Equipa(codigo);
        if (equipaRemover == -1) {

        } else

        this.equipaEscalao.set(equipaRemover, equipaEscalao);
    }

    public int Equipa(int codigo) {
        for (int i = 0; i < equipaEscalao.size(); i++) {
            if (equipaEscalao.get(i).getCodIdentificador() == codigo)
                return i;
        }
        return -1;
    }
	
	public void addJogo(Jogos jogos) {
		this.jogos.add(jogos);
	}
	
	public void removeJogo(int codigo) {
        int jogoRemover = Jogo(codigo);
        if (jogoRemover == -1) {

        } else

        this.jogos.remove(jogoRemover);
    }

    public void editJogo(int codigo, Jogos jogos) {
        int jogoRemover = Jogo(codigo);
        if (jogoRemover == -1) {

        } else

        this.jogos.set(jogoRemover, jogos);
    }

    public int Jogo(int codigo) {
        for (int i = 0; i < jogos.size(); i++) {
            if (jogos.get(i).getCodIdentificador() == codigo)
                return i;
        }
        return -1;
    }
	
	public void numeroEquipas(Equipas equipaEscalao) {
		this.equipaEscalao.size();
	}
	
	public void jogosJornada() {
		
	}

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

	@Override
	public String toString() {
		return "Competicoes [codIdentificador=" + codIdentificador + ", nome=" + nome + ", dateInicio=" + dateInicio
				+ ", dateFIm=" + dateFIm + ", jogos=" + jogos + ", equipaEscalao=" + equipaEscalao + "]";
	}

    // ----> equals()
}
