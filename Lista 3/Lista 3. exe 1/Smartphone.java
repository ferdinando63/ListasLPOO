package lista.pkg3.exe.pkg1;

public class Smartphone extends DispositivoEletronico {
    
    private String contatos[];
    private int mensagens;
    private boolean modoAviao;    
    
    public boolean desligarModoAviao(){ return false; }
    
    public boolean ligarModoAviao(){ return true; }
    
    public void addContato(){}
    
    public void deletaContato(){}
    
    public void mensagens(){}
    
    public Smartphone(String cor, String Formato, boolean ligado, String conexao) {
        super(cor, Formato, ligado, conexao);
    }
    
}
