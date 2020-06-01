import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
//Competicoes
		
		Competicoes competicao1 = new Competicoes();
		competicao1.setCodIdentificador(1234567);
		competicao1.setNome("Futebol Distrital de Santarém");
		competicao1.setDateInicio(new Date());
		competicao1.setDateFIm(new Date());

		System.out.println(competicao1);

//-----------------------------------------------------------------------------------------------
//Clubes
		
		Clubes clube1 = new Clubes();
		clube1.setCodIdentificador(12345678);
		clube1.setNome("FC Badjula");
		clube1.setContacto(912563348);
		clube1.setCorEquipamento("vermelho");
		clube1.setDataFundacao(new Date());
		clube1.setEmail("clube@gmail.com");
		clube1.setMorada("Rua Apagada");
		
		System.out.println(clube1);
		
		Clubes clube2 = new Clubes();
		clube2.setCodIdentificador(12345678);
		clube2.setNome("FC Badjula");
		clube2.setCorEquipamento("vermelho");
		clube2.setDataFundacao(new Date());
		clube2.setEmail("clube@gmail.com");
		clube2.setMorada("Rua Apagada");
		
		System.out.println(clube2);
		
//-------------------------------------------------------------------------------------------------
//Jogadores
		
		Jogadores jogador1 = new Jogadores();
		jogador1.setNumeroCartaoCidadao(123453);
		jogador1.setNome("Toni");
		jogador1.setDataNascimento(new Date());
		jogador1.setContacto(910000000);
		jogador1.setEmail("toni@gmail.com");
		jogador1.setPosicao("Avançado");
		jogador1.setPePreferido("Direito");
		jogador1.addJogadores(jogador1);
		
		System.out.println(jogador1);
		
		Jogadores jogador2 = new Jogadores();
		jogador2.setNumeroCartaoCidadao(123454);
		jogador2.setNome("John");
		jogador2.setDataNascimento(new Date());
		jogador2.setContacto(930000000);
		jogador2.setEmail("john@gmail.com");
		jogador2.setPosicao("Médio");
		jogador2.setPePreferido("Esquerdo");
		jogador2.addJogadores(jogador2);
		
		System.out.println(jogador2);
		
		Jogadores jogador3 = new Jogadores();
		jogador3.setNumeroCartaoCidadao(123454);
		jogador3.setNome("Artista");
		jogador3.setDataNascimento(new Date());
		jogador3.setContacto(930000000);
		jogador3.setEmail("artista@gmail.com");
		jogador3.setPosicao("defesa");
		jogador3.setPePreferido("direito");
		jogador3.addJogadores(jogador3);
		
		System.out.println(jogador3);
		
//--------------------------------------------------------------------------------------------------
//Treinadores

		Treinadores treinador1 = new Treinadores();
		treinador1.setNumeroCartaoCidadao(54321);
		treinador1.setNome("Alexandre");
		treinador1.setDataNascimento(new Date());
		treinador1.setContacto(910000000);
		treinador1.setEmail("treinador1@gmail.com");
		
		System.out.println(treinador1);
		
		Treinadores treinador2 = new Treinadores();
		treinador2.setNumeroCartaoCidadao(67890);
		treinador2.setNome("Jumento");
		treinador2.setDataNascimento(new Date());
		treinador2.setContacto(920000000);
		treinador2.setEmail("treinador2@gmail.com");
		
		System.out.println(treinador2);
		
		Treinadores treinador3 = new Treinadores();
		treinador3.setNumeroCartaoCidadao(98076);
		treinador3.setNome("Jacinto");
		treinador3.setDataNascimento(new Date());
		treinador3.setContacto(930000000);
		treinador3.setEmail("treinador3@gmail.com");
		
		System.out.println(treinador3);
		
//-------------------------------------------------------------------------------------------------
//Arbitros
		
		Arbitros arbitro1 = new Arbitros();
		arbitro1.setNumeroCartaoCidadao(987612110);
		arbitro1.setNome("Joao");
		arbitro1.setDataNascimento(new Date());
		arbitro1.setContacto(911111111);
		arbitro1.setEmail("arbitro1@gmail.com");
		
		System.out.println(arbitro1);
		
//-------------------------------------------------------------------------------------------------
//Equipas
		
		Equipas equipa1 = new Equipas();
		equipa1.setCodIdentifacador(1);
		equipa1.setNome("FC Badjula");
		equipa1.setEscalao("Seniores");
		
		Equipas equipa2 = new Equipas();
		equipa2.setCodIdentifacador(2);
		equipa2.setNome("FC Gordos");
		equipa2.setEscalao("Seniores");
		
		Equipas equipa3 = new Equipas();
		equipa3.setCodIdentifacador(3);
		equipa3.setNome("FC Magros");
		equipa3.setEscalao("Seniores");
		
		System.out.println(equipa1);
		System.out.println(equipa2);	
		System.out.println(equipa3);
		
//-----------------------------------------------------------------------------------------------------
//Jogos
		
		Jogos jogo1 = new Jogos();
		jogo1.setEquipaVisitada("FC Badjulas");
		jogo1.setEquipaVisitante("FC Gordos");
		jogo1.setGolosEquipaVisitada(5);
		jogo1.setGolosEquipaVisitante(3);
		jogo1.setData(new Date());
		jogo1.setJornada(1);
		
		System.out.println(jogo1);
//------------------------------------------------------------------------------------------------------
		
		//Criar equipas para à competição
		competicao1.addEquipa(equipa1);
		competicao1.addEquipa(equipa2);
		
		//Remover uma equipa da competição
		competicao1.removeEquipa(3);
		
		//Adicionar um jogo
		competicao1.addJogo(jogo1);
		
		//Ver todas as equipas da competição
		competicao1.numeroEquipas(equipa1);
		
		//Adicionar um arbitro ao jogo
		jogo1.addArbitro(arbitro1);
		
		//Adicionar jogadores às equipas
		equipa1.addJogadores(jogador1);
		equipa1.addJogadores(jogador3);
		equipa2.addJogadores(jogador2);
		
		//Remover um jogador da equipa
		equipa1.removeJogadores(258741963);
		
		//Adicionar treinadores às equipas
		equipa1.addTreinadores(treinador1);
		equipa2.addTreinadores(treinador2);
		equipa3.addTreinadores(treinador3);
		
		//Remover um treinador da equipa
		equipa1.removeTreinadores(67890);
		
		//Mostrar o número de jogadores de um clube
		clube1.numeroJogadores(jogador1);
		
		//Mostrar o número de treinadores de um clube
		clube1.numeroTreinadores(treinador1);
		
		//Informações de um jogador
		jogador1.informacaoJogador();
		
		//Informações de um treinador
		treinador1.informacaoTreinador();
		
		//Infromações de um árbitro
		arbitro1.informacaoArbitro();
		
	}

}
