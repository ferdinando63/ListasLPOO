package lista.pkg5.exe.pkg3.parte.pkg1;

public class CamoroteSuperior extends VIP{
    private double adicional;
    private String localizacao;

    private double getAdicional() {
        return adicional = 10;
    }
    
    @Override
    public double imprimeValor(){
        return valor + this.adicional + getAdicional();
    }

}
