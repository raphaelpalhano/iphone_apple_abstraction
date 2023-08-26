package br.com.apple;

import java.util.List;

import br.com.apple.iphone.Iphone;
import br.com.apple.iphone.internet.Internet;
import br.com.apple.iphone.musical.ReprodutorMusical;
import br.com.apple.iphone.telefone.Contato;
import br.com.apple.iphone.telefone.Telefone;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        List<Contato> contatos = Arrays.asList(new Contato("Joaquim", "934322"), new Contato("Maria", "23122122"), new Contato("Joaquim", "213123123"));
        Iphone iPhonePro = new Iphone("IPhone Pro", "12", 999.99, contatos);
        ReprodutorMusical spotify = iPhonePro;
        Internet chrome = iPhonePro;
        Telefone telefone = iPhonePro;

        spotify.tocarMusica("Bohemian Rhapsody");
        chrome.navegar("google.com");
        telefone.ligarParaContato("Joaquim");
    }
}
