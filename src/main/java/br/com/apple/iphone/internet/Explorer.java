package br.com.apple.iphone.internet;

public class Explorer implements Internet {

    @Override
    public void navegar(String url) {
        System.out.println("Navegando para: " + url);
        this.interpretar();
    }

    private void interpretar() {
        System.out.println("Interpretando...");
    }

}

