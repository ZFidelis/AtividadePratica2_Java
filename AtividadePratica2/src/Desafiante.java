public class Desafiante extends Treinador{

    private int ranking;
    private int numeroInsignias;
    private String titulo;
    
    public Desafiante(String nome, int idade, String pokePrincipal, String cidadeNatal, int ranking,
            int numeroInsignias, String titulo) {
        super(nome, idade, pokePrincipal, cidadeNatal);
        this.ranking = ranking;
        this.numeroInsignias = numeroInsignias;
        this.titulo = titulo;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getNumeroInsignias() {
        return numeroInsignias;
    }

    public void setNumeroInsignias(int numeroInsignias) {
        this.numeroInsignias = numeroInsignias;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRanking: " + ranking + "\nNúmero de Insignias: " + numeroInsignias + "\nTítulo: " + titulo;
    }
}
