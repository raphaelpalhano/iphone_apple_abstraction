package br.com.apple.iphone;

import java.util.List;

import br.com.apple.iphone.internet.Internet;
import br.com.apple.iphone.musical.ReprodutorMusical;
import br.com.apple.iphone.telefone.Contato;
import br.com.apple.iphone.telefone.Telefone;

public class Iphone implements ReprodutorMusical, Internet, Telefone{
    private String nome;
    private String modelo;
    private Double preco;
    private List<Contato> contatos;


    public Iphone(String nome, String modelo, Double preco, List<Contato> contatos) {

        this.nome = nome;
        this.modelo = modelo;
        this.preco = preco;
        this.contatos = contatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public void navegar(String url) {
        System.out.println("Navegando para: " + url);
        this.interpretar();
    }

    private void interpretar() {
        System.out.println("Interpretando...");
    }


    public void ligarParaContato(String nome) {
        Contato contato = this.contatos.stream()
                .filter(c -> c.getNome().equals(nome))
                .findFirst()
                .orElse(null);
        System.out.println("Ligando para " + contato.getNome());
    }

    public void desligarChamada() {
        System.out.println("Desligando chamada");
    }

    public void adicionarNovoContato(Contato[] contatos) {
        System.out.println("Adicionando novo contato");
    }

    @Override
    public void listarContatos() {
        this.contatos.stream().forEach(c -> System.out.println(c.getNome()));

    }

    @Override
    public void deletarContato(String nome) {
        System.out.println("Deletando contato " + nome);
        this.contatos.removeIf(c -> c.getNome().equals(nome));
    }


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
