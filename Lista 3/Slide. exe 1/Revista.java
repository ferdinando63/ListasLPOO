package slide.exe.pkg1;

public class Revista implements ItemDeBiblioteca {
    private String nomeRevista;
    private int edicao;
    private int ano;

    public String getNomeRevista() {
        return nomeRevista;
    }

    public void setNomeRevista(String nomeRevista) {
        this.nomeRevista = nomeRevista;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Revista(String nomeRevista, int edicao, int ano) {
        this.nomeRevista = nomeRevista;
        this.edicao = edicao;
        this.ano = ano;
    }

    @Override
    public String disponivel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String emprestado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String emAtraso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String reservado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
