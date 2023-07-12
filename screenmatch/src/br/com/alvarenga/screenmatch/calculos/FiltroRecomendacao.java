package br.com.alvarenga.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtrar(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento.");
        } else if(classificavel.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado no momento.");
        } else {
            System.out.println("Coloque na lista para assistir depois.");
        }
    }
}