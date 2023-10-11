package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    Ave refAve = new Ave();

    Alojamento alojamento = new Alojamento();

    Scanner scanner = new Scanner(System.in);
    public void executarMenu() {

        boolean continuar;

        while (continuar) {

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
                    System.out.println("Escolha qual animal cadastrar");
                    System.out.println("1- Mamifero");
                    System.out.println("2- Ave");
                    System.out.println("3- Felino");
                    int optionCadastro = scanner.nextInt();
                    scanner.nextLine();

                    switch (optionCadastro) {
                        case 1:
                            Mamifero mamifero = new Mamifero();
                            break;
                        case 2:
                            Ave ave = new Ave();
                            ave.cadastrarAnimal();
                            refAve.addAve(ave);
                            alojamento.adicionarAveAlojamento(ave);
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    continuar = false;
                    break;
            }
        }
    }

}
