package br.com.apple.iphone.telefone;

import java.util.List;

public class MeuTelefone implements Telefone {
    private List<Contato> contatos;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarContatos'");
    }

    @Override
    public void deletarContato(String nome) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletarContato'");
    }
}
