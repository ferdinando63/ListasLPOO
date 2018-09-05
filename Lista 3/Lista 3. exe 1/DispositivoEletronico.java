package lista.pkg3.exe.pkg1;

public class DispositivoEletronico {
    
    protected String cor;
    protected String Formato;
    protected boolean ligado;
    protected String conexao;
        
    public void ligar(){}
    public void desligar(){}

    public DispositivoEletronico(String cor, String Formato, boolean ligado, String conexao) {
        this.cor = cor;
        this.Formato = Formato;
        this.ligado = ligado;
        this.conexao = conexao;
    }
    
    
}
