public class Treinador {
    private String nome;
    private int idade;
    private String pokePrincipal;
    
    public Treinador() {
    }

    public Treinador(String nome, int idade, String pokePrincipal) {
        this.nome = nome;
        this.idade = idade;
        this.pokePrincipal = pokePrincipal;
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

    
    @Override
    public String toString() {
        String text = "\nNome: " + nome + "\nIdade: " + idade + "\nPokémon Principal: " + pokePrincipal + "\n";

        return text;
    }


}
