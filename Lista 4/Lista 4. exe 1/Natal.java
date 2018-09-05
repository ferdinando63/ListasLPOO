package lista.pkg4.exe.pkg1;

public class Natal extends CartaoWeb{
    
    public Natal(String destinatario){
        this.destinatario = destinatario; 
    }
    
    @Override
    public String retornaMensagem(String Remetente){
        return "Querido(a) " + this.destinatario +
               "\n Feliz Natal!!!" + 
               "\n Atenciosamente... " + Remetente;
    }
}