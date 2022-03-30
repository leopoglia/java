import java.util.ArrayList;

public class Professor extends Pessoa {
    private String turno;
    private double salario;

	ArrayList<Materia> listaMaterias = new ArrayList<Materia>();

    public void cadastrarNota(int av, double nota, Aluno aluno){

    }

    public Professor() {

    }

    public Professor(String nome, String cpf, String telefone, String genero, int idade, int matricula, ArrayList<Materia> listaMaterias, String turno, double salario) {
        super(nome, cpf, telefone, genero, idade, matricula);
        this.listaMaterias = listaMaterias;
        this.turno = turno;
        this.salario = salario;
    }

    public ArrayList<Materia> getMateria() {
        return listaMaterias;
    }

    public void setMateria(ArrayList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString()+"MATERIA: " + listaMaterias + "\nTURNO: " + turno + "\nSALARIO: " + salario +
                "\n";
    }
}
  