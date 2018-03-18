package controleacademico;

public class RDM {

	public RDM(String nomeAluno, String nomeDisciplina, String horarioDisciplina, String nomeProfessor) {
		
		
		
		
		
		
		
		
		
		Aluno aluno = new Aluno(nomeAluno);
		
		Professor professor = new Professor(nomeProfessor);

		Disciplina disciplina = new Disciplina(nomeDisciplina, horarioDisciplina, professor);

		

	}

}
