import com.DuartesantosJoaoAmeixa.projeto.*;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Competicoes competicao = new Competicoes();
		competicao.setCod_identificador(123456);
		competicao.setNome("Futebol Distrital de Santarém");
		competicao.setDateInicio(new Date());
		competicao.setDateFIm(new Date());
		
		System.out.println(competicao);

		Arbitros arbitro = new Arbitros();
		arbitro.setNumeroCartaoCidadao(123456789);
		arbitro.setContacto(910000111);
		arbitro.setDataNascimento(new Date());
		arbitro.setEmail("arbitro@gmail.com");
		arbitro.setNome("Joaquim");

		
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
		equipa1.setCodIndentifacador(1);
		equipa1.setNome("FC Badjula");
		equipa1.setEscalao("Seniores");
		
		Equipas equipa2 = new Equipas();
		equipa2.setCodIndentifacador(2);
		equipa2.setNome("FC Magros");
		equipa2.setEscalao("Seniores");
		
		Equipas equipa3 = new Equipas();
		equipa3.setCodIndentifacador(3);
		equipa3.setNome("FC Gordos");
		equipa3.setEscalao("Seniores");
		
		Jogos jogo = new Jogos();
		jogo.setEquipaVisitada("FC Magros");
		jogo.setEquipaVisitante("FC Gordos");
		jogo.setGolosEquipaVisitada(5);
		jogo.setGolosEquipaVisitante(3);
		jogo.setJornada(1);
		
		
		
		System.out.println(equipa1);
		System.out.println(equipa2);
		System.out.println(equipa3);
		System.out.println(jogo);
		
		
//		competicao.addEquipa(equipa1);
//		competicao.addEquipa(equipa2);
//		competicao.removeEquipa(equipa3);		
//		competicao.addJogo(jogo);

	}

}