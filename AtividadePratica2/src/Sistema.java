public class Sistema {
    public static void menuPrincipal(){

        System.out.println("-- Menu Principal --");

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
        System.out.println("1)Excluir Desafiante");
        System.out.println("2)Excluir Líder de Ginásio");
        System.out.println("3)Excluir Performer Pokemon");
        System.out.println("4)Excluir Todos");
        System.out.print("Informe uma opção: ");

    }

    public static void encaminharMenu(int op){
        
        switch (op) {
            case 0: // Encerra Programa
                System.out.println("Programa Finalizado");
                break;
            case 1: // Mostra menu de Cadastros
                menuCadastros();
                break;
            case 2: // Mostra menu de Listagem
                menuConsultas();
                break;
            case 3: // Mostra menu de Exclusões
                menuExclusoes();
                break;

            default:
                System.out.println("Opção Inválida");
                break;
        }
    }


    public static void realizarCadastro(int op){
        String nome, pokePrincipal;
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


                // Desafiante desafiante1 = new Desafiante(nome,idade,pokePrincipal);
                break;
            case 2: // Cadastrar Lider de Ginásio
                System.out.println("\n-> Cadastro de Líder de Ginásio <-\n");
                
                System.out.print("Nome do Treinador: ");
                nome = Console.lerString();
                System.out.print("Idade: ");
                idade = Console.lerInt();
                System.out.print("Pokémon Principal: ");
                pokePrincipal = Console.lerString();
                
                // Lider lider1 = new Lider(nome,idade,pokePrincipal);
                break;
            case 3: // Cadastrar Performer Pokemon
                System.out.println("\n-> Cadastro de Performer Pokémon <-\n");
                
                System.out.print("Nome do Treinador: ");
                nome = Console.lerString();
                System.out.print("Idade: ");
                idade = Console.lerInt();
                System.out.print("Pokémon Principal: ");
                pokePrincipal = Console.lerString();
                
                // Performer performer1 = new Performer(nome,idade,pokePrincipal);
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }

    public static void realizarConsulta(){}

    public static void realizarExclusao(){}



}
