import java.util.Scanner;

public class tugas1 {
    static char KODE[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
    static char[][] KOTA = {{ 'B', 'A', 'N', 'T', 'E', 'N' },
                            { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                            { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
                            { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                            { 'B', 'O', 'G', 'O', 'R' },
                            { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                            { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
                            { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                            { 'M', 'A', 'L', 'A', 'N', 'G' },
                            { 'T', 'E', 'G', 'A', 'L' }};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Kode Plat: ");
        char input = sc.next().charAt(0);    
        int indexPlat = cariIndexPlat(input);
         for (int i = 0; i < KOTA[indexPlat].length; i++) {
            if(KOTA[i] != null){
                System.out.print(KOTA[indexPlat][i]);
            }else{
                break;
            }
        }
    }
    public static int cariIndexPlat(char plat){
        int indexPlat = 0;
        for (int i = 0; i < KODE.length; i++) {
            if(plat == KODE[i]){
                indexPlat = i;
            } 
        }
        return indexPlat;
    }

}
