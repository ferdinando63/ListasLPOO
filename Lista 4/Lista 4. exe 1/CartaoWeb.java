package lista.pkg4.exe.pkg1;

public abstract class CartaoWeb {
    protected String destinatario;
    
    public String getNome(){
        return this.destinatario;
    }
    
    public abstract String retornaMensagem(String Remetente);
}