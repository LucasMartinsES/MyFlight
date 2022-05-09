package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.util.Collections;

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

    /*
    / Metodo que ordena os aeroportos de acordo com seus nomes
    */

    public void ordemNomeAeroportos(){
        Collections.sort(aeroportos);
        System.out.println(aeroportos);
    }
}
