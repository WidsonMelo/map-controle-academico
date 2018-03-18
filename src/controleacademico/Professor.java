package controleacademico;

import java.util.ArrayList;

public class Professor {
    
    public String nome;
    public Integer matricula;
    public static ArrayList<Disciplina> listaDeDisciplinasDoProfessor = new ArrayList<>();
    
    public Professor() {
    	Controle.adicionarProfessorNaLista(this);
    }       
    
    public static void disciplinasDoProfessor(Professor professor) {
    	for (int i = 0; i < professor.listaDeDisciplinasDoProfessor.size(); i++) {
        	System.out.println("Disciplina " + professor.listaDeDisciplinasDoProfessor.get(i).getNome() + " de " + professor.getNome());			
		}
    }        
    
    public static void horariosDoProfessor(Professor professor) {
    	System.out.println("Professor: " + professor.getNome());
    	for (int i = 0; i < professor.listaDeDisciplinasDoProfessor.size(); i++) {
        	System.out.println(professor.listaDeDisciplinasDoProfessor.get(i).getHorario());			
		}    	
    }
    
    
    public static boolean adicionarDisciplinaAoProfessor(Disciplina disciplina, Professor professor){
    	boolean disciplinaExiste = professor.listaDeDisciplinasDoProfessor.contains(disciplina);
		if (disciplinaExiste == true) {
			System.out.println("o professor j� est� na disciplina");
			return false;
		} else {
			professor.listaDeDisciplinasDoProfessor.add(disciplina);	
			disciplina.setProfessorResponsavel(professor);
			System.out.println("o aluno n�o estava na disciplina, foi adicionado");
			return true;
		}
    }       

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Integer getMatricula() {
        return matricula;
    }
    
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }


	public static ArrayList<Disciplina> getListaDeDisciplinasDoProfessor() {
		return listaDeDisciplinasDoProfessor;
	}


	public static void setListaDeDisciplinasDoProfessor(ArrayList<Disciplina> listaDeDisciplinasDoProfessor) {
		Professor.listaDeDisciplinasDoProfessor = listaDeDisciplinasDoProfessor;
	} 

   

    

  


    
    

    
}