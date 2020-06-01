import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <b><i>Jogos</i></b></br></br>
 * 
 * A classe <strong>Jogos</strong> oferece um conjunto de atributos
 * referente a cada atributo.</br></br>
 * 
 * 
 */

public class Jogos extends Competicoes {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================

	private String equipaVisitada;
	private String equipaVisitante;
	private int golosEquipaVisitada;
	private int golosEquipaVisitante;
	private Date data;
	private int jornada;
	private List<Arbitros> arbitro = new ArrayList<Arbitros>();

	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	public String getEquipaVisitada() {
		return equipaVisitada;
	}

	public void setEquipaVisitada(String equipaVisitada) {
		this.equipaVisitada = equipaVisitada;
	}

	public String getEquipaVisitante() {
		return equipaVisitante;
	}

	public void setEquipaVisitante(String equipaVisitante) {
		this.equipaVisitante = equipaVisitante;
	}

	public int getGolosEquipaVisitada() {
		return golosEquipaVisitada;
	}

	public void setGolosEquipaVisitada(int golosEquipaVisitada) {
		this.golosEquipaVisitada = golosEquipaVisitada;
	}

	public int getGolosEquipaVisitante() {
		return golosEquipaVisitante;
	}

	public void setGolosEquipaVisitante(int golosEquipaVisitante) {
		this.golosEquipaVisitante = golosEquipaVisitante;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getJornada() {
		return jornada;
	}

	public void setJornada(int jornada) {
		this.jornada = jornada;
	}

	public List<Arbitros> getArbitro() {
		return arbitro;
	}

	public void setArbitro(List<Arbitros> arbitro) {
		this.arbitro = arbitro;
	}

	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================

	// CONSTRUTOR DEFAULT
	public Jogos() {

	}

	// CONSTRUTOR COM PARÂMETROS

	public Jogos(String equipaVisitada, String equipaVisitante, int golosEquipaVisitada, int golosEquipaVisitante,
			Date data, int jornada) {
		super();
		this.equipaVisitada = equipaVisitada;
		this.equipaVisitante = equipaVisitante;
		this.golosEquipaVisitada = golosEquipaVisitada;
		this.golosEquipaVisitante = golosEquipaVisitante;
		this.data = data;
		this.jornada = jornada;
		this.arbitro = new ArrayList<Arbitros>();
	}

	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================

	public void addArbitro(Arbitros arbitro) {
		this.arbitro.add(arbitro);
	}
	
	public void removeArbitro(int codigo) {
        int arbitroRemover = Arbitro(codigo);
        if (arbitroRemover == -1) {

        } else

        this.arbitro.remove(arbitroRemover);
    }

    public void editJogo(int codigo, Arbitros arbitro) {
        int arbitroRemover = Arbitro(codigo);
        if (arbitroRemover == -1) {

        } else

        this.arbitro.set(arbitroRemover, arbitro);
    }

    public int Arbitro(int codigo) {
        for (int i = 0; i < arbitro.size(); i++) {
            if (arbitro.get(i).getNumeroCartaoCidadao() == codigo)
                return i;
        }
        return -1;
    }

	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================

	// ----> toString()

	@Override
	public String toString() {
		return "Jogos [equipaVisitada=" + equipaVisitada + ", equipaVisitante=" + equipaVisitante
				+ ", golosEquipaVisitada=" + golosEquipaVisitada + ", golosEquipaVisitante=" + golosEquipaVisitante
				+ ", data=" + data + ", jornada=" + jornada + ", arbitro=" + arbitro + "]";
	}
		
	// ----> equals()

}
