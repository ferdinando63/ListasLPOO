package lista.pkg5.exe.pkg4.part.pkg1;

public class Velho extends Imovel {
    private double descontoPreco = 10.1;

    public double getDescontoPreco() {
        return preco - descontoPreco;
    }

    public void setDescontoPreco(double descontoPreco) {
        this.descontoPreco = descontoPreco;
    }

}