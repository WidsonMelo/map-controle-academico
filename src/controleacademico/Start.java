package controleacademico;
import controleacademico.Professor;

public class Start {
	public static Disciplina d1, d2, d3, d4, d5;
	public static Professor p1, p2, p3, p4, p5;
	public static Aluno a1, a2, a3, a4, a5;

	public static void main(String[] args) {    
		
		adicionaAluno_5();
        adicionaDisciplina_5();
        adicionaProfessor_5();

        
        //Cadastra disciplinas para o professor
        Controle.cadastraDisciplinaParaProfessor(d1, p1);
        Controle.cadastraDisciplinaParaProfessor(d2, p1);
        Controle.cadastraDisciplinaParaProfessor(d3, p1);
        
        Controle.cadastraDisciplinaParaProfessor(d4, p2);
        Controle.cadastraDisciplinaParaProfessor(d5, p2);                
        
        //Mostra as disciplinas do professor
        Professor.disciplinasDoProfessor(p1);
        System.out.println("===============");
        Professor.disciplinasDoProfessor(p2);
        System.out.println("===============");        
        Professor.horariosDoProfessor(p1);
        System.out.println("===============");
        Professor.horariosDoProfessor(p2);                
        
        //Adiciona lunos na disciplina d5
        Disciplina.adicionarAlunoNaDisciplina(d5, a1);
        Disciplina.adicionarAlunoNaDisciplina(d5, a2);
        Disciplina.adicionarAlunoNaDisciplina(d5, a3);
        Disciplina.adicionarAlunoNaDisciplina(d5, a4);
        Disciplina.adicionarAlunoNaDisciplina(d5, a5);
        
        //Mostrando os alunos que estão cadastrados na disciplina d5
        Disciplina.alunosDaDisciplina(d5);
        
        //Mostrando as disciplinas do aluno a1
        Aluno.disciplinasDoAluno(a1);
       
        //Mostrando os horários do aluno a1       
        Aluno.horariosDoAluno(a1);
        
        //Numero de alunos da disciplina
        Disciplina.numeroDeAlunosDaDisciplina(d5);     
                
        
	}

	public static void adicionaDisciplina_5() {
		// Disciplina d1 = Calculo 1
		d1 = new Disciplina();
		d1.setNome("Cálculo 1");
		d1.setCodigo("01");
		d1.setSala("A203");
		d1.setCargaHoraria(60);
		d1.setHorario("07:00");

		// Disciplina d2 = Algebra Linear
		d2 = new Disciplina();
		d2.setNome("Álgebra Linear");
		d2.setCodigo("02");
		d2.setSala("B404");
		d2.setCargaHoraria(60);
		d2.setHorario("09:00");

		// Disciplina d3 = Algoritmo
		d3 = new Disciplina();
		d3.setNome("Algoritmo");
		d3.setCodigo("03");
		d3.setSala("Psico 104");
		d3.setCargaHoraria(60);
		d3.setHorario("11:00");

		// Disciplina d4 = Programacao OO
		d4 = new Disciplina();
		d4.setNome("Programação OO");
		d4.setCodigo("04");
		d4.setSala("Odonto 12");
		d4.setCargaHoraria(60);
		d4.setHorario("18:00");

		// Disciplina d5 = Computacao Grafica
		d5 = new Disciplina();
		d5.setNome("Computação Gráfica");
		d5.setCodigo("05");
		d5.setSala("CCT 303");
		d5.setCargaHoraria(60);
		d5.setHorario("20:00");
	}

	public static void adicionaProfessor_5() {
		// Professor p1 = Paulo Eduardo
		p1 = new Professor();
		p1.setNome("Paulo Eduardo");
		p1.setMatricula(101010);

		// Professor p2 = Robson Pequeno
		p2 = new Professor();
		p2.setNome("Robson Pequeno");
		p2.setMatricula(202020);

		// Professor p3 = Janderson Jason
		p3 = new Professor();
		p3.setNome("Janderson Jason");
		p3.setMatricula(303030);

		// Professor p4 = Edson Holanda
		p4 = new Professor();
		p4.setNome("Edson Holanda");
		p4.setMatricula(404040);

		// Professor p5 = Allyson Milanez
		p5 = new Professor();
		p5.setNome("Allyson Milanez");
		p5.setMatricula(505050);		

	}
	
	public static void adicionaAluno_5() {
		//Aluno a1 = Widson Melo
        a1 = new Aluno();
        a1.setNome("Widson Melo");
        a1.setMatricula(111111);             
        
        //Aluno a2 = José George
        a2 = new Aluno();
        a2.setNome("José George");
        a2.setMatricula(222222);                                
        
        //Aluno a3 = Pablo Monteiro
        a3 = new Aluno();
        a3.setNome("Pablo Monteiro");
        a3.setMatricula(333333);                
        
        //Aluno a4 = Sergio Davi
        a4 = new Aluno();
        a4.setNome("Sergio Davi");
        a4.setMatricula(444444);                
        
        //Aluno a5 = Samuel Junior
        a5 = new Aluno();
        a5.setNome("Samuel Junior");
        a5.setMatricula(555555);                               		
	}	

}
