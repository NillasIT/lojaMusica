package lojaMusica.gestorProduto;

import java.io.IOException;
import java.util.*;

import lojaMusica.validacao.Validacao;
import lojaMusica.classes.*;

public class GestorProduto {
    private ArrayList <Produto> produtos;
    private ArrayList <Produto> resultados;
    Validacao validacao = new Validacao();

    public GestorProduto() {
        this.produtos = new ArrayList <Produto> ();
        this.resultados = new ArrayList <Produto> ();
    }

    public void adicionarCD () throws IOException {
        System.out.println();
        String name = validacao.validaString("Nome do CD: ");
        int code = validacao.validarInt("Código do CD: ");
        float price = validacao.validarFloat("Preço do CD: ");
        int numeroDeFaixas = validacao.validarInt("Número de faixas: ");
        System.out.println();

        CD cd = new CD(code, name, price, numeroDeFaixas);
        produtos.add(cd);
    }

    public void adicionarDVD() throws IOException {
        System.out.println();
        String name = validacao.validaString("Nome do DVD: ");
        int code = validacao.validarInt("Código do DVD: ");
        float price = validacao.validarFloat("Preço do DVD: ");
        int duration = validacao.validarInt("Duração: ");
        System.out.println();

        DVD dvd = new DVD(code, name, price, duration);
        produtos.add(dvd);
    }

    public void listarProdutos() {
        for (Produto pdt : produtos) {
            pdt.detalhesProduto();
            System.out.println();
        }
    }

    public void removerProduto() throws IOException {
        System.out.println();
        int remover = validacao.validarInt("Qual produto deseja remover: ");
        produtos.remove(remover);
        System.out.println("Produto removido!");
    }

    public List<Produto> buscarPorNome() throws IOException { //* Preciso entender como funciona List, e busca por nome
        for (Produto pdtNome: produtos) {
            String nome = validacao.validaString("Qual produto procura: ");

            if (pdtNome.getName().equalsIgnoreCase(nome)) {
                resultados.add(pdtNome);
            } 
        }
        return resultados;
    }

    public void buscaNome() throws IOException {
        buscarPorNome();
        if (!resultados.isEmpty()) {
            System.out.println("Produtos encontrados: ");

            for (Produto produto : resultados) {
                produto.detalhesProduto();
                System.out.println();
            }
        }
    }

    public float valorTotalEstoque() {
        float valorTotal = 0.0f;
;;
        for (Produto produto : produtos) {
            valorTotal = valorTotal + produto.getPrice();
        }
        return valorTotal;
    }
}
