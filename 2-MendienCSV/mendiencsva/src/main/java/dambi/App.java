package dambi;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        int aukera = 0;
        do {
            System.out.println();
            System.out.println("MENUAREN IZENBURUA");
            System.out.println("====================================");
            System.out.println("1.- Mendien zerrenda ikusi (taula formatuan)");
            System.out.println("2.- Mendirik altuena bistaratu");
            System.out.println("3.- Mendiak esportatu (Araba.csv, Bizkaia.csv, Gipuzkoa.csv)");
            System.out.println("4.- ...");
            System.out.println("5.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    met1();
                    break;
                case 2:
                    met2();
                    break;
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 5);
        in.next();
    }

    public static void met1() {
        ArrayList<Mendia> mendiakArrayList = mendiakargatu();
        System.out.printf("%15s| %10s| %15s|", "MENDIA", "ALTUERA", "PROBINTZIA");
        System.out.println();
        System.out.println("_________________________________________________________");
        for (Mendia mendia : mendiakArrayList) {
            System.out.printf("%15s| %10s| %15s|", mendia.getIzena(), mendia.getAltuera(), mendia.getProbintzia());
            System.out.println();
        }
    }

    public static void met2() {
        ArrayList<Mendia> mendiakArrayList = mendiakargatu();
        Mendia altuena = mendiakArrayList.get(0);
        for (Mendia mendia : mendiakArrayList) {
            if (altuena.getAltuera() < mendia.getAltuera()) {
                altuena = mendia;
            }
        }
        System.out.println("Altuena: " + altuena.getAltuera() + " " + altuena.getIzena());
    } 

    public static ArrayList<Mendia> mendiakargatu() {
        String split = ";";
        String ilara = "";
        ArrayList mendiakArrayList = new ArrayList<Mendia>();
        try {
            BufferedReader ireki = new BufferedReader(new FileReader("Mendiak.csv"));
            ireki.readLine();// lenengoko lerroa jan egiten du

            while ((ilara = ireki.readLine()) != null) {
                String[] mendiadatuak = ilara.split(split);

                Mendia mendia = new Mendia(mendiadatuak[0], Integer.parseInt(mendiadatuak[1]), mendiadatuak[2]);
                mendiakArrayList.add(mendia);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Mendiak fitxategia ez du aurkitu");
        } catch (IOException e) {

        }
        return mendiakArrayList;

    }
}
