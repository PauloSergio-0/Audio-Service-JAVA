package br.com.paulo.audioservice;

import br.com.paulo.audioservice.service.Musica;
import br.com.paulo.audioservice.service.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica phonk = new Musica("SHADOW","Phonks Raiz", "ONIMXRU, SMITHMANE", "Phonk");

        Podcast falaGlauber = new Podcast("Fala Glauber - PODCAST", "falaglauber.com.br", "Um podcast focado na geopolitica.");

        phonk.reproduz();
        phonk.reproduz();
        phonk.reproduz();
        phonk.reproduz();

        phonk.curte();
        phonk.curte();
        phonk.curte();
        System.out.println(phonk.info());


        falaGlauber.reproduz();
        falaGlauber.reproduz();
        falaGlauber.reproduz();
        falaGlauber.reproduz();

        falaGlauber.curte();
        falaGlauber.curte();
        falaGlauber.curte();
        System.out.println(falaGlauber.info());
    }
}
