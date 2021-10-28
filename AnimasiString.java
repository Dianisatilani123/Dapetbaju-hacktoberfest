package Program_animasi_string;
import java.util.Scanner;
public class AnimasiString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String animasi;
        int a, b, panjang;
        char karakter;
        System.out.print("MASUKKAN STRING :  ");
        animasi = scan.nextLine();
        
        panjang = animasi.length();
        for (a = 0; a < panjang; a++){
        for (b = a; b < panjang; b++){
            karakter = animasi.charAt(b);
            System.out.print(karakter);
        }
            System.out.println();
            
        }
        
        }
    
    }
