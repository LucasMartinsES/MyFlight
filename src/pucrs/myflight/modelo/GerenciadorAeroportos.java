package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;

    public GerenciadorAeroportos(){
        aeroportos = new ArrayList<>();
    }

    public void adicionar(Aeroporto aero){
        aeroportos.add(aero);
    }

    public ArrayList<Aeroporto> listarTodos(){        
        if (aeroportos.isEmpty() == false){
                return aeroportos;
        }   
        return null; 
    } 
    
    public Aeroporto buscarPorCodigo(String cod){
        for (Aeroporto aeroporto : aeroportos){
            if(aeroporto.getCodigo() == cod){
                return aeroporto;
            }
        }
        return null;
    }
}
