public class Performer extends Treinador {

    private String estiloDanca;
    private String titulo;
    
    public Performer(String nome, int idade, String pokePrincipal, String cidadeNatal, String estiloDanca,
            String titulo) {
        super(nome, idade, pokePrincipal, cidadeNatal);
        this.estiloDanca = estiloDanca;
        this.titulo = titulo;
    }

    public String getEstiloDanca() {
        return estiloDanca;
    }

    public void setEstiloDanca(String estiloDanca) {
        this.estiloDanca = estiloDanca;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nEstilo de Dança: " + estiloDanca + "\nTítulo: " + titulo;
    }
    
}
