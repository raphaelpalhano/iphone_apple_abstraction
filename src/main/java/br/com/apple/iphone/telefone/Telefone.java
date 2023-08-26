package br.com.apple.iphone.telefone;

public interface Telefone {

    public void ligarParaContato(String nome);

    public void desligarChamada();

    public void adicionarNovoContato(Contato[] contato);

    public void listarContatos();

    public void deletarContato(String nome);

}
