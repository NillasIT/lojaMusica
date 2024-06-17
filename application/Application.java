package lojaMusica.application;

import java.io.*;

import lojaMusica.gestorProduto.GestorProduto;

public class Application {
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        GestorProduto gestorProduto = new GestorProduto();
        int option;

        do {
            System.out.println("===================MENU===================");
            System.out.println("1. Adicionar CD");
            System.out.println("2. Adicionar DVD");
            System.out.println("3. Listar todos os produtos");
            System.out.println("4. Remover Produtos");
            System.out.println("5. Valor total do estoque");
            System.out.println("6. Busca Por Nome");
            System.out.println("0. Sair do Programa");
            System.out.print(": ");
            option = Integer.parseInt(keyboard.readLine());
            System.out.println();

            if (option == 1) {
                gestorProduto.adicionarCD();
            } else 
            if (option == 2) {
                gestorProduto.adicionarDVD();
            } else
            if (option == 3) {
                gestorProduto.listarProdutos();
            } else 
            if (option == 4) {
                gestorProduto.removerProduto();
            } else
            if (option == 5) {
                System.out.println("Valor total do Estoque: " + gestorProduto.valorTotalEstoque());
            } else 
            if (option == 6) {
                gestorProduto.buscaNome();
            }
            if (option == 0) {
                break;
            }
            
        } while (option != 0);
    }
}