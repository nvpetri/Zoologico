package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal{

    List<Ave> listAve = new ArrayList<>();
    public Ave(){

        super("ave");
    }

    public void listarAve(){
        for (Ave ave: listAve) {
            System.out.println("id: "+ ave.idAnimal);
            System.out.println("nome: " + ave.nome);
            System.out.println("idade: " + ave.idade);
            System.out.println("----------------------------------");
        }
    }
}
