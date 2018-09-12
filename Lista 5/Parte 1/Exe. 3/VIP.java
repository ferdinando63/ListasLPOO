package lista.pkg5.exe.pkg3.parte.pkg1;

public class VIP extends Ingresso {
    protected double adicional;

    public double getAdcional() {
        return adicional = 10;
    }
    
    @Override
    public double imprimeValor(){
        return valor + this.adicional;
    }
    
}
