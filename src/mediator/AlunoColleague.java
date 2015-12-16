package mediator;

public class AlunoColleague extends Colleague {

	public AlunoColleague(Mediator m) {
		super(m);
	}

	@Override
	public void receberMensagem(String mensagem) {
		System.out.println("Aluno: " + mensagem);
	}

}
