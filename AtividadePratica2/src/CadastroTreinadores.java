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
            if (treinadorT.getNome() == nome) {
                listaTreinadores.remove(treinadorT);
                System.out.println("enter-\n");
                return true;
            }
            System.out.println("pass-\n");
        }
        return false;
    }



    
    
}
