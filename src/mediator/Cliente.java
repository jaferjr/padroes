package mediator;

public class Cliente {
	public static void main(String[] args) {
		MensagemMediator mediador = new MensagemMediator();
	
		ProfessorColleague professor = new ProfessorColleague(mediador);
		AlunoColleague aluno = new AlunoColleague(mediador);
		AlunoColleague aluno2 = new AlunoColleague(mediador);
	
		mediador.adicionarColleague(aluno);
		mediador.adicionarColleague(aluno2);
		mediador.adicionarColleague(professor);
		
		System.out.println("=========");
		aluno.enviarMensagem("Como estão as coisas nobre colega");
		System.out.println("=========");
		aluno2.enviarMensagem("vou bem caro colega");
		System.out.println("=========");
		professor.enviarMensagem("façam silêncio!");
	}
}
