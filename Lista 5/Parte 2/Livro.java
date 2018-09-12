package parte.pkg2;

public class Livro extends Produto {
    private String autor;

    public String getAutor() {
        return autor = "Charles Darwin";
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
