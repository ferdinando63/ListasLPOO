package lista.pkg3.exe.pkg1;

public class Notebook extends DispositivoEletronico {
    
    private String modelo;
    private String marca;
    private float polegadas;
    private String processador;

    public Notebook(String cor, String Formato, boolean ligado, String conexao) {
        super(cor, Formato, ligado, conexao);
    }

}
