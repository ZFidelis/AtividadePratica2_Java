public class LiderGinasio extends Treinador {

    private String tipoGinasio;
    private String insignia;
    
    
    public LiderGinasio(String nome, int idade, String pokePrincipal, String cidadeNatal, String tipoGinasio,
            String insignia) {
        super(nome, idade, pokePrincipal, cidadeNatal);
        this.tipoGinasio = tipoGinasio;
        this.insignia = insignia;
    }

    public String getTipoGinasio() {
        return tipoGinasio;
    }
    public void setTipoGinasio(String tipoGinasio) {
        this.tipoGinasio = tipoGinasio;
    }
    public String getInsignia() {
        return insignia;
    }
    public void setInsignia(String insignia) {
        this.insignia = insignia;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de Ginásio: " + tipoGinasio + "\nInsígnia: " + insignia;
    }
}