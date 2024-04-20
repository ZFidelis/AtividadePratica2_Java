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

        System.out.println("-- Menu de Cadastros --");

        System.out.println("0)Voltar");
        System.out.println("1)Cadastrar Desafiante");
        System.out.println("2)Cadastrar Líder de Ginásio");
        System.out.println("3)Cadastrar Performer Pokemon");
        System.out.print("Informe uma opção: ");

    }

    public static void menuConsultas(){

        System.out.println("-- Menu de Listagem --");

        System.out.println("0)Voltar");
        System.out.println("1)Listar Desafiante");
        System.out.println("2)Listar Líder de Ginásio");
        System.out.println("3)Listar Performer Pokemon");
        System.out.println("4)Listar Todos");
        System.out.print("Informe uma opção: ");

    }

    public static void menuExclusoes(){

        System.out.println("-- Menu de Exclusões --");

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
                
                System.out.print("Nome do Treinador: ");
                nome = Console.lerString();
                System.out.print("Idade: ");
                idade = Console.lerInt();
                System.out.print("Pokémon Principal: ");
                pokePrincipal = Console.lerString();
                System.out.print("Cidade Natal: ");
                cidadeNatal = Console.lerString();

                Treinador treinador = new Treinador(nome,idade,pokePrincipal);
                CadastroTreinadores.cadastro(treinador);
                // Desafiante desafiante1 = new Desafiante(nome,idade,pokePrincipal,cidadeNatal);
                break;
            case 2: // Cadastrar Lider de Ginásio
                System.out.println("\n-> Cadastro de Líder de Ginásio <-\n");
                
                System.out.print("Nome do Treinador: ");
                nome = Console.lerString();
                System.out.print("Idade: ");
                idade = Console.lerInt();
                System.out.print("Pokémon Principal: ");
                pokePrincipal = Console.lerString();
                System.out.print("Cidade Natal: ");
                cidadeNatal = Console.lerString();
                
                // Lider lider1 = new Lider(nome,idade,pokePrincipal,cidadeNatal);
                break;
            case 3: // Cadastrar Performer Pokemon
                System.out.println("\n-> Cadastro de Performer Pokémon <-\n");
                
                System.out.print("Nome do Treinador: ");
                nome = Console.lerString();
                System.out.print("Idade: ");
                idade = Console.lerInt();
                System.out.print("Pokémon Principal: ");
                pokePrincipal = Console.lerString();
                System.out.print("Cidade Natal: ");
                cidadeNatal = Console.lerString();
                
                // Performer performer1 = new Performer(nome,idade,pokePrincipal,cidadeNatal);
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }

    public static void realizarConsulta(int op){
        switch (op) {
            case 0:
                
                break;
            case 1:
                for (Treinador treinadorT : CadastroTreinadores.getListaTreinadores()) {
                    System.out.println(treinadorT);
                }
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }

    public static void realizarExclusao(int op){
        switch (op) {
            case 0: // Voltar para Menu Principal
                
                break;
            case 1: // Excluir Treinador
                System.out.print("Nome do Treinador: ");
                String nomeEx = Console.lerString();
                boolean excluido = CadastroTreinadores.excluirTreinador(nomeEx);

                if(excluido){
                    System.out.println("Treinador excluído com sucesso");
                }
                else{
                    System.out.println("Treinador " + nomeEx + " não encontrado");
                }
                break;
            default:
                System.out.println("Opção Inválida");
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
