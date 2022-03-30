
public class Aluno extends Pessoa {
    private Turma turma;


    public Aluno(String nome, String cpf, Turma turma){
        super(nome, cpf);
        this.turma = turma;
    }

    public Aluno(String nome, String cpf, String telefone, String genero, int idade, int matricula, Turma turma) {
        super(nome, cpf, telefone, genero, idade, matricula);
        this.turma = turma;

    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

	@Override
	public String toString() {
		return super.toString() +  "\nTURMA: " + turma + "]";
	}
    
    
}
