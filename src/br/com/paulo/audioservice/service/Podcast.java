package br.com.paulo.audioservice.service;

import br.com.paulo.audioservice.models.Audio;

public class Podcast extends Audio {
    private String host;
    private String descricao;

    public Podcast(String titulo, String host, String descricao){
        super(titulo);
        this.host = host;
        this.descricao = descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String info() {
        return String.format("""
        Titulo: %s
        Host: %s
        Descrição: %s
        Total de Curtidas: %d
        Total de reproduções: %d
        Classsificação: %d
        """, getTitulo(),getHost(), getDescricao(), getTotalCurtidas(), getTotalReproducoes(), getClassificacao());
    }

    //    public void setHost(String host) {
//        this.host = host;
//    }

    public String getHost() {
        return host;
    }
}
