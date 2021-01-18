
package segitiga;
import java.util.Scanner;
public class summon {
    //variabel
    Scanner input = new Scanner (System.in);
    double luas,alas,tinggi;
        
    //method void untuk memulai program
    void awalan(){
        System.out.println("---PROGRAM MENGHITUNG LUAS SEGITIGA---");
    }
    //method void untuk memproses data program
    void isi(){
        System.out.println("");
        System.out.println("=================");
        //
        System.out.println("Masukkan Alas : ");
        alas =input.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        
        System.out.print("Masukkan Tinggi : ");
        tinggi =input.nextDouble();
    }
    //method void untuk menghitung luas segitiga
    void hitung(){
        //Rumus Luas Segitiga
        luas = alas*tinggi/2;
    }
    //method void untuk memberikan hasil luas segitiga
    void hasil(){
        System.out.println("=================");
        //Hasil Luas Segitiga
        System.out.println("("+ alas + " * "+tinggi +") / 2 = " + luas );
    }
}
