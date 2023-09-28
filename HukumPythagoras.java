import java.util.Scanner;

public class HukumPythagoras {
    public static void main(String[] args ) {
        Scanner input = new Scanner (System.in);

        System.out.println ("Hukum Pythagoras:  Menghitung panjang Hipotenusa dalam Segitiga siku siku");
        System.out.println ( "Masukkan panjang sisi A: ");
        double sisiA = input.nextDouble();

        System.out.print("Masukkan panjang sisi B : ");
        double sisiB = input.nextDouble();

        //Menggunakan rumus Pythagoras untuk menghitung panjang hipotenusa (sisi c) 
        double sisiC = Math.sqrt ( Math.pow(sisiA, 2) + Math.pow(sisiB, 2));

        System.out.println("Panjang hipotenusa (sisi C) adalah: " + sisiC);
        input.close();
    }
}
    
