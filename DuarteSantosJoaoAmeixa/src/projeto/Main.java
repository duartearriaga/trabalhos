package projeto;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Competicoes competicao = new Competicoes();
		competicao.setCod_identificador(123456);
		competicao.setNome("Futebol Distrital de Santarém");
		competicao.setDateInicio(new Date());
		competicao.setDateFIm(new Date());
		
		System.out.println(competicao);

		
		Jogos jogo = new Jogos();
		jogo.setEquipaVisitada("FC Badjulas");
		jogo.setEquipaVisitante("FC Leão");
		jogo.setGolosEquipaVisitada(5);
		jogo.setGolosEquipaVisitante(3);
		jogo.setJornada(1);
		
		System.out.println(jogo);

		
		Arbitros arbitro = new Arbitros();
		arbitro.setNumeroCartaoCidadao(123456789);
		arbitro.setContacto(910000111);
		arbitro.setDataNascimento(new Date());
		arbitro.setEmail("arbitro@gmail.com");

		
		Clubes clube1 = new Clubes();
		clube1.setCodIdentificador(1);
		clube1.setNome("FC Badjula");
		clube1.setContacto(912563348);
		clube1.setCorEquipamento("vermelho");
		clube1.setDataFundacao(new Date());
		clube1.setEmail("clube@gmail.com");
		clube1.setMorada("Rua Apagada");
		
		System.out.println(clube1);

		
		Equipas equipa1 = new Equipas();
		equipa1.setCodIdentificador(1);
		equipa1.setNome("FC Badjula");
		equipa1.setEscalao("Seniores");
		
		Equipas equipa2 = new Equipas();
		equipa2.setCodIdentificador(1);
		equipa2.setNome("FC Badjula");
		equipa2.setEscalao("Seniores");
		
		Equipas equipa3 = new Equipas();
		equipa3.setCodIdentificador(1);
		equipa3.setNome("FC Badjula");
		equipa3.setEscalao("Seniores");
		
		System.out.println(equipa1);
		System.out.println(equipa2);
		System.out.println(equipa3);

		
		competicao.addEquipa(equipa1);
		competicao.addEquipa(equipa2);
		competicao.removeEquipa(equipa3);		
		competicao.addJogo(jogo);

	}

}