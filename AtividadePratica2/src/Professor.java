public class Professor extends Treinador {

    private String pokemonsIniciais;
    private String pesquisaAtual;

    public Professor(String nome, int idade, String pokePrincipal, String cidadeNatal, String pokemonsIniciais,
            String pesquisaAtual) {
        super(nome, idade, pokePrincipal, cidadeNatal);
        this.pokemonsIniciais = pokemonsIniciais;
        this.pesquisaAtual = pesquisaAtual;
    }

    public String getPokemonsIniciais() {
        return pokemonsIniciais;
    }

    public void setPokemonsIniciais(String pokemonsIniciais) {
        this.pokemonsIniciais = pokemonsIniciais;
    }

    public String getPesquisaAtual() {
        return pesquisaAtual;
    }

    public void setPesquisaAtual(String pesquisaAtual) {
        this.pesquisaAtual = pesquisaAtual;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPokémons iniciais que esse professor oferece: " + pokemonsIniciais + "\nPesquisa Atual: " + pesquisaAtual;
    }
}
