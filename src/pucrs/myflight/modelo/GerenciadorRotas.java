package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorRotas {
    private ArrayList<Rota> caminhos;

    public GerenciadorRotas(){
        caminhos = new ArrayList<>();
    }

    public void adicionar(Rota caminho){
        caminhos.add(caminho);
    }

    public void ordemNomeCiaArea(){
        Collections.sort(caminhos);
        System.out.println(caminhos);

    }
}
