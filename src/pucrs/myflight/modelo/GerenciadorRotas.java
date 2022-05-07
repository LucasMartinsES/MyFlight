package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList<Rota> caminhos;

    public GerenciadorRotas(){
        caminhos = new ArrayList<>();
    }

    public void adicionar(Rota caminho){
        caminhos.add(caminho);
    }
}
