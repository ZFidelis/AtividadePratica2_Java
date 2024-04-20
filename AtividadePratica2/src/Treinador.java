public class Treinador {
    private String nome;
    private int idade;
    private String pokePrincipal;
    private String cidadeNatal; 
    
    public Treinador() {
    }
    
    public Treinador(String nome, int idade, String pokePrincipal, String cidadeNatal) {
        this.nome = nome;
        this.idade = idade;
        this.pokePrincipal = pokePrincipal;
        this.cidadeNatal = cidadeNatal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPokePrincipal() {
        return pokePrincipal;
    }

    public void setPokePrincipal(String pokePrincipal) {
        this.pokePrincipal = pokePrincipal;
    }

    public String getCidadeNatal() {
        return cidadeNatal;
    }

    public void setCidadeNatal(String cidadeNatal) {
        this.cidadeNatal = cidadeNatal;
    }

    @Override
    public String toString() {
        String text = "\nNome: " + nome + "\nIdade: " + idade + "\nPokémon Principal: " + pokePrincipal + "\nCidade Natal: " + cidadeNatal;

        return text;
    }

}
