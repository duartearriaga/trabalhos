import java.util.Date;
import java.util.List;

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
	private List<Jogos> arbitro;

	
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
	public List<Jogos> getArbitro() {
		return arbitro;
	}
	public void setArbitro(List<Jogos> arbitro) {
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
			Date data, int jornada, List<Jogos> arbitro) {
		super();
		this.equipaVisitada = equipaVisitada;
		this.equipaVisitante = equipaVisitante;
		this.golosEquipaVisitada = golosEquipaVisitada;
		this.golosEquipaVisitante = golosEquipaVisitante;
		this.data = data;
		this.jornada = jornada;
		this.arbitro = arbitro;
	}


    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	public void addArbitro(Arbitros arbitro) {
		this.arbitro.add(arbitro);
	}
	
	public void removeArbitro(Arbitros arbitro) {
		this.arbitro.remove(arbitro);
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
