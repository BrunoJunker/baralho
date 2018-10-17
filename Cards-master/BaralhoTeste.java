public class BaralhoTeste {

	public static void main(String[] args) {
		Baralho meuBaralho  = new Baralho();
		
		meuBaralho.embaralha(); // coloca as cartas de forma aleatória
		
        System.out.println("Jogador 1:");
		// imprime as 52 cartas, na ordem em que elas estão no baralho
		for (int i = 1; i <= 3; i++) {
			System.out.println(meuBaralho.distribuiCarta());
			System.out.println(meuBaralho.verificaValor());
			/*if (i % 4 == 0) // gera uma linha em branco a cada 4 cartas
				System.out.println();*/
		}

        System.out.println("\nJogador 2:");
		// imprime as 52 cartas, na ordem em que elas estão no baralho
		for (int j = 1; j <= 3; j++) {
			System.out.printf("%-19s", meuBaralho.distribuiCarta());
			//meuBaralho.verficaValor();
			/*if (i % 4 == 0) // gera uma linha em branco a cada 4 cartas
				System.out.println();*/
		}

        System.out.println("\nCarta da mesa:");
        System.out.printf("%-19s", meuBaralho.distribuiCarta());
	}

}