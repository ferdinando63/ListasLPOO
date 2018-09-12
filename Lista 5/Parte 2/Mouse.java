package parte.pkg2;

public class Mouse extends Produto {
    private String tipo;

    public Mouse(String tipo) {
        this.tipo = "Mouse ótico, Saída USB, 1.600 dpi";
        this.descricao = this.tipo; 
    }
    
    @Override
    public String getNomeLoja(){
        return nomeLoja;
    }
    
    @Override
    public double getPreco() {
        return preco;
    }
    
    @Override
    public String getDescricao() {
        return "Produto de Informatica";
    }
}
