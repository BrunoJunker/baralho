// representa uma carta do baralho
public class Carta {
	private final String face; // face da carta ("As", "Dois", "Três"...)
	private final String naipe; //  naipe da carta ("Ouros", "Copas" ...)
    private int value;
	
	// construtor de dois argumentos, inicializa face e naipe
	public Carta(String face, String naipe) {
		this.face = face;
		this.naipe = naipe;
	}

    public void setValue(){
        switch(this.face){
            case "Tres":
                this.value = 10;
                break;
            case "Dois":
                this.value = 9;
                break;
            case "As":
                this.value = 8;
                break;
            case "Rei":
                this.value = 7;
                break;
            case "Valete":
                this.value = 6;
                break;
            case "Dama":
                this.value = 5;
                break;
            case "Sete":
                this.value = 4;
                break;
            case "Seis":
                this.value = 3;
                break;
            case "Cinco":
                this.value = 2;
                break;
            case "Quatro":
                this.value = 1;
                break;
        }
    }

    public int getValue(){
        return this.value;
    }
	
	// retorna a representação em string
	@Override
	public String toString() {
		return face + " de " + naipe;
	}
	
} // fim da classe Carta