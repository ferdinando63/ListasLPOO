package lista.pkg4.exe.pkg1;

public class Aniversario extends CartaoWeb{
    
    
    public Aniversario(String destinatario){
        this.destinatario = destinatario; 
    }
    @Override
    public String retornaMensagem(String Remetente){
        return "Querido(a) " + this.destinatario + ", " +
               "\n Feliz aniversario, eu te desejo muita sorte, paz e saúde!!!"
             + "\n Atenciosamente... " + Remetente;
    }
}