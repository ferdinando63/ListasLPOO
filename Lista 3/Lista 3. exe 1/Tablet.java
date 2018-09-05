package lista.pkg3.exe.pkg1;

public class Tablet extends DispositivoEletronico {
    
    private float polegadas;
    private String marca;
    private float memoria;

    public Tablet(String cor, String Formato, boolean ligado, String conexao) {
        super(cor, Formato, ligado, conexao);
    }

}
