package com.DuartesantosJoaoAmeixa.projeto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Competicoes {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================

	private int codIdentificador;
	private String nome;
	private Date dateInicio;
	private Date dateFIm;
//	private List<Clubes> equipasparticipantes;
	private List<Jogos> jogos;
	private List<Equipas> equipaEscalao = new ArrayList();

	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	public int getCod_identificador() {
		return codIdentificador;
	}

	public void setCod_identificador(int cod_identificador) {
		this.codIdentificador = cod_identificador;
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

//	public List<Clubes> getEquipasparticipantes() {
//		return equipasparticipantes;
//	}
//
//	public void setEquipasparticipantes(List<Clubes> equipasparticipantes) {
//		this.equipasparticipantes = equipasparticipantes;
//	}

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
	
	public Competicoes(int cod_identificador, String nome, Date dateInicio, Date dateFIm) {
		super();
		this.codIdentificador = cod_identificador;
		this.nome = nome;
		this.dateInicio = dateInicio;
		this.dateFIm = dateFIm;
//		this.equipasparticipantes = new ArrayList<Clubes>();
		this.jogos = new ArrayList<Jogos>();
		this.equipaEscalao = new ArrayList<Equipas>();
	}	
	

	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================

	
//	public void addEquipa(Equipas equipasparticipantes) {
//		
//		this.equipasparticipantes.add(equipasparticipantes);
//		
//	}
//	
//	
//	public void removeEquipa(Equipas equipasparticipantes) {
//		this.equipasparticipantes.remove(equipasparticipantes);
//	}
	
	public void addEquipa(Equipas equipaEscalao) {
		
		this.equipaEscalao.add(equipaEscalao);
		
	}
	
	public void removeEquipa(Equipas equipaEscalao) {
		this.equipaEscalao.remove(equipaEscalao);
	}
	
	public void addJogo(Jogos jogos) {
		this.jogos.add(jogos);
	}
	
	public void removeJogo(Jogos jogos) {
		this.jogos.remove(jogos);
	}
	
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================

	// ----> toString()

	@Override
	public String toString() {
		return "Competicoes [cod_identificador=" + codIdentificador + ", nome=" + nome + ", dateInicio=" + dateInicio
				+ ", dateFIm=" + dateFIm + ", jogos=" + jogos + "]";
	}



	// ----> equals()
}
