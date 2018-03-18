package controleacademico;

import controleacademico.Professor;

public class Start {
	public static Disciplina d1, d2, d3, d4, d5;
	public static Professor p1, p2, p3, p4, p5;
	public static Aluno a1, a2, a3, a4, a5;

	public static void main(String[] args) {

		RDM widson = new RDM("Widson", "Claculo Numérico", "Seg. 18:00, Qui. 20:00", "Paulo Barbosa");
		RDM jose = new RDM("José", "Programação", "Seg. 18:00, Qui. 20:00", "Robson");
		RDM carlos = new RDM("Widson", "Claculo Numérico", "Seg. 18:00, Qui. 20:00", "Paulo Barbosa");
		RDM piaminino = new RDM("Widson", "Claculo Numérico", "Seg. 18:00, Qui. 20:00", "Paulo Barbosa");
		
		

		// //Cadastra disciplinas para o professor
		// Controle.cadastraDisciplinaParaProfessor(d1, p1);
		// Controle.cadastraDisciplinaParaProfessor(d2, p1);
		// Controle.cadastraDisciplinaParaProfessor(d3, p1);
		//
		// Controle.cadastraDisciplinaParaProfessor(d4, p2);
		// Controle.cadastraDisciplinaParaProfessor(d5, p2);
		//
		// //Mostra as disciplinas do professor
		// Professor.disciplinasDoProfessor(p1);
		// System.out.println("===============");
		// Professor.disciplinasDoProfessor(p2);
		// System.out.println("===============");
		// Professor.horariosDoProfessor(p1);
		// System.out.println("===============");
		// Professor.horariosDoProfessor(p2);
		//
		// //Adiciona lunos na disciplina d5
		// Disciplina.adicionarAlunoNaDisciplina(d5, a1);
		// Disciplina.adicionarAlunoNaDisciplina(d5, a2);
		// Disciplina.adicionarAlunoNaDisciplina(d5, a3);
		// Disciplina.adicionarAlunoNaDisciplina(d5, a4);
		//
		// Disciplina.adicionarAlunoNaDisciplina(d5, a5);
		//
		// //Mostrando os alunos que estão cadastrados na disciplina d5
		// Disciplina.alunosDaDisciplina(d5);
		//
		// //Mostrando as disciplinas do aluno a1
		// Aluno.disciplinasDoAluno(a1);
		//
		// //Mostrando os horários do aluno a1
		// Aluno.horariosDoAluno(a1);
		//
		// //Numero de alunos da disciplina
		// Disciplina.numeroDeAlunosDaDisciplina(d5);

	}

	public static void adicionaDisciplina_5() {
//		// Disciplina d1 = Calculo 1
//		d1 = new Disciplina("Cálculo 1", "07:00");
//
//		// Disciplina d2 = Algebra Linear
//		d2 = new Disciplina("Álgebra Linear", "09:00");
//
//		// Disciplina d3 = Algoritmo
//		d3 = new Disciplina("Algoritmo", "11:00");
//
//		// Disciplina d4 = Programacao OO
//		d4 = new Disciplina("Programação OO", "18:00");
//
//		// Disciplina d5 = Computacao Grafica
//		d5 = new Disciplina("Computação Gráfica", "20:00");
	}

	public static void adicionaProfessor_5() {
		// Professor p1 = Paulo Eduardo
		p1 = new Professor("Paulo Eduardo");

		// Professor p2 = Robson Pequeno
		p2 = new Professor("Robson Pequeno");

		// Professor p3 = Janderson Jason
		p3 = new Professor("Janderson Jason");

		// Professor p4 = Edson Holanda
		p4 = new Professor("Edson Holanda");

		// Professor p5 = Allyson Milanez
		p5 = new Professor("Allyson Milanez");

	}

	public static void adicionaAluno_5() {
		// Aluno a1 = Widson Melo
		a1 = new Aluno("Widson Melo");

		// Aluno a2 = José George
		a2 = new Aluno("José George");

		// Aluno a3 = Pablo Monteiro
		a3 = new Aluno("Pablo Monteiro");

		// Aluno a4 = Sergio Davi
		a4 = new Aluno("Sergio Davi");

		// Aluno a5 = Samuel Junior
		a5 = new Aluno("Samuel Junior");
	}

}
