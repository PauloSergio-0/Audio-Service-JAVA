package br.com.paulo.audioservice.models;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public Audio(String titulo){
        this.titulo = titulo;
    }

    public void curte(){
        this.totalCurtidas++;
        classsificar();
    }

    public void reproduz(){
        this.totalReproducoes++;
    }

    public String info(){
        return String.format("""
                Titulo: %s
                Total de Curtidas: %d 
                Total de reproduções: %d
                Classsificação: %d 
                """, this.titulo, this.totalCurtidas, this.totalReproducoes, this.classificacao);
    }

    private void classsificar(){
        if (totalCurtidas < (totalReproducoes * 0.5)){
            this.classificacao = 4;
        }else if (totalCurtidas >= (totalReproducoes * 0.5)){
            this.classificacao = 7;
        } else {
            this.classificacao = 10;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

}
