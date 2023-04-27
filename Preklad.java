package com.example.rocnikovapracezkouska;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Preklad{
    public String ceskaNaFrancouzska(ArrayList francouzskaSlova, ArrayList ceskaSlova){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int nahodneCislo= random.nextInt(francouzskaSlova.size());
        System.out.println("Přeložte: "+ceskaSlova.get(nahodneCislo));
        String slovoUzivatele = scanner.nextLine();
        if (slovoUzivatele.equals(francouzskaSlova.get(nahodneCislo))){
            System.out.println("Správně");
            ceskaSlova.remove(nahodneCislo);
        }
        else {
            System.out.println("Špatně, správná odpověď: "+francouzskaSlova.get(nahodneCislo));
        }

        return "Ahoj";
    }
    public String francouzskaNaCeska(ArrayList francouzskaSlova, ArrayList ceskaSlova){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int nahodneCislo= random.nextInt(ceskaSlova.size());
        System.out.println("Přeložte: "+francouzskaSlova.get(nahodneCislo));
        String slovoUzivatele = scanner.nextLine();
        if (slovoUzivatele.equals(ceskaSlova.get(nahodneCislo))){
            System.out.println("Správně");
            ceskaSlova.remove(nahodneCislo);
        }
        else {
            System.out.println("Špatně, správná odpověď: "+ceskaSlova.get(nahodneCislo));
        }

        return "Ahoj";
    }
}
