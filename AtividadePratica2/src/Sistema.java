public class Sistema {
    public static void menuPrincipal(){

        System.out.println("\n-- Menu Principal --");

        System.out.println("0)Encerrar Programa");
        System.out.println("1)Cadastros");
        System.out.println("2)Lista");
        System.out.println("3)Exclusões");
        System.out.print("Informe uma opção: ");

    }

    public static void menuCadastros(){

        System.out.println("\n-- Menu de Cadastros --");

        System.out.println("0)Voltar");
        System.out.println("1)Cadastrar Desafiante");
        System.out.println("2)Cadastrar Líder de Ginásio");
        System.out.println("3)Cadastrar Performer Pokemon");
        System.out.println("4)Cadastrar Professor");
        System.out.print("Informe uma opção: ");

    }

    public static void menuConsultas(){

        System.out.println("\n-- Menu de Listagem --");

        System.out.println("0)Voltar");
        System.out.println("1)Listar Desafiante");
        System.out.println("2)Listar Líder de Ginásio");
        System.out.println("3)Listar Performer Pokemon");
        System.out.println("4)Listar Professor");
        System.out.println("5)Listar Todos");
        System.out.print("Informe uma opção: ");

    }

    public static void menuExclusoes(){

        System.out.println("\n-- Menu de Exclusões --");

        System.out.println("0)Voltar");
        System.out.println("1)Excluir Treinador");
        System.out.println("2)Excluir Todos");
        System.out.print("Informe uma opção: ");

    }

    public static void encaminharMenu(int op){
        int opt;
        switch (op) {
            case 0: // Encerra Programa
                System.out.println("Programa Finalizado");
                break;
            case 1: // Mostra menu de Cadastros
                menuCadastros();
                opt = Console.lerInt(); 
                realizarCadastro(opt);
                break;
            case 2: // Mostra menu de Listagem
                menuConsultas();
                opt = Console.lerInt();
                realizarConsulta(opt);
                break;
            case 3: // Mostra menu de Exclusões
                menuExclusoes();
                opt = Console.lerInt(); 
                realizarExclusao(opt);
                break;

            default:
                System.out.println("Opção Inválida");
                break;
        }
    }

    public static void realizarCadastro(int op){
        String nome, pokePrincipal, cidadeNatal;
        int idade;

        switch (op) {
            case 0: // Voltar para Menu Principal
                
                break;
            case 1: // Cadastrar Desafiante
                System.out.println("\n-> Cadastro de Desafiante <-\n");
                
                System.out.print("Nome do Desafiante(a): ");
                nome = Console.lerString();
                System.out.print("Idade: ");
                idade = Console.lerInt();
                System.out.print("Pokémon Principal: ");
                pokePrincipal = Console.lerString();
                System.out.print("Cidade Natal: ");
                cidadeNatal = Console.lerString();
                System.out.print("Posição no Ranking: ");
                int ranking = Console.lerInt();
                System.out.print("Quantidade de Insígnias: ");
                int numeroInsignias = Console.lerInt();
                System.out.print("Título (N/A caso não tenha): ");
                String tituloD = Console.lerString();

                Desafiante desafiante = new Desafiante(nome,idade,pokePrincipal,cidadeNatal,ranking,numeroInsignias,tituloD);
                CadastroTreinadores.cadastro(desafiante);
                break;
            case 2: // Cadastrar Lider de Ginásio
                System.out.println("\n-> Cadastro de Líder de Ginásio <-\n");
                
                System.out.print("Nome do Líder(a): ");
                nome = Console.lerString();
                System.out.print("Idade: ");
                idade = Console.lerInt();
                System.out.print("Pokémon Principal: ");
                pokePrincipal = Console.lerString();
                System.out.print("Cidade Natal: ");
                cidadeNatal = Console.lerString();
                System.out.print("Elemento do Ginásio: ");
                String tipoGinasio = Console.lerString();
                System.out.print("Nome da Insígnia: ");
                String insignia = Console.lerString();
                
                LiderGinasio lider = new LiderGinasio(nome,idade,pokePrincipal,cidadeNatal,tipoGinasio, insignia);
                CadastroTreinadores.cadastro(lider);
                break;
            case 3: // Cadastrar Performer Pokemon
                System.out.println("\n-> Cadastro de Performer Pokémon <-\n");
                
                System.out.print("Nome da Performer: ");
                nome = Console.lerString();
                System.out.print("Idade: ");
                idade = Console.lerInt();
                System.out.print("Pokémon Principal: ");
                pokePrincipal = Console.lerString();
                System.out.print("Cidade Natal: ");
                cidadeNatal = Console.lerString();
                System.out.print("Estilo de Dança: ");
                String estiloDanca = Console.lerString();
                System.out.print("Título (N/A caso não tenha): ");
                String tituloP = Console.lerString();
                
                Performer performer = new Performer(nome,idade,pokePrincipal,cidadeNatal,estiloDanca,tituloP);
                CadastroTreinadores.cadastro(performer);
                break;
            case 4: // Cadastrar Professor
                System.out.println("\n-> Cadastro de Professor <-\n");
                
                System.out.print("Nome do Professor(a): ");
                nome = Console.lerString();
                System.out.print("Idade: ");
                idade = Console.lerInt();
                System.out.print("Pokémon Principal: ");
                pokePrincipal = Console.lerString();
                System.out.print("Cidade Natal: ");
                cidadeNatal = Console.lerString();
                System.out.print("Pokemons disponibilizados pelo Professor(a): ");
                String pokemonsIniciais = Console.lerString();
                System.out.print("Pesquisa atual: ");
                String pesquisaAtual = Console.lerString();
                
                Professor professor = new Professor(nome,idade,pokePrincipal,cidadeNatal,pokemonsIniciais,pesquisaAtual);
                CadastroTreinadores.cadastro(professor);
                break;
            default:
                System.out.println("Opção Inválida");
                encaminharMenu(1);
                break;
        }
    }

    public static void realizarConsulta(int op){
        switch (op) {
            case 0:
                
                break;
            case 1: // Listar Desafiantes
                for (Treinador treinadorT : CadastroTreinadores.getListaTreinadores()) {
                    if (treinadorT instanceof Desafiante){
                        System.out.println(treinadorT);
                    }
                }
                break;
            case 2: // Listar Líderes
                for (Treinador treinadorT : CadastroTreinadores.getListaTreinadores()) {
                    if (treinadorT instanceof LiderGinasio){
                        System.out.println(treinadorT);
                    }
                }
                break;
            case 3: // Listar Performers
                for (Treinador treinadorT : CadastroTreinadores.getListaTreinadores()) {
                    if (treinadorT instanceof Performer){
                        System.out.println(treinadorT);
                    }
                }
                break;
            case 4: // Listar Professores
                for (Treinador treinadorT : CadastroTreinadores.getListaTreinadores()) {
                    if (treinadorT instanceof Professor){
                        System.out.println(treinadorT);
                    }
                }
                break;
            case 5: // Listar Tudo
                for (Treinador treinadorT : CadastroTreinadores.getListaTreinadores()) {
                    System.out.println(treinadorT);
                }
                break;
            default:
                System.out.println("Opção Inválida");
                encaminharMenu(2);
                break;
        }
    }

    public static void realizarExclusao(int op){
        switch (op) {
            case 0: // Voltar para Menu Principal
                
                break;
            case 1: // Excluir Treinador
                System.out.print("Nome do registro que deseja excluir: ");
                String nomeEx = Console.lerString();
                boolean excluido = CadastroTreinadores.excluirTreinador(nomeEx);

                if(excluido){
                    System.out.println("Cadastro excluído com sucesso");
                }
                else{
                    System.out.println("Cadastro " + nomeEx + " não encontrado");
                }
                break;
            case 2: // Excluir Todos
                CadastroTreinadores.excluirTodos();
                System.out.println("Todos os Registros foram excluidos");
                break;
            default:
                System.out.println("Opção Inválida");
                encaminharMenu(3);
                break;
        }
    }

    public static void executar(){
        int op = 1;

        while(op != 0){
            menuPrincipal();
            op = Console.lerInt();
            encaminharMenu(op);
        }
    }

}
