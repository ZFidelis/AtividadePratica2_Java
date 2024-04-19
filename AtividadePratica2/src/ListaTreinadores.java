import java.util.ArrayList;
import java.util.List;

public class ListaTreinadores {

    private static List<Treinador> listaTreinadores = new ArrayList<>();

    public static void cadastro(Treinador treinador){
        listaTreinadores.add(treinador);
    }

    public static List<Treinador> getListaTreinadores() {
        return listaTreinadores;
    }

    
}
