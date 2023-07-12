package br.com.alvarenga.audio.modelos;

public class Audio {
    protected String titulo;
   protected int totalReproducoes;
    protected int curtidas;
    protected String classificacao;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibirFicha(){
        System.out.println("Título: " + titulo);
        System.out.println("Total de reproduções: " + totalReproducoes);
        System.out.println("Curtidas: " + curtidas);
        System.out.println("Classificação: " + classificacao);
    }

    public void curtir(){
        curtidas ++;
    }

    public void avaliar(){

        int nota = (int)(curtidas / 50);

        switch (nota){
            case 0:
                classificacao = "Sem classificação.";
                break;
            case 1:
                classificacao = "*";
                break;
            case 2:
                classificacao = "**";
                break;
            case 3:
                classificacao = "***";
                break;
            case 4:
                classificacao = "****";
                break;
            default:
                classificacao = "*****";
                break;

        }
    }

    public void reproduzir() {
        totalReproducoes ++;
    }
}
