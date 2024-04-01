package driver;

import java.util.*;
import model.*;

public class Driver{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Lingkaran lingkaran = new Lingkaran (4);
        Persegi persegi = new Persegi (7);

        int pilihan = sc.nextInt();
        Bentuk bentuk = null;

        switch (pilihan){
            case 1:
            bentuk = Bentuk.Lingkaran;
            break;
            case 2:
            bentuk = Bentuk.Persegi;
            break;
            default:
            System.out.println("Pilihan tidak valid");
        }

        if (bentuk == Bentuk.Lingkaran){
            System.out.println(lingkaran.hitungkeliling());
        } else if (bentuk == Bentuk.Persegi){
            System.out.println(persegi.hitungkeliling());
        }
        sc.close();
    }
    
    private static double hitungkeliling(Keliling keliling){
        return keliling.hitungkeliling();
    }
}