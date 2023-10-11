package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    public void executarMenu(){

        System.out.println("---------------Seja bem vindo ao Zoo -----------------");
        System.out.println("1- Cadastrar Animais");
        System.out.println("2- Listar Animais");
        System.out.println("3- Cadastrar Informações de Saúde");
        System.out.println("4- Pesquisar Animal");
        System.out.println("5- Sair");
        System.out.println("------------------------------------------------------");

        System.out.println("Escolha uma opção: ");
        int optionMenu = scanner.nextInt();
        scanner.nextLine();

        switch (optionMenu) {
            case 1:
                break;

                }
    }

}
