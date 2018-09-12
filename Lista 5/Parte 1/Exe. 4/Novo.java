package lista.pkg5.exe.pkg4.part.pkg1;

public class Novo extends Imovel {
    private double precoAdicional = 10.1;

    public double getPrecoAdicional() {
        return preco * precoAdicional ;
    }

    public void setPrecoAdicional(double precoAdicional) {
        this.precoAdicional = precoAdicional;
    }
   
}