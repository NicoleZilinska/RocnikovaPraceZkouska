package com.example.rocnikovapracezkouska;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Preklad preklad = new Preklad();
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> francouzskaSlova = new ArrayList<>();
        ArrayList<String> ceskaSlova = new ArrayList<>();
        try {
            BufferedReader cteniFrancouzska = new BufferedReader(new FileReader("francouzskaSlovesa.txt"));
            BufferedReader cteniCeska = new BufferedReader(new FileReader("ceskaSlovesa.txt"));
            String line1;
            String line2;
            while((line1= cteniFrancouzska.readLine()) != null && (line2= cteniCeska.readLine()) != null){
                francouzskaSlova.add(line1);
                ceskaSlova.add(line2);
            }
            cteniFrancouzska.close();
            cteniCeska.close();
        }

        catch (IOException e){ //
            System.out.println("Stala se chyba");
        }
        boolean opakovani=true;
        while (opakovani){
        try {
            System.out.println("Kategorie:");
            System.out.println("1.) ceska na francouzska");
            System.out.println("2.) francouzska na ceska");
            System.out.println("3.) vypnout program");
            int vyberUzivatele = scanner.nextInt();
            switch (vyberUzivatele) {
                case 1 -> preklad.ceskaNaFrancouzska(francouzskaSlova, ceskaSlova);
                case 2 -> preklad.francouzskaNaCeska(francouzskaSlova, ceskaSlova);
                case 3 -> opakovani=false;
            }
        }catch (InputMismatchException e){
            System.out.println("Zadejte prosím číslo☠️:");
            }
        }
    }
}
