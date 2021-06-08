
package manipularDados;

import java.util.ArrayList;
import negocio.Veiculo;

public class ControlaVeiculo {
    //Vai armazenar o objeto veiculo
    private ArrayList<Veiculo> veiculos = new ArrayList<>();
    
    public boolean salvar (Veiculo v) {
        if (v != null){
            veiculos.add(v);
            return true;
        }else{
            return false;
        }
    }
    
    //Chamar informações 
    public ArrayList<Veiculo> retornarTodos (){
        return veiculos;
    }
}
