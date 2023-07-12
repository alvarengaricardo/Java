package br.com.alvarenga.audio.modelos;

public class Podcast extends Audio {
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void avaliar() {

        int nota = (int) (totalReproducoes / 200);

        switch (nota) {
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

    @Override
    public void exibirFicha(){
        System.out.println("Título: " + titulo);
        System.out.println("Host: " + host);
        System.out.println("Descrição: " + descricao);
        System.out.println("Total de reproduções: " + totalReproducoes);
        System.out.println("Curtidas: " + curtidas);
        System.out.println("Classificação: " + classificacao);

    }
}
