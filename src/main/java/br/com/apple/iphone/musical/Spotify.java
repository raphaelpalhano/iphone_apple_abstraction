package br.com.apple.iphone.musical;

public class Spotify implements ReprodutorMusical {
    @Override
    public void tocarMusica(String nomeMusica) {
        System.out.println("Tocando musica: " + nomeMusica);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando musica");
    }

    @Override
    public void pararMusica() {
        System.out.println("Parando musica");
    }

    @Override
    public void avancarMusica() {
        System.out.println("Avançando musica");
    }

    @Override
    public void voltarMusica() {
        System.out.println("Voltando musica");
    }

}
