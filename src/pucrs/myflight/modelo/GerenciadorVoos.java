package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorVoos {
    private ArrayList<Voo> viagem;

    public GerenciadorVoos(){
        viagem = new ArrayList<>();
    }

    public void adicionar(Voo v){
        viagem.add(v);
    }
}
