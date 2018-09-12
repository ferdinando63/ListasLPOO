package slide;

public class DisciplinaTrimestral extends Disciplina {
    
    public DisciplinaTrimestral(String nome, String periodo, double nota1, double nota2) {
    super(nome, periodo, nota1, nota2);
    }
    
    @Override
    public void avaliarDisciplina() {
        double notaFinal = (nota1 * 0.4) + (nota2 * 0.6);
        System.out.println("Resultado: " + this.getNome() + this.getPeriodo() + notaFinal);
    }

}