package slide;

public class DisciplinaSemestral extends Disciplina {
    public double nota3;

    @Override
    public void avaliarDisciplina() {
        double notaFinal = (nota1 + nota2 + nota3) / 3;
        System.out.println("Resultado: " + this.getNome() + this.getPeriodo() + notaFinal);
    }

    public DisciplinaSemestral(String nome, String periodo, double nota1, double nota2, double nota3) {
        super(nome, periodo, nota1, nota2);
        this.nota3 = nota3;
    }
    
}