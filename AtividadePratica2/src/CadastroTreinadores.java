import java.util.ArrayList;
import java.util.List;

public class CadastroTreinadores {

    private static List<Treinador> listaTreinadores = new ArrayList<>();

    public static void cadastro(Treinador treinador){
        listaTreinadores.add(treinador);
    }

    public static List<Treinador> getListaTreinadores() {
        return listaTreinadores;
    }

    public static boolean excluirTreinador(String nome){

        for (Treinador treinadorT : listaTreinadores) {
            if (treinadorT.getNome().equals(nome)) {
                listaTreinadores.remove(treinadorT);
                return true;
            }
        }
        return false;
    }

    public static void excluirTodos(){
        listaTreinadores.removeAll(listaTreinadores);
    }

    public static int buscarTreinador(String nome){

        for (Treinador temporario: CadastroTreinadores.getListaTreinadores()) {
            if (temporario.getNome().equals(nome)) {
                System.out.println(temporario);
                return 0;
            }
        }
        return -1;
    }





    
    
}
