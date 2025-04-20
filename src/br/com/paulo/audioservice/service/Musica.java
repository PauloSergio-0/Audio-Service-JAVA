package br.com.paulo.audioservice.service;

import br.com.paulo.audioservice.models.Audio;

public class Musica extends Audio {
    private String album;
    private String artista;
    private String genero;


    public Musica(String titulo, String album, String artista, String genero){
        super(titulo);
        this.album = album;
        this.artista = artista;
        this.genero = genero;
    }

    @Override
    public String info(){
        return String.format("""
        Titulo: %s
        Album: %s
        Artista: %s
        genero: %s
        Total de Curtidas: %d
        Total de reproduções: %d
        Classsificação: %d
        """, getTitulo(),getAlbum(), getArtista(), getGenero(), getTotalCurtidas(), getTotalReproducoes(), getClassificacao());
}
public String getAlbum() {
return album;
}

public void setAlbum(String album) {
this.album = album;
}

public String getArtista() {
return artista;
}

public void setArtista(String artista) {
this.artista = artista;
}

public String getGenero() {
return genero;
}

public void setGenero(String genero) {
this.genero = genero;
}
}
