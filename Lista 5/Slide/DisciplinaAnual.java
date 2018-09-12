package slide;

public class DisciplinaAnual extends Disciplina {
    public double nota3;
    public double nota4;
    public double nota5;
    public double nota6;

    @Override
    public void avaliarDisciplina() {
        double notaFinal = ((nota1 + nota2 + nota3 + nota4 + nota5) / 5 * 0.6) + (nota6 * 0.4);
        System.out.println("Resultado: " + this.getNome() + this.getPeriodo() + notaFinal);
    }

    public DisciplinaAnual(String nome, String periodo, double nota1, double nota2, double nota3, double nota4, double nota5, double nota6) {
        super(nome, periodo, nota1, nota2);
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;
        this.nota6 = nota6;
    }
    
}