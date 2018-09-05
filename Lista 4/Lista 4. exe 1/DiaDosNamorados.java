package lista.pkg4.exe.pkg1;

public class DiaDosNamorados extends CartaoWeb{
    
    public DiaDosNamorados(String destinatario){
        this.destinatario = destinatario; 
    }
    @Override
    public String retornaMensagem(String Remetente){
        return "Querido(a) " + this.destinatario + ", " +
               "\n Feliz dia dos namorados... Eu te amo!!!"
             + "\n Com amor... " + Remetente;
    }
}