package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeronaves {
    
    private ArrayList<Aeronave> avioes; 

    public GerenciadorAeronaves(){
        avioes = new ArrayList<>();
    }

    public void adicionar(Aeronave umaAeronave){
        avioes.add(umaAeronave);
    }

    public ArrayList<Aeronave> listarTodas(){        
        if (avioes.isEmpty() == false){
                return avioes;
        }   
        return null; 
    } 
    
    public Aeronave buscarPorCodigo(String cod){
        for (Aeronave aviao : avioes){
            if(aviao.getCodigo() == cod){
                return aviao;
            }
        }
        return null;
    }
}
