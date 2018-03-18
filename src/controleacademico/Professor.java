package controleacademico;

import java.util.ArrayList;

public class Professor {
    
    public String nomeProfessor;
    public String matriculaProfessor;
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
			System.out.println("o professor já está na disciplina");
			return false;
		} else {
			professor.listaDeDisciplinasDoProfessor.add(disciplina);	
			disciplina.setProfessorResponsavel(professor);
			System.out.println("o aluno não estava na disciplina, foi adicionado");
			return true;
		}
    }       

    public String getNome() {
        return nomeProfessor;
    }
    
    public void setNome(String nome) {
        this.nomeProfessor = nome;
    }
    
    public String getMatricula() {
        return matriculaProfessor;
    }
    
    public void setMatricula(String matricula) {
        this.matriculaProfessor = matricula;
    }


	public static ArrayList<Disciplina> getListaDeDisciplinasDoProfessor() {
		return listaDeDisciplinasDoProfessor;
	}


	public static void setListaDeDisciplinasDoProfessor(ArrayList<Disciplina> listaDeDisciplinasDoProfessor) {
		Professor.listaDeDisciplinasDoProfessor = listaDeDisciplinasDoProfessor;
	} 

   

    

  


    
    

    
}
