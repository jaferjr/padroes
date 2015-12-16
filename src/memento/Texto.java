package memento;

public class Texto {
	protected String texto;
	TextoCareTaker caretaker;
	
	public Texto() {
		caretaker = new TextoCareTaker();
		texto = new String();
	}

	public void escreverTexto(String novoTexto) {
		if (novoTexto.toCharArray()[0] == '=' && novoTexto.toCharArray().length == 1) {
			calcular();
			return;
		}
		caretaker.adicionarMemento(new TextoMemento(texto, novoTexto));
		texto += novoTexto;
		if(novoTexto.toCharArray()[0] == 'x' && novoTexto.toCharArray().length == 1){
			texto = caretaker.getUltimoEstadoSalvo().getTextoSalvo();
			System.out.println("valor apagado com sucesso.");
		}
		if (caretaker.estados.size()%2 == 1) {
			try{
				Integer.parseInt(novoTexto);
		    }catch(NumberFormatException e){
		    	System.out.println("Erro, espera-se um número. Digite um numero novamente.");
		    	texto = caretaker.getUltimoEstadoSalvo().getTextoSalvo();
		        return;
		    }
		}
		else {
			char operador = novoTexto.toCharArray()[0];
			if (!((operador == '+' || operador == '-' || operador == '*' || operador == '/') && novoTexto.toCharArray().length == 1)){
				System.out.println("Erro, espera-se um operador, ex: + ou - ou * ou /. Digite um operador novamente.");
				texto = caretaker.getUltimoEstadoSalvo().getTextoSalvo();
			}
		}
	}

	public void desfazerEscrita() {
		texto = caretaker.getUltimoEstadoSalvo().getTextoSalvo();
	}

	public void mostrarTexto() {
		System.out.println(texto);
	}

	public void calcular() {
		String textoFinal = texto;
		if (caretaker.estados.size()%2 == 0) {
			System.out.println("Ultimo valor é um operador, adicione mais um numero");
			return;
		}
		int valorTotal = 0;
		int tamanhoInicial = caretaker.estados.size();
		char ultimoOperador = 'x';
		while(caretaker.estados.size() > 0) {
			String ultimoValor = caretaker.estados.get(caretaker.estados.size()-1).valor;
			if (tamanhoInicial == caretaker.estados.size()) {
				valorTotal = Integer.parseInt(ultimoValor);
			}
			else if (caretaker.estados.size()%2 == 1) {
				if (ultimoOperador == '+') {
					valorTotal = Integer.parseInt(ultimoValor) + valorTotal;
				}
				else if (ultimoOperador == '-') {
					valorTotal = Integer.parseInt(ultimoValor) - valorTotal;
				}
				else if (ultimoOperador == '*') {
					valorTotal = Integer.parseInt(ultimoValor) * valorTotal;
				}
				else if (ultimoOperador == '/') {
					valorTotal = Integer.parseInt(ultimoValor) / valorTotal;
				}
			}
			else {
				ultimoOperador = ultimoValor.toCharArray()[0];
			}
			caretaker.getUltimoEstadoSalvo().getTextoSalvo();
		}
		texto = textoFinal + "=" + valorTotal;
	}
}
