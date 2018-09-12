package slide;

public class Slide {

    public static void main(String[] args) {
        //Disciplina[] d = new Disciplina [3];
        
        //d[0] = new DisciplinaTrimestral("Ferdinando", "4°", 8, 7);
        //d[0].avaliarDisciplina();
        //d[1] = new DisciplinaSemestral("Ferdinando", "4°", 8, 7, 6);
        //d[1].avaliarDisciplina();
        //d[2] = new DisciplinaAnual("Ferdinando", "4°", 8, 7, 6, 9, 8, 5);
        //d[2].avaliarDisciplina();
        
        DisciplinaTrimestral dt = new DisciplinaTrimestral("Ferdinando ", "4° ", 8, 7);
        DisciplinaSemestral ds = new DisciplinaSemestral("Ferdinando ", "4° ", 8, 7, 6);
        DisciplinaAnual da = new DisciplinaAnual("Ferdinando ", "4° ", 8, 7, 6, 9, 8, 5);
        
        dt.avaliarDisciplina();
        ds.avaliarDisciplina();
        da.avaliarDisciplina();
        
    }
}
